package com.zlf.utils.sparkjava.blog;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import spark.Request;
import spark.Response;
import spark.Route;

import java.io.File;
import java.util.*;

public class FormHandler implements Route {

    @Override
    public Object handle(Request request, Response response) throws Exception {
        Map<String, Object> result = new HashMap<>();

        addCustomHeaders(request, result);

        addQueryParams(request, result);

        if (ServletFileUpload.isMultipartContent(request.raw())) {
            ServletFileUpload fileUpload = new ServletFileUpload(new DiskFileItemFactory(8, new File("./Data")));
            List<FileItem> fileItems = fileUpload.parseRequest(request.raw());
            List<FileEntity> fileEntities = getFileEntities(result, fileItems);
            if (!fileEntities.isEmpty())
                result.put("_files", fileEntities);
        }

        return result;
    }

    private List<FileEntity> getFileEntities(Map<String, Object> result, List<FileItem> fileItems) throws Exception {
        List<FileEntity> fileEntities = new ArrayList<>();

        for (FileItem fileItem : fileItems) {

            if (fileItem.isFormField()) {
                fileItem.getFieldName();
                result.put(fileItem.getFieldName(), fileItem.getString());
                if (!fileItem.isInMemory()) {
                    fileItem.delete();
                }
            } else {
                FileEntity fileEntity = new FileEntity();
                fileEntity.name = fileItem.getName();
                fileEntity.contentType = fileItem.getContentType();
                fileEntity.size = fileItem.getSize();
                fileEntity.readableSize = FileSizeUtil.toReadable(fileItem.getSize());
                fileEntity.savePath = "Data/" + fileEntity.name;
                File file = new File(fileEntity.savePath);
                fileItem.write(file);
                fileEntities.add(fileEntity);
            }

        }

        return fileEntities;
    }

    private void addCustomHeaders(Request request, Map<String, Object> result) {
        String[] normalHeaders = new String[]{"Accept-Encoding", "Connection", "Content-Length", "Content-Type", "Host", "User-Agent"};
        Set<String> headers = request.headers();
        for (String s : normalHeaders) {
            headers.remove(s);
        }
        if (!headers.isEmpty()) {
            Map<String, String> customHeaderMap = new HashMap<>();
            for (String header : headers) {
                customHeaderMap.put(header, request.headers(header));
            }
            result.put("_customHeader", customHeaderMap);
        }
    }


    private void addQueryParams(Request request, Map<String, Object> result) {
        Map<String, String[]> queryParamsMap = request.queryMap().toMap();
        Set<Map.Entry<String, String[]>> entries = queryParamsMap.entrySet();

        for (Map.Entry<String, String[]> entry : entries) {
            String[] values = entry.getValue();
            if (values == null) {
                continue;
            }
            if (values.length == 1) {
                result.put(entry.getKey(), values[0]);
            } else {
                result.put(entry.getKey(), values);
            }
        }
    }


}
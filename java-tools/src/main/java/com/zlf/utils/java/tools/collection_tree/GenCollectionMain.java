package com.zlf.utils.java.tools.collection_tree;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;

public class GenCollectionMain {
    public static void main(String[] args) {
        System.out.println(123);
        genTree();
    }
    private static void genTree(){
        String path = GenCollectionMain.class.getClassLoader().getResource("./11category.csv").getPath();
        readFileByLines(path);

    }
    public static void readFileByLines(String fileName) {
        Map<Integer, List<CategoryStd>> categoryMap = new HashMap<>();
        categoryMap.put(1, new ArrayList<>());
        categoryMap.put(2, new ArrayList<>());
        categoryMap.put(3, new ArrayList<>());
        categoryMap.put(4, new ArrayList<>());
        categoryMap.put(5, new ArrayList<>());

        long total = 1;
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
//                System.out.println("line " + line + ": " + tempString);

                String[] strings = tempString.split(",");
                for (int i = 0; i < strings.length; i++) {
                    String string = strings[i];
                    if(StringUtils.hasText(string)){
                        int level = i+1;
                        String parentName = null;
                        if(i>0){
                            List<CategoryStd> categoryStds = categoryMap.get(i);
                            parentName = categoryStds.get(categoryStds.size()-1).getCategoryName();
                        }
                        categoryMap.get(level).add(
                                CategoryStd.builder()
                                        .level(level)
                                        .parentName(parentName)
                                        .categoryName(string)
                                        .build());
                    }
                }
                line++;
            }
            reader.close();

            for (int i = 1; i < 6; i++) {
                List<CategoryStd> categoryStds = categoryMap.get(i);
                for (int j = 0; j < categoryStds.size(); j++) {
                    CategoryStd categoryStd = categoryStds.get(j);
                    categoryStd.setId(total++);
                    String parentName = categoryStd.getParentName();
                    if(parentName==null){
                        continue;
                    }
                    List<CategoryStd> categoryStds1 = categoryMap.get(i - 1);
                    for (int i1 = 0; i1 < categoryStds1.size(); i1++) {
                        if(categoryStds1.get(i1).getCategoryName().equals(parentName)){
                            categoryStd.setParentId(categoryStds1.get(i1).getId());
                        }
                    }
                }
            }
            categoryMap.remove(5);
            System.out.println(JSON.toJSONString(categoryMap));
            /**
             * INSERT INTO `category_std` (`id`, `parent_id`, `category_name`, `level`, `category_id`, `code`)
             * VALUES
             * 	(1727,2035,'Dresses',3,'1727',NULL),
             * 	(1732,1767,'Skirts',4,'1732',NULL),
             */
            String sql = "INSERT INTO `category_std` (`id`, `parent_id`, `category_name`, `level`, `category_id`, `code`) VALUES";
            for (int i = 1; i < 5; i++) {
                List<CategoryStd> categoryStds = categoryMap.get(i);
                for (int j = 0; j < categoryStds.size(); j++) {
                    CategoryStd std = categoryStds.get(j);
                    sql += "("+std.getId()+","+std.getParentId()+",'"+std.getCategoryName()+"',"+
                            std.getLevel()+",'"+std.getId()+"',NULL),";
                }
            }
            System.out.println(sql);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}

package com.zlf.utils.java.tools.javacsv;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.nio.charset.Charset;

public class JavaCSVTest {

    public static void main(String[] args) {
//        write();
        read();
    }

    public static void read(){
        String path = "./test.csv";
        try{
            CsvReader csvReader = new CsvReader(path, ',', Charset.forName("utf-8"));

            csvReader.readHeaders();
            while (csvReader.readRecord()){
                System.out.println(csvReader.getRawRecord());
                System.out.println(csvReader.get("编号"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void write(){
        String path = "./test.csv";
        try{
            CsvWriter csvWriter = new CsvWriter(path, ',', Charset.forName("utf-8"));
            String[] headers = {"编号","姓名","年龄"};
            String[] content1 = {"1","姓名1","18"};
            String[] content2 = {"2","姓名2","18"};

            csvWriter.writeRecord(headers);
            csvWriter.writeRecord(content1);
            csvWriter.writeRecord(content2);

            csvWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

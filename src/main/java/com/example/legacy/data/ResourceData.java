package com.example.legacy.data;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.legacy.entity.Resource;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import org.springframework.stereotype.Service;

@Service
public class ResourceData {

    static private String calFile = "schema/cal.csv";
    static private String resourceFile = "schema/resource.csv";

    public List<Resource> getResources() {
        List<Resource> res = new ArrayList<Resource>();
        try {
            // 读取资源
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(resourceFile), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            Map<String, Resource> resourceMap = contents.stream()
                    .collect(Collectors.toMap(line -> line[0], line -> new Resource(line[0], line[1], line[3], Integer.valueOf(line[4]), null, null)));
            // 读取日历
            reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(calFile), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            contents = reader.readAll();
            for (String[] line : contents) {
                Resource resource = resourceMap.get(line[0]);
                resource.setDay(line[1]);
                resource.setShift(line[2]);
            }
            res = resourceMap.values().stream().collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
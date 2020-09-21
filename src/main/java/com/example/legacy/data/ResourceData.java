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

    static private String groupFile = "schema/group.csv";
    static private String deviceFile = "schema/device.csv";
    static private String resourceFile = "schema/resource.csv";

    public List<Resource> getGroups() {
        return getResources(groupFile);
    }

    public List<Resource> getDevices() {
        return getResources(deviceFile);
    }

    private List<Resource> getResources(String file) {
        List<Resource> res = new ArrayList<Resource>();
        try {
            // 读取资源获取资源数量
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(resourceFile), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            Map<String, Integer> groupSizeMap = contents.stream()
                    .collect(Collectors.toMap(line -> line[0], line -> Integer.valueOf(line[4])));
            // 读取设备
            reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            contents = reader.readAll();
            for (String[] line : contents)
                res.add(new Resource(line[0], groupSizeMap.get(line[0])));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
package com.apsh.legacy.data;

import com.apsh.legacy.entity.Item;
import com.apsh.legacy.entity.Product;
import com.apsh.legacy.entity.Resource;
import com.apsh.legacy.util.SchemaUtil;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ResourceData {

    static private final File calFile = SchemaUtil.loadSchema("cal.csv");
    static private final File resourceFile = SchemaUtil.loadSchema("resource.csv");

    public List<Resource> getResources() {
        List<Resource> res = new ArrayList<>();
        try {
            // 读取资源
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(resourceFile), StandardCharsets.UTF_8))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            Map<String, Resource> resourceMap = contents.stream()
                    .collect(Collectors.toMap(line -> line[0], line -> new Resource(line[0], line[1], line[3], Integer.valueOf(line[4]), null, null)));
            // 读取日历
            reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(calFile), StandardCharsets.UTF_8))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            contents = reader.readAll();
            for (String[] line : contents) {
                Resource resource = resourceMap.get(line[0]);
                resource.setDay(line[1]);
                resource.setShift(line[2]);
            }
            res = new ArrayList<>(resourceMap.values());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public Resource getResourcesByCode(String code) {
        return null;
    }

    public Item getItemByCode(String code) {
        return null;
    }

    public Product getProductByCode(String code) {
        return null;
    }
}
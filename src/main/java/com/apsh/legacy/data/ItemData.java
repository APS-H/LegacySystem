package com.apsh.legacy.data;

import com.apsh.legacy.entity.Item;
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

@Repository
public class ItemData {

    static private final File file = SchemaUtil.loadSchema("item.csv");

    public List<Item> getItems() {
        List<Item> res = new ArrayList<>();
        try {
            // 读取物品
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            for (String[] line : contents)
                res.add(new Item(line[0], line[1], line[2], line[3], line[8]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
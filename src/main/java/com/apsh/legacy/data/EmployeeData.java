package com.apsh.legacy.data;

import com.apsh.legacy.entity.Employee;
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
public class EmployeeData {

    static private final File file = SchemaUtil.loadSchema("group.csv");
    static private final File resourceFile = SchemaUtil.loadSchema("resource.csv");

    public List<Employee> getEmployees() {
        List<Employee> res = new ArrayList<>();
        try {
            // 读取资源获取小组人数
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(resourceFile), StandardCharsets.UTF_8))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            Map<String, Integer> groupSizeMap = contents.stream()
                    .collect(Collectors.toMap(line -> line[0], line -> Integer.valueOf(line[4])));
            // 读取小组
            reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            contents = reader.readAll();
            for (String[] line : contents)
                for (int i = 0; i < groupSizeMap.get(line[0]); i++)
                    res.add(new Employee(line[0], i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public Boolean Indentification(String employeeId) {
        return false;
    }
}
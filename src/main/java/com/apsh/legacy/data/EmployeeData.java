package com.apsh.legacy.data;

import com.apsh.legacy.entity.Employee;
import com.apsh.legacy.entity.Employees;
import com.apsh.legacy.util.Transformer;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@WebService
@Component
public class EmployeeData {

    static private final String file = "schema/group.csv";
    static private final String resourceFile = "schema/resource.csv";

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

    @WebMethod
    public String getEmployeesService() throws Exception {
        List<Employee> res = getEmployees();
        Employees emd = new Employees(res);
        Transformer<Employees> jtx = new Transformer<>();
        return jtx.java2Xml(emd);
    }

}
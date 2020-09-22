package com.example.legacy.data;

import com.example.legacy.entity.Employer;
import com.example.legacy.entity.Employers;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@WebService
public class EmployerData {

    static private String file = "schema/group.csv";
    static private String resourceFile = "schema/resource.csv";

    public List<Employer> getEmployers() {
        List<Employer> res = new ArrayList<Employer>();
        try {
            // 读取资源获取小组人数
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(resourceFile), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            List<String[]> contents = reader.readAll();
            Map<String, Integer> groupSizeMap = contents.stream()
                    .collect(Collectors.toMap(line -> line[0], line -> Integer.valueOf(line[4])));
            // 读取小组
            reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file), "utf-8"))
                    .withCSVParser(new CSVParserBuilder().withSeparator(',').build()).build();
            contents = reader.readAll();
            for (String[] line : contents)
                for (int i = 0; i < groupSizeMap.get(line[0]); i++)
                    res.add(new Employer(line[0], i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @WebMethod
    public String getEmployersService() throws Exception {
        List<Employer> res = getEmployers();
        Employers emd = new Employers(res);
        JavaToXml<Employers> jtx = new JavaToXml<>();
        return jtx.JavaToXml(emd);

    }




//测试用
    public static void main(String[] args) throws Exception {
        EmployerData s = new EmployerData();
        System.out.println(s.getEmployersService());
    }
}
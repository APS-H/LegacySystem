package com.apsh.legacy.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeDataTest {

    @Test
    public void TestGetEmployersService() throws Exception {
        EmployeeData s = new EmployeeData();
        String actual = s.getEmployeesService();
        System.out.println(actual);
        assertNotNull(actual);
        assertNotEquals(0, actual.length());
    }

}
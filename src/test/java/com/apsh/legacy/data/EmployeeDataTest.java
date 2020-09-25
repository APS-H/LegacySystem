package com.apsh.legacy.data;

import com.apsh.legacy.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeDataTest {

    @Test
    public void TestGetEmployersService() throws Exception {
        EmployeeService s = new EmployeeService();
        int amount = s.getEmployeesService().size();
        System.out.println(amount);
       // assertNotNull(actual);
        assertNotEquals(0, amount);
    }

}
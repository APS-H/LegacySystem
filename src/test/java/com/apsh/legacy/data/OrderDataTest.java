package com.apsh.legacy.data;

import com.apsh.legacy.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OrderDataTest {

    @Test
    public void TestGetOrderService() throws Exception {
        OrderService s = new OrderService();
        int actualAmount = s.getOrderAll().size();
        System.out.println(actualAmount);
        //assertNotNull(actual);
        assertNotEquals(0, actualAmount);
    }

}
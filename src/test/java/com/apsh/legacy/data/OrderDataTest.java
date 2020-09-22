package com.apsh.legacy.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OrderDataTest {

    @Test
    public void TestGetOrderService() throws Exception {
        OrderData s = new OrderData();
        String actual = s.getOrderService();
        System.out.println(actual);
        assertNotNull(actual);
        assertNotEquals(0, actual.length());
    }

}
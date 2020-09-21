package com.example.legacy.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataTests {

    @Autowired
    EmployerData employerData;

    @Autowired
    ItemData ItemData;

    @Autowired
    OrderData orderData;

    @Autowired
    ResourceData resourceData;

    @Test
    void getEmployersTest() {
        assertEquals(employerData.getEmployers().size(), 139);
    }

    @Test
    void getItemsTest() {
        assertEquals(ItemData.getItems().size(), 90);
    }

    @Test
    void getOrdersTest() {
        assertEquals(orderData.getOrders().size(), 78);
    }

    @Test
    void getResourcesTest() {
        assertEquals(resourceData.getGroups().size(), 34);
        assertEquals(resourceData.getDevices().size(), 31);
    }

}

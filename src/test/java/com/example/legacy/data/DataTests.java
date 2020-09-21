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

    @Autowired
    ShiftData shiftData;

    @Test
    void getEmployersTest() {
        assertEquals(139, employerData.getEmployers().size());
    }

    @Test
    void getItemsTest() {
        assertEquals(90, ItemData.getItems().size());
    }

    @Test
    void getOrdersTest() {
        assertEquals(78, orderData.getOrders().size());
    }

    @Test
    void getResourcesTest() {
        assertEquals(65, resourceData.getResources().size());
    }

    @Test
    void getShiftsTest() {
        assertEquals(4, shiftData.getShifts().size());
    }

}

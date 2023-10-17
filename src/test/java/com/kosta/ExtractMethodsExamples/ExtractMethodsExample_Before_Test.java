package com.kosta.ExtractMethodsExamples;


import junit.framework.TestSuite;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExtractMethodsExample_Before_Test extends TestSuite {

    @Test
    public void checkOutstandingAmount() {
        final String customerName = "June Park";
        Map<String, Integer> order = new HashMap<>();
        order.put("Milk", 10);
        order.put("Banana", 20);
        order.put("Bread", 30);
        assert ExtractMethodsExample_Before.printOutstandingAmountOfCustomer(customerName, order) == 60.0;
    }

}
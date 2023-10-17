package com.kosta.ExtractMethodsExamples;

import java.util.HashMap;
import java.util.Map;

public class ExtractMethodsExample_After_NoLocalVariables {

    public static void main(String[] args) {
        final String customerName = "June Park";
        Map<String, Integer> order = new HashMap<>();
        order.put("Milk", 10);
        order.put("Banana", 20);
        order.put("Bread", 30);
        printOutstandingAmountOfCustomer(customerName, order);
    }

    static double printOutstandingAmountOfCustomer(String customerName, Map<String, Integer> order) {

        double outstanding = 0.0;

        printBanner();

        // calculate outstanding
        for (Map.Entry<String, Integer> e : order.entrySet()) {
            outstanding += e.getValue();
        }

        //print details
        System.out.println ("name: " + customerName);
        System.out.println ("amount: " + outstanding);

        return outstanding;

    }

    private static void printBanner() {
        System.out.println ("**************************");
        System.out.println ("***** Customer Owes ******");
        System.out.println ("**************************");
    }

}

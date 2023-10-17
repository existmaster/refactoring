package com.kosta.ChangeValueToReferenceExample;

import com.kosta.ExtractClassExample.Person_Before;

import java.util.ArrayList;
import java.util.List;

public class Customer_After {

    private static List<Customer_After> customers = new ArrayList<>();

    public static void createCustomer(String name, String email) {
        customers.add(new Customer_After(name, email));
    }
    private String name, emailAddress;
    public Customer_After(String name, String email) {
        this.name = name;
        this.emailAddress = email;
    }

    public Customer_After(String name) { this.name = name; }

    public static Customer_After getCustomer(String name) {
        for (Customer_After customer : customers) {
            if (customer.getName().equals(name))
                return customer;
        }
        return null;
    }


    public String getName() { return name; }

}

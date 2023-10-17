package com.kosta.ChangeUnidirectionalAssociationToBidirectionalExample;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer_After {

    private String name, emailAddress;
    public Customer_After(String name) { this.name =name; }
    String getName() { return name; }
    void setName(String arg) { name = arg; }

    private Set<Order_After> orders = new HashSet<>();
    public Set<Order_After> friendOrders() {
        return orders;
    }
    public void addOrder(Order_After arg) {
        if (arg != null) arg.setCustomer(this);
    }
}

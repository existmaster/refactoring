package com.kosta.ReplaceDataValueWithObjectExample;

public class Order_Before {

    private final String orderID;
    private final String customer;

    public Order_Before(String orderID, String customer) {
        this.customer = customer;
        this.orderID = orderID;
    }

    public String getOrderID() { return orderID; }
    public String getCustomer() { return customer; }


}

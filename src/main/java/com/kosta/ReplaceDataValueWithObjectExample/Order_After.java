package com.kosta.ReplaceDataValueWithObjectExample;

public class Order_After {

    private final String orderID;
    private final Customer_After customer;

    public Order_After(String orderID, String customerName) {
        this.customer = new Customer_After(customerName);
        this.orderID = orderID;
    }

    public String getOrderID() { return orderID; }
    public String getCustomerName() { return customer.getName(); }


}

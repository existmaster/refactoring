package com.kosta.ChangeValueToReferenceExample;

public class Order_Before {
    private final String orderID;
    private final Customer_Before customer;

    public Order_Before(String orderID, String customerName) {
        this.orderID = orderID;
        this.customer = new Customer_Before(customerName);
    }

    public String getOrderID() { return orderID; }
    public String getCustomerName() { return customer.getName(); }

}

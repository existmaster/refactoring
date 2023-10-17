package com.kosta.ChangeUnidirectionalAssociationToBidirectionalExample;

public class Order_Before {

    private final String orderID;
    public Order_Before(String orderID) { this.orderID = orderID; }
    public String getOrderID() { return orderID; }

    Customer_Before customer = new Customer_Before("June Park");
    Customer_Before getCustomer() { return customer; }
    void setCustomer(Customer_Before arg) { customer = arg; }

}

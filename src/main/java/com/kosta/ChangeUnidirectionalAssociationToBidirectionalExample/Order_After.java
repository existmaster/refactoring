package com.kosta.ChangeUnidirectionalAssociationToBidirectionalExample;

public class Order_After {

    private final String orderID;
    public Order_After(String orderID) { this.orderID = orderID; }
    public String getOrderID() { return orderID; }

    Customer_After customer = new Customer_After("June Park");
    Customer_After getCustomer() { return customer; }
    void setCustomer(Customer_After arg) {
        if (customer != null) customer.friendOrders().remove(this);
        customer = arg;
        if (customer != null) customer.friendOrders().add(this);
    }

}

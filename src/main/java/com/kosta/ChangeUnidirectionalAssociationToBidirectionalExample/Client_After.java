package com.kosta.ChangeUnidirectionalAssociationToBidirectionalExample;

public class Client_After {

    public static void main(String[] args) {
        Order_After order = new Order_After("1234");
        Customer_After customer = new Customer_After("June Park");
        customer.addOrder(order);
        order.setCustomer(customer);
        System.out.println("Customer of Order ID " + order.getOrderID() +
                " is " + order.getCustomer().getName());
    }

}

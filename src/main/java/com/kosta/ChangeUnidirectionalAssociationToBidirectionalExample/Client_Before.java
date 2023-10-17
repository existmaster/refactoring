package com.kosta.ChangeUnidirectionalAssociationToBidirectionalExample;

public class Client_Before {

    public static void main(String[] args) {
        Order_Before order = new Order_Before("1234");
        Customer_Before customer = new Customer_Before("June Park");
        order.setCustomer(customer);
        System.out.println("Customer of Order ID " + order.getOrderID() +
                " is " + order.getCustomer().getName());
    }

}

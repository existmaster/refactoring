package com.kosta.ReplaceDataValueWithObjectExample;

public class Client_After {

    public static void main(String [] args) {

        String orderID = "1234";
        String customer = "June Park";
        Order_After order = new Order_After(orderID, customer);
        System.out.println("Customer of Order ID = " + order.getOrderID() + " is " + order.getCustomerName());

    }

}

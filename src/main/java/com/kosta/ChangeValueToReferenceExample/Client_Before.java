package com.kosta.ChangeValueToReferenceExample;

public class Client_Before {

    public static void main(String [] args) {

        String orderID = "1234";
        String customer = "June Park";
        Order_Before order = new Order_Before(orderID, customer);
        System.out.println("Customer of Order ID " + order.getOrderID() + " is " + order.getCustomerName());

    }

}

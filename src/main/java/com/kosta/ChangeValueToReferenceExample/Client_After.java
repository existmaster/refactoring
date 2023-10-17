package com.kosta.ChangeValueToReferenceExample;

public class Client_After {

    public static void main(String [] args) {
        Customer_After.createCustomer("June Park", "june@gmail.com");
        String orderID = "1234";
        Order_After order =
                new Order_After(
                        orderID,
                        Customer_After.getCustomer("June Park").getName()
                );
        System.out.println("Customer of Order ID " + order.getOrderID() + " is " + order.getCustomerName());

    }

}

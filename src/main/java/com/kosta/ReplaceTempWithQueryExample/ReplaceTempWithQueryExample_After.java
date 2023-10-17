package com.kosta.ReplaceTempWithQueryExample;

public class ReplaceTempWithQueryExample_After {

    static int quantity = 5;
    static double itemPrice = 1500.0;

    public static void main(String[] args) {
        System.out.println("Sales Amount = " + getSalesAmount());
    }

    private static double getSalesAmount() {
        return getBasePrice() * getDiscountFactor();
    }

    private static double getDiscountFactor() {
        if (getBasePrice() > 1000.0) return 0.95;
        else return 0.98;
    }

    private static double getBasePrice() {
        return quantity * itemPrice;
    }

}

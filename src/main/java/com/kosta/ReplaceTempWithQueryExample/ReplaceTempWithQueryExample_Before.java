package com.kosta.ReplaceTempWithQueryExample;

public class ReplaceTempWithQueryExample_Before {

    static int quantity = 5;
    static double itemPrice = 1500.0;

    public static void main(String[] args) {
        double salesAmount = getSalesAmount();
        System.out.println("Sales Amount = " + salesAmount);
    }

    private static double getSalesAmount() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 1000.0) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }

}

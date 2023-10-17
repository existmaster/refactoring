package com.kosta.IntroduceExplainingVariableExample;

public class IntroduceExplainingVariableExample_After {

    static int quantity = 700;
    static double itemPrice = 15;

    public static void main(String[] args) {
        System.out.println(salesAmount());
    }

    private static double salesAmount() {
        // salesAmount is base price - quantity discount + shipping
        double basePrice = quantity * itemPrice;
        double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        double shipping = Math.min(quantity * itemPrice * 0.1, 100.0);
        return basePrice - quantityDiscount + shipping;
    }

}

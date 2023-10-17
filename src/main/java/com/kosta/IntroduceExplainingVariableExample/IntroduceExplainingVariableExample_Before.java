package com.kosta.IntroduceExplainingVariableExample;

public class IntroduceExplainingVariableExample_Before {

    static int quantity = 700;
    static double itemPrice = 15;

    public static void main(String[] args) {
        System.out.println(salesAmount());
    }

    private static double salesAmount() {
        // salesAmount is base price - quantity discount + shipping
        return quantity * itemPrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(quantity * itemPrice * 0.1, 100.0);
    }

}

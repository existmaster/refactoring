package com.kosta.ReplaceMethodWithMethodObjectExample;

public class ReplaceMethodWithMethodObjectExample_After {
    public static void main(String[] args) {
        int x = 10, alpha = 3, beta = 7;
        Y y = new Y(x, alpha, beta);
        System.out.println("value of y = " + y.y());
    }
}

package com.kosta.ReplaceMethodWithMethodObjectExample;

public class ReplaceMethodWithMethodObjectExample_Before {
    public static void main(String[] args) {
        int x = 10, alpha = 3, beta = 7;
        System.out.println("value of y = " + y(x, alpha, beta));
    }

    static int y(int x, int alpha, int beta) {
        int temp1 = x * alpha;
        int temp2 = (x * beta) + 100;
        if ((beta - temp1) > 100)
            temp2 -= 20;
        int temp3 = temp2 * 7;
        return temp3 - 2 * temp1;
    }
}

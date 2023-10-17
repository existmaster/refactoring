package com.kosta.ReplaceMethodWithMethodObjectExample;

public class Y {

    private final int x;
    private final int alpha;
    private final int beta;

    public Y(int x, int alpha, int beta) {
        this.x = x;
        this.alpha = alpha;
        this.beta = beta;
    }

    int y() {
        int temp1 = x * alpha;
        int temp2 = (x * beta) + 100;
        if ((beta - temp1) > 100)
            temp2 -= 20;
        int temp3 = temp2 * 7;
        return temp3 - 2 * temp1;
    }

}

package com.kosta.IntroduceLocalExtensionExample;

import java.util.Date;

public class Client_Before {
    private static Date nextDay(Date arg) { // foreign method, should be on date
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("Next day is " + nextDay(today));
    }
}

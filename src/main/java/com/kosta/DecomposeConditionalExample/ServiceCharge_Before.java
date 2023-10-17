package com.kosta.DecomposeConditionalExample;

import java.util.Date;

public class ServiceCharge_Before {

    private static double charge, normalRate = 200.0, winterRate = 300.0, winterCharge = 500.0;
    private int numberOfDays;

    public static double calculateCharge(Date date, int numberOfDays) {

        if (date.getMonth() == 11 || date.getMonth() == 0 || date.getMonth() == 1 )
            charge = numberOfDays * winterRate + winterCharge;
        else charge = numberOfDays * normalRate;
        return charge;

    }

    public static void main(String[] args) {

        Date today = new Date();
        System.out.println("Service charge is " + calculateCharge(today,15));

    }

}

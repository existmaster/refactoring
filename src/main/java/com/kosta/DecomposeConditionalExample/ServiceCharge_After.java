package com.kosta.DecomposeConditionalExample;

import java.util.Date;

public class ServiceCharge_After {

    private static double charge, normalRate = 200.0, winterRate = 300.0, winterCharge = 500.0;
    private int numberOfDays;

    public static double calculateCharge(Date date, int numberOfDays) {

        if (isWinter(date)) return winterCharge(numberOfDays);
        else return normalCharge(numberOfDays);
    }

    private static double normalCharge(int numberOfDays) {
        return numberOfDays * normalRate;
    }

    private static double winterCharge(int numberOfDays) {
        return numberOfDays * winterRate + winterCharge;
    }

    private static boolean isWinter(Date date) {
        return date.getMonth() == 11 || date.getMonth() == 0 || date.getMonth() == 1;
    }

    public static void main(String[] args) {

        Date today = new Date();
        System.out.println("Service charge is " + calculateCharge(today,15));

    }

}

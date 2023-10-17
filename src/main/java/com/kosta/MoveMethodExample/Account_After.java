package com.kosta.MoveMethodExample;

public class Account_After {

    private static String accountID = "P12345";
    private static AccountType_Before accountType;


    private static int daysOverdrawn = 10;

    public static int getDaysOverdrawn() {
        return daysOverdrawn;
    }
    public static String getAccountID() {
        return accountID;
    }

    public static void main(String[] args) {
        System.out.println("Bank Charge = " + bankCharge());
    }

    static double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) result += AccountType_After.overdraftCharge();
        return result;
    }


}

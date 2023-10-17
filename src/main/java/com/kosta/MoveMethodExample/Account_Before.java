package com.kosta.MoveMethodExample;

public class Account_Before {

    private static String accountID = "P12345";
    private static AccountType_Before accountType;
    private static int daysOverdrawn = 10;

    public static String getAccountID() {
        return accountID;
    }

    public static void main(String[] args) {
        System.out.println("Bank Charge = " + bankCharge());
    }

    static double overdraftCharge() {
        if (accountType.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result +=
                    (daysOverdrawn - 7) * 0.85;
            return result;
        }
        else return daysOverdrawn * 1.75;
    }

    static double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }


}

package com.kosta.MoveMethodExample;

public class AccountType_After {
    public static boolean isPremium() {
        if (Account_Before.getAccountID().charAt(0) == 'P')
            return true;
        else return false;
    }

    static double overdraftCharge() {
        int daysOverdrawn = Account_After.getDaysOverdrawn();
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) result +=
                    (daysOverdrawn - 7) * 0.85;
            return result;
        }
        else return daysOverdrawn * 1.75;
    }

}

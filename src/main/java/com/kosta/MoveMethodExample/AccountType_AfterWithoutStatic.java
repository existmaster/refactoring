package com.kosta.MoveMethodExample;

public class AccountType_AfterWithoutStatic {
    public boolean isPremium(String accountId) {
        if (accountId.charAt(0) == 'P')
            return true;
        else return false;
    }

    public double overdraftCharge(String accountId, int daysOverdrawn) {
        if (isPremium(accountId)) {
            double result = 10;
            if (daysOverdrawn > 7) result +=
                    (daysOverdrawn - 7) * 0.85;
            return result;
        }
        else return daysOverdrawn * 1.75;
    }

}

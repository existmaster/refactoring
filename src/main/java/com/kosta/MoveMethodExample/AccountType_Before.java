package com.kosta.MoveMethodExample;

public class AccountType_Before {
    public static boolean isPremium() {
        if (Account_Before.getAccountID().charAt(0) == 'P')
            return true;
        else return false;
    }
}

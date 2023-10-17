package com.kosta.MoveMethodExample;

public class Account_AfterWithoutStatic {

    private final String accountID;
    private final AccountType_AfterWithoutStatic accountType;
    private int daysOverdrawn;

    public Account_AfterWithoutStatic(String accountID, int daysOverdrawn) {
        this.accountID = accountID;
        this.daysOverdrawn = daysOverdrawn;
        accountType = new AccountType_AfterWithoutStatic();
    }

    public int getDaysOverdrawn() {
        return daysOverdrawn;
    }
    public String getAccountID() {
        return accountID;
    }

    public void setDaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }

    public static void main(String[] args) {
        Account_AfterWithoutStatic accountA
                = new Account_AfterWithoutStatic(
                        "P12345", 10
        );
        Account_AfterWithoutStatic accountB
                = new Account_AfterWithoutStatic(
                        "A53232", 10
        );
        System.out.println("Bank Charge = " + accountA.bankCharge());
        System.out.println("Bank Charge = " + accountB.bankCharge());
    }

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) result += accountType.overdraftCharge(accountID, daysOverdrawn);
        return result;
    }


}

package org.kemy.aggregationAndComposition.bills;

public class Bill {
    private int billNumber;
    private boolean block;
    private double accountAmount;
    private String nameCustomer;
    public static int counterNumber = 1;

    public Bill(int accountNumber, boolean block, double accountAmount, String nameCustomer) {
        this.billNumber = accountNumber;
        this.block = block;
        this.accountAmount = accountAmount;
        this.nameCustomer = nameCustomer;
    }

    public int getAccountNumber() {
        return billNumber;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    @Override
    public String toString() {

        return "billNumber = " + billNumber +
                " nameCustomer = " + nameCustomer +
                " accountAmount = " + accountAmount +
                " state of an account is " + ((block) ? "locked" : "unlocked");
    }
}

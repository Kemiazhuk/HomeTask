package org.kemy.aggregationAndComposition.bills;

public class Bills {
    private boolean block;
    private double accountAmount;
    private String nameCustomer;

    public Bills(boolean block, double accountAmount, String nameCustomer) {
        this.block = block;
        this.accountAmount = accountAmount;
        this.nameCustomer = nameCustomer;
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

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    @Override
    public String toString() {
        return   " nameCustomer = " + nameCustomer +
                "  accountAmount = " + accountAmount;
    }
}

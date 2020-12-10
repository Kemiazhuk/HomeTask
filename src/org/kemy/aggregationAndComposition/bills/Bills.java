package org.kemy.aggregationAndComposition.bills;

public class Bills {
    private int id;
    private boolean block;
    private double accountAmount;
    private String nameCustomer;

    public Bills(int id, boolean block, double accountAmount, String nameCustomer) {
        this.id = id;
        this.block = block;
        this.accountAmount = accountAmount;
        this.nameCustomer = nameCustomer;
    }

    public int getId() {
        return id;
    }

    public boolean isBlock() {
        return block;
    }

//    public void setBlock(boolean block) {
//        this.block = block;
//    }

    public void lockUnlock(){
        if (block) {
            block = false;
        } else {
            block = true;
        }
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
        return "id = " + id +
                " nameCustomer = " + nameCustomer +
                " accountAmount = " + accountAmount +
                " state of an account is " + ((block) ? "locked" : "unlocked");
    }
}

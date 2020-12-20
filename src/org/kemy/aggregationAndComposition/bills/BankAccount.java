package org.kemy.aggregationAndComposition.bills;

import java.math.BigDecimal;
import java.util.UUID;

public class BankAccount {
    private UUID accountNumber;
    private boolean lock;
    private BigDecimal accountAmount;
    private String nameCustomer;

    public BankAccount(UUID accountNumber, boolean lock, BigDecimal accountAmount, String nameCustomer) {
        this.accountNumber = accountNumber;
        this.lock = lock;
        this.accountAmount = accountAmount;
        this.nameCustomer = nameCustomer;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }

    public void withdrawMoneyFromAccount(BigDecimal amount) throws NotEnoughMoney {
        if (accountAmount.compareTo(amount) >= 0) {
            accountAmount = accountAmount.subtract(amount);
        } else {
            throw new NotEnoughMoney();
        }
    }


    public void putMoneyIntoAccount(BigDecimal amount) {
        accountAmount = accountAmount.add(amount);
    }


    @Override
    public String toString() {

        return nameCustomer + " " + accountNumber + " " + accountAmount + " $" +
                " state of an account is " + ((lock) ? "locked" : "unlocked");
    }
}

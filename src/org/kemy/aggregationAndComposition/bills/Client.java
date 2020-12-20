package org.kemy.aggregationAndComposition.bills;

import java.math.BigDecimal;
import java.util.*;

public class Client {
    private UUID id;
    private String name;
    private List<UUID> clientBankAccountsId = new ArrayList<>();

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<UUID> getClientBankAccountsId() {
        return clientBankAccountsId;
    }

    public Client(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public BankAccount createBankAccount() {
        BankAccount newBankAccount = new BankAccount(UUID.randomUUID(), false, BigDecimal.valueOf(0), name);
        clientBankAccountsId.add(newBankAccount.getAccountNumber());
        return newBankAccount;
    }

}

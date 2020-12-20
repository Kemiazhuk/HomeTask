package org.kemy.aggregationAndComposition.bills;

import java.math.BigDecimal;
import java.util.*;

public class Bank {
    private HashMap<UUID, Client> allClients;
    private HashMap<UUID, BankAccount> allAccounts;


    public HashMap<UUID, BankAccount> getAllAccounts() {
        return allAccounts;
    }

    public HashMap<UUID, Client> getAllClients() {
        return allClients;
    }

    public Bank(HashMap<UUID, Client> allClients, HashMap<UUID, BankAccount> allAccounts) {
        this.allClients = allClients;
        this.allAccounts = allAccounts;
    }

    public void addClient(Client client) {
        allClients.put(client.getId(), client);
    }

    public UUID addBankAccount(BankAccount bankAccount) {
        allAccounts.put(bankAccount.getAccountNumber(), bankAccount);
        return bankAccount.getAccountNumber();
    }

    public Client searchByIdClient(UUID id) {
        return allClients.get(id);
    }

    public Client addNewClient(String name) {
        UUID id = UUID.randomUUID();
        allClients.put(id, new Client(id, name));
        return allClients.get(id);
    }

    public void lockUnlockAccount(UUID id) {
        if (allAccounts.get(id).isLock()) {
            allAccounts.get(id).setLock(false);
        } else {
            allAccounts.get(id).setLock(true);
        }
    }

    public BigDecimal amountAllBills(List<UUID> id) {
        BigDecimal sum = new BigDecimal(0);
        for (UUID u : id) {
            sum = sum.add(allAccounts.get(u).getAccountAmount());
        }
        return sum;
    }

    public BigDecimal amountPositiveAccounts(List<UUID> id) {
        BigDecimal sum = new BigDecimal(0);
        for (UUID u : id) {
            if (allAccounts.get(u).getAccountAmount().compareTo(BigDecimal.valueOf(0)) >= 0) {
                sum = sum.add(allAccounts.get(u).getAccountAmount());
            }
        }
        return sum;
    }

    public BigDecimal amountNegativeAccounts(List<UUID> id) {
        BigDecimal sum = new BigDecimal(0);
        for (UUID u : id) {
            if (allAccounts.get(u).getAccountAmount().compareTo(BigDecimal.valueOf(0)) < 0) {
                sum = sum.add(allAccounts.get(u).getAccountAmount());
            }
        }
        return sum;
    }

    public List<BankAccount> sortByAccountAmount(List<UUID> id) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        for (UUID u : id) {
            bankAccounts.add(allAccounts.get(u));
        }
        Collections.sort(bankAccounts, Comparator.comparing(BankAccount::getAccountAmount));
        return bankAccounts;
    }

}

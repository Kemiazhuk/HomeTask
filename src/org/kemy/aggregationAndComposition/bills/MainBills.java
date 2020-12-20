package org.kemy.aggregationAndComposition.bills;

import org.kemy.Input;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.UUID;

public class MainBills {
    public static void main(String[] args) {

        Bank bank = new Bank(new HashMap<>(), new HashMap<>());
        Client firstClient = new Client(UUID.randomUUID(), "Ivanov");
        Client secondClient = new Client(UUID.randomUUID(), "Petrov");
        secondClient.setId(UUID.fromString("6d986af6-efc2-4e9c-afac-18aea3d2b2e6"));
        Client thirdClient = new Client(UUID.randomUUID(), "Sidorov");

        bank.addClient(firstClient);
        bank.addClient(secondClient);
        bank.addClient(thirdClient);

        UUID newId = bank.addBankAccount(firstClient.createBankAccount());
        bank.getAllAccounts().get(newId).putMoneyIntoAccount(BigDecimal.valueOf(4545.22));
        newId = bank.addBankAccount(firstClient.createBankAccount());
        bank.getAllAccounts().get(newId).putMoneyIntoAccount(BigDecimal.valueOf(-6.34));

        newId = bank.addBankAccount(secondClient.createBankAccount());
        bank.getAllAccounts().get(newId).putMoneyIntoAccount(BigDecimal.valueOf(34344.34));
        newId = bank.addBankAccount(secondClient.createBankAccount());
        bank.getAllAccounts().get(newId).putMoneyIntoAccount(BigDecimal.valueOf(-12.44));
        newId = bank.addBankAccount(secondClient.createBankAccount());
        bank.getAllAccounts().get(newId).putMoneyIntoAccount(BigDecimal.valueOf(100000.33));
        UUID idForLockUnlock = newId;
        System.out.println();
        newId = bank.addBankAccount(thirdClient.createBankAccount());
        bank.getAllAccounts().get(newId).putMoneyIntoAccount(BigDecimal.valueOf(134));

        try {
            bank.getAllAccounts().get(newId).withdrawMoneyFromAccount(BigDecimal.valueOf(234));
        } catch (NotEnoughMoney ex) {
            System.out.println("You haven't enough money");
        }


        System.out.println("Enter your id");
        Client client = bank.searchByIdClient(UUID.fromString("6d986af6-efc2-4e9c-afac-18aea3d2b2e6"));
        if (client == null) {
            System.out.println("We don't have you account. We can create new account for you! Enter Y/N");
            if (Input.inputChar() == 'Y') {
                System.out.println("Enter your name");
                client = bank.addNewClient(Input.inputStr());
                System.out.println("Your id will be " + client.getId());
            }
        } else {
            System.out.println("Hello " + client.getName() + ". You have :");
            System.out.println(client.getClientBankAccountsId().toString());
            bank.lockUnlockAccount(idForLockUnlock);
            System.out.println("Your balance on all bills " + bank.amountAllBills(client.getClientBankAccountsId()));
            System.out.println("Your balance on positive bills " + bank.amountPositiveAccounts(client.getClientBankAccountsId()));
            System.out.println("Your balance on negative bills " + bank.amountNegativeAccounts(client.getClientBankAccountsId()));
            System.out.println(bank.sortByAccountAmount(client.getClientBankAccountsId()).toString());

        }
    }
}

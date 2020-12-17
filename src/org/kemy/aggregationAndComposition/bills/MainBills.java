package org.kemy.aggregationAndComposition.bills;

import org.kemy.Input;

import java.util.ArrayList;

public class MainBills {
    public static void main(String[] args) {

        Client firstClient = new Client(Client.counterId++, "Ivanov");
        Client secondClient = new Client(Client.counterId++, "Petrov");
        Client thirdClient = new Client(Client.counterId++, "Sidorov");

        firstClient.createBill(4556.26);
        firstClient.createBill(-6.26);
        secondClient.createBill(34555.44);
        thirdClient.createBill(12.11);
        thirdClient.createBill(100.11);
        thirdClient.createBill(-1.11);

        AllBankClients allBankClients = new AllBankClients(new ArrayList<Client>());
        allBankClients.addClient(firstClient);
        allBankClients.addClient(secondClient);
        allBankClients.addClient(thirdClient);

        System.out.println("Enter your id");
        int id = Input.inputInt();
        Client client = allBankClients.searchByIdClient(id);
        if (client == null) {
            System.out.println("We don't have you account. We can create new account for you! Enter Y/N");
            if (Input.inputChar() == 'Y') {
                System.out.println("Enter your name");
                allBankClients.addNewClient(Input.inputStr());
            }
        } else {
            System.out.println("Hello " + client.getName() + ". You have :");
            client.sortByAccountAmount();
            System.out.println(client.getBillsClient().toString());
            System.out.println("Enter bill number to lock bill");
            client.lockBill(Input.inputInt());

            System.out.println("Your balance on all bills " + client.amountAllBills());
            System.out.println("Your balance on positive bills " + client.amountPositiveBills());
            System.out.println("Your balance on negative bills " + client.amountNegativeBills());

            System.out.println("Enter which bank account you want to top up");
            int numBill = Input.inputInt();
            System.out.println("Enter how much money your want to put on bill");
            double addMoney = Input.inputDouble();

            client.topUpBill(numBill,addMoney);

        }
    }
}

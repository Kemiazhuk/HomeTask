package org.kemy.aggregationAndComposition.bills;

import org.kemy.Input;

import java.util.ArrayList;

public class AllBankClients {
    private ArrayList<Client> clients;

    public AllBankClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client searchByIdClient(int id) {
        for (Client c : clients) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void addNewClient(String name) {
        Client client = new Client(Client.counterId++, name);
        System.out.println("Enter account amount");
        client.createBill(Input.inputDouble());
        clients.add(client);
    }
}

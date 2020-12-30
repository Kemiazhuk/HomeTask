package org.kemy.taskClass.customer;

import java.util.UUID;

public class Customer {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private String creditCard;
    private UUID bankAccount;

    public Customer( String lastName, String firstName, String patronymic, String address, String creditCard, UUID bankAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + patronymic;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public UUID getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(UUID bankAccount) {
        this.bankAccount = bankAccount;
    }
}

package com.haulmont.testtask;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.domain.Credit;
import com.haulmont.testtask.storage.ClientStorage;
import com.haulmont.testtask.storage.CreditStorage;
import com.haulmont.testtask.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static Storage clientStorage;
    private static Storage creditStorage;

    static {
        clientStorage = new ClientStorage();
        creditStorage = new CreditStorage();
    }

    public Bank() {

    }

    public void printAllClient() {
        clientStorage.getAll().forEach(System.out::println);
    }

    public void printAllCredit() {
        creditStorage.getAll().forEach(System.out::println);
    }

    public void addClient(Client client) {
        clientStorage.addItem(client);
        System.out.println("Клиент " + client + " добавлен");
    }

    public void editClient() {
        System.out.println("Клиент изменен");
    }

    public void deleteClient() {
        System.out.println("Клиент удален");
    }

    public void addCredit(Credit credit) {
        creditStorage.addItem(credit);
        System.out.println("Кредит добавлен");
    }

    public void editCredit() {
        System.out.println("Кредит изменен");
    }

    public void deleteCredit() {
        System.out.println("Кредит удален");
    }

}

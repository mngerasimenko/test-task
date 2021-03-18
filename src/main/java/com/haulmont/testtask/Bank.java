package com.haulmont.testtask;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clientList;
    private List<Credit> creditList;

    public Bank() {
      this.clientList = new ArrayList<>();
      this.creditList = new ArrayList<>();
    }

    public void printAllClient() {
        System.out.println(clientList);
    }

    public void printAllCredit() {
        System.out.println(creditList);
    }

    public void addClient() {
        String surName = "Иванов";
        String foreName = "Евгений";
        String patronymic = "Петрович";
        String telephone = "8 938 123 11 22";
        String email = "my_mail@mail.ru";
        String passport = "8422 4875602";

        Client client = new Client(surName, foreName, patronymic, telephone, email, passport);
        clientList.add(client);
        System.out.println("Клиент " + client + " добавлен");

        surName = "Ригованов";
        foreName = "Максим";
        patronymic = "Сергеевич";
        telephone = "8 905 662 15 73";
        email = "mynew_mail@mail.ru";
        passport = "6655 23456788";

        client = new Client(surName, foreName, patronymic, telephone, email, passport);
        clientList.add(client);

        System.out.println("Клиент " + client + " добавлен");
    }

    public void editClient() {
        System.out.println("Клиент изменен");
    }

    public void deleteClient() {
        System.out.println("Клиент удален");
    }

    public void addCredit() {
        Credit credit1 = new Credit(1000000.00, 12.3);
        Credit credit2 = new Credit(500000.00, 10.4);
        creditList.add(credit1);
        creditList.add(credit2);
        System.out.println("Кредит добавлен");
    }

    public void editCredit() {
        System.out.println("Кредит изменен");
    }

    public void deleteCredit() {
        System.out.println("Кредит удален");
    }

}

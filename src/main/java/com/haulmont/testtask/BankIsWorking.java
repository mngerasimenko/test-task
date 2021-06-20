package com.haulmont.testtask;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.domain.Credit;

public class BankIsWorking {

    public static void main(String[] args) {
        Bank bank = new Bank();

        String surName = "Иванов";
        String foreName = "Евгений";
        String patronymic = "Петрович";
        String telephone = "8 938 123 11 22";
        String email = "my_mail@mail.ru";
        String passport = "8422 4875602";
        //Client client = new Client(surName, foreName, patronymic, telephone, email, passport);
        //bank.addClient(client);

        surName = "Ригованов";
        foreName = "Максим";
        patronymic = "Сергеевич";
        telephone = "8 905 662 15 73";
        email = "mynew_mail@mail.ru";
        passport = "6655 23456788";
       // client = new Client(surName, foreName, patronymic, telephone, email, passport);
       // bank.addClient(client);


        bank.addCredit(new Credit(1_000_000.00, 12.3));
        bank.addCredit(new Credit(500_000.00, 22.5));

        System.out.println();
        bank.printAllClient();
        System.out.println();
        bank.printAllCredit();

    }
}

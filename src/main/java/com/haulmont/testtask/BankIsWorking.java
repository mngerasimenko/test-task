package com.haulmont.testtask;

public class BankIsWorking {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCredit();
        bank.addClient();


        bank.printAllClient();
        bank.printAllCredit();

    }
}

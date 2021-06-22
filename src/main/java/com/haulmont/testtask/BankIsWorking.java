package com.haulmont.testtask;

import com.fasterxml.uuid.Generators;
import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.domain.Credit;

import java.util.UUID;

public class BankIsWorking {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        uuid = Generators.timeBasedGenerator().generate();
        System.out.println(uuid);

    }
}

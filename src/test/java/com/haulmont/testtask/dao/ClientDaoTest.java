package com.haulmont.testtask.dao;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClientDaoTest {

    @Test
    public void getAll() throws DaoException {
        ClientDao clientDao = new ClientDao();
        List<Client> clients = clientDao.getAll();

        clients.forEach(c -> {
            System.out.println("FIO: " + c.getFio());
            System.out.println("Class: " + c.getClass());
            System.out.println("Credits: " + c.getBanks().size());
            c.getBanks().forEach(b -> {
                System.out.println(b.getCredit());
            });
        });
    }
}
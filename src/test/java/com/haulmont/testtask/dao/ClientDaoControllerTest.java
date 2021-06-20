package com.haulmont.testtask.dao;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;

import java.util.List;

import static org.junit.Assert.*;

public class ClientDaoControllerTest {

    ClientDaoController cdc = new ClientDaoController();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void findItem() {
    }

    @org.junit.Test
    public void getItem() {
    }

    @org.junit.Test
    public void insertItem() {
    }

    @org.junit.Test
    public void deleteItem() {
    }

    @org.junit.Test
    public void getAll() throws DaoException {
        List<Client> clientList = cdc.getAll();
        List<Client> clientList2 = cdc.getAll();
    }
}
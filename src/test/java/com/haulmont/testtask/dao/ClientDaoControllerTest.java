package com.haulmont.testtask.dao;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;
import org.junit.Assert;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static org.junit.Assert.*;

public class ClientDaoControllerTest {

    private static ClientDaoController cdc;

    @BeforeClass
    public static void initTest() throws Exception {
        DBInit.initDB();
        cdc = new ClientDaoController();
    }

//    @org.junit.Test
//    public void findItem() {
//    }
//
//    @org.junit.Test
//    public void getItem() {
//    }
//
//    @org.junit.Test
//    public void insertItem() {
//    }
//
//    @org.junit.Test
//    public void deleteItem() {
//    }

    @org.junit.Test
    public void getAll() throws DaoException {
        //List<Client> clientList = cdc.getAll();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager();


        List clientList = em.createQuery("FROM Client ").getResultList();
        clientList.forEach(c -> System.out.println(c));

        em.close();

        Assert.assertTrue(clientList.size() == 3);
    }
}
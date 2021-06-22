package com.haulmont.testtask.dao;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Component
public class ClientDao implements DaoController{

    private EntityManager entityManager;

    public ClientDao() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        entityManager = factory.createEntityManager();
    }

    @Override
    public List findItem(String patten) {
        return null;
    }

    @Override
    public Object getItem(Object id) {
        return null;
    }

    @Override
    public Object insertItem(Object item) {
        return null;
    }

    @Override
    public void deleteItem(Object id) {

    }

    @Override
    public List<Client> getAll() throws DaoException {
        return entityManager.createQuery("SELECT cl FROM Client cl").getResultList();
    }

}

package com.haulmont.testtask.dao;

import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

@Component("clientDao")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ClientDao implements DaoController<Client, UUID>{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List findItem(String patten) {
        return null;
    }

    @Override
    public Client getItem(UUID id) {
        return null;
    }

    @Override
    public UUID insertItem(Client item) {
        return null;
    }

    @Override
    public void deleteItem(UUID id) {

    }

    @Override
    public List<Client> getAll() throws DaoException {
        return entityManager.createQuery("SELECT cl FROM Client cl").getResultList();
    }

}

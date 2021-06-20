package com.haulmont.testtask.dao;

import com.haulmont.testtask.exception.DaoException;

import java.sql.Connection;
import java.util.List;

public interface DaoController<E, K> {

    List<E> findItem(String patten);
    E getItem(K id);
    K insertItem(E item);
    void deleteItem(K id);
    List<E> getAll() throws DaoException;
}

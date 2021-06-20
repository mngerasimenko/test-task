package com.haulmont.testtask.dao;

import com.haulmont.testtask.config.Config;
import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ClientDaoController implements DaoController<Client, Integer>{

    private static final Logger logger = LoggerFactory.getLogger(ClientDaoController.class);

    ConnectionBuilder cb;


    private final String GET_ALL = "SELECT * FROM bk_client LIMIT ?;";

    public ClientDaoController() {
        try {
            cb = ConnectionBuilder.getConnectionBuilder();
        } catch (SQLException ex) {
            logger.error("", ex);
        }
    }

    @Override
    public List findItem(String patten) {
        return null;
    }

    @Override
    public Client getItem(Integer id) {
        return null;
    }

    @Override
    public Integer insertItem(Client item) {
        return null;
    }


    @Override
    public void deleteItem(Integer id) {

    }

    @Override
    public List<Client> getAll() throws DaoException {
        List<Client> resultList = new LinkedList<>();
        try {
            Connection con = cb.getConnection();
            PreparedStatement stmt = con.prepareStatement(GET_ALL);
            stmt.setInt(1, Integer.parseInt(Config.getProperty(Config.DB_LIMIT)));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Client client = new Client(rs.getInt("client_id"), rs.getString("fio")
                        , rs.getString("telephone"), rs.getString("email")
                        , rs.getString("passport"));
                System.out.println(client);
                resultList.add(client);
            }
        } catch (SQLException ex) {
            logger.error("", ex);
            throw new DaoException();
        }
        return resultList;
    }
}

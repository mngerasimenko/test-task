package com.haulmont.testtask.dao;

import com.haulmont.testtask.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

    private static final Logger logger = LoggerFactory.getLogger(ConnectionBuilder.class);

    private static ConnectionBuilder instance;
    private Connection connection;

    private ConnectionBuilder() throws SQLException {
        this.connection = DriverManager.getConnection(
                Config.getProperty(Config.DB_URL),
                Config.getProperty(Config.DB_LOGIN),
                Config.getProperty(Config.DB_PASSWORD)
        );
        logger.info("connection");
    }

    public static ConnectionBuilder getConnectionBuilder() throws SQLException {
        if (instance == null) {
            instance = new ConnectionBuilder();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }


}

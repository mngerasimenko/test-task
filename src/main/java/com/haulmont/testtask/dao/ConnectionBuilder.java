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
    private static String urlDB;

    private ConnectionBuilder() throws SQLException {
        this.connection = DriverManager.getConnection(
                urlDB,
                Config.getProperty(Config.DB_LOGIN),
                Config.getProperty(Config.DB_PASSWORD)
        );
        logger.info("connection susses", connection);
    }


    public static ConnectionBuilder getConnectionBuilder() throws SQLException {
        if (instance == null) {
            ConnectionBuilder.urlDB = Config.getProperty(Config.DB_URL);
            instance = new ConnectionBuilder();
        }
        return instance;
    }

    public static ConnectionBuilder getTestConnectionBuilder() throws SQLException {
        if (instance == null) {
            ConnectionBuilder.urlDB = Config.getProperty(Config.DB_TEST_URL);
            instance = new ConnectionBuilder();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}

package com.haulmont.testtask.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class DBInit {

    private static final Logger LOGGER = LoggerFactory.getLogger(DBInit.class);

    public static void initDB() throws Exception {
        URL urlData = ClientDaoController.class.getClassLoader().getResource("bank.sql");
        List<String> strBank = Files.readAllLines(Paths.get(urlData.toURI()));
        String[] sqlStrings = String.join(" ", strBank).split(";");
        Connection connection = ConnectionBuilder.getTestConnectionBuilder().getConnection();
        Statement stmt = connection.createStatement();

        for (String sql: sqlStrings) {
            LOGGER.info(sql);
            stmt.executeUpdate(sql);
        }
    }
}

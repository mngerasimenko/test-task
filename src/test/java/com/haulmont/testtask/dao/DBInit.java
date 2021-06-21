package com.haulmont.testtask.dao;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class DBInit {

    public static void initDB() throws Exception {
        URL urlData = ClientDaoController.class.getClassLoader().getResource("bank.sql");
        List<String> strBank = Files.readAllLines(Paths.get(urlData.toURI()));
        String[] sqlStrings = String.join(" ", strBank).split(";");
        Connection connection = ConnectionBuilder.getTestConnectionBuilder().getConnection();
        Statement stmt = connection.createStatement();

        for (String sql: sqlStrings) {
            stmt.executeUpdate(sql);
        }
    }
}

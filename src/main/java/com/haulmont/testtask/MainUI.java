package com.haulmont.testtask;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Theme(ValoTheme.THEME_NAME)
public class MainUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);

        Button testButton = new Button("Test");
        testButton.addClickListener(event -> {
            try {
                Class.forName("org.hsqldb.jdbc.JDBCDriver" );
            } catch (Exception e) {
                System.err.println("ERROR: failed to load HSQLDB JDBC driver.");
                e.printStackTrace();
                return;
            }

            try {
                Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/db_bank", "SA", "");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });

        layout.addComponent(new Label("Main UI"));
        layout.addComponent(testButton);


        setContent(layout);
    }
}
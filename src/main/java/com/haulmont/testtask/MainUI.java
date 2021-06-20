package com.haulmont.testtask;

import com.haulmont.testtask.dao.ClientDaoController;
import com.haulmont.testtask.domain.Client;
import com.haulmont.testtask.exception.DaoException;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;


@Theme(ValoTheme.THEME_NAME)
public class MainUI extends UI {

    ClientDaoController cdc = new ClientDaoController();

    private Grid clientGrid;
    private Table clientTable = new Table();
    List<Client> clientList = new ArrayList<>();

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setMargin(true);

        TextArea textArea = new TextArea();
        textArea.setSizeFull();

        Button testButton = new Button("Test");
        testButton.addClickListener(event -> {
            clientList = new LinkedList<>();
            try {
               clientList =  cdc.getAll();
            } catch (DaoException e) {
                e.printStackTrace();
            }

            //initTable();
            for (Client client: clientList) {
                textArea.setValue(textArea.getValue() + "\n" + client.toString());

            }

        });

        layout.addComponent(new Label("Main UI"));
       // initTable();

        layout.addComponent(clientTable);
        layout.addComponent(textArea);
        layout.addComponent(testButton);




        setContent(layout);
    }

    public void initTable() {

        //if (clientTable == null) clientTable = new Table();
        clientTable.removeAllItems();

        try {
            clientList = cdc.getAll();
        } catch (DaoException e) {
            e.printStackTrace();
        }
        if (clientList != null && !clientList.isEmpty()) {

            clientTable.addItems(clientList);


        }


    }
}
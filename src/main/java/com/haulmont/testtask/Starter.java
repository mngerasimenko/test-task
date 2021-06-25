package com.haulmont.testtask;

import com.haulmont.testtask.dao.ClientDao;
import com.haulmont.testtask.exception.DaoException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) throws DaoException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"springContext.xml"});
        ClientDao controller = context.getBean("clientDao", ClientDao.class);
        System.out.println(controller.getAll());
    }
}

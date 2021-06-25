package com.haulmont.testtask.config;

import com.haulmont.testtask.dao.ClientDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:/config.properties")
public class ConfigProperties {

    @Bean
    public ClientDao buildClientDao() {
        System.out.println("ClientDao is created");
        return new ClientDao();
    }
}

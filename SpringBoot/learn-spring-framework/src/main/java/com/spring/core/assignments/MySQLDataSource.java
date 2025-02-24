package com.spring.core.assignments;

import org.springframework.stereotype.Component;

@Component("mySqlDataSource")
public class MySQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {

        return new String[]{"abc@gmail.com","John@gmail.com","sony@gmail.com"};
    }
}

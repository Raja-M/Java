package com.spring.core.assignments;

import org.springframework.stereotype.Component;

@Component("postgresSqlDataSource")
public class PostgresSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        return new String[]{"qrt@gmail.com","bob@gmail.com","fog@gmail.com"};
    }
}

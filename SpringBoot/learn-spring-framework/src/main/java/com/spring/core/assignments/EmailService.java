package com.spring.core.assignments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private DataSource dataSource;
    private PostgresSQLDataSource postgresSqlDataSource;

    @Autowired
    public EmailService(@Qualifier("mySqlDataSource") DataSource dataSource, PostgresSQLDataSource postgresSqlDataSource){
        this.dataSource = dataSource;
        this.postgresSqlDataSource = postgresSqlDataSource;
    }

    public void sendEmail(){
        String[] sqlEmail = dataSource.getEmails();

        String[] postgresEmail = postgresSqlDataSource.getEmails();

        for(String mEmail: sqlEmail) {
            System.out.println("the email from  mySQLDataSource : " + " " + mEmail);
        }
        for(String pEmail: postgresEmail) {
            System.out.println("the email from  PostgresDataSource is : " + " " + pEmail);
        }
    }
}

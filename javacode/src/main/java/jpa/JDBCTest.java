package jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

    public static void main( String[] args){
        System.out.println("Testing JDBC Connection pool !!");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila", "root", "admin");
            Statement stmt  = conn.createStatement();
            ResultSet rs = stmt.executeQuery( " select * from customer");
            System.out.println("Rs " + rs.getFetchSize());
            while( rs.next()){
                System.out.println( " Customer Id : " + rs.getInt(1) + " " +
                                    " Name : "  + rs.getString(3) +  " " +
                                    rs.getString(4)
                );
            }

        }catch( Exception e ){
            System.out.println(e);
        }
    }
}

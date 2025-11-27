package com.gfg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableWithMaven {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical_gfg ", "root", "Password12345");
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE example(id INT Primary Key, name VARCHAR(20))");
        System.out.println("Table Create Successfully");
    }
}

package com.concepts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {


    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        String host = "localhost";
        String port = "3306";
        String string = "jdbc:mysql://localhost:3306/qadbt?useSSL=true";

        Connection con = DriverManager.getConnection(string, "user", "100postgres100");
        System.out.println(con);

        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery("select * from employeeinfo where name like 'Elena';");


        while (resultSet.next()) ;
        {
            System.out.println(resultSet.getString("gender"));
            System.out.println(resultSet.getString("name"));

        }
    }


}

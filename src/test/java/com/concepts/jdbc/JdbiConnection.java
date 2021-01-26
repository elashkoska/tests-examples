package com.concepts.jdbc;

import org.jdbi.v3.core.Jdbi;

import java.util.List;
import java.util.Map;

public class JdbiConnection {

    public static void main(String args[]) {
        String string = "jdbc:mysql://localhost:3306/qadbt";
        Jdbi jdbi = Jdbi.create(string, "user", "100postgres100");

        List<Map<String, Object>> list = jdbi.withHandle(handle -> handle.createQuery("select * from employeeinfo where name like 'elena'")
                .mapToMap()
                .list());
        System.out.println(list);

    }
}

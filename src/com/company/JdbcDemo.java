package com.company;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws IOException {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "";
        Connection conn = null;
        Statement statement = null;
        try {
            //load driver com.company
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root", "mysql");

            if(conn != null) {
                statement = conn.createStatement();
//                boolean queryRes = statement.execute("" +
//                        "CREATE TABLE person(id INT PRIMARY KEY AUTO_INCREMENT," +
//                        "firstName VARCHAR(250)," +
//                        "lastName VARCHAR(250))"
//                );
//                System.out.println(queryRes);
                boolean queryRes = statement.execute("INSERT INTO PERSON VALUES(1,'Christian','MPANO')");
                System.out.println(queryRes);
            }else{
                System.out.println("null conn");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

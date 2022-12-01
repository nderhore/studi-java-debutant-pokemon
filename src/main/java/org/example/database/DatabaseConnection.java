package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection = null;

    public static Connection getConnection(){
        if(connection == null){
            initConnexion();
        }
        return connection;
    }

    private static void initConnexion() {
        String url = "jdbc:sqlite:database.db";
        String user = "";
        String password = "";

        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


}

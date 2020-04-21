package com.epsilon.training.util;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbUtil {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        ResourceBundle rb = ResourceBundle.getBundle("com.epsilon.training.jdbc");
        Class.forName(rb.getString("driverClassName"));
        String url = rb.getString("url");
        String username = rb.getString("username");
        String password=rb.getString("password");

        return DriverManager.getConnection(url, username, password);
    }
}

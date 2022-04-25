package com.spring;

import java.sql.*;

/**
 * @author aming
 */
public class Prep {
    static ResultSet res;
    static PreparedStatement ps;
    static Connection con;

    public  Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","aming","172613247");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

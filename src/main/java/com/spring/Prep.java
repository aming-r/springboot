package com.spring;

import java.sql.*;

/**
 * @author aming
 */
public class Prep {
    static ResultSet res;
    static PreparedStatement ps;
    static Connection con;

    public static Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","aming","172613247");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

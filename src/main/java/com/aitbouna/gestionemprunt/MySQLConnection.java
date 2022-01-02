package com.aitbouna.gestionemprunt;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AitBouna
 */
public class MySQLConnection {
    
    public static Connection getConnection() throws Exception{
        String root = "jdbc:mysql://";
        String host = "localhost/";
        String dbName = "fssmProject";
        String user = "root";
        String password = "";
        String url = root+host+dbName;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(url,user,password);
        return myConn;
    }
    
}

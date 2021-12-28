
package com.aitbouna.gestionemprunt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author AitBouna
 */
public class Operation {
    public static boolean isLogin(String username, String password, JFrame frame){
        try{
            Connection myConn = MySQLConnection.getConnection();
            String query = "SELECT UID, UserType, NickName FROM login where username = '"+
                    username+"' AND password = '"+password+"' AND usertype = 'admin'";
            PreparedStatement preparedStatement = myConn.prepareStatement(query);
            ResultSet res = preparedStatement.executeQuery();
            
            
            while(res.next()){
                LoginSession.UID = res.getInt("UID");
                LoginSession.NickName = res.getString("NickName");
                LoginSession.UsetrType = "admin";
                
                return true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "DataBase Error : "+e.getMessage());
        }
        return false;

    }

   
}

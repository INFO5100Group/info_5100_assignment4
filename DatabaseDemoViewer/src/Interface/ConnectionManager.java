/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bohan Feng
 */
public class ConnectionManager {
    public Connection conn;
    
    public ConnectionManager(){
        this.conn = CreateConnection();
    }
    
    public Connection CreateConnection(){
        String connectionUrl =
                "jdbc:sqlserver://info5100final.database.windows.net:1433;"
                + "database=databseDemo;"
                + "user=dbmin@info5100final;"
                + "password=123456jK;"
                + "encrypt=true;trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;";
        try {
            return DriverManager.getConnection(connectionUrl);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String executeQuery(String query){
        System.out.println(query);
        ResultSet resultSet = null;
        String re = "";
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(query); 
            
            while (resultSet.next()) {
                re += "\n";
                re += resultSet.getString(1) + ", "
                    + resultSet.getString(2) + ", "
                    + resultSet.getString(3) + ", "
                    + resultSet.getString(4) + "";
            }
            return re;
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "data error";
    }
}

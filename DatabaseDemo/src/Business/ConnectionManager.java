/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.sql.*;
import Business.*;
import databasedemo.MainFrame;
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
    
    public void executeQuery(String query){
        System.out.println(query);
        ResultSet resultSet = null;
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(query); 
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AddObject(DatabaseSerializeableObject o){
        AddToObjectKeyTable(o);
        AddToCorrTable(o);
    }

    private void AddToObjectKeyTable(DatabaseSerializeableObject o) {
        String [] data = DataManager.InsertObjectSQL(o);
        String q = "INSERT INTO [Demo].[ObjectKey] " 
                + data[0]
                + " VALUES " 
                + data[1]
                + ";";
        executeQuery(q);
    }

    private void AddToCorrTable(DatabaseSerializeableObject o) {
        String [] data = DataManager.InsertSQL(o);
        String q = "INSERT INTO [Demo].["
                + o.getClass().getSimpleName() + "] "
                + data[0]
                + " VALUES " 
                + data[1]
                + ";";
        executeQuery(q);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pimenvibritania.kec.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Konfig {
    
    private static Connection MYSQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            
            String url = "jdbc.mysql://localhost:3306/kec";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
        System.out.println("Gagal error ke database" + e.getMessage());
    }
    return MYSQLConfig;
    }
    
}

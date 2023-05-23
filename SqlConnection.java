/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Abdullah
 */
public class SqlConnection {
    
    public static Statement getConnection(){
        String url = "jdbc:mysql://localhost:3306/LiabraryManagement";
        String username = "root";
        String password = ""; 
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);  
            statement  = connection.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return statement;
    }
}

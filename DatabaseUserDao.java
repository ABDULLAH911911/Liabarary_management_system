/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Controllers;

import com.mycompany.liabrarymanagementsystem.Interfaces.UserDao;
import com.mycompany.liabrarymanagementsystem.Models.User;
import com.mycompany.liabrarymanagementsystem.SqlConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class DatabaseUserDao implements UserDao{

    @Override
    public ResultSet login(User user) {
        Statement statement = SqlConnection.getConnection();
        ResultSet resultSet = null;

        if(statement != null){
            String query = "SELECT * FROM `users` WHERE `admin`= 'YES' AND `username`='"+user.getUsername()+"' AND `password` = '"+user.getPassword()+"'";
            try {
                resultSet = statement.executeQuery(query);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseUserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultSet;
        
    }

    @Override
    public ResultSet getAllusers() {
        Statement statement;
        statement = SqlConnection.getConnection();
        ResultSet resultSet = null;
        try{
            if(statement != null){
                String addbookquery = "Select * FROM  `users`;";
                resultSet = statement.executeQuery(addbookquery);
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return resultSet;
  


    }

    @Override
    public boolean addUser(User user) {
        Statement statement;
        statement = SqlConnection.getConnection();
        try{
            if(statement != null){
                String addbookquery = "INSERT INTO `users`(`username`, `password`, `admin`) VALUES ('" +  user.getUsername()+ "','"+ user.getPassword()+"','"+ user.getAdmin() +"');";
                statement.execute(addbookquery);
                return true;
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        
        return false;
    }
    
}

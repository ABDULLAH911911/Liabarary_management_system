/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Models;

/**
 *
 * @author Abdullah
 */
public class User {
    int id;
    String username;
    String password;
    String admin;
    
    public int getId(){
        return id;
    }
    public void stId(int id){
        this.id = id;
    }
    public void setUsername(String username){
         this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
     public String getPassword(){
        return password;
    }
    public void setAdmin(String admin){
         this.admin = admin;
    }
    public String getAdmin(){
      return admin;   
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.liabrarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Abdullah
 */
public class LiabraryManagementSystem {

    public static void main(String[] args) {
        login_frame lf= new login_frame();
        lf.setVisible(true);
        
        /*
        //creating the connection of the database
        String url = "jdbc:mysql://localhost:3306/LiabraryManagement";
        String username = "root";
        String password = ""; 
              
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        
        Statement statement  = connection.createStatement();
        String bookname ="English";        
        String bookgenre ="science";
        String bookprice ="300";

        String addbookquery = "INSERT INTO `books`(`BNAME`, `GENRE`, `PRICE`) VALUES ('" +  bookname + "','"+ bookgenre +"','"+ bookprice +"');";
        statement.execute(addbookquery);
        connection.close();
        
        }catch(Exception e){
            System.out.println(e);
        }
*/
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Controllers;

import com.mycompany.liabrarymanagementsystem.Interfaces.IssuedBookDao;
import com.mycompany.liabrarymanagementsystem.Models.IssuedBooks;
import com.mycompany.liabrarymanagementsystem.SqlConnection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abdullah
 */
public class DatabaseIssuedBookDao implements IssuedBookDao{

    @Override
    public boolean issueABook(IssuedBooks issuedBook) {
        Statement statement;
        statement = SqlConnection.getConnection();
        try{
            if(statement != null){
                String addbookquery = "INSERT INTO  `issuedbooks`(`user_id`, `book_id`, `period`) VALUES ('" +  issuedBook.getUserid()+ "','"+ issuedBook.getBookid()+"','"+ issuedBook.getPeriod()+"');";
                statement.execute(addbookquery);
                return true;
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        
        return false;
    }

    @Override
    public boolean returnBook(IssuedBooks issuedBook) {
        Statement statement;
        statement = SqlConnection.getConnection();
        try{
            if(statement != null){
                String addbookquery = "UPDATE `issuedbooks` SET status = 'RETURNED' WHERE `user_id` ='" +  issuedBook.getUserid()+ "' AND `book_id`='"+ issuedBook.getBookid()+"';";
                statement.execute(addbookquery);
                return true;
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        
        return false;
    }
    
}

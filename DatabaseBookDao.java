/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Controllers;

import com.mycompany.liabrarymanagementsystem.Interfaces.BookDao;
import com.mycompany.liabrarymanagementsystem.Models.Book;
import com.mycompany.liabrarymanagementsystem.SqlConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abdullah
 */
public class DatabaseBookDao implements BookDao{

    @Override
    public boolean addBook(Book book) {
        Statement statement;
        statement = SqlConnection.getConnection();
        try{
            if(statement != null){
                String addbookquery = "INSERT INTO `books`(`BNAME`, `GENRE`, `PRICE`) VALUES ('" +  book.getBookName() + "','"+ book.getBookGenre() +"','"+ book.getBookPrice() +"');";
                statement.execute(addbookquery);
                return true;
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        
        return false;
    }

    @Override
    public ResultSet getBooks() {
        Statement statement;
        statement = SqlConnection.getConnection();
        ResultSet resultSet = null;
        try{
            if(statement != null){
                String addbookquery = "Select * FROM  `books`;";
                resultSet = statement.executeQuery(addbookquery);
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return resultSet;
    }

    @Override
    public ResultSet getIssuedBooks() {
        Statement statement;
        statement = SqlConnection.getConnection();
        ResultSet resultSet = null;
        try{
            if(statement != null){
                String addbookquery = "SELECT ib.id as Booking_ID,u.username,b.BNAME,ib.date,ib.status,ib.period FROM issuedbooks ib JOIN users u ON ib.user_id=u.id JOIN books b ON b.BID = ib.book_id;";
                resultSet = statement.executeQuery(addbookquery);
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return resultSet;
    }
    
}

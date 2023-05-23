/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Interfaces;

import com.mycompany.liabrarymanagementsystem.Models.Book;
import java.sql.ResultSet;

/**
 *
 * @author Abdullah
 */
public interface BookDao {
    public boolean addBook(Book book);    
    public ResultSet getBooks();
    public ResultSet getIssuedBooks();

}

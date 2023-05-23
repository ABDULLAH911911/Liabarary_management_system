/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Interfaces;

import com.mycompany.liabrarymanagementsystem.Models.IssuedBooks;

/**
 *
 * @author Abdullah
 */
public interface IssuedBookDao {
    boolean issueABook(IssuedBooks issuedBook);    
    boolean returnBook(IssuedBooks issuedBook);

}

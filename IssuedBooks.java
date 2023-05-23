/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liabrarymanagementsystem.Models;

/**
 *
 * @author Abdullah
 */
public class IssuedBooks {
    int id;
    String userid;
    String bookid;
    String period;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    
    public String getUserid(){
        return userid;
    }
    public String getBookid(){
        return bookid;
    }
    public String getPeriod(){
        return period;
    }
    
    public void setUserid(String userid){
        this.userid = userid;
    }
    public void setBookId(String bookid){
        this.bookid = bookid;
    }
    public void setPeriod(String period){
        this.period = period;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysongs;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Go
 */
public class db {
   
 // add to mysql jar file    
    
 public static Connection mycon(){
 
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://"
                 + "localhost:3306/mysongs","root","");
         
         return c ;
         
     } catch (Exception e) {
     }
     return null;
 
 
 }
    
}

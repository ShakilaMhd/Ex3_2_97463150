/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author SH-MHD
 */
public class User {
     String fname;
     String lname;
     String username;
     String password;
     int id;
     ArrayList log = new ArrayList<Logs>();
     
     
     
     static int count=0;
     
     public User(String fname ,String lname ,String username ,String password) {
         id = ++count;
         this.fname = fname;
         this.lname = lname;
         this.username = username;
         this.password = password;
     }

     
     public void addToEnterTime() {
        log.add(LocalDateTime.now());  
    }
    public String getUsername() {
        return username.toString();
    }

    public String getPassword() {
        return password.toString();
    }
    
        
}

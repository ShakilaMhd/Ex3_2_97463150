
package ex3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
      

        Storage store = new Storage();

        ArrayList users = new ArrayList<User>();
        
        Logs l = new Logs();
        
        ArrayList fnamelist = new ArrayList<String>();
        String firstNameAddress = "E://Telegram desktop//Ex3//fname.txt";
        store.readAndWrite(fnamelist, firstNameAddress);
        
        ArrayList lnamelist = new ArrayList<String>();
        String lastNameAddress = "E://Telegram desktop//Ex3//lname.txt";
        store.readAndWrite(lnamelist, lastNameAddress);
        
        ArrayList unamelist = new ArrayList<String>();
        String userNameAddress = "E://Telegram desktop//Ex3//uname.txt";
        store.readAndWrite(unamelist, userNameAddress);
        
        ArrayList passwordlist = new ArrayList<String>();
        String passwordAddress = "E://Telegram desktop//Ex3//password.txt";
        store.readAndWrite(passwordlist, passwordAddress);
        
        for (int i = 0; i < fnamelist.size(); i++) {
            users.add(new User(fnamelist.get(i).toString(), lnamelist.get(i).toString(), unamelist.get(i).toString(), passwordlist.get(i).toString()));
        }
        System.out.println("enter username:");
        String uname = u.nextLine();
        
        
        User dd = (User) users.get(0);
        
//        for (int i = 0; i < users.size(); i++) {
//            User u1 = (User) users.get(i);
//            
//            
//            if (uname.equals(u1.getUsername())) {
//                if (pass.equals(u1.password)) {
//                    System.out.println("Success!!");
//                    u1.addToEnterTime();
//                }else {
//                    System.out.println("username or password is incorect");
//                }
//            }
//        }
        
     
       

        if (uname.equals("admin")) {  
         
            int j=0;
        users.add(new User(fnamelist.get(j).toString(), lnamelist.get(j).toString(), unamelist.get(j).toString(), passwordlist.get(j).toString()));
       
        System.out.println("enter new firstname:");
        String fname = u.nextLine();
        
        
        System.out.println("enter new lastname:");
        String lname = u.nextLine();
        System.out.println("enter new lastname:");
        String unewname = u.nextLine();
        System.out.println("enter new password:");
        String password = u.nextLine();
        
        try {
      FileWriter myWriter = new FileWriter("data.txt");
      myWriter.write(fname+"_"+lname+"_"+password+"\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        j+=1;
        
             }else{
            System.out.println("enter password:");
        String pass = u.nextLine();
            for (int i = 0; i < users.size(); i++) {
            User u1 = (User) users.get(i);
            
            
            if (uname.equals(u1.getUsername())) {
                if (pass.equals(u1.password)) {
                    System.out.println("Success!!");
                    u1.addToEnterTime();
                }else {
                    System.out.println("username or password is incorect");
                }
            }else {
                for(int clear = 0; clear < 10; clear++)
  {
            System.out.println("\b") ;
      }
                System.out.println("username not found!!");

            }
            }
        }    
    }}

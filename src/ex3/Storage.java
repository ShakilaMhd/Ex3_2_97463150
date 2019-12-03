/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SH-MHD
 */
public class Storage {
    public void readAndWrite(ArrayList list , String address ) {
        
        try (Scanner scanner = new Scanner(new File(address))) {

            while (scanner.hasNext()){
                list.add(scanner.nextLine());
            }
        
        
        }   catch (FileNotFoundException ex) {
            Logger.getLogger(Ex3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

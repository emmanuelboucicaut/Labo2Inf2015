/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ab091098
 */
public class lireFichier {  
       private FileInputStream fs = null;
       private BufferedInputStream rs;

    public lireFichier() {
        this.rs = null;
    }

       public void lire(){
                  try {
            fs = new FileInputStream(new File("./listLivre.txt"));

            rs = new BufferedInputStream(fs);

            while(rs.available() > 0){
                System.out.print((char)rs.read());
            }
       }
       catch(FileNotFoundException e){
           System.out.println("Fichier text   non trouve");
       }
       catch(IOException e){
           System.out.println("Fichier non trouve");
       }
       }

}

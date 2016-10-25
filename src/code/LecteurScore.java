/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class LecteurScore {
     protected String source;
  
  public LecteurScore(String dest){
    this.source = dest;
  
  }

 
  public String lecture() { 
      String ligne="" ;
    try {
      String temp="";
      BufferedReader fichier = new BufferedReader(new FileReader(source));
      
      while((ligne = fichier.readLine()) != null){
          System.out.println(ligne);
          temp=ligne;
          
      }
     
      fichier.close();
       return temp;
    } catch (Exception e) {
      e.printStackTrace();
    }     
   return ligne;
  }    
    
}

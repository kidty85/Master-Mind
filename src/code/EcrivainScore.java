/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;
import java.io.*;

/**
 *
 * @author  team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class EcrivainScore {
 protected String destination;
  
  public EcrivainScore(String s, int p , String dest) {
    this.destination = dest;
    traitement(s,p);
  }

 
  public void traitement(String s, int p) { 
    try {
    
      PrintWriter fichier = new PrintWriter(new FileWriter(destination));

      fichier.println(s+" :"+p);
      

      fichier.close();
    } catch (Exception e) {
      e.printStackTrace();
    }     
  }    
    
}

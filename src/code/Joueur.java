/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

/**
 *
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class Joueur {
    String pseudo;
    int record;
    int essai;
    
    public Joueur(String s){
        pseudo=s;
        record=0;
        essai = 0;
    }
    
    public String getPseudo(){
        return pseudo;
    }
    
    public int getRecord(){
        return record;
    }
    public int getEssai(){
        return essai;
    }
     public void setEssai(int e){
        essai=e;
    }
                   
    public void setPseudo(String s){
        pseudo=s;
    }
    public void setRecord(int i){
        record=i;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import java.util.ArrayList;

/**
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class CodeSecret {
    ArrayList<Couleur> Code;
    public CodeSecret(int niveau){
        Code=new ArrayList<>();
        Couleur[] facile={Couleur.BLANC,Couleur.BLEUE,Couleur.ROSE,Couleur.ORANGE,Couleur.ROUGE,Couleur.NOIRE};
        Couleur[] moyen={Couleur.BLANC,Couleur.BLEUE,Couleur.ROSE,Couleur.ORANGE,Couleur.ROUGE,Couleur.NOIRE,Couleur.VIOLETTE,Couleur.VERTE};
        Couleur[] difficile={Couleur.BLANC,Couleur.BLEUE,Couleur.ROSE,Couleur.ORANGE,Couleur.ROUGE,Couleur.NOIRE,Couleur.VIOLETTE,Couleur.VERTE,Couleur.MARRON,Couleur.JAUNE};
        Couleur[] col = null;
        switch(niveau){
            case 4: col=facile;break;
            case 5: col=moyen;break;
            case 6: col=difficile;break;
        }
       
        for(int i=0;i<niveau;i++){
            //random de la couleur a tirer
            int lower = 0; 
            int higher = col.length-1;
            int random = (int)(Math.random() * (higher+1-lower)) + lower; 
            
            while(Code.contains(col[random])){
                random = (int)(Math.random() * (higher+1-lower)) + lower; 
    
            }
             Code.add(col[random]);
        }
        
    }
    
    public CodeSecret(ArrayList<Couleur> c){
          Code=new ArrayList<>();
          Code=c;
    }
    
    public ArrayList<Couleur> getCodeSecret(){
        return Code;
    }
    
    public String afficher(){
        String s="";
        for(int i=0;i<Code.size();i++){
         s=s+" "+Code.get(i).toString();
        }
        return s;
    }
   }

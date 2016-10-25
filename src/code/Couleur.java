/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import javax.swing.JLabel;

/**
 *
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */

    public enum Couleur{
        BLANC,ROUGE,VERTE,JAUNE,ROSE,NOIRE,ORANGE,BLEUE,MARRON,VIOLETTE;
         public String toString()  //pour ecrire la couleur en string
         {
             switch(this)
             {
                 case BLANC: return "BLANC";
                 case ROUGE: return "ROUGE";
                 case VERTE: return "VERT";
                 case JAUNE: return "JAUNE";
                 case ROSE:  return "ROSE";
                 case NOIRE: return "NOIR";
                 case ORANGE: return "ORANGE";
                 case BLEUE: return "BLEU";
                 case MARRON: return "MARRON";
                 case VIOLETTE: return "VIOLET";
              }
             return null;
         }
         
         //fonction pour tester l'egalitE
         public boolean egalA(Couleur c){
             if(this.toString().equals(c.toString())){
                 return true;
             }
             return false;
         }
         
           public static Couleur corCouleur(String s){
        switch (s) {
            case "N": return code.Couleur.NOIRE;
            case "B": return code.Couleur.BLEUE;
            case "W": return code.Couleur.BLANC;
            case "P": return code.Couleur.ROSE;
            case "O": return code.Couleur.ORANGE;
            case "R": return code.Couleur.ROUGE;  
            case "J": return code.Couleur.JAUNE;
            case "M": return code.Couleur.MARRON;
            case "V": return code.Couleur.VIOLETTE;
            case "G": return code.Couleur.VERTE;
        }
        return null;
    }
          
    }
    
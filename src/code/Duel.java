/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import fenetre.SelecteurCouleur;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class Duel {
    Joueur j1;
    Joueur j2;
    ArrayList<Integer> score_J1;
    ArrayList<Integer> score_J2;
    int round;
    int niveau;
    public Duel(Joueur j, Joueur k, int n){
    j1=j;
    j2=k;
  
   round=1;
   niveau=n;
   score_J1=new ArrayList<>();
   score_J2=new ArrayList<>();
    }
    
    public CodeSecret donnerCode(ArrayList<Couleur> d){
        CodeSecret c=new CodeSecret(d);
        return c;
    }
    
    public void jouer(){
        if(round%2==0){
           JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
          jop.showMessageDialog(null, "Veuillez entrer la combinaison secrète"+j2.getPseudo(), "Tour "+round, JOptionPane.INFORMATION_MESSAGE);
       /*     SelecteurCouleur s=new SelecteurCouleur(niveau,j1);
            s.setVisible(true);*/
        }
        else{
          JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
          jop.showMessageDialog(null, "Veuillez entrer la combinaison secrète "+j1.getPseudo(), "Tour "+round, JOptionPane.INFORMATION_MESSAGE);
           /* SelecteurCouleur s=new SelecteurCouleur(niveau,j2);
            s.setVisible(true);  */
        }
        
    }
    
}

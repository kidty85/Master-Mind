/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import java.util.ArrayList;

/**
 *
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class Combinaison {
    public ArrayList<Couleur> choix;
    public ArrayList<Boolean> bonnePioche;
    public ArrayList<Boolean> position;

    public Combinaison(){
        choix=new ArrayList<>();
        bonnePioche=new ArrayList<>();
        position=new ArrayList<>();
    }

    public void ajouterBoule(Couleur c){
        choix.add(c);
    }

    public void supprimerBoule(Couleur c){
        choix.remove(c);
    }

    public void reset(){
        choix.clear();
    }

}

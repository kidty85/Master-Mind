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
public class Partie {
    int niveau;
    int essai;
    int score;
    Joueur joueur;
    Joueur joueur2;
    Joueur actif;
    ArrayList<Combinaison> comb;
    boolean fin;
    CodeSecret cs;
    int type;
    int round;
    public Partie(int i,Joueur g, int t){
        niveau=i;
        joueur=g;
        fin=false;
        comb=new ArrayList<>();
        cs=new CodeSecret(niveau);
        essai=0;
        type=t;
        actif=g;
        round=1;
    }
    public Partie(int i,Joueur j,Joueur k, ArrayList<Couleur> c,int t, int r){
        niveau=i;
        joueur=j;
        joueur2=k;
        fin=false;
        comb=new ArrayList<>();
        cs=new CodeSecret(c);
        type=t;
        round=r;
        if(round%2==0){
            actif=joueur;
        }
        else{
            actif=joueur2;
        }
       
    }
    public int getNiveau(){
        return niveau;
    }
    public int getEssai(){
        return essai;
    }
    public Joueur getJoueur(){
        return joueur;
    }
    public Joueur getJoueur2(){
        return joueur2;
    }
    public void incEssai(){
        essai++;
    }
    public CodeSecret getCode(){
        return cs;
    }
    public boolean getFin(){
        return fin;
    }
    public int getType(){
        return type;
    }
    public int getRound(){
        return round;
    }
   
   public Joueur getActif(){
       return actif;
   }
   public void ajouterCombinaison(Combinaison c){
       comb.add(c);
   }
   public void verifier(Combinaison c){
       for(int i=0;i<c.choix.size();i++)
       {
           if(cs.Code.contains(c.choix.get(i)))
           {
               c.bonnePioche.add(true);
               if(c.choix.get(i).egalA(cs.Code.get(i)))
               {
                   c.position.add(true);
               }
               else
                   c.position.add(false);
           }
           else{
               c.bonnePioche.add(false);
               c.position.add(false);
           }
       
           
   }
       if(!c.position.contains(false))
               fin=true;
}
   public void setType(int t){
       type=t;
   }
   public void setActif(Joueur j){
       actif=j;
   }
   public void setRound(int i){
       round=i;
   }
}

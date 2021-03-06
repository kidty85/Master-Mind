/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fenetre;

import code.LecteurScore;
import java.io.File;

/**
 *
 * @author team : ALICHERIF Elhaous, MOUHAMAD Imame & NGUYEN Quang Minh
 */
public class Podium extends javax.swing.JFrame {

    /**
     * Creates new form Podium
     */
    public Podium() {
        
        initComponents();
        remplissage();
    }
   
   public void remplissage(){
        File f=new File("score.txt");
            if(f.exists()){
            code.LecteurScore l=new LecteurScore("score.txt");
            String score=l.lecture();
            lblfacile.setText(score);
            } 
            else
            {
               lblfacile.setText("*******:******"); 
            }
       File g=new File("scoremoyen.txt");
            if(g.exists()){
            code.LecteurScore l=new LecteurScore("scoremoyen.txt");
            String scorem=l.lecture();
            lblMoyen.setText(scorem);
            } 
            else
            {
               lblMoyen.setText("*******:******"); 
            }
      File h=new File("scoredifficile.txt");
            if(h.exists()){
            code.LecteurScore l=new LecteurScore("scoredifficile.txt");
            String scored=l.lecture();    
            lblDifficile.setText(scored);
            } 
            else
            {
               lblDifficile.setText("*******:******"); 
            }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblfacile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMoyen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDifficile = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Qui sont les masters of mind???");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Niveau facile");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, 30));

        lblfacile.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblfacile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblfacile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 270, 20));

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Niveau Moyen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, -1));

        lblMoyen.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblMoyen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMoyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 320, 30));

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Niveau Difficile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, -1));

        lblDifficile.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblDifficile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblDifficile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 270, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/podium 48.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fond-gris-galyoneo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Podium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Podium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDifficile;
    private javax.swing.JLabel lblMoyen;
    private javax.swing.JLabel lblfacile;
    // End of variables declaration//GEN-END:variables
}

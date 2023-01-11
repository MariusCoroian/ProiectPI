/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author coroi
 */
public class meniu_user extends javax.swing.JFrame {

    /**
     * Creates new form meniu_user
     */
    public meniu_user() {
        initComponents();
    }
    
     public meniu_user(String email) {
        initComponents();
        mail.setText(email);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        vizCal = new javax.swing.JButton();
        istoric = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fundal_meniu_clienti = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel1.setText("Meniu client");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 260, 40));

        vizCal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vizCal.setText("Realizare programare");
        vizCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vizCalMouseClicked(evt);
            }
        });
        getContentPane().add(vizCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 260, 50));

        istoric.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        istoric.setText("Istoric programari");
        istoric.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                istoricMouseClicked(evt);
            }
        });
        getContentPane().add(istoric, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 260, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Inapoi");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 383, 260, 50));

        fundal_meniu_clienti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundal_meniu_clienti.jpg"))); // NOI18N
        getContentPane().add(fundal_meniu_clienti, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -450, -1, 1660));
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vizCalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vizCalMouseClicked
        // TODO add your handling code here:
        meniuProgramari f=new meniuProgramari(mail.getText());
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vizCalMouseClicked

    private void istoricMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_istoricMouseClicked
        // TODO add your handling code here:
        String email=mail.getText();
        IstoricClient f=new IstoricClient(email);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_istoricMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        logare f=new logare();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked
      
    
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
            java.util.logging.Logger.getLogger(meniu_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(meniu_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(meniu_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(meniu_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new meniu_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundal_meniu_clienti;
    private javax.swing.JButton istoric;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mail;
    private javax.swing.JButton vizCal;
    // End of variables declaration//GEN-END:variables
}

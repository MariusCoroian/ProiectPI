/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author coroi
 */
public class meniu_frizer extends javax.swing.JFrame {

    /**
     * Creates new form meniu_frizer
     */
    public meniu_frizer() {
        initComponents();
    }
    
      public meniu_frizer(String email) {
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
        programari = new javax.swing.JButton();
        Istoricul_clientului = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Meniu frizer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 260, -1));

        programari.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        programari.setText("Vizualizare programari");
        programari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programariMouseClicked(evt);
            }
        });
        getContentPane().add(programari, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 280, 60));

        Istoricul_clientului.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Istoricul_clientului.setText("Vizualizare istoric client");
        Istoricul_clientului.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Istoricul_clientuluiMouseClicked(evt);
            }
        });
        getContentPane().add(Istoricul_clientului, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 313, 280, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Inapoi");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 403, 280, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frizer.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        logare f=new logare();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void programariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programariMouseClicked
        // TODO add your handling code here:
        ProgramariFrizer f = new ProgramariFrizer(mail.getText());
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_programariMouseClicked

    private void Istoricul_clientuluiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Istoricul_clientuluiMouseClicked
        // TODO add your handling code here:
        IstoricProg f = new IstoricProg(mail.getText());
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Istoricul_clientuluiMouseClicked

    
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
            java.util.logging.Logger.getLogger(meniu_frizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(meniu_frizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(meniu_frizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(meniu_frizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new meniu_frizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Istoricul_clientului;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mail;
    private javax.swing.JButton programari;
    // End of variables declaration//GEN-END:variables
}

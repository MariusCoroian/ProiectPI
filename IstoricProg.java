
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author coroi
 */
public class IstoricProg extends javax.swing.JFrame {

    /**
     * Creates new form IstoricClient
     */
    public IstoricProg() {
        initComponents();
    }
public IstoricProg(String email)
    {
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

        jLabel2 = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Istoric Programari");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));
        getContentPane().add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 220, 180));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "data", "interval", "oferta", "pret", "status", "client"
            }
        ));
        jScrollPane1.setViewportView(Tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Vezi programarile");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 220, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Inapoi");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 170, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2023-01-09 at 21.38.39.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String email=mail.getText();
        meniu_frizer f=new meniu_frizer(email);
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
             Tabel.removeAll();
         DefaultTableModel tblModel=(DefaultTableModel)Tabel.getModel();
          tblModel.setRowCount(0);
        SimpleDateFormat date_form=new SimpleDateFormat("DD/MM/YYYY");
        String date=date_form.format(calendar.getDate());
        var date1 = calendar.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = sdf.format(date1);
        String email=mail.getText();
        String nume="";
        try
         {
             Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaven","root","");
                String sql="Select nume from frizer where email='"+ email +"'";
                  PreparedStatement stmt=con.prepareStatement(sql);
                
               ResultSet rs=stmt.executeQuery(sql);
               while(rs.next())
               {
                nume=rs.getString("nume");
                
                      
                    
               }
               
                   rs.close();
      
                 stmt.close();
      
                 con.close();
                 
             
         }
         catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        
        
          try
         {
             Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heaven","root","");
                String sql="select b.email email, b.Date Date, b.serviciu serviciu,b.status Stat, b.frizer frizer,b.nr nr, b.pret pret, i.inceput inceput, i.sfarsit sfarsit from(SELECT a.status status, a.email email, a.data Date,a.serviciu serviciu,a.frizer frizer,a.nr nr,o.pret pret from programari a, oferte o where a.frizer ='"+ nume +"' and o.oferta=a.serviciu)b, intervale i where i.id=b.nr and b.Date='"+ dateString +"'";
                  PreparedStatement stmt=con.prepareStatement(sql);
                
               ResultSet rs=stmt.executeQuery(sql);
               while(rs.next())
               {
                   
                   String client=rs.getString("email");
                String data=rs.getString("Date");
                String stat=rs.getString("Stat");
                String serviciu=rs.getString("serviciu");
              
                String inceput=rs.getString("inceput");
                String sfarsit=rs.getString("sfarsit");
                String st=inceput+"-"+sfarsit;
                Integer pret=rs.getInt("pret");
                String prog[]={data,st,serviciu,pret.toString(),stat,client};

                tblModel.addRow(prog);
                
                      
                    
               }
               
                   rs.close();
      
                 stmt.close();
      
                 con.close();
                 
             
         }
         catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        
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
            java.util.logging.Logger.getLogger(IstoricClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IstoricClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IstoricClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IstoricClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IstoricClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mail;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seno
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDaftar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnhuruf = new javax.swing.JButton();
        btnsholat = new javax.swing.JButton();
        btnwudhu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel4.setText("AYO BELAJAR MENGAJI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel5.setText("Masjid At-Taqwa Sawojajar, Malang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 100));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDaftar.setText("DAFTAR");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        jPanel2.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        btnhuruf.setBackground(new java.awt.Color(204, 204, 255));
        btnhuruf.setIcon(new javax.swing.ImageIcon("E:\\XI RPL 2\\PBO\\huruf.jpg")); // NOI18N
        btnhuruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhurufActionPerformed(evt);
            }
        });
        jPanel2.add(btnhuruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 290));

        btnsholat.setIcon(new javax.swing.ImageIcon("E:\\XI RPL 2\\PBO\\sholat.jpg")); // NOI18N
        btnsholat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsholatActionPerformed(evt);
            }
        });
        jPanel2.add(btnsholat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 180, 290));

        btnwudhu.setIcon(new javax.swing.ImageIcon("E:\\XI RPL 2\\PBO\\wudhu.jpg")); // NOI18N
        btnwudhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwudhuActionPerformed(evt);
            }
        });
        jPanel2.add(btnwudhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 180, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 640, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
        new Pendaftaran().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnhurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhurufActionPerformed
        // TODO add your handling code here:
        new Huruf().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnhurufActionPerformed

    private void btnsholatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsholatActionPerformed
        // TODO add your handling code here:
        new Sholat().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsholatActionPerformed

    private void btnwudhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwudhuActionPerformed
        // TODO add your handling code here:
        new Wudhu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnwudhuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnhuruf;
    private javax.swing.JButton btnsholat;
    private javax.swing.JButton btnwudhu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

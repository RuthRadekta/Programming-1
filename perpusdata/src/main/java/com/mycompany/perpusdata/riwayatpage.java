package com.mycompany.perpusdata;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class riwayatpage extends javax.swing.JFrame {

    /**
     * Creates new form riwayatpage
     */
    public riwayatpage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFFF"));
        setDefaultCloseOperation(riwayatpage.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JButton();
        anggota = new javax.swing.JButton();
        buku = new javax.swing.JButton();
        peminjaman = new javax.swing.JButton();
        pengembalian = new javax.swing.JButton();
        statkini = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        bg2 = new javax.swing.JPanel();
        kembali = new javax.swing.JButton();
        hover = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelread = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(241, 244, 246));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota.setBackground(new java.awt.Color(241, 244, 246));
        anggota.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota.setForeground(new java.awt.Color(255, 255, 255));
        anggota.setText("ANGGOTA");
        anggota.setBorderPainted(false);
        anggota.setContentAreaFilled(false);
        anggota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anggotaActionPerformed(evt);
            }
        });
        getContentPane().add(anggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku.setBackground(new java.awt.Color(241, 244, 246));
        buku.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku.setForeground(new java.awt.Color(255, 255, 255));
        buku.setText("BUKU");
        buku.setBorderPainted(false);
        buku.setContentAreaFilled(false);
        buku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuActionPerformed(evt);
            }
        });
        getContentPane().add(buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman.setText("PEMINJAMAN");
        peminjaman.setBorderPainted(false);
        peminjaman.setContentAreaFilled(false);
        peminjaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian.setText("PENGEMBALIAN");
        pengembalian.setBorderPainted(false);
        pengembalian.setContentAreaFilled(false);
        pengembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini.setBackground(new java.awt.Color(241, 244, 246));
        statkini.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini.setForeground(new java.awt.Color(255, 255, 255));
        statkini.setText("STATUS TERKINI");
        statkini.setBorderPainted(false);
        statkini.setContentAreaFilled(false);
        statkini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statkini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statkiniActionPerformed(evt);
            }
        });
        getContentPane().add(statkini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        riwayat.setBackground(new java.awt.Color(241, 244, 246));
        riwayat.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        riwayat.setForeground(new java.awt.Color(255, 255, 255));
        riwayat.setText("RIWAYAT");
        riwayat.setBorderPainted(false);
        riwayat.setContentAreaFilled(false);
        riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 150, -1));

        bg2.setBackground(new java.awt.Color(155, 164, 180));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("kembali");
        kembali.setBorderPainted(false);
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        bg2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        hover.setBackground(new java.awt.Color(190, 196, 205));
        bg2.add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 30));

        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 710));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(155, 164, 180));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Riwayat", "Riwayat"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 1070, 630));

        labelread.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelread.setForeground(new java.awt.Color(190, 196, 205));
        labelread.setText("RIWAYAT");
        getContentPane().add(labelread, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        new mainpage().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        dispose();
        new mainpage().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anggotaActionPerformed
        // TODO add your handling code here:
        dispose();
        new anggotapage().setVisible(true);
    }//GEN-LAST:event_anggotaActionPerformed

    private void bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuActionPerformed
        // TODO add your handling code here:
        dispose();
        new bukupage().setVisible(true);
    }//GEN-LAST:event_bukuActionPerformed

    private void peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanActionPerformed
        // TODO add your handling code here:
        dispose();
        new pinjampage().setVisible(true);
    }//GEN-LAST:event_peminjamanActionPerformed

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
        // TODO add your handling code here:
        dispose();
        new kembalipage().setVisible(true);
    }//GEN-LAST:event_pengembalianActionPerformed

    private void statkiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statkiniActionPerformed
        // TODO add your handling code here:
        dispose();
        new statuspage().setVisible(true);
    }//GEN-LAST:event_statkiniActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void riwayatpage(String args[]) {
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
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(riwayatpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new riwayatpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anggota;
    private javax.swing.JPanel bg2;
    private javax.swing.JButton buku;
    private javax.swing.JButton home;
    private javax.swing.JPanel hover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel labelread;
    private javax.swing.JButton peminjaman;
    private javax.swing.JButton pengembalian;
    private javax.swing.JButton riwayat;
    private javax.swing.JButton statkini;
    // End of variables declaration//GEN-END:variables
}

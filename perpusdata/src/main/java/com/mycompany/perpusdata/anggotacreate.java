package com.mycompany.perpusdata;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class anggotacreate extends javax.swing.JFrame {

    /**
     * Creates new form anggotacreate
     */
    public anggotacreate() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFFF"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home1 = new javax.swing.JButton();
        anggota1 = new javax.swing.JButton();
        buku1 = new javax.swing.JButton();
        peminjaman1 = new javax.swing.JButton();
        pengembalian1 = new javax.swing.JButton();
        statkini1 = new javax.swing.JButton();
        riwayat1 = new javax.swing.JButton();
        hover1 = new javax.swing.JPanel();
        bg3 = new javax.swing.JPanel();
        kembali1 = new javax.swing.JButton();
        labelcreate = new javax.swing.JLabel();
        labelcreate2 = new javax.swing.JLabel();
        labelida = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        labeljenke = new javax.swing.JLabel();
        labelalamat = new javax.swing.JLabel();
        labelemail = new javax.swing.JLabel();
        inputemail = new javax.swing.JTextField();
        inputida = new javax.swing.JTextField();
        inputnama = new javax.swing.JTextField();
        inputalamat = new javax.swing.JTextField();
        pilihanjenke = new javax.swing.JComboBox<>();
        buttoncreate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home1.setBackground(new java.awt.Color(241, 244, 246));
        home1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home1.setForeground(new java.awt.Color(255, 255, 255));
        home1.setText("HOME");
        home1.setBorderPainted(false);
        home1.setContentAreaFilled(false);
        home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        anggota1.setBackground(new java.awt.Color(241, 244, 246));
        anggota1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        anggota1.setForeground(new java.awt.Color(255, 255, 255));
        anggota1.setText("ANGGOTA");
        anggota1.setBorderPainted(false);
        anggota1.setContentAreaFilled(false);
        anggota1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(anggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 20));

        buku1.setBackground(new java.awt.Color(241, 244, 246));
        buku1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buku1.setForeground(new java.awt.Color(255, 255, 255));
        buku1.setText("BUKU");
        buku1.setBorderPainted(false);
        buku1.setContentAreaFilled(false);
        buku1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(buku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 120, 120, 20));

        peminjaman1.setBackground(new java.awt.Color(241, 244, 246));
        peminjaman1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        peminjaman1.setForeground(new java.awt.Color(255, 255, 255));
        peminjaman1.setText("PEMINJAMAN");
        peminjaman1.setBorderPainted(false);
        peminjaman1.setContentAreaFilled(false);
        peminjaman1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(peminjaman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        pengembalian1.setBackground(new java.awt.Color(241, 244, 246));
        pengembalian1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pengembalian1.setForeground(new java.awt.Color(255, 255, 255));
        pengembalian1.setText("PENGEMBALIAN");
        pengembalian1.setBorderPainted(false);
        pengembalian1.setContentAreaFilled(false);
        pengembalian1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pengembalian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 30));

        statkini1.setBackground(new java.awt.Color(241, 244, 246));
        statkini1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        statkini1.setForeground(new java.awt.Color(255, 255, 255));
        statkini1.setText("STATUS TERKINI");
        statkini1.setBorderPainted(false);
        statkini1.setContentAreaFilled(false);
        statkini1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(statkini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, -1));

        riwayat1.setBackground(new java.awt.Color(241, 244, 246));
        riwayat1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        riwayat1.setForeground(new java.awt.Color(255, 255, 255));
        riwayat1.setText("RIWAYAT");
        riwayat1.setBorderPainted(false);
        riwayat1.setContentAreaFilled(false);
        riwayat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(riwayat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 270, 150, -1));

        hover1.setBackground(new java.awt.Color(190, 196, 205));
        getContentPane().add(hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 40));

        bg3.setBackground(new java.awt.Color(155, 164, 180));
        bg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali1.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        kembali1.setForeground(new java.awt.Color(255, 255, 255));
        kembali1.setText("kembali");
        kembali1.setBorderPainted(false);
        kembali1.setContentAreaFilled(false);
        kembali1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg3.add(kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, -1, -1));

        getContentPane().add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 410));

        labelcreate.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        labelcreate.setForeground(new java.awt.Color(190, 196, 205));
        labelcreate.setText("MEMBUAT DATA BARU");
        getContentPane().add(labelcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        labelcreate2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelcreate2.setForeground(new java.awt.Color(155, 164, 180));
        labelcreate2.setText("CREATE");
        getContentPane().add(labelcreate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        labelida.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelida.setForeground(new java.awt.Color(155, 164, 180));
        labelida.setText("ID Anggota");
        getContentPane().add(labelida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        labelnama.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelnama.setForeground(new java.awt.Color(155, 164, 180));
        labelnama.setText("Nama");
        getContentPane().add(labelnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        labeljenke.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labeljenke.setForeground(new java.awt.Color(155, 164, 180));
        labeljenke.setText("Jenis Kelamin");
        getContentPane().add(labeljenke, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        labelalamat.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelalamat.setForeground(new java.awt.Color(155, 164, 180));
        labelalamat.setText("Alamat");
        getContentPane().add(labelalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        labelemail.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelemail.setForeground(new java.awt.Color(155, 164, 180));
        labelemail.setText("Email");
        getContentPane().add(labelemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        inputemail.setBackground(new java.awt.Color(216, 219, 227));
        inputemail.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputemail.setForeground(new java.awt.Color(155, 164, 180));
        getContentPane().add(inputemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 300, 30));

        inputida.setBackground(new java.awt.Color(216, 219, 227));
        inputida.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputida.setForeground(new java.awt.Color(155, 164, 180));
        getContentPane().add(inputida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 300, 30));

        inputnama.setBackground(new java.awt.Color(216, 219, 227));
        inputnama.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputnama.setForeground(new java.awt.Color(155, 164, 180));
        getContentPane().add(inputnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 300, 30));

        inputalamat.setBackground(new java.awt.Color(216, 219, 227));
        inputalamat.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        inputalamat.setForeground(new java.awt.Color(155, 164, 180));
        getContentPane().add(inputalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 300, 30));

        pilihanjenke.setBackground(new java.awt.Color(216, 219, 227));
        pilihanjenke.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        pilihanjenke.setForeground(new java.awt.Color(155, 164, 180));
        pilihanjenke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        pilihanjenke.setBorder(null);
        getContentPane().add(pilihanjenke, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 300, 30));

        buttoncreate.setBackground(new java.awt.Color(155, 164, 180));
        buttoncreate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        buttoncreate.setForeground(new java.awt.Color(255, 255, 255));
        buttoncreate.setText("CREATE");
        buttoncreate.setBorder(null);
        buttoncreate.setBorderPainted(false);
        buttoncreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(buttoncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 110, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 360, 10));

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
            java.util.logging.Logger.getLogger(anggotacreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anggotacreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anggotacreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anggotacreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anggotacreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anggota1;
    private javax.swing.JPanel bg3;
    private javax.swing.JButton buku1;
    private javax.swing.JButton buttoncreate;
    private javax.swing.JButton home1;
    private javax.swing.JPanel hover1;
    private javax.swing.JTextField inputalamat;
    private javax.swing.JTextField inputemail;
    private javax.swing.JTextField inputida;
    private javax.swing.JTextField inputnama;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kembali1;
    private javax.swing.JLabel labelalamat;
    private javax.swing.JLabel labelcreate;
    private javax.swing.JLabel labelcreate2;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labelida;
    private javax.swing.JLabel labeljenke;
    private javax.swing.JLabel labelnama;
    private javax.swing.JButton peminjaman1;
    private javax.swing.JButton pengembalian1;
    private javax.swing.JComboBox<String> pilihanjenke;
    private javax.swing.JButton riwayat1;
    private javax.swing.JButton statkini1;
    // End of variables declaration//GEN-END:variables
}

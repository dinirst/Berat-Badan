
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class beratbadan extends javax.swing.JFrame {
    
    String temp="";
    Double tb,bb,hs;

    /**
     * Creates new form beratbadan
     */
    public beratbadan() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tinggi = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pr = new javax.swing.JRadioButton();
        lk = new javax.swing.JRadioButton();
        keluar = new javax.swing.JButton();
        hitung = new javax.swing.JButton();
        coba = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sarann = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        saran = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("CEK IDEAL TURUN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 120, 19);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 36, 16);
        getContentPane().add(nama);
        nama.setBounds(150, 40, 170, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("cm");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 90, 20, 19);
        getContentPane().add(tinggi);
        tinggi.setBounds(150, 80, 40, 30);
        getContentPane().add(berat);
        berat.setBounds(150, 120, 40, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 130, 80, 16);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 170, 80, 16);

        buttonGroup1.add(pr);
        pr.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        pr.setText("Perempuan");
        getContentPane().add(pr);
        pr.setBounds(150, 170, 93, 25);

        buttonGroup1.add(lk);
        lk.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lk.setText("Laki-Laki");
        getContentPane().add(lk);
        lk.setBounds(270, 170, 77, 25);

        keluar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(260, 210, 90, 30);

        hitung.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(30, 210, 90, 30);

        coba.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        coba.setText("Coba Lagi");
        coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobaActionPerformed(evt);
            }
        });
        getContentPane().add(coba);
        coba.setBounds(130, 210, 110, 30);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Hasil diagnosa kesehatan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 300, 149, 16);
        getContentPane().add(sarann);
        sarann.setBounds(40, 370, 330, 30);
        getContentPane().add(hasil);
        hasil.setBounds(250, 250, 40, 30);
        getContentPane().add(saran);
        saran.setBounds(40, 330, 330, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Tinggi");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 90, 35, 16);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Berat badan ideal anda adalah ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 260, 187, 16);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 260, 17, 19);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 130, 17, 19);

        setBounds(0, 0, 429, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        if(nama.getText().equals("")||berat.getText().equals("")||tinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak isian harus diisi semua");
    }else if(lk.isSelected()||pr.isSelected()){
        try{
            Proses();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Input salah");
        }
    }else{
        JOptionPane.showMessageDialog(null, "Radio Button Harus dipilih");
    }
    }//GEN-LAST:event_hitungActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void cobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobaActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        berat.setText("");
        tinggi.setText("");
        hasil.setText("");
        lk.setSelected(false);
        pr.setSelected(false);
        saran.setText("");
        sarann.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_cobaActionPerformed

    private void Proses() {
        tb = Double.parseDouble(tinggi.getText());
        bb = Double.parseDouble(berat.getText());
        
        if(lk.isSelected()){
            hs = (tb-100) * 1;
        } else if(pr.isSelected()){
            hs = (tb-110) * 1;
        }
        temp = Double.toString(hs.intValue());
        
        if(hs<bb){
            hasil.setText(temp);
            saran.setText("Maaf "+nama.getText()+" , Sepertinya anda overweight");
            sarann.setText("Banyaklah berolahraga dan hindarai makanan berkolesterol");
        }else if(hs > bb){
            hasil.setText(temp);
            saran.setText("Maaf "+nama.getText()+" , Sepertinya anda underweight");
            sarann.setText("Banyaklah mengkonsumsi makanan berkarbohidrat");
        }else{
            hasil.setText(temp);
            saran.setText("Hallo! "+nama.getText()+" , Berat badan anda sudah ideal");
            sarann.setText("Lanjutkan pola makan dan gaya hidup sehat");
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beratbadan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beratbadan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton coba;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton keluar;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton pr;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField sarann;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

/**
 *
 * @author Dinda Damayanti
 */
public class PenjualanTiket extends javax.swing.JFrame {

    /**
     * Creates new form PenjualanTiket
     */
    public PenjualanTiket() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NoKursi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Reguler = new javax.swing.JRadioButton();
        VIP = new javax.swing.JRadioButton();
        VVIP = new javax.swing.JRadioButton();
        Gold = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        HargaSatuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JumlahBeli = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TotalHarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setText("TIKET BIOSKOP");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("No. Kursi ");

        NoKursi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        NoKursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoKursiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Jenis Tiket ");

        Reguler.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Reguler.setText("Reguler");
        Reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegulerActionPerformed(evt);
            }
        });

        VIP.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        VIP.setText("VIP");
        VIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIPActionPerformed(evt);
            }
        });

        VVIP.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        VVIP.setText("VVIP");
        VVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VVIPActionPerformed(evt);
            }
        });

        Gold.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Gold.setText("Gold");
        Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Harga Satuan ");

        HargaSatuan.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Jumlah Beli ");

        JumlahBeli.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBeliActionPerformed(evt);
            }
        });

        Proses.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Total Harga");

        TotalHarga.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        TotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Proses)
                        .addGap(71, 71, 71)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Reguler)
                                                .addComponent(VVIP))
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(VIP)
                                                .addComponent(Gold)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(NoKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(HargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(26, 26, 26)
                                    .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NoKursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reguler)
                    .addComponent(VIP)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VVIP)
                    .addComponent(Gold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proses)
                    .addComponent(Cancel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegulerActionPerformed
        // TODO add your handling code here:
         HargaSatuan.setText("50000");
    }//GEN-LAST:event_RegulerActionPerformed

    private void VVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VVIPActionPerformed
        // TODO add your handling code here:
        HargaSatuan.setText("70000");
    }//GEN-LAST:event_VVIPActionPerformed

    private void VIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIPActionPerformed
        // TODO add your handling code here:
         HargaSatuan.setText("60000");
    }//GEN-LAST:event_VIPActionPerformed

    private void GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoldActionPerformed
        // TODO add your handling code here:
          HargaSatuan.setText("100000");
    }//GEN-LAST:event_GoldActionPerformed

    private void JumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahBeliActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        String text = NoKursi.getText();
        Jumlahbeli.setText("");
        HargaSatuan.setText("");
        TotalHarga.setText("");
        Reguler.setText("False");
        VVIP.setText("False");
        Reguler.setText("True");
        VVIP.setText("True");
    }//GEN-LAST:event_CancelActionPerformed

    private void NoKursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoKursiActionPerformed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_NoKursiActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        int a;
        a = Integer.valueOf(HargaSatuan.getText());
        int b;
        b = Integer.valueOf(JumlahBeli.getText());
        int hasilnya= a*b ;
        TotalHarga.setText(String.valueOf(hasilnya));
    }//GEN-LAST:event_ProsesActionPerformed

    private void TotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHargaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Frame_Penjualan_Tiket Laund = new Frame_Penjualan_Tiket ();
        Laund.setVisible(true);
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
            java.util.logging.Logger.getLogger(PenjualanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PenjualanTiket().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JRadioButton Gold;
    private javax.swing.JTextField HargaSatuan;
    private javax.swing.JTextField JumlahBeli;
    private javax.swing.JTextField NoKursi;
    private javax.swing.JButton Proses;
    private javax.swing.JRadioButton Reguler;
    private javax.swing.JTextField TotalHarga;
    private javax.swing.JRadioButton VIP;
    private javax.swing.JRadioButton VVIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private static class HargaSatuan {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String getText() {
            return null;
        }

        public HargaSatuan() {
        }
    }


        private static void setText(String string) {
            
        }

        private static String getText() {
        return null;
        }

        }
    

    class Frame_Penjualan_Tiket {

        public Frame_Penjualan_Tiket() {
        }

        void setVisible(boolean b) {
        }
    }


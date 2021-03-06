
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gunanto
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    Object[] value = new Object[9];
    Mahasiswa currentMahasiswa;
    DefaultTableModel dtm;
    int no = 0;
    
    public Form() {
        initComponents();
        dtm = (DefaultTableModel) jTableMahasiswa.getModel();
    }
    
    private Mahasiswa getMahasiswa()
    {
        Mahasiswa ms = new Mahasiswa(new Nilai());
        ms.setNama(textFieldNama.getText());
        ms.setNrp(textFieldNRP.getText());
        ms.getNilai().setUts(Double.parseDouble(textFieldUTS.getText()));
        ms.getNilai().setUas(Double.parseDouble(textFieldUAS.getText()));
        ms.getNilai().setTtt(Double.parseDouble(textFieldTTT.getText()));
        ms.getNilai().setLainlain(Double.parseDouble(textFieldLainLain.getText()));
        ms.getNilai().setTugas(Double.parseDouble(textFieldTugas.getText()));
        
        return ms;
    }
    
    private void refresh()
    {
        textFieldNRP.setText("");
        textFieldNama.setText("");
        textFieldUTS.setText("");
        textFieldUAS.setText("");
        textFieldTugas.setText("");
        textFieldTTT.setText("");
        textFieldLainLain.setText("");
        
        textFieldNRP.requestFocusInWindow();
        
        jButtonCreate.setEnabled(true);
        jButtonDelete.setEnabled(false);
        jButtonUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNRP = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelUTS = new javax.swing.JLabel();
        labelUAS = new javax.swing.JLabel();
        labelTugas = new javax.swing.JLabel();
        labelTTT = new javax.swing.JLabel();
        labelLainLain = new javax.swing.JLabel();
        textFieldNRP = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        textFieldUTS = new javax.swing.JTextField();
        textFieldUAS = new javax.swing.JTextField();
        textFieldTugas = new javax.swing.JTextField();
        textFieldTTT = new javax.swing.JTextField();
        textFieldLainLain = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMahasiswa = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nilai Mahasiswa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelNRP.setText("NIM");

        labelNama.setText("NAMA");

        labelUTS.setText("UTS");

        labelUAS.setText("UAS");

        labelTugas.setText("TUGAS");

        labelTTT.setText("TTT");

        labelLainLain.setText("Lain-Lain");

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jTableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIM", "Nama", "UTS", "UAS", "TUGAS", "TTT", "Lain-Lain", "Nilai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMahasiswa);

        jButtonDelete.setText("Delete");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.setEnabled(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNRP)
                            .addComponent(labelNama)
                            .addComponent(labelUTS)
                            .addComponent(labelUAS)
                            .addComponent(labelTugas)
                            .addComponent(labelTTT)
                            .addComponent(labelLainLain))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNRP)
                            .addComponent(textFieldNama)
                            .addComponent(textFieldUTS)
                            .addComponent(textFieldUAS)
                            .addComponent(textFieldTugas)
                            .addComponent(textFieldTTT)
                            .addComponent(textFieldLainLain, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNRP)
                    .addComponent(textFieldNRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUTS)
                    .addComponent(textFieldUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUAS)
                    .addComponent(textFieldUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTugas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTTT)
                    .addComponent(textFieldTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLainLain)
                    .addComponent(textFieldLainLain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        setSize(new java.awt.Dimension(596, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        currentMahasiswa = getMahasiswa();
        value[0] = no = dtm.getRowCount();
        value[1] = currentMahasiswa.getNrp();
        value[2] = currentMahasiswa.getNama();
        value[3] = currentMahasiswa.getNilai().getUts();
        value[4] = currentMahasiswa.getNilai().getUas();
        value[5] = currentMahasiswa.getNilai().getTugas();
        value[6] = currentMahasiswa.getNilai().getTtt();
        value[7] = currentMahasiswa.getNilai().getLainlain();
        value[8] = currentMahasiswa.getNilai().getNilai();
        dtm.addRow(value);
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMahasiswaMouseClicked
        // TODO add your handling code here:
        int row = jTableMahasiswa.getSelectedRow();
        textFieldNRP.setText(jTableMahasiswa.getValueAt(row, 1).toString());
        textFieldNama.setText(jTableMahasiswa.getValueAt(row, 2).toString());
        textFieldUTS.setText(jTableMahasiswa.getValueAt(row, 3).toString());
        textFieldUAS.setText(jTableMahasiswa.getValueAt(row, 4).toString());
        textFieldTugas.setText(jTableMahasiswa.getValueAt(row, 5).toString());
        textFieldTTT.setText(jTableMahasiswa.getValueAt(row, 6).toString());
        textFieldLainLain.setText(jTableMahasiswa.getValueAt(row, 7).toString());
        
        jButtonCreate.setEnabled(false);
        jButtonDelete.setEnabled(true);
        jButtonUpdate.setEnabled(true);
    }//GEN-LAST:event_jTableMahasiswaMouseClicked

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        value[0] = no = dtm.getRowCount();;
        value[1] = "31112022";
        value[2] = "Steven Gunanto";
        value[3] = 100.0;
        value[4] = 90.0;
        value[5] = 80.0;
        value[6] = 70.0;
        value[7] = 60.0;
        value[8] = 86.0;
        
        dtm.addRow(value);
        
        value[0] = no = dtm.getRowCount();;
        value[1] = "31112004";
        value[2] = "Johan Prasetio";
        value[3] = 100.0;
        value[4] = 90.0;
        value[5] = 90.0;
        value[6] = 90.0;
        value[7] = 90.0;
        value[8] = 93.5;
        
        dtm.addRow(value);
        
        value[0] = no = dtm.getRowCount();;
        value[1] = "31112025";
        value[2] = "Tommy Kurniawan";
        value[3] = 100.0;
        value[4] = 100.0;
        value[5] = 90.0;
        value[6] = 90.0;
        value[7] = 90.0;
        value[8] = 96.0;
        
        dtm.addRow(value);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int sisa = jTableMahasiswa.getRowCount()-1 - jTableMahasiswa.getSelectedRow();
        for(int i = jTableMahasiswa.getSelectedRow(); sisa > 0; i++, sisa--)
        {
            dtm.setValueAt(i, i+1, 0);
        }
        dtm.removeRow(jTableMahasiswa.getSelectedRow());
        jButtonClearActionPerformed(evt);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int row = jTableMahasiswa.getSelectedRow();
        currentMahasiswa = getMahasiswa();
        dtm.setValueAt(currentMahasiswa.getNrp(), row, 1);
        dtm.setValueAt(currentMahasiswa.getNama(), row, 2);
        dtm.setValueAt(currentMahasiswa.getNilai().getUts(), row, 3);
        dtm.setValueAt(currentMahasiswa.getNilai().getUas(), row, 4);
        dtm.setValueAt(currentMahasiswa.getNilai().getTugas(), row, 5);
        dtm.setValueAt(currentMahasiswa.getNilai().getTtt(), row, 6);
        dtm.setValueAt(currentMahasiswa.getNilai().getLainlain(), row, 7);
        dtm.setValueAt(currentMahasiswa.getNilai().getNilai(), row, 8);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMahasiswa;
    private javax.swing.JLabel labelLainLain;
    private javax.swing.JLabel labelNRP;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTTT;
    private javax.swing.JLabel labelTugas;
    private javax.swing.JLabel labelUAS;
    private javax.swing.JLabel labelUTS;
    private javax.swing.JTextField textFieldLainLain;
    private javax.swing.JTextField textFieldNRP;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldTTT;
    private javax.swing.JTextField textFieldTugas;
    private javax.swing.JTextField textFieldUAS;
    private javax.swing.JTextField textFieldUTS;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
    package gui;

    import javax.swing.*;
    import java.util.*;
/**
 *
 * @author ASUS
 */
public class Gui extends javax.swing.JFrame {
    DefaultListModel<String> dlm;
    List<String> itemsList = new ArrayList<>();
    Set<String> itemsSet = new HashSet<>();
    Map<Integer, String> itemsMap = new HashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
        dlm = new DefaultListModel<>();
        jListItem.setModel(dlm);
        for (String data : datas) {
            dlm.addElement(data);
        }
        updateJumDataTersimpanList();
        updateJumDataTersimpanSet();
        updateJumDataTersimpanMap();
    }

    private void updateJumDataTersimpanList() {
        jLabelJumlahDataList.setText("Data tersimpan = " + itemsList.size());
    }
    
    private void updateJumDataTersimpanSet() {
        jLabelJumlahDataSet.setText("Data tersimpan = " + itemsSet.size());
    }
    
    private void updateJumDataTersimpanMap() {
        jLabelJumlahDataMap.setText("Data tersimpan = " + itemsMap.size());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonClearAll = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldItem = new javax.swing.JTextField();
        jLabelItemName = new javax.swing.JLabel();
        jButtonSaveToList = new javax.swing.JButton();
        jButtonInsertDataList = new javax.swing.JButton();
        jButtonSaveToSet = new javax.swing.JButton();
        jButtonInsertDataSet = new javax.swing.JButton();
        jButtonSaveToMap = new javax.swing.JButton();
        jButtonInsertDataMap = new javax.swing.JButton();
        jLabelJumlahDataList = new javax.swing.JLabel();
        jLabelJumlahDataSet = new javax.swing.JLabel();
        jLabelJumlahDataMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButtonClearAll.setText("clear all");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jButtonAdd.setText("add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelItemName.setText("item name:");

        jButtonSaveToList.setText("save to List ->");
        jButtonSaveToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToListActionPerformed(evt);
            }
        });

        jButtonInsertDataList.setText("<- insert data List");
        jButtonInsertDataList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataListActionPerformed(evt);
            }
        });

        jButtonSaveToSet.setText("save to Set ->");
        jButtonSaveToSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToSetActionPerformed(evt);
            }
        });

        jButtonInsertDataSet.setText("<- insert data Set");
        jButtonInsertDataSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataSetActionPerformed(evt);
            }
        });

        jButtonSaveToMap.setText("save to Map ->");
        jButtonSaveToMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveToMapActionPerformed(evt);
            }
        });

        jButtonInsertDataMap.setText("<- insert data Map");
        jButtonInsertDataMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertDataMapActionPerformed(evt);
            }
        });

        jLabelJumlahDataList.setText("jLabel2");

        jLabelJumlahDataSet.setText("jLabel3");

        jLabelJumlahDataMap.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonInsertDataMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSaveToMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonInsertDataSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSaveToSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonInsertDataList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldItem)
                                    .addComponent(jButtonSaveToList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelJumlahDataList)
                                    .addComponent(jLabelJumlahDataSet)
                                    .addComponent(jLabelJumlahDataMap)))
                            .addComponent(jLabelItemName))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToList)
                            .addComponent(jLabelJumlahDataList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToSet)
                            .addComponent(jLabelJumlahDataSet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveToMap)
                            .addComponent(jLabelJumlahDataMap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertDataMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelItemName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClearAll)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String item = jTextFieldItem.getText();
        if (item.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item name is empty");
            return;
        }
        dlm.addElement(item);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "No item selected");
            return;
        }
        dlm.removeElementAt(index);
        jTextFieldItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "No item selected");
            return;
        }
        String selected = jTextFieldItem.getText();
        if (selected.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item name is empty");
            return;
        }
        dlm.setElementAt(selected, index);
        jTextFieldItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonSaveToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToListActionPerformed
        if (!itemsList.isEmpty()) {
            itemsList.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsList.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpanList();
    }//GEN-LAST:event_jButtonSaveToListActionPerformed

    private void jButtonSaveToSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToSetActionPerformed
        if (!itemsSet.isEmpty()) {
            itemsSet.clear();
        } 
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsSet.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpanSet();
    }//GEN-LAST:event_jButtonSaveToSetActionPerformed

    private void jButtonSaveToMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveToMapActionPerformed
        if (!itemsMap.isEmpty()) {
            itemsMap.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            itemsMap.put(i, dlm.getElementAt(i));
        }
        updateJumDataTersimpanMap();
    }//GEN-LAST:event_jButtonSaveToMapActionPerformed

    private void jButtonInsertDataListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataListActionPerformed
        for (String item : itemsList) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataListActionPerformed

    private void jButtonInsertDataSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataSetActionPerformed
        for (String item : itemsSet) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataSetActionPerformed

    private void jButtonInsertDataMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataMapActionPerformed
        Set<Integer> keys = itemsMap.keySet();
        for (int key : keys) {
            dlm.addElement(itemsMap.get(key));
        }
    }//GEN-LAST:event_jButtonInsertDataMapActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertDataList;
    private javax.swing.JButton jButtonInsertDataMap;
    private javax.swing.JButton jButtonInsertDataSet;
    private javax.swing.JButton jButtonSaveToList;
    private javax.swing.JButton jButtonSaveToMap;
    private javax.swing.JButton jButtonSaveToSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelItemName;
    private javax.swing.JLabel jLabelJumlahDataList;
    private javax.swing.JLabel jLabelJumlahDataMap;
    private javax.swing.JLabel jLabelJumlahDataSet;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItem;
    // End of variables declaration//GEN-END:variables
}

//Karakteristik Data List, Set, dan Map
//List: Menyimpan data terstruktur dengan indeks, memungkinkan duplikat, dan akses cepat berdasarkan indeks.
//Set: Menyimpan data unik dengan cara yang efisien, memungkinkan pencarian dan pemeriksaan keberadaan yang cepat.
//Map: Menyimpan data dalam pasangan kunci-nilai, memungkinkan akses cepat berdasarkan kunci, tetapi urutan akses tidak terjamin.
//Kelebihan & Kekurangan Data List, Set, dan Map
//List :
//Kelebihan: Penyimpanan Terstruktur, Memungkinkan Duplikat, Operasi Penyisipan dan Penghapusan Cepat.
//Kekurangan: Mengonsumsi Memori Lebih Banyak, Pencarian Berdasarkan Konten Lambat, Tidak Efisien untuk Data Unik.
//Set :
//Kelebihan: Penyimpanan Data Unik Efisien, Pencarian Cepat Berdasarkan Konten, Operasi Cek Keberadaan Cepat.
//Kekurangan: Penyimpanan Tidak Terstruktur, Tidak Mendukung Duplikat, Operasi Penyisipan dan Penghapusan di Tengah Lambat.
//Map :
//Kelebihan: Penyimpanan Data Terstruktur Berdasarkan Kunci, Mendukung Berbagai Jenis Kunci, Memungkinkan Nilai Duplikat dengan Kunci Berbeda.
//Kekurangan: Penyimpanan Memori Lebih Banyak, Urutan Akses Data Tidak Terjamin, Operasi Penyisipan dan Penghapusan di Tengah Lambat.

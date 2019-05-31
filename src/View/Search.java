/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.InvertedIndex;
import Model.SearchingResult;
import Model.TableModelDokumen;
import View.Input;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import Model.*;

/**
 *
 * @author K
 */
public class Search extends javax.swing.JFrame {

    TableModelDokumen Model;
    InvertedIndex Index;

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        positionFrame();
        Index = new InvertedIndex();
        loadData();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ClearButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Input_MenuItem = new javax.swing.JMenuItem();
        Add_MenuItem = new javax.swing.JMenuItem();
        Close_MenuItem = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Dokumen");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchLabel.setText("Masukan Kata");

        SearchButton.setText("Cari");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Doc","Content","Cimilarity"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        ClearButton.setText("Bersihkan");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setText("Pemerolehan Informasi");

        jLabel3.setText("Mesin Pencari Undang-Undang");

        jMenu1.setText("File");

        Input_MenuItem.setText("Masukan Dokumen");
        Input_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Input_MenuItem);

        Add_MenuItem.setText("Tambah Dokumen");
        Add_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Add_MenuItem);

        Close_MenuItem.setText("Keluar");
        Close_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Close_MenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(SearchLabel)
                                .addGap(30, 30, 30)
                                .addComponent(SearchField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton)
                    .addComponent(SearchLabel))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClearButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        searching(Index);
    }//GEN-LAST:event_SearchButtonActionPerformed

     private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
         this.dispose(); // exit frame/dialog
    }//GEN-LAST:event_closeButtonActionPerformed

    private void Input_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_MenuItemActionPerformed
        new Input(this, rootPaneCheckingEnabled, Index).show();
    }//GEN-LAST:event_Input_MenuItemActionPerformed

    private void Add_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_MenuItemActionPerformed
        addDocument();

    }//GEN-LAST:event_Add_MenuItemActionPerformed

    private void Close_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_MenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_Close_MenuItemActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed

        DefaultTableModel model = new DefaultTableModel();
        Table.setModel(model);
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int i = Table.getSelectedRow();
        TableModel table = Table.getModel();
        jDialog1.setBounds(250, 250, 700, 500);
        jDialog1.setVisible(true);
        jTextArea1.setText(table.getValueAt(i, 2).toString());
    }//GEN-LAST:event_TableMouseClicked
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        new Input(this, rootPaneCheckingEnabled, Index).show();
    }

    public void addDocument() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            Index.readOneFile(dir);
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_MenuItem;
    private javax.swing.JToggleButton ClearButton;
    private javax.swing.JMenuItem Close_MenuItem;
    private javax.swing.JMenuItem Input_MenuItem;
    private javax.swing.JToggleButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTable Table;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
public void positionFrame() {
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
    }

    public void loadData() {
        File dir = new File("C:\\Users\\K\\Documents\\NetBeansProjects\\PI_Search_Engine_165314050\\src\\Dokumen");
        Index.readDirectory(dir);
    }

    public void searching(InvertedIndex idx) {
        Index = idx;
        String query = SearchField.getText();
        ArrayList<SearchingResult> hasilCari = Index.searchCosineSimilarity(query);
        System.out.println(hasilCari.size());
        Model = new TableModelDokumen(hasilCari);
        Table.setModel(Model);
    }

}

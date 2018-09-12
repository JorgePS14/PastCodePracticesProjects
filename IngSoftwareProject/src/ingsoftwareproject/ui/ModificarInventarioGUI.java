/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingsoftwareproject.ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author japso
 */
public class ModificarInventarioGUI extends javax.swing.JFrame {

    GestorGUI parent;
    
    public ModificarInventarioGUI(GestorGUI parent, boolean modal) {
        initComponents();
        this.parent = parent;
    }

    /**
    Automatically generated code that NetBeans provides for the proper functioning of this program.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNewValue = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("¿Cuántos de este artículo existen en invventario?");

        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNewValue))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int newValue = Integer.parseInt(this.txtNewValue.getText().trim());
        
        try {
            
            int currentIndex = this.parent.ProductInventory.searchId(this.parent.currentId);
            
            this.parent.ProductInventory.getArticle(currentIndex).setAvailability(newValue);
            
            this.parent.setTxtAvailable(this.txtNewValue.getText().trim());
            
            DefaultTableModel model = new DefaultTableModel();
            
            model.addColumn("Clave de artículo");
            model.addColumn("Categoría");
            model.addColumn("Marca");
            model.addColumn("Nombre");
            model.addColumn("Disponibles");
            
            this.parent.getTblClothes().setModel(model);
        
            for(int i = 0; i<this.parent.ProductInventory.getNoOfItems(); i++) {
                String[] agregar = new String[5];
                agregar[0] = this.parent.ProductInventory.getArticle(i).getKeyArt();
                agregar[1] = this.parent.ProductInventory.getArticle(i).getClass().getSimpleName();
                agregar[2] = this.parent.ProductInventory.getArticle(i).getBrand();
                agregar[3] = this.parent.ProductInventory.getArticle(i).getName();
                agregar[4] = Integer.toString(this.parent.ProductInventory.getArticle(i).getAvailability());

                model.addRow(agregar);
            }
            
            this.parent.model = model;
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error. Por favor checa que el dato introducido sea un número entero.");
        }
        
        setVisible(false);
        
        dispose();
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNewValue;
    // End of variables declaration//GEN-END:variables
}

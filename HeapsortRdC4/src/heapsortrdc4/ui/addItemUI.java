package heapsortrdc4.ui;

import heapsortrdc4.Bottoms;
import heapsortrdc4.Clothes;
import heapsortrdc4.Shoes;
import heapsortrdc4.Tops;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class addItemUI extends javax.swing.JFrame {
    
    Clothes newItem = null;
    
    RdCUI parent;
    
    /**
    Constructor for addItemUI.
    This window takes a parent JFrame in order to modify its clothes deposit and add an item.
     */
    
    public addItemUI(RdCUI parent, boolean modal) {
        initComponents();
        this.parent = parent;
    }

    /**
    Automatically generated code that NetBeans provides for the proper functioning of this program.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtColour = new javax.swing.JTextField();
        txtFabric = new javax.swing.JTextField();
        txtStyle = new javax.swing.JTextField();
        txtFit = new javax.swing.JTextField();
        txtAvailable = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtItemNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboClass = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("Availability:");

        jLabel1.setText("Brand:");

        jLabel2.setText("Description:");

        jLabel3.setText("Category:");

        jLabel4.setText("Colour:");

        jLabel5.setText("Fabric:");

        jLabel6.setText("Style:");

        jLabel7.setText("Fit:");

        jLabel8.setText("Price:");

        jLabel9.setText("Item number:");

        btnAdd.setText("Add item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel10.setText("Item class:");

        comboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tops", "Bottoms", "Shoes" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrand))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCategory))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColour))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFabric))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStyle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAvailable))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemNo, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFabric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    Method to add an element to a Clothes Deposit.
    ThIS method modifies a Clothes Deposit and returns it to the main window that called this window.
     */
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String itemClass = this.comboClass.getSelectedItem().toString().trim();
        
        if(parent.clothesStore.searchId(this.txtItemNo.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "There was already an item with that ID number. Please re-enter item with another ID.");
            return;
        }
        
        try {
            switch (itemClass) {
                case "Tops":
                    this.newItem = new Tops(this.txtItemNo.getText().trim(),
                            this.txtBrand.getText().trim(),
                            this.txtDescription.getText().trim(),
                            this.txtCategory.getText().trim(),
                            this.txtColour.getText().trim(),
                            this.txtFabric.getText().trim(),
                            this.txtStyle.getText().trim(),
                            this.txtFit.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                    parent.clothesStore.addItem(this.newItem);
            
                    String[] addToTableC1 = new String[5];

                    addToTableC1[0] = this.newItem.getId();
                    addToTableC1[1] = this.newItem.getBrand();
                    addToTableC1[2] = this.newItem.getClass().getSimpleName().trim();
                    addToTableC1[3] = this.newItem.getColour();
                    addToTableC1[4] = Double.toString(this.newItem.getPrice());

                    DefaultTableModel tmpC1 = (DefaultTableModel)parent.getTblClothes().getModel();

                    tmpC1.addRow(addToTableC1);
                    break;
                case "Bottoms":
                    this.newItem = new Bottoms(this.txtItemNo.getText().trim(),
                            this.txtBrand.getText().trim(),
                            this.txtDescription.getText().trim(),
                            this.txtCategory.getText().trim(),
                            this.txtColour.getText().trim(),
                            this.txtFabric.getText().trim(),
                            this.txtStyle.getText().trim(),
                            this.txtFit.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                    parent.clothesStore.addItem(this.newItem);
            
                    String[] addToTableC2 = new String[5];

                    addToTableC2[0] = this.newItem.getId();
                    addToTableC2[1] = this.newItem.getBrand();
                    addToTableC2[2] = this.newItem.getClass().getSimpleName().trim();
                    addToTableC2[3] = this.newItem.getColour();
                    addToTableC2[4] = Double.toString(this.newItem.getPrice());

                    DefaultTableModel tmpC2 = (DefaultTableModel)parent.getTblClothes().getModel();

                    tmpC2.addRow(addToTableC2);
                    break;
                case "Shoes":
                    this.newItem = new Shoes(this.txtItemNo.getText().trim(),
                            this.txtBrand.getText().trim(),
                            this.txtDescription.getText().trim(),
                            this.txtCategory.getText().trim(),
                            this.txtColour.getText().trim(),
                            this.txtFabric.getText().trim(),
                            this.txtStyle.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                    parent.clothesStore.addItem(this.newItem);
            
                    String[] addToTableC3 = new String[5];

                    addToTableC3[0] = this.newItem.getId();
                    addToTableC3[1] = this.newItem.getBrand();
                    addToTableC3[2] = this.newItem.getClass().getSimpleName().trim();
                    addToTableC3[3] = this.newItem.getColour();
                    addToTableC3[4] = Double.toString(this.newItem.getPrice());

                    DefaultTableModel tmpC3 = (DefaultTableModel)parent.getTblClothes().getModel();

                    tmpC3.addRow(addToTableC3);
                    break;
                default:
                    break;
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error. Please make sure you wrote everything correctly.");
        }
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAddActionPerformed
                        
    /**
    Method to cancel.
    This method basically does nothing, just cancels the operation.
     */
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.newItem = null;
        parent.addItem = this.newItem;
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> comboClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtColour;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtFabric;
    private javax.swing.JTextField txtFit;
    private javax.swing.JTextField txtItemNo;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStyle;
    // End of variables declaration//GEN-END:variables

    
}

package ingsoftwareproject.ui;

import ingsoftwareproject.Anillo;
import ingsoftwareproject.Aretes;
import ingsoftwareproject.Collar;
import ingsoftwareproject.Crema;
import ingsoftwareproject.Producto;
import ingsoftwareproject.Fragancia;
import ingsoftwareproject.Maquillaje;
import ingsoftwareproject.Pulsera;
import ingsoftwareproject.Reloj;
import ingsoftwareproject.Shampoo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarProductoGUI extends javax.swing.JFrame {
    
    Producto newItem = null;
    
    GestorGUI parent;
    
    /**
    Constructor for AgregarProductoGUI.
    This window takes a parent JFrame in order to modify its Producto deposit and add an item.
     * @param parent
     * @param modal
     */
    
    public AgregarProductoGUI(GestorGUI parent, boolean modal) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtAvailable = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtItemNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        comboBrand = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Disponibles en inventario: ");

        jLabel5.setText("Precio:");

        jLabel9.setText("Clave de artículo:");

        btnAdd.setText("Agregar artículo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel10.setText("Categoría:");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger", "Anillo", "Aretes", "Collar", "Crema", "Fragancia", "Maquillaje", "Pulsera", "Reloj", "Shampoo" }));

        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger", "Cinquessence", "Piel de Luna", "MAL", "Belle Queen", "Beclay", "Klickiss" }));
        comboBrand.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAvailable))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemNo, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    Method to add an element to a Producto Deposit.
    ThIS method modifies a Producto Deposit and returns it to the main window that called this window.
     */
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String itemClass = this.comboCategory.getSelectedItem().toString().trim();
        String[] addToTable = new String[5];
        DefaultTableModel tmpModel = (DefaultTableModel)parent.getTblClothes().getModel();
        
        if(this.txtItemNo.getText().trim().length() == 0 ||
            this.comboBrand.getSelectedItem().toString().trim().equals("Escoger") ||
            this.txtName.getText().trim().length() == 0 ||
            this.txtDescription.getText().trim().length() == 0 ||
            this.txtAvailable.getText().trim().length() == 0 ||
            this.txtPrice.getText().trim().length() == 0 ||
            itemClass.equals("Escoger")
            ) {
            JOptionPane.showMessageDialog(this, "Por favor asegúrate de que todos los campos estén llenos.");
            return;
        }
        
        if(parent.ProductInventory.searchId(this.txtItemNo.getText()) != -1) {
            JOptionPane.showMessageDialog(this, "Ya existe un objeto con esa clave de artículo, por favor corrobora los dats introducidos.");
            return;
        }
        
        try {
            switch (itemClass) {
                case "Anillo":
                    this.newItem = new Anillo(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Aretes":
                    this.newItem = new Aretes(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Collar":
                    this.newItem = new Collar(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Crema":
                    this.newItem = new Crema(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Fragancia":
                    this.newItem = new Fragancia(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Maquillaje":
                    this.newItem = new Maquillaje(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Pulsera":
                    this.newItem = new Pulsera(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Reloj":
                    this.newItem = new Reloj(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                case "Shampoo":
                    this.newItem = new Shampoo(this.txtItemNo.getText().trim(),
                            this.comboBrand.getSelectedItem().toString().trim(),
                            this.txtName.getText().trim(),
                            this.txtDescription.getText().trim(),
                            Integer.parseInt(this.txtAvailable.getText().trim()),
                            Double.parseDouble(this.txtPrice.getText().trim()));
                            
                    parent.ProductInventory.addItem(this.newItem);

                    addToTable[0] = this.newItem.getKeyArt();
                    addToTable[1] = this.newItem.getClass().getSimpleName().trim();
                    addToTable[2] = this.newItem.getBrand();
                    addToTable[3] = this.newItem.getName();
                    addToTable[4] = Integer.toString(this.newItem.getAvailability());

                    tmpModel.addRow(addToTable);
                    break;
                default:
                    break;
            }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error. Por favor checa que todos los campos estén llenados correctamente.");
            return;
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
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtItemNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    
}

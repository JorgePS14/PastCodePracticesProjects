package ingsoftwareproject.ui;

import ingsoftwareproject.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ingsoftwareproject.Inventario;

/**
GestorGUI Class:
Main window for this project.
*/

public class GestorGUI extends javax.swing.JFrame {
    
    /**
    Variable declaration.
    */

    DefaultTableModel model = new DefaultTableModel();
    
    String currentId;
    
    DefaultTableModel restrictedItemsModel;
    
    DefaultTableModel doublyRestrictedItemsModel;
    
    Inventario ProductInventory = new Inventario(true);
    
    /**
    Constructor for the main window of this program.
    */
    
    public GestorGUI() {
        initComponents();
        this.setTitle("Gestor de Inventario");
        model.addColumn("Clave de artículo");
        model.addColumn("Categoría");
        model.addColumn("Marca");
        model.addColumn("Nombre");
        model.addColumn("Disponibles");
        
        this.tblProduct.setModel(model);
        
        for(int i = 0; i<ProductInventory.getNoOfItems(); i++) {
            String[] agregar = new String[5];
            agregar[0] = this.ProductInventory.getArticle(i).getKeyArt();
            agregar[1] = this.ProductInventory.getArticle(i).getClass().getSimpleName();
            agregar[2] = this.ProductInventory.getArticle(i).getBrand();
            agregar[3] = this.ProductInventory.getArticle(i).getName();
            agregar[4] = Integer.toString(this.ProductInventory.getArticle(i).getAvailability());
            
            model.addRow(agregar);
        }
        
        this.restrictedItemsModel = this.model;
        this.doublyRestrictedItemsModel = this.restrictedItemsModel;
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        txtKeyArt = new javax.swing.JLabel();
        txtBrand = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        txtPrice = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboBrand = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEmpty = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miSave = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clave:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Descripción:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Disponibles en inventario:");

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        jScrollPane2.setViewportView(jScrollPane1);

        btnModify.setText("Modificar disponibilidad");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel10.setText("Categoría:");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Anillo", "Aretes", "Collar", "Crema", "Fragancia", "Maquillaje", "Pulsera", "Reloj", "Shampoo" }));
        comboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoryActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar artículo");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar clave de art.");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel11.setText("Marca:");

        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cualquiera", "Beclay", "Cinquessence", "Piel de Luna", "MAL", "Belle Queen", "Klickiss" }));
        comboBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBrandActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar artículo");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEmpty.setText("Vaciar campos");
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });

        menuFile.setText("Archivo");

        miSave.setText("Guardar");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        menuFile.add(miSave);

        miExit.setText("Guardar y salir");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFile.add(miExit);

        jMenuBar1.add(menuFile);

        menuHelp.setText("Ayuda");

        miAbout.setText("Acerca del desarrollador");
        miAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAboutActionPerformed(evt);
            }
        });
        menuHelp.add(miAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

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
                        .addComponent(txtKeyArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKeyArt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAvailable))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEmpty))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
    Method that allows us to see the information of the creator of this program.
    */
    
    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Matríula: A00226522 \n"
                + "Nombre del autor: Jorge Pietra Santa \n"
                + "Materia: Fundamentos de Ingeniería de Software \n"
                + "Institución: ITESM \n"
                + "Profesor de la materia: Luis Palomino");
    }//GEN-LAST:event_miAboutActionPerformed

    /**
    Method to close and exit the program.
    */
    
    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        this.ProductInventory.saveFile();
        this.ProductInventory.generateCSV(this.ProductInventory.getInventario());
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    /**
    Method that allows us to save our ProductInventory in the form of a .dat file.
    */
    
    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        this.ProductInventory.saveFile();
    }//GEN-LAST:event_miSaveActionPerformed

    /**
    Method to get the information from an element in the table.
    This allows us to listen for a click and get all the available information from that item.
     */
    
    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        
        try{
            int row = this.tblProduct.getSelectedRow();
            String id = this.tblProduct.getValueAt(row, 0).toString();
            
            Producto tmp = this.ProductInventory.getArticle(this.ProductInventory.searchId(id));
            
            this.txtKeyArt.setText(tmp.getKeyArt());
            this.txtBrand.setText(tmp.getBrand());
            this.txtName.setText(tmp.getName());
            this.txtDescription.setText(tmp.getDescription());
            this.txtPrice.setText(Double.toString(tmp.getPrice()));
            this.txtAvailable.setText(Integer.toString(tmp.getAvailability()));
            
            this.currentId = id;
            
            this.txtSearch.setText("");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "An unexpected error occured, please try again.");
        }
    }//GEN-LAST:event_tblProductMouseClicked

    /**
    Method to rearrange the information in the table.
    This method allows the user to search items based on their category.
     */
    
    private void comboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoryActionPerformed
        
        if(this.comboCategory.getSelectedItem().toString().equals("Cualquiera")) {
            this.comboBrand.setSelectedIndex(0);
            this.restrictedItemsModel = this.model;
            this.tblProduct.setModel(this.model);
            return;
        }
        
        this.restrictedItemsModel = new DefaultTableModel();
        
        for(int i = 0; i < this.model.getRowCount(); i++) {
            
            if(i==0) {
                this.restrictedItemsModel.addColumn("Clave de artículo");
                this.restrictedItemsModel.addColumn("Categoría");
                this.restrictedItemsModel.addColumn("Marca");
                this.restrictedItemsModel.addColumn("Nombre");
                this.restrictedItemsModel.addColumn("Disponibles");
                
                this.tblProduct.setModel(this.restrictedItemsModel);
            }
            
            if(this.ProductInventory.getArticle(this.ProductInventory.searchId(this.model.getValueAt(i, 0).toString())).getClass().getSimpleName().equals(this.comboCategory.getSelectedItem().toString().trim())) {
                
                String[] agregar = new String[5];
                
                agregar[0] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.model.getValueAt(i, 0).toString())).getKeyArt();
                agregar[1] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.model.getValueAt(i, 0).toString())).getClass().getSimpleName();
                agregar[2] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.model.getValueAt(i, 0).toString())).getBrand();
                agregar[3] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.model.getValueAt(i, 0).toString())).getName();
                agregar[4] = Integer.toString(this.ProductInventory.getArticle(this.ProductInventory.searchId(this.model.getValueAt(i, 0).toString())).getAvailability());

                this.restrictedItemsModel.addRow(agregar);
            }
        }
        
    }//GEN-LAST:event_comboCategoryActionPerformed

    /**
    Method to modify availability of an item.
    This method modifies the availability of an item.
     */
    
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        ModificarInventarioGUI mod = new ModificarInventarioGUI(this, true);
        
        mod.setVisible(true);
    }//GEN-LAST:event_btnModifyActionPerformed

    /**
     * Method to delete an item.
     * @param evt 
     */
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar");
        
        if(confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CLOSED_OPTION) {
            //Do Nothing
        } else {
            this.ProductInventory.removeItem(this.ProductInventory.getArticle(this.ProductInventory.searchId(this.txtKeyArt.getText().trim())));
            
            model = new DefaultTableModel();
            
            model.addColumn("Clave de artículo");
            model.addColumn("Categoría");
            model.addColumn("Marca");
            model.addColumn("Nombre");
            model.addColumn("Disponibles");

            this.tblProduct.setModel(model);

            for(int i = 0; i<ProductInventory.getNoOfItems(); i++) {
                String[] agregar = new String[5];
                agregar[0] = this.ProductInventory.getArticle(i).getKeyArt();
                agregar[1] = this.ProductInventory.getArticle(i).getClass().getSimpleName();
                agregar[2] = this.ProductInventory.getArticle(i).getBrand();
                agregar[3] = this.ProductInventory.getArticle(i).getName();
                agregar[4] = Integer.toString(this.ProductInventory.getArticle(i).getAvailability());

                model.addRow(agregar);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int currentIndex = this.ProductInventory.searchId(this.txtSearch.getText().trim());
        
        if(currentIndex < 0) {
            JOptionPane.showMessageDialog(this, "No existe ningún objeto con esta clave de artículo en el inventario.");
        } else {
            this.txtKeyArt.setText(this.ProductInventory.getArticle(currentIndex).getKeyArt());
            this.txtBrand.setText(this.ProductInventory.getArticle(currentIndex).getBrand());
            this.txtName.setText(this.ProductInventory.getArticle(currentIndex).getName());
            this.txtDescription.setText(this.ProductInventory.getArticle(currentIndex).getDescription());
            this.txtPrice.setText(Double.toString(this.ProductInventory.getArticle(currentIndex).getPrice()));
            this.txtAvailable.setText(Integer.toString(this.ProductInventory.getArticle(currentIndex).getAvailability()));
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AgregarProductoGUI add = new AgregarProductoGUI(this, true);
        
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void comboBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBrandActionPerformed
        
        if(this.comboBrand.getSelectedItem().toString().equals("Cualquiera")) {
            this.doublyRestrictedItemsModel = this.restrictedItemsModel;
            this.tblProduct.setModel(this.restrictedItemsModel);
            return;
        }
        
        this.doublyRestrictedItemsModel = new DefaultTableModel();
        
        for(int i = 0; i < this.restrictedItemsModel.getRowCount(); i++) {
            
            if(i==0) {
                this.doublyRestrictedItemsModel.addColumn("Clave de artículo");
                this.doublyRestrictedItemsModel.addColumn("Categoría");
                this.doublyRestrictedItemsModel.addColumn("Marca");
                this.doublyRestrictedItemsModel.addColumn("Nombre");
                this.doublyRestrictedItemsModel.addColumn("Disponibles");
                
                this.tblProduct.setModel(this.doublyRestrictedItemsModel);
            }
            
            if(this.ProductInventory.getArticle(this.ProductInventory.searchId(this.restrictedItemsModel.getValueAt(i, 0).toString())).getBrand().equals(this.comboBrand.getSelectedItem().toString().trim())) {
                String[] agregar = new String[5];
                agregar[0] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.restrictedItemsModel.getValueAt(i, 0).toString())).getKeyArt();
                agregar[1] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.restrictedItemsModel.getValueAt(i, 0).toString())).getClass().getSimpleName();
                agregar[2] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.restrictedItemsModel.getValueAt(i, 0).toString())).getBrand();
                agregar[3] = this.ProductInventory.getArticle(this.ProductInventory.searchId(this.restrictedItemsModel.getValueAt(i, 0).toString())).getName();
                agregar[4] = Integer.toString(this.ProductInventory.getArticle(this.ProductInventory.searchId(this.restrictedItemsModel.getValueAt(i, 0).toString())).getAvailability());

                this.doublyRestrictedItemsModel.addRow(agregar);
            }
        }
        
    }//GEN-LAST:event_comboBrandActionPerformed

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        this.txtKeyArt.setText("");
        this.txtBrand.setText("");
        this.txtName.setText("");
        this.txtDescription.setText("");
        this.txtPrice.setText("");
        this.txtAvailable.setText("");
    }//GEN-LAST:event_btnEmptyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JTable tblProduct;
    private javax.swing.JLabel txtAvailable;
    private javax.swing.JLabel txtBrand;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtKeyArt;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    /**
    Method that allows external agents to get the table of contents.
     * @return 
     */
    public javax.swing.JTable getTblClothes() {
        return tblProduct;
    }

    /**
     * @param newAvailable
     */
    public void setTxtAvailable(String newAvailable) {
        this.txtAvailable.setText(newAvailable);
    }

}
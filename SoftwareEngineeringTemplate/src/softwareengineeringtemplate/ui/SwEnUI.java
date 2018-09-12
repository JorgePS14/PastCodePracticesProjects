package softwareengineeringtemplate.ui;

import softwareengineeringtemplate.Clothes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import softwareengineeringtemplate.ClothesDeposit;
import softwareengineeringtemplate.MaxHeap;
import softwareengineeringtemplate.MinHeap;

/**
SwEnUI Class:
Main window for this project.
*/

public class SwEnUI extends javax.swing.JFrame {
    
    /**
    Variable declaration.
    */

    DefaultTableModel model = new DefaultTableModel();
    
    String currentId;
    
    DefaultTableModel searchModel;
    
    DefaultTableModel restrictModel;
    
    DefaultTableModel currentModel;
    
    ClothesDeposit clothesStore = new ClothesDeposit(true);
    
    MinHeap lowToHigh;
    
    MaxHeap highToLow;
    
    Clothes addItem;
    
    /**
    Constructor for the main window of this program.
    */
    
    public SwEnUI() {
        initComponents();
        this.setTitle("Virtual Shop App");
        model.addColumn("ID");
        model.addColumn("Brand");
        model.addColumn("Class");
        model.addColumn("Colour");
        model.addColumn("Price");
        
        this.tblClothes.setModel(model);
        this.currentModel = model;
        
        for(int i = 0; i<clothesStore.getNoOfClothes(); i++) {
            String[] agregar = new String[5];
            agregar[0] = this.clothesStore.getClothingItem(i).getId();
            agregar[1] = this.clothesStore.getClothingItem(i).getBrand();
            agregar[2] = this.clothesStore.getClothingItem(i).getClass().getSimpleName();
            agregar[3] = this.clothesStore.getClothingItem(i).getColour();
            agregar[4] = Double.toString(this.clothesStore.getClothingItem(i).getPrice());
            
            model.addRow(agregar);
        }
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAvailable = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtPrice = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClothes = new javax.swing.JTable();
        txtBrand = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        txtCategory = new javax.swing.JLabel();
        txtColour = new javax.swing.JLabel();
        txtFabric = new javax.swing.JLabel();
        txtStyle = new javax.swing.JLabel();
        txtFit = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        comboShow = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboPrice = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miSave = new javax.swing.JMenuItem();
        miAdd = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        miReport = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Brand:");

        jLabel2.setText("Description:");

        jLabel3.setText("Category:");

        jLabel4.setText("Colour:");

        jLabel5.setText("Fabric:");

        jLabel6.setText("Style:");

        jLabel7.setText("Fit:");

        jLabel8.setText("Price:");

        jLabel11.setText("Availability:");

        btnSearch.setText("Search by brand");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblClothes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClothes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClothesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClothes);

        jScrollPane2.setViewportView(jScrollPane1);

        btnBuy.setText("Buy item");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        jLabel9.setText("Show only");

        comboShow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Tops", "Bottoms", "Shoes" }));
        comboShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboShowActionPerformed(evt);
            }
        });

        jLabel10.setText("Price:");

        comboPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "High to Low", "Low to High" }));
        comboPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPriceActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        menuFile.add(miSave);

        miAdd.setText("Add item");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        menuFile.add(miAdd);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFile.add(miExit);

        jMenuBar1.add(menuFile);

        menuReport.setText("Report");

        miReport.setText("Generate CSV Report");
        miReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReportActionPerformed(evt);
            }
        });
        menuReport.add(miReport);

        jMenuBar1.add(menuReport);

        menuHelp.setText("Help");

        miAbout.setText("About");
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
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFabric, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStyle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrice))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAvailable))
                            .addComponent(btnBuy)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(comboPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBrand))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtColour))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFabric))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStyle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAvailable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrice))
                .addGap(41, 41, 41)
                .addComponent(btnBuy)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
    Method to search for a clothing item of a certain brand in the store.
    */
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String brand = this.txtSearch.getText();
        
        if(brand.equals("")) {
            this.txtSearch.setText("");
            this.currentModel = this.model;
            this.tblClothes.setModel(this.model);
            JOptionPane.showMessageDialog(this, "Please enter a brand to use the search functionality.");
            return;
        }
        
        int indicator = 0;
        
        this.searchModel = new DefaultTableModel();
        
        this.searchModel.addColumn("ID");
        this.searchModel.addColumn("Brand");
        this.searchModel.addColumn("Class");
        this.searchModel.addColumn("Colour");
        this.searchModel.addColumn("Price");
        
        //this.tblClothes.setModel(this.searchModel);
        
        for(int i = 0; i < this.clothesStore.getNoOfClothes(); i++) {

            if(this.clothesStore.getClothingItem(i).getBrand().equals(brand)) {
                
                String[] add = new String[5];
                
                add[0] = this.clothesStore.getClothingItem(i).getId();
                add[1] = this.clothesStore.getClothingItem(i).getBrand();
                add[2] = this.clothesStore.getClothingItem(i).getClass().getSimpleName();
                add[3] = this.clothesStore.getClothingItem(i).getColour();
                add[4] = Double.toString(this.clothesStore.getClothingItem(i).getPrice());
                
                this.searchModel.addRow(add);
                
                indicator++;
            }
            this.tblClothes.setModel(this.searchModel);
        }
        
        this.comboPrice.setSelectedIndex(0);
        this.comboShow.setSelectedIndex(0);
        
        if(indicator != 0) {
            this.tblClothes.setModel(this.searchModel);
            this.currentModel = this.searchModel;
            this.tblClothes.setModel(this.searchModel);
        }
        
        this.txtSearch.setText("");
        
        
        if(indicator == 0) {
            this.tblClothes.setModel(this.model);
            
            JOptionPane.showMessageDialog(this, "We're currently not selling anything from this brand.");
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
    Method that allows us to see the information of the creator of this program.
    */
    
    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed
        JOptionPane.showMessageDialog(this, "ID: A00226522 \n"
                + "Name: Jorge Pietra Santa \n"
                + "Subject: Estructura de Datos \n"
                + "Institution: ITESM \n"
                + "Professor: Jairo Salazar");
    }//GEN-LAST:event_miAboutActionPerformed

    /**
    Method to close and exit the program.
    */
    
    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    /**
    Method that allows us to save our clothesStore in the form of a .dat file.
    */
    
    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        this.clothesStore.guardarArchivo();
    }//GEN-LAST:event_miSaveActionPerformed

    /**
    Method to generate a CSV document of the clothesStore.
    */
    
    private void miReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReportActionPerformed
        this.clothesStore.generateCSV(this.clothesStore.getClothesDeposit());
    }//GEN-LAST:event_miReportActionPerformed

    /**
    Method that calls the add method from the clothesStore.
    Allows us to add an element to the Clothes Deposit.
     */
    
    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
        
        addItemUI add = new addItemUI(this, true);
        
        add.setVisible(true);
        
    }//GEN-LAST:event_miAddActionPerformed

    /**
    Method to get the information from an element in the table.
    This allows us to listen for a click and get all the available information from that item.
     */
    
    private void tblClothesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClothesMouseClicked
        
        try{
            int row = this.tblClothes.getSelectedRow();
            String id = this.tblClothes.getValueAt(row, 0).toString();
            
            Clothes tmp = this.clothesStore.getClothingItem(this.clothesStore.searchId(id));
            
            this.txtBrand.setText(tmp.getBrand());
            this.txtDescription.setText(tmp.getDescription());
            this.txtCategory.setText(tmp.getClass().getSimpleName() + ", " + tmp.getCategory());
            this.txtColour.setText(tmp.getColour());
            this.txtFabric.setText(tmp.getFabric());
            this.txtStyle.setText(tmp.getStyle());
            this.txtFit.setText(tmp.getFit());
            this.txtAvailable.setText(Integer.toString(tmp.getAvailability()));
            this.txtPrice.setText(Double.toString(tmp.getPrice()));
            
            this.currentId = id;
            
            this.txtSearch.setText("");
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "An unexpected error occured, please try again.");
        }
    }//GEN-LAST:event_tblClothesMouseClicked

    /**
    Method to filter items.
    This allows the user to select if he/she wants to look for tops, bottoms, shoes, or all elements in general.
     */
    
    private void comboShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboShowActionPerformed
        
        String show = this.comboShow.getSelectedItem().toString().trim();
        
        
        if(show.equals("All")) {
            this.comboPrice.setSelectedIndex(0);
            this.tblClothes.setModel(this.model);
            this.currentModel = this.model;
            return;
        }
        
        this.restrictModel = new DefaultTableModel();
        
        restrictModel.addColumn("ID");
        restrictModel.addColumn("Brand");
        restrictModel.addColumn("Class");
        restrictModel.addColumn("Colour");
        restrictModel.addColumn("Price");
        
        this.tblClothes.setModel(restrictModel);
        
        int indicator = 0;
        
        for(int i = 0; i < this.clothesStore.getNoOfClothes(); i++) {

            if(this.clothesStore.getClothingItem(i).getClass().getSimpleName().equals(show)) {
                
                String[] add = new String[5];

                add[0] = this.clothesStore.getClothingItem(i).getId();
                add[1] = this.clothesStore.getClothingItem(i).getBrand();
                add[2] = this.clothesStore.getClothingItem(i).getClass().getSimpleName();
                add[3] = this.clothesStore.getClothingItem(i).getColour();
                add[4] = Double.toString(this.clothesStore.getClothingItem(i).getPrice());

                restrictModel.addRow(add);

                indicator++;
            } 
        }
        
        this.currentModel = restrictModel;
        
        if(indicator == 0)
            JOptionPane.showMessageDialog(this, "We're currently not selling any " + show);
    }//GEN-LAST:event_comboShowActionPerformed

    /**
    Method to rearrange the information in the table.
    This method allows the user to search items based on their price. The user can select to view prices high to low, low to high, or in any random order.
     */
    
    private void comboPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPriceActionPerformed
        
        
        if(this.comboPrice.getSelectedItem().toString().equals("Any")) {
            this.comboShow.setSelectedIndex(0);
            this.tblClothes.setModel(this.model);
            this.currentModel = this.model;
            return;
        }
        
        this.restrictModel = new DefaultTableModel();
        
        restrictModel.addColumn("ID");
        restrictModel.addColumn("Brand");
        restrictModel.addColumn("Class");
        restrictModel.addColumn("Colour");
        restrictModel.addColumn("Price");
        
        
        if(this.comboPrice.getSelectedItem().toString().equals("High to Low")) {
            ClothesDeposit tmp = new ClothesDeposit();
            
            for(int i = 0; i < this.currentModel.getRowCount(); i++) {
                tmp.addItem(this.clothesStore.getClothingItem(this.clothesStore.searchId(this.currentModel.getValueAt(i, 0).toString().trim())));
            }
            
            this.highToLow = new MaxHeap(this.currentModel.getRowCount(), tmp.getClothesDeposit());
            
            int tmpsize = this.highToLow.getSize();
            
            for(int i = 0; i < tmpsize; i++) {
                
                Clothes current = this.highToLow.extractMax();
                
                String[] add = new String[5];
                
                add[0] = current.getId();
                add[1] = current.getBrand();
                add[2] = current.getClass().getSimpleName().trim();
                add[3] = current.getColour();
                add[4] = Double.toString(current.getPrice());
                
                this.restrictModel.addRow(add);
            }
            
        } else if(this.comboPrice.getSelectedItem().toString().equals("Low to High")) {
            ClothesDeposit tmp = new ClothesDeposit();
            
            for(int i = 0; i < this.currentModel.getRowCount(); i++) {
                tmp.addItem(this.clothesStore.getClothingItem(this.clothesStore.searchId(this.currentModel.getValueAt(i, 0).toString().trim())));
            }
            
            this.lowToHigh = new MinHeap(this.currentModel.getRowCount(), tmp.getClothesDeposit());
            
            int tmpsize = this.lowToHigh.getSize();
            
            for(int i = 0; i < tmpsize; i++) {
                
                Clothes current = this.lowToHigh.extractMin();
                
                String[] add = new String[5];
                
                add[0] = current.getId();
                add[1] = current.getBrand();
                add[2] = current.getClass().getSimpleName().trim();
                add[3] = current.getColour();
                add[4] = Double.toString(current.getPrice());
                
                this.restrictModel.addRow(add);
            }
        }
        
        this.currentModel = restrictModel;
        this.tblClothes.setModel(restrictModel);
        
    }//GEN-LAST:event_comboPriceActionPerformed

    /**
    Method to buy an item.
    This method simulates buying an item, which decreases the availability of any particular item.
     */
    
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        
        if(Integer.parseInt(this.txtAvailable.getText()) != 0 ) {
            JOptionPane.showMessageDialog(this, "Compra realizada. Se ha cargado el monto total a su tarjeta.");
            this.clothesStore.getClothingItem(this.clothesStore.searchId(currentId)).setAvailability(this.clothesStore.getClothingItem(this.clothesStore.searchId(currentId)).getAvailability()-1);
            
            this.txtBrand.setText("");
            this.txtDescription.setText("");
            this.txtCategory.setText("");
            this.txtColour.setText("");
            this.txtFabric.setText("");
            this.txtStyle.setText("");
            this.txtFit.setText("");
            this.txtAvailable.setText("");
            this.txtPrice.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "We're sorry, this item is out of stock.");
        }
        
    }//GEN-LAST:event_btnBuyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboPrice;
    private javax.swing.JComboBox<String> comboShow;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miReport;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JTable tblClothes;
    private javax.swing.JLabel txtAvailable;
    private javax.swing.JLabel txtBrand;
    private javax.swing.JLabel txtCategory;
    private javax.swing.JLabel txtColour;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtFabric;
    private javax.swing.JLabel txtFit;
    private javax.swing.JLabel txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtStyle;
    // End of variables declaration//GEN-END:variables

    /**
    Method that allows external agents to get the table of contents.
     */
    public javax.swing.JTable getTblClothes() {
        return tblClothes;
    }

}
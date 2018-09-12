package ruletadecodigov2.ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ruletadecodigov2.Libro;
import ruletadecodigov2.RepositorioLibros;

/**
Clase RuletaDeCodigoV2UI:
Ventana principal del programa del repositorio de libros.
*/

public class RuletaDeCodigoV2UI extends javax.swing.JFrame {
    
    /**
    Declaración de variables para el funcionamiento de la aplicación.
    */

    DefaultTableModel model = new DefaultTableModel();
    
    RepositorioLibros libros = new RepositorioLibros();
    
    private int libroActual;
    
    /**
    Método que permite conseguir el repositorio de libros que se está manejando en el programa.
    */
    
    public RepositorioLibros getLibros() {
        return this.libros;
    }
    
    /**
    Constructor de la ventana principal del programa.
    */
    
    public RuletaDeCodigoV2UI() {
        initComponents();
        this.setTitle("Repositorio de libros");
        model.addColumn("ISBN");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        this.tblLibros.setModel(model);
                
        for(int i = 0; i<libros.getNumLibros(); i++) {
            String[] agregar = new String[3];
            agregar[0] = this.libros.getLibro(i).getIsbn();
            agregar[1] = this.libros.getLibro(i).getNombre();
            agregar[2] = Double.toString(this.libros.getLibro(i).getPrecio());
            
            model.addRow(agregar);
        }
    }
    
    /**
    Código generado automáticamente por NetBeans para el funcionamiento correcto de la ventana.
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnVaciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnOrdenarISBN = new javax.swing.JButton();
        btnOrdenarNom = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnOrdenarPrecio = new javax.swing.JButton();
        btnOrdenarPrecio2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        miGuardar = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miCSV = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        miAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ISBN:");

        jLabel2.setText("Nombre:");

        jLabel6.setText("Precio:");

        btnGuardar.setText("Modificar datos del libro");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar libro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar lilbro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        jScrollPane2.setViewportView(jScrollPane1);

        btnVaciar.setText("Vaciar campos de texto");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        btnOrdenarISBN.setText("Ordenar por ISBN");
        btnOrdenarISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarISBNActionPerformed(evt);
            }
        });

        btnOrdenarNom.setText("Ordenar alfabéticamente por título");
        btnOrdenarNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNomActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar ISBN");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnOrdenarPrecio.setText("Ordenar por precio menor a mayor");
        btnOrdenarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPrecioActionPerformed(evt);
            }
        });

        btnOrdenarPrecio2.setText("Ordenar por precio mayor a menor");
        btnOrdenarPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPrecio2ActionPerformed(evt);
            }
        });

        menuArchivo.setText("Archivo");

        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(miGuardar);

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(miSalir);

        jMenuBar1.add(menuArchivo);

        jMenu1.setText("CSV");

        miCSV.setText("Generar archivo CSV");
        miCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCSVActionPerformed(evt);
            }
        });
        jMenu1.add(miCSV);

        jMenuBar1.add(jMenu1);

        menuAyuda.setText("Ayuda");

        miAcercaDe.setText("Acerca de...");
        miAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(miAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnOrdenarISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenarPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenarNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenarPrecio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVaciar)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenarISBN)
                    .addComponent(btnOrdenarNom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenarPrecio)
                    .addComponent(btnOrdenarPrecio2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
    Método que permite guardar los cambios realizados a un libro.
    Este método realiza cambios tanto en el repositorio de libros como en la tabla de acceso rápido y los campos de texto de la aplicación.
    */
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.libroActual = this.libros.buscarLibro(this.txtISBN.getText());
        
        if(this.libroActual != -1) {
        
            this.libros.getLibro(this.libroActual).setNombre(this.txtNombre.getText());
            this.libros.getLibro(this.libroActual).setPrecio(Double.parseDouble(this.txtPrecio.getText()));
        
            String actualISBN = this.txtISBN.getText();
        
            for(int i = 0; i<this.tblLibros.getRowCount(); i++) {
                String tempISBN = this.tblLibros.getModel().getValueAt(i, 0).toString();
                if(actualISBN.equals(tempISBN)) {
                    model.setValueAt(this.libros.getLibro(this.libros.buscarLibro(actualISBN)).getIsbn(), i, 0);
                    model.setValueAt(this.libros.getLibro(this.libros.buscarLibro(actualISBN)).getNombre(), i, 1);
                    model.setValueAt(Double.toString(this.libros.getLibro(this.libros.buscarLibro(actualISBN)).getPrecio()), i, 2);
                }
            }
            
            this.libroActual = this.libros.buscarLibro(this.txtISBN.getText());
            
            this.txtNombre.setText(libros.getLibro(this.libroActual).getNombre());
            this.txtPrecio.setText(Double.toString(libros.getLibro(this.libroActual).getPrecio()));
            
        } else
            JOptionPane.showMessageDialog(this, "No existe un libro con ese ISBN.");
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
    Método que permite eliminar un libro.
    Este método elimina al libro del repositorio, de la tabla de acceso rápido y vacía los campos de texto.
    */
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.libroActual = this.libros.buscarLibro(this.txtISBN.getText());
        
        if(this.libroActual != -1) {
            
            this.libros.eliminarLibro(this.libros.getLibro(this.libroActual));
        
            String actualISBN = this.txtISBN.getText();
        
            for(int i = 0; i<this.tblLibros.getRowCount(); i++) {
                String tempISBN = this.tblLibros.getModel().getValueAt(i, 0).toString();
                if(actualISBN.equals(tempISBN)) {
                    model.removeRow(i);
                
                    this.txtISBN.setText("");
                    this.txtNombre.setText("");
                    this.txtPrecio.setText("");
                
                } 
            }
            
        } else
            JOptionPane.showMessageDialog(this, "No existe un libro con ese ISBN.");
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
    Método para agregar un libro a la lista.
    Este método permite agregar un nuevo libro al repositorio y a la lista de acceso rápido.
    */
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            this.libroActual = this.libros.buscarLibro(this.txtISBN.getText());

            if(this.libroActual == -1) {

                String[] agregar = new String[3];
                agregar[0] = this.txtISBN.getText();
                agregar[1] = this.txtNombre.getText();
                agregar[2] = this.txtPrecio.getText();

                Libro e;
                
                e = new Libro(this.txtNombre.getText(), this.txtISBN.getText(), Double.parseDouble(this.txtPrecio.getText()));
                    model.addRow(agregar);
                    libros.agregarLibro(e);

                this.libroActual = this.libros.buscarLibro(this.txtISBN.getText());

                this.txtNombre.setText(libros.getLibro(this.libroActual).getNombre());
                this.txtPrecio.setText(Double.toString(libros.getLibro(this.libroActual).getPrecio()));

            }
            else
                JOptionPane.showMessageDialog(this, "Ya existe un libro con ese ISBN.");
        }
        catch(NullPointerException e) {
            
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
    Método para ver los datos acerca de la aplicación.
    Este método muestra una ventana de diálogo con los datos del autor de la aplicación.
    */
    
    private void miAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, "Matrícula: A00226522 \n"
                + "Nombre: Jorge Pietra Santa \n"
                + "Materia: Estrutura de Datos \n"
                + "Escuela: ITESM \n"
                + "Profesor: Jairo Salazar");
    }//GEN-LAST:event_miAcercaDeActionPerformed

    /**
    Método para salir del programa.
    Este método cierra todas las ventanas y cierra el programa.
    */
    
    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    /**
    Método para guardar el repositorio de libros en un archivo.
    Este método llama al método guardarArchivo del repositorio de libros para generar un archivo DAT.
    */
    
    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        this.libros.guardarArchivo();
    }//GEN-LAST:event_miGuardarActionPerformed

    /**
    Método para vaciar campos.
    Este método vacía todos los campos de texto de la aplicación.
    */
    
    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        this.txtISBN.setText("");
        this.txtNombre.setText("");
        this.txtPrecio.setText("");
    }//GEN-LAST:event_btnVaciarActionPerformed

    /**
    Método para generar archivo CSV.
    Este método llama al método generarCSV del repositorio de libros para exportar el repositorio en un archivo CSV.
    */
    
    private void miCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCSVActionPerformed
        this.libros.generarCSV(this.libros.getRepositorioLibros());
    }//GEN-LAST:event_miCSVActionPerformed
    
    /**
    Método para ordenar libros por ISBN.
    Este método llama al método ordenarLibrosISBN del repositorio de libros para ordenar los libros por su ISBN.
    */
    
    private void btnOrdenarISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarISBNActionPerformed
        this.libros.ordenarLibrosISBN();
        
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for(int i = 0; i<this.libros.getNumLibros(); i++) {
            String[] agregar = new String[3];
            agregar[0] = this.libros.getLibro(i).getIsbn();
            agregar[1] = this.libros.getLibro(i).getNombre();
            agregar[2] = Double.toString(this.libros.getLibro(i).getPrecio());
            
            model.addRow(agregar);
        }
    }//GEN-LAST:event_btnOrdenarISBNActionPerformed
    
    /**
    Método para ordenar libros por nombre.
    Este método llama al método ordenarLibrosNom del repositorio de libros para ordenar los libros por su nombre en orden alfabético.
    */
    
    private void btnOrdenarNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNomActionPerformed
        this.libros.ordenarLibrosNom();
        
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for(int i = 0; i<this.libros.getNumLibros(); i++) {
            String[] agregar = new String[3];
            agregar[0] = this.libros.getLibro(i).getIsbn();
            agregar[1] = this.libros.getLibro(i).getNombre();
            agregar[2] = Double.toString(this.libros.getLibro(i).getPrecio());
            
            model.addRow(agregar);
        }
    }//GEN-LAST:event_btnOrdenarNomActionPerformed

    /**
    Método para buscar un libro.
    Este método llama al método getLibro del repositorio de libros para conseguir los datos de un libro.
    */
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.libroActual = this.libros.buscarLibro(this.txtISBN.getText());
        
        if(this.libroActual != -1) {
            this.txtNombre.setText(libros.getLibro(this.libroActual).getNombre());
            this.txtPrecio.setText(Double.toString(libros.getLibro(this.libroActual).getPrecio()));
        } else
            JOptionPane.showMessageDialog(this, "No existe un libro con ese ISBN.");
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
    Método para ordenar libros por precio.
    Este método llama al método ordenarLibrosPrecio del repositorio de libros para ordenar los libros por su precio de menor a mayor.
    */
    
    private void btnOrdenarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPrecioActionPerformed
        this.libros.ordenarLibrosPreciomM();
        
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for(int i = 0; i<this.libros.getNumLibros(); i++) {
            String[] agregar = new String[3];
            agregar[0] = this.libros.getLibro(i).getIsbn();
            agregar[1] = this.libros.getLibro(i).getNombre();
            agregar[2] = Double.toString(this.libros.getLibro(i).getPrecio());
            
            model.addRow(agregar);
        }
    }//GEN-LAST:event_btnOrdenarPrecioActionPerformed

    /**
    Método para ordenar libros por precio.
    Este método llama al método ordenarLibrosPrecio del repositorio de libros para ordenar los libros por su precio de mayor a menor.
    */
    
    private void btnOrdenarPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPrecio2ActionPerformed
        this.libros.ordenarLibrosPrecioMm();
        
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for(int i = 0; i<this.libros.getNumLibros(); i++) {
            String[] agregar = new String[3];
            agregar[0] = this.libros.getLibro(i).getIsbn();
            agregar[1] = this.libros.getLibro(i).getNombre();
            agregar[2] = Double.toString(this.libros.getLibro(i).getPrecio());
            
            model.addRow(agregar);
        }
    }//GEN-LAST:event_btnOrdenarPrecio2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOrdenarISBN;
    private javax.swing.JButton btnOrdenarNom;
    private javax.swing.JButton btnOrdenarPrecio;
    private javax.swing.JButton btnOrdenarPrecio2;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem miAcercaDe;
    private javax.swing.JMenuItem miCSV;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
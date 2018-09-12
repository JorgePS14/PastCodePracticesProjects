package metodosnumericoserrores.ui;

import javax.swing.JOptionPane;
import metodosnumericoserrores.ErrorCalculator;

public class ErrorCalcUI extends javax.swing.JFrame {

    ErrorCalculator errorCalc = new ErrorCalculator();
    
    public ErrorCalcUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        trueValText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aproxValText = new javax.swing.JTextField();
        errorAbsButton = new javax.swing.JButton();
        errorAproxButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        errorAbsoluto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        errorRelativo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prevValText = new javax.swing.JTextField();
        actValText = new javax.swing.JTextField();
        errorNormButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        errorNormalizado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calcular error absoluto o aprox.:");

        jLabel3.setText("Calcular error normalizado:");

        jLabel4.setText("Valor verdadero");

        jLabel5.setText("Valor aprox.");

        errorAbsButton.setText("Error absoluto");
        errorAbsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorAbsButtonActionPerformed(evt);
            }
        });

        errorAproxButton.setText("Error aprox.");
        errorAproxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorAproxButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Error absoluto: ");

        errorAbsoluto.setText("N/A");

        jLabel6.setText("Error aprox.:");

        errorRelativo.setText("N/A");

        jLabel7.setText("Valor actual");

        jLabel8.setText("Valor anterior");

        errorNormButton.setText("Error normalizado");
        errorNormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorNormButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Error normalizado: ");

        errorNormalizado.setText("N/A");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(errorAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(trueValText, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(aproxValText))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(errorAbsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorAproxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(errorRelativo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(actValText))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(prevValText))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(errorNormButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorNormalizado)))
                .addGap(5, 192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trueValText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(actValText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aproxValText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(prevValText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorAbsButton)
                    .addComponent(errorNormButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorAproxButton)
                    .addComponent(jLabel9)
                    .addComponent(errorNormalizado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(errorAbsoluto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(errorRelativo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void errorAbsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorAbsButtonActionPerformed
        try {
            double trueVal = Double.parseDouble(trueValText.getText());
            double aproxVal = Double.parseDouble(aproxValText.getText());
            
            double absError = errorCalc.absErrorCalc(trueVal, aproxVal);
            
            errorAbsoluto.setText(Double.toString(absError));
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor asegúrate de que todos los valores sean números.");
        }
    }//GEN-LAST:event_errorAbsButtonActionPerformed

    private void errorAproxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorAproxButtonActionPerformed
        try {
            double trueVal = Double.parseDouble(trueValText.getText());
            double aproxVal = Double.parseDouble(aproxValText.getText());
            
            double relError = errorCalc.relErrorCalc(trueVal, aproxVal);
            
            if(relError != -1)
                errorRelativo.setText(Double.toString(relError));
            else
                JOptionPane.showMessageDialog(this, "El valor verdadero no puede ser 0");
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor asegúrate de que todos los valores sean números.");
        }
    }//GEN-LAST:event_errorAproxButtonActionPerformed

    private void errorNormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorNormButtonActionPerformed
        try {
            double actVal = Double.parseDouble(actValText.getText());
            double prevVal = Double.parseDouble(prevValText.getText());
            
            double normError = errorCalc.normErrorCalc(actVal, prevVal);
            
            if(normError != -1)
                errorNormalizado.setText(Double.toString(normError));
            else
                JOptionPane.showMessageDialog(this, "El valor actual no puede ser 0");
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor asegúrate de que todos los valores sean números.");
        }
    }//GEN-LAST:event_errorNormButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actValText;
    private javax.swing.JTextField aproxValText;
    private javax.swing.JButton errorAbsButton;
    private javax.swing.JLabel errorAbsoluto;
    private javax.swing.JButton errorAproxButton;
    private javax.swing.JButton errorNormButton;
    private javax.swing.JLabel errorNormalizado;
    private javax.swing.JLabel errorRelativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField prevValText;
    private javax.swing.JTextField trueValText;
    // End of variables declaration//GEN-END:variables
}

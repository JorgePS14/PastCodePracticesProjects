package sistemaecuaciones.ui;

import javax.swing.JOptionPane;

public class SistemaEcuacionesUI extends javax.swing.JFrame {
    
    private double systemX[] = new double[3], systemY[] = new double[3],
                    systemZ[] = new double[3], answers[] = new double [3],
                    tempDiags1[] = new double[3], tempDiags2[] = new double[3];
    
    private double detSys, detX, detY, detZ, x, y, z;

    public SistemaEcuacionesUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        z1 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        z3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ans1 = new javax.swing.JTextField();
        ans2 = new javax.swing.JTextField();
        ans3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        answer1 = new javax.swing.JLabel();
        answer2 = new javax.swing.JLabel();
        answer3 = new javax.swing.JLabel();
        solveButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setText("Three Equation System Solver");

        x1.setText("0");

        x2.setText("0");

        x3.setText("0");

        jLabel1.setText("x+");

        jLabel2.setText("x+");

        jLabel3.setText("x+");

        y1.setText("0");

        y2.setText("0");

        y3.setText("0");

        jLabel4.setText("y+");

        jLabel5.setText("y+");

        jLabel6.setText("y+");

        z1.setText("0");

        z2.setText("0");

        z3.setText("0");

        jLabel7.setText("z =");

        jLabel8.setText("z =");

        jLabel9.setText("z =");

        ans1.setText("0");

        ans2.setText("0");

        ans3.setText("0");

        jLabel10.setText("X =");

        jLabel11.setText("Y =");

        jLabel12.setText("Z =");

        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(solveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ans3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answer2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answer3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answer1)))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(errorMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(answer1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(answer2)
                    .addComponent(solveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(answer3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(errorMessage)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        try{
            systemX[0] = Double.parseDouble(x1.getText());
            systemX[1] = Double.parseDouble(x2.getText());
            systemX[2] = Double.parseDouble(x3.getText());
            
            systemY[0] = Double.parseDouble(y1.getText());
            systemY[1] = Double.parseDouble(y2.getText());
            systemY[2] = Double.parseDouble(y3.getText());
            
            systemZ[0] = Double.parseDouble(z1.getText());
            systemZ[1] = Double.parseDouble(z2.getText());
            systemZ[2] = Double.parseDouble(z3.getText());
            
            answers[0] = Double.parseDouble(ans1.getText());
            answers[1] = Double.parseDouble(ans2.getText());
            answers[2] = Double.parseDouble(ans3.getText());
            
            solveDetSys();
            
            if(detSys == 0) {
                answer1.setText("?");
                answer2.setText("?");
                answer3.setText("?");
                errorMessage.setText("There are either infinite solutions for this equation system, or none at all.");
            } else {
                solveDetX();
                solveDetY();
                solveDetZ();
                
                solveX();
                solveY();
                solveZ();
                
                answer1.setText(Double.toString(x));
                answer2.setText(Double.toString(y));
                answer3.setText(Double.toString(z));
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please make sure all values are numbers.");
        }
    }//GEN-LAST:event_solveButtonActionPerformed

    //Method to solve for the System Determinant
    public void solveDetSys() {
        tempDiags1[0] = systemX[0]*systemY[1]*systemZ[2];
        tempDiags1[1] = systemX[2]*systemY[0]*systemZ[1];
        tempDiags1[2] = systemX[1]*systemY[2]*systemZ[0];
        
        tempDiags2[0] = systemX[2]*systemY[1]*systemZ[0];
        tempDiags2[1] = systemX[0]*systemY[2]*systemZ[1];
        tempDiags2[2] = systemX[1]*systemY[0]*systemZ[2];
        
        detSys = (tempDiags1[0]+tempDiags1[1]+tempDiags1[2])-
                (tempDiags2[0]+tempDiags2[1]+tempDiags2[2]);
    }
    
    //Method to solve for the X Determinant
    public void solveDetX() {
        tempDiags1[0] = answers[0]*systemY[1]*systemZ[2];
        tempDiags1[1] = answers[2]*systemY[0]*systemZ[1];
        tempDiags1[2] = answers[1]*systemY[2]*systemZ[0];
        
        tempDiags2[0] = answers[2]*systemY[1]*systemZ[0];
        tempDiags2[1] = answers[0]*systemY[2]*systemZ[1];
        tempDiags2[2] = answers[1]*systemY[0]*systemZ[2];
        
        detX = (tempDiags1[0]+tempDiags1[1]+tempDiags1[2])-
                (tempDiags2[0]+tempDiags2[1]+tempDiags2[2]);
    }
    
    //Method to solve for the Y Determinant
    public void solveDetY() {
        tempDiags1[0] = systemX[0]*answers[1]*systemZ[2];
        tempDiags1[1] = systemX[2]*answers[0]*systemZ[1];
        tempDiags1[2] = systemX[1]*answers[2]*systemZ[0];
        
        tempDiags2[0] = systemX[2]*answers[1]*systemZ[0];
        tempDiags2[1] = systemX[0]*answers[2]*systemZ[1];
        tempDiags2[2] = systemX[1]*answers[0]*systemZ[2];
        
        detY = (tempDiags1[0]+tempDiags1[1]+tempDiags1[2])-
                (tempDiags2[0]+tempDiags2[1]+tempDiags2[2]);
    }
    
    //Method to solve for the Z Determinant
    public void solveDetZ() {
        tempDiags1[0] = systemX[0]*systemY[1]*answers[2];
        tempDiags1[1] = systemX[2]*systemY[0]*answers[1];
        tempDiags1[2] = systemX[1]*systemY[2]*answers[0];
        
        tempDiags2[0] = systemX[2]*systemY[1]*answers[0];
        tempDiags2[1] = systemX[0]*systemY[2]*answers[1];
        tempDiags2[2] = systemX[1]*systemY[0]*answers[2];
        
        detZ = (tempDiags1[0]+tempDiags1[1]+tempDiags1[2])-
                (tempDiags2[0]+tempDiags2[1]+tempDiags2[2]);
    }
    
    public void solveX() {
        x = detX/detSys;
    }
    
    public void solveY() {
        y = detY/detSys;
    }
    
    public void solveZ() {
            z = detZ/detSys;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans1;
    private javax.swing.JTextField ans2;
    private javax.swing.JTextField ans3;
    private javax.swing.JLabel answer1;
    private javax.swing.JLabel answer2;
    private javax.swing.JLabel answer3;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton solveButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    // End of variables declaration//GEN-END:variables
}

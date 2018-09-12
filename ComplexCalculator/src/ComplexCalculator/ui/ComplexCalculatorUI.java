package complexcalculator.ui;

import javax.swing.JOptionPane;

public class ComplexCalculatorUI extends javax.swing.JFrame {

    float varR1 = 0, varR2 = 0, varI1 = 0, varI2 = 0;
    String r1 = "", r2 = "", i1 = "", i2 = "";
    int state = 0;
    char op;
    
    public ComplexCalculatorUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnImag = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N

        btn7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnEquals.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMul.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnMul.setText("X");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnSum.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnSum.setText("+");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnImag.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnImag.setText("i");
        btnImag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEquals)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImag, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        int num = 0;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int num = 1;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        int num = 2;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        int num = 3;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        int num = 4;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        int num = 5;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        int num = 6;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        int num = 7;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        int num = 8;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        int num = 9;
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                this.state = 2;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r1 = this.r1+num;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                this.state = 6;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i1 = this.i1+num;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                this.state = 10;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.r2 = this.r2+num;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                this.state = 14;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 15:
                this.txtDisplay.setText(this.txtDisplay.getText()+num);
                this.i2 = this.i2+num;
                break;
            case 16:
                this.txtDisplay.setText(Integer.toString(num));
                this.state = 2; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        String point = ".";
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.r1 = this.r1+point;
                this.state = 3;
                break;
            case 1:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.r1 = this.r1+point;
                this.state = 3;
                break;
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.r1 = this.r1+point;
                this.state = 3;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.i1 = this.i1+point;
                this.state = 7;
                break;
            case 5:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.i1 = this.i1+point;
                this.state = 7;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.i1 = this.i1+point;
                this.state = 7;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.r2 = this.r2+point;
                this.state = 11;
                break;
            case 9:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.r2 = this.r2+point;
                this.state = 11;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.r2 = this.r2+point;
                this.state = 11;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.i2 = this.i2+point;
                this.state = 15;
                break;
            case 13:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.i2 = this.i2+point;
                this.state = 15;
                break;
            case 14:
                this.txtDisplay.setText(this.txtDisplay.getText()+point);
                this.i2 = this.i2+point;
                this.state = 15;
                break;
            case 16:
                this.txtDisplay.setText(point);
                this.state = 3; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        String sub = "-";
        switch(state) {
            case 0:
                this.txtDisplay.setText(this.txtDisplay.getText()+sub);
                this.r1 = this.r1+sub;
                this.state = 1;
                break;
            case 4:
                this.txtDisplay.setText(this.txtDisplay.getText()+sub);
                this.i1 = this.i1+sub;
                this.state = 5;
                break;
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+" "+sub+ " ");
                this.op = '-';
                this.state = 8;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +sub+ " ");
                this.op = '-';
                this.state = 8;
                break;
            case 8:
                this.txtDisplay.setText(this.txtDisplay.getText()+sub);
                this.r2 = this.r2+sub;
                this.state = 9;
                break;
            case 12:
                this.txtDisplay.setText(this.txtDisplay.getText()+sub);
                this.i2 = this.i2+sub;
                this.state = 13;
                break;
            case 16:
                this.txtDisplay.setText(sub);
                this.state = 1; 
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        String sum = "+";
        switch(state) {
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +sum+ " ");
                this.op = '+';
                this.state = 8;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +sum+ " ");
                this.op = '+';
                this.state = 8;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        String div = "/";
        switch(state) {
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +div+ " ");
                this.op = '/';
                this.state = 8;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +div+ " ");
                this.op = '/';
                this.state = 8;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        String mul = "x";
        switch(state) {
            case 6:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +mul+ " ");
                this.op = '*';
                this.state = 8;
                break;
            case 7:
                this.txtDisplay.setText(this.txtDisplay.getText()+" " +mul+ " ");
                this.op = '*';
                this.state = 8;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        this.varR1 = 0;
        this.varI1 = 0;
        this.varI2 = 0;
        this.varR2 = 0;
        this.r1 = "";
        this.r2 = "";
        this.i1 = "";
        this.i2 = "";
        this.op = ' ';
        this.txtDisplay.setText("");
        this.state = 0;
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        this.varR1 = Float.parseFloat(this.r1);
        this.varR2 = Float.parseFloat(this.r2);
        this.varI1 = Float.parseFloat(this.i1);
        this.varI2 = Float.parseFloat(this.i2);
        
        switch(state) {
            case 14:
                switch(this.op)  {
                    case '+':
                        this.txtDisplay.setText(Double.toString(this.varR1+this.varR2) + 
                                ((this.varI1 + this.varI2) >= 0 ? " + " : " ") +
                                Double.toString(this.varI1+this.varI2) + "i");
                        break;
                    case '-':
                        this.txtDisplay.setText(Double.toString(this.varR1-this.varR2) +
                                ((this.varI1 - this.varI2) >= 0 ? " + " : " ") +
                                Double.toString(this.varI1-this.varI2) + "i");
                        break;
                    case '*':
                        this.txtDisplay.setText(Double.toString(this.varR1*this.varR2 - this.varI1*this.varI2) +
                                ((this.varR1*this.varI2 + this.varR2*this.varI1) >= 0 ? " + " : " ") +
                                Double.toString(this.varR1*this.varI2 + this.varR2*this.varI1) + "i");
                        break;
                    case '/':
                        if(this.varR2 == 0 || this.varI2 == 0) {
                            JOptionPane.showMessageDialog(this, "No se puede dividir entre 0");
                            break;
                        }
                        this.txtDisplay.setText(Double.toString((this.varR1*this.varR2 + this.varI1*this.varI2)/
                                (this.varR2*this.varR2 + this.varI2*this.varI2)) + 
                                (((this.varR2*this.varI1-this.varR1*this.varI2)/ 
                                (this.varR2*this.varR2 + this.varI2*this.varI2)) >= 0 ? " + " : " ") +
                                Double.toString((this.varR2*this.varI1-this.varR1*this.varI2)/ 
                                (this.varR2*this.varR2 + this.varI2*this.varI2)) + "i");
                        break;
                    default:
                        break;
                } 
                this.state = 16;
                break;
                
            case 15: 
                switch(this.op)  {
                    case '+':
                        this.txtDisplay.setText(Double.toString(this.varR1+this.varR2) + 
                                ((this.varI1 + this.varI2) >= 0 ? " + " : " ") +
                                Double.toString(this.varI1+this.varI2) + "i");
                        break;
                    case '-':
                        this.txtDisplay.setText(Double.toString(this.varR1-this.varR2) +
                                ((this.varI1 - this.varI2) >= 0 ? " + " : " ") +
                                Double.toString(this.varI1-this.varI2) + "i");
                        break;
                    case '*':
                        this.txtDisplay.setText(Double.toString(this.varR1*this.varR2 - this.varI1*this.varI2) +
                                ((this.varR1*this.varI2 + this.varR2*this.varI1) >= 0 ? " + " : " ") +
                                Double.toString(this.varR1*this.varI2 + this.varR2*this.varI1) + "i");
                        break;
                    case '/':
                        if(this.varR2 == 0 || this.varI2 == 0) {
                            JOptionPane.showMessageDialog(this, "No se puede dividir entre 0");
                            break;
                        }
                        this.txtDisplay.setText(Double.toString((this.varR1*this.varR2 + this.varI1*this.varI2)/
                                (this.varR2*this.varR2 + this.varI2*this.varI2)) + 
                                (((this.varR2*this.varI1-this.varR1*this.varI2)/ 
                                (this.varR2*this.varR2 + this.varI2*this.varI2)) >= 0 ? " + " : " ") +
                                Double.toString((this.varR2*this.varI1-this.varR1*this.varI2)/ 
                                (this.varR2*this.varR2 + this.varI2*this.varI2)) + "i");
                        break;
                    default:
                        break;
                } 
                this.state = 16;
                break;
            default:
                break;
                
        }
        
        this.varR1 = 0;
        this.varI1 = 0;
        this.varI2 = 0;
        this.varR2 = 0;
        this.r1 = "";
        this.r2 = "";
        this.i1 = "";
        this.i2 = "";
        this.op = ' ';
        
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnImagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagActionPerformed
        String imag = "i";
        switch(state) {
            case 2:
                this.txtDisplay.setText(this.txtDisplay.getText()+" +"+imag);
                this.state = 4;
                break;
            case 3:
                this.txtDisplay.setText(this.txtDisplay.getText()+" +"+imag);
                this.state = 4;
                break;
            case 10:
                this.txtDisplay.setText(this.txtDisplay.getText()+" +"+imag);
                this.state = 12;
                break;
            case 11:
                this.txtDisplay.setText(this.txtDisplay.getText()+" +"+imag);
                this.state = 12;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnImagActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnImag;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnSum;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}

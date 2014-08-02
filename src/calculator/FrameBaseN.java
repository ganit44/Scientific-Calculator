
package calculator;

import javax.swing.ButtonGroup;
import java.awt.event.KeyEvent;

/**
 *
 * @author Ganit
 */
public class FrameBaseN extends javax.swing.JFrame {

    /**
     * Creates new form FrameBaseN
     */
    int i=10;
    int decNumber;
    public FrameBaseN() {
        initComponents();
        this.addKeyListener(null);                          //Add Key Listener to the frame
        this.setFocusable(true);                            //make frame focusable
        ButtonGroup bg2 = new ButtonGroup();                 //make a new button group
        bg2.add(standardRadioButton);                                     //add standard radio button to the buttongroup
        bg2.add(baseNRadioButton);                                     //add baseN radio button to the buttongroup
        baseNRadioButton.setSelected(true);                           //default baseN
        jButtonA.setEnabled(false);
        jButtonB.setEnabled(false);
        jButtonC.setEnabled(false);
        jButtonD.setEnabled(false);
        jButtonE.setEnabled(false);
        jButtonF.setEnabled(false);
    }

    public void convertToDecimal(){
        if(i==16)
                decNumber=Integer.parseInt(jTextField2.getText(), 16);
        if(i==8)
                decNumber=Integer.parseInt(jTextField2.getText(), 8);
        if(i==2)
                decNumber=Integer.parseInt(jTextField2.getText(), 2);
        if(i==10)
                decNumber=Integer.parseInt(jTextField2.getText(), 10);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        standardRadioButton = new javax.swing.JRadioButton();
        baseNRadioButton = new javax.swing.JRadioButton();
        decButton = new javax.swing.JButton();
        hexButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        octButton = new javax.swing.JButton();
        binButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programmer's Calculator");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setFocusable(false);

        jButton1.setText("1");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.setFocusable(false);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonA.setText("A");
        jButtonA.setFocusable(false);
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonB.setText("B");
        jButtonB.setFocusable(false);
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.setFocusable(false);
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonD.setText("D");
        jButtonD.setFocusable(false);
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });

        jButtonE.setText("E");
        jButtonE.setFocusable(false);
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });

        jButtonF.setText("F");
        jButtonF.setFocusable(false);
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });

        standardRadioButton.setText("Standard");
        standardRadioButton.setFocusable(false);
        standardRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                standardRadioButtonItemStateChanged(evt);
            }
        });

        baseNRadioButton.setText("Base N");
        baseNRadioButton.setFocusable(false);

        decButton.setText("Dec");
        decButton.setFocusable(false);
        decButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decButtonActionPerformed(evt);
            }
        });

        hexButton.setText("Hex");
        hexButton.setFocusable(false);
        hexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        octButton.setText("Oct");
        octButton.setFocusable(false);
        octButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octButtonActionPerformed(evt);
            }
        });

        binButton.setText("Bin");
        binButton.setFocusable(false);
        binButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binButtonActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setFocusable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dec", "Hex", "Oct", "Bin" }));
        jComboBox1.setFocusable(false);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonA)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonC)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton0))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton9)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonF)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(octButton)
                                    .addComponent(hexButton)
                                    .addComponent(decButton)
                                    .addComponent(binButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(standardRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(baseNRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardRadioButton)
                    .addComponent(baseNRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButtonA)
                    .addComponent(jButtonB)
                    .addComponent(decButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButtonC)
                    .addComponent(jButtonD)
                    .addComponent(hexButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButtonE)
                    .addComponent(jButtonF)
                    .addComponent(octButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(clearButton)
                    .addComponent(binButton))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standardRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_standardRadioButtonItemStateChanged
            this.setVisible(false);         //if standard radio button clicked open NewJFrame
            NewJFrame n = new NewJFrame();
            n.createWindow();
            this.dispose();
    }//GEN-LAST:event_standardRadioButtonItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            jTextField2.setText(jTextField2.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            jTextField2.setText(jTextField2.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void decButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decButtonActionPerformed
            convertToDecimal();             //dec button clicked first of all convert to decimal then use toString
            jTextField1.setText(Integer.toString(decNumber));
    }//GEN-LAST:event_decButtonActionPerformed

    private void hexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexButtonActionPerformed
            convertToDecimal();             //hex button clicked first of all convert to decimal then use toHexString
            jTextField1.setText(Integer.toHexString(decNumber));
    }//GEN-LAST:event_hexButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
            jTextField1.setText("");            //clear All Button Clicked
            jTextField2.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void octButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octButtonActionPerformed
            convertToDecimal();                 //oct button clicked first of all convert to decimal then use toOctalString
            jTextField1.setText(Integer.toOctalString(decNumber));
    }//GEN-LAST:event_octButtonActionPerformed

    private void binButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binButtonActionPerformed
            convertToDecimal();                 //bin button clicked first of all convert to decimal then use toBinaryString
            jTextField1.setText(Integer.toBinaryString(decNumber));
    }//GEN-LAST:event_binButtonActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
            jTextField1.setText("");
            jTextField2.setText("");
            if(jComboBox1.getSelectedItem().equals("Dec"))
            {
                i=10;
                enableAllButtons();         //enable buttons 0-9
                jButtonA.setEnabled(false);
                jButtonB.setEnabled(false);
                jButtonC.setEnabled(false);
                jButtonD.setEnabled(false);
                jButtonE.setEnabled(false);
                jButtonF.setEnabled(false);
            }
            else if(jComboBox1.getSelectedItem().equals("Hex"))
            {
                i=16;                       //enable buttons 0-F
                enableAllButtons();
            }
            else if(jComboBox1.getSelectedItem().equals("Oct"))
            {    
                i=8;                        //enable buttons 0-7
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
                jButtonA.setEnabled(false);
                jButtonB.setEnabled(false);
                jButtonC.setEnabled(false);
                jButtonD.setEnabled(false);
                jButtonE.setEnabled(false);
                jButtonF.setEnabled(false);
            }
            else if(jComboBox1.getSelectedItem().equals("Bin"))
            {
                i=2;                    //enable buttons 0-1
                disableAllButtons();
                jButton1.setEnabled(true);
                jButton0.setEnabled(true);
            }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            jTextField2.setText(jTextField2.getText() + "3");       //button 3 Clicked
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            jTextField2.setText(jTextField2.getText() + "4");       //button 4 Clicked
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            jTextField2.setText(jTextField2.getText() + "5");       //button 5 Clicked
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            jTextField2.setText(jTextField2.getText() + "6");       //button 6 Clicked
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            jTextField2.setText(jTextField2.getText() + "7");       //button 7 Clicked
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            jTextField2.setText(jTextField2.getText() + "8");       //button 8 Clicked
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            jTextField2.setText(jTextField2.getText() + "9");       //button 9 Clicked
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
            jTextField2.setText(jTextField2.getText() + "0");       //button 0 Clicked
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
            jTextField2.setText(jTextField2.getText() + "a");       //button A Clicked
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
            jTextField2.setText(jTextField2.getText() + "b");       //button B Clicked
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
            jTextField2.setText(jTextField2.getText() + "c");       //button C Clicked
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
            jTextField2.setText(jTextField2.getText() + "d");       //button D Clicked
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
            jTextField2.setText(jTextField2.getText() + "e");       //button E Clicked
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
            jTextField2.setText(jTextField2.getText() + "f");       //button F Clicked
    }//GEN-LAST:event_jButtonFActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
            int key = evt.getKeyCode();             //for keyevent
        switch(key) {
            case KeyEvent.VK_NUMPAD1: ;
            case KeyEvent.VK_1:
                jButton1ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD2: ;
            case KeyEvent.VK_2:
                jButton2ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD3: ;
            case KeyEvent.VK_3:
                jButton3ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD4: ;
            case KeyEvent.VK_4:
                jButton4ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD5: ;
            case KeyEvent.VK_5:
                jButton5ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD6: ;
            case KeyEvent.VK_6:
                jButton6ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD7: ;
            case KeyEvent.VK_7:
                jButton7ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD8: ;
            case KeyEvent.VK_8:
                jButton8ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD9: ;
            case KeyEvent.VK_9:
                jButton9ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD0: ;
            case KeyEvent.VK_0:
                jButton0ActionPerformed(null);
                break;
                
            case KeyEvent.VK_A:
                jButtonAActionPerformed(null);
                break;
                
            case KeyEvent.VK_B:
                jButtonBActionPerformed(null);
                break;
            
            case KeyEvent.VK_C:
                jButtonCActionPerformed(null);
                break;
                
            case KeyEvent.VK_D:
                jButtonDActionPerformed(null);
                break;
                
            case KeyEvent.VK_E:
                jButtonEActionPerformed(null);
                break;    
           
            case KeyEvent.VK_F:
                jButtonFActionPerformed(null);
                break;  
           
                
        }
    }//GEN-LAST:event_formKeyPressed

    public void disableAllButtons(){
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
            jButton9.setEnabled(false);
            jButton0.setEnabled(false);
            jButtonA.setEnabled(false);
            jButtonB.setEnabled(false);
            jButtonC.setEnabled(false);
            jButtonD.setEnabled(false);
            jButtonE.setEnabled(false);
            jButtonF.setEnabled(false);
    }
    
    public void enableAllButtons(){
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton0.setEnabled(true);
            jButtonA.setEnabled(true);
            jButtonB.setEnabled(true);
            jButtonC.setEnabled(true);
            jButtonD.setEnabled(true);
            jButtonE.setEnabled(true);
            jButtonF.setEnabled(true);
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton baseNRadioButton;
    private javax.swing.JButton binButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton decButton;
    private javax.swing.JButton hexButton;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton octButton;
    private javax.swing.JRadioButton standardRadioButton;
    // End of variables declaration//GEN-END:variables
}

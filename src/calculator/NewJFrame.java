package calculator;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
/**
 *
 * @author Ganit
 */
public class NewJFrame extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc=" Shunting Yard Algorithm ">
//    While there are tokens to be read:
//
//        Read a token.
//        If the token is a number, then add it to the output queue.
//        If the token is a function token, then push it onto the stack.
//        If the token is a function argument separator (e.g., a bracket):
//
//            Until the token at the top of the stack is a left parenthesis, pop operators off the stack onto the output queue. If no left parentheses are encountered, either the separator was misplaced or parentheses were mismatched.
//
//        If the token is an operator, o1, then:
//
//            while there is an operator token, o2, at the top of the stack, and
//
//                    either o1 is left-associative and its precedence is equal to that of o2,
//                    or o1 has precedence less than that of o2,
//
//                pop o2 off the stack, onto the output queue;
//
//            push o1 onto the stack.
//
//        If the token is a left parenthesis, then push it onto the stack.
//        If the token is a right parenthesis:
//
//            Until the token at the top of the stack is a left parenthesis, pop operators off the stack onto the output queue.
//            Pop the left parenthesis from the stack, but not onto the output queue.
//            If the token at the top of the stack is a function token, pop it onto the output queue.
//            If the stack runs out without finding a left parenthesis, then there are mismatched parentheses.
//
//    When there are no more tokens to read:
//
//        While there are still operator tokens in the stack:
//
//            If the operator token on the top of the stack is a parenthesis, then there are mismatched parentheses.
//            Pop the operator onto the output queue.
//
//    Exit.

    //</editor-fold>
    Queue<String> opq = new LinkedList<String>();          //Queue accrding to Shunting Yard Algorithm 
    Stack s = new Stack();                                 //Stack accrding to Shunting Yard Algorithm
    Stack ns = new Stack();                                //Stack for evaluating postfiv expression
 
    int leftpar=0;                                         //count the number of left parenthesis
    int function=0;                                         //count the number of function called
    double multiplier=1;                                    //for conversion between radian and degree
    boolean equalpressed=false;                             //to check whether equal button is pressed or not
    boolean err=false;                                      //to check if error is generated or not
    
    public void createWindow() {
        initComponents();
        this.setVisible(true);
        this.setLocation(400, 200);                         //set the location of the window
        this.addKeyListener(null);                          //Add Key Listener to the frame
        this.setFocusable(true);                            //make frame focusable
        this.getContentPane().setBackground(Color.LIGHT_GRAY);      //set backgroud color
        this.setIconImage(new ImageIcon(getClass().getResource("/calculator_icon.jpg")).getImage());    //set icon
        
        ButtonGroup bg = new ButtonGroup();                 //make a new button group
        bg.add(degree);                                     //add degree button to the buttongroup
        bg.add(radian);                                     //add radian button to the buttongroup
        radian.setSelected(true);                           //default radian
        
        ButtonGroup bg2 = new ButtonGroup();                 //make a new button group
        bg2.add(standardRadioButton);                        //add standard radio button to the buttongroup
        bg2.add(baseNRadioButton);                           //add baseN radio button to the buttongroup
        standardRadioButton.setSelected(true);               //default standard radio Button
        
    }

    public boolean isNumeric(String str)                    //to check if a given string is only Numeric or not
    {  
        try  
        {  
            double d = Double.parseDouble(str);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true;  
    }
    
    public boolean isAlpha(String name)                 //to check if a string contains only alphabet or not
    {
        return name.matches("[a-zA-Z]+");
    }
    
    public static double fact(double number){           //method to calculate factorial
        double result = 1.0;
        while(number != 0){
            result = result*number;
            number--;
        }
     
        return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        decimalButton = new javax.swing.JButton();
        divisonButton = new javax.swing.JButton();
        sinButton = new javax.swing.JButton();
        leftParButton = new javax.swing.JButton();
        rightParButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        lnButton = new javax.swing.JButton();
        inverseButton = new javax.swing.JToggleButton();
        squareRootButton = new javax.swing.JButton();
        degree = new javax.swing.JRadioButton();
        radian = new javax.swing.JRadioButton();
        powerButton = new javax.swing.JButton();
        modButton = new javax.swing.JButton();
        cubeRootButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        logTenButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        standardRadioButton = new javax.swing.JRadioButton();
        baseNRadioButton = new javax.swing.JRadioButton();
        factButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator by Ganit");
        setBackground(java.awt.SystemColor.activeCaption);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setFocusable(false);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("+");
        addButton.setFocusable(false);
        addButton.setMaximumSize(new java.awt.Dimension(39, 23));
        addButton.setMinimumSize(new java.awt.Dimension(39, 23));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        equalButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        equalButton.setText("=");
        equalButton.setFocusable(false);
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button1.setText("1");
        button1.setToolTipText("");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setFocusable(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button2.setText("2");
        button2.setFocusable(false);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        subtractButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        subtractButton.setText("-");
        subtractButton.setFocusable(false);
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        multiplyButton.setText("x");
        multiplyButton.setFocusable(false);
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        clearAllButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearAllButton.setText("Clear All");
        clearAllButton.setFocusable(false);
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setFocusable(false);

        button3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button3.setText("3");
        button3.setFocusable(false);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button4.setText("4");
        button4.setFocusable(false);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button7.setText("7");
        button7.setFocusable(false);
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button5.setText("5");
        button5.setFocusable(false);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button6.setText("6");
        button6.setFocusable(false);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button8.setText("8");
        button8.setFocusable(false);
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button9.setText("9");
        button9.setFocusable(false);
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        decimalButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        decimalButton.setText(".");
        decimalButton.setFocusable(false);
        decimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalButtonActionPerformed(evt);
            }
        });

        divisonButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        divisonButton.setText("/");
        divisonButton.setFocusable(false);
        divisonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisonButtonActionPerformed(evt);
            }
        });

        sinButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sinButton.setText("sin");
        sinButton.setToolTipText("Sine of an angle");
        sinButton.setFocusable(false);
        sinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinButtonActionPerformed(evt);
            }
        });

        leftParButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leftParButton.setText("(");
        leftParButton.setFocusable(false);
        leftParButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftParButtonActionPerformed(evt);
            }
        });

        rightParButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rightParButton.setText(")");
        rightParButton.setFocusable(false);
        rightParButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightParButtonActionPerformed(evt);
            }
        });

        zeroButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zeroButton.setText("0");
        zeroButton.setFocusable(false);
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        cosButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cosButton.setText("cos");
        cosButton.setFocusable(false);
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        tanButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tanButton.setText("tan");
        tanButton.setFocusable(false);
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });

        lnButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnButton.setText("ln");
        lnButton.setFocusable(false);
        lnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnButtonActionPerformed(evt);
            }
        });

        inverseButton.setText("Inverse");
        inverseButton.setToolTipText("Toggle Button to change Trigonometric Function to their Inverse and Vice-Versa");
        inverseButton.setFocusable(false);
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });

        squareRootButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        squareRootButton.setText("√`");
        squareRootButton.setFocusable(false);
        squareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootButtonActionPerformed(evt);
            }
        });

        degree.setText("Degree");
        degree.setToolTipText("Degree Mode");
        degree.setFocusable(false);
        degree.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                degreeItemStateChanged(evt);
            }
        });

        radian.setText("Radian");
        radian.setToolTipText("Radian Mode");
        radian.setFocusable(false);

        powerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powerButton.setText("^");
        powerButton.setFocusable(false);
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        modButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modButton.setText("mod");
        modButton.setFocusable(false);
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });

        cubeRootButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cubeRootButton.setText("cbrt(");
        cubeRootButton.setFocusable(false);
        cubeRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeRootButtonActionPerformed(evt);
            }
        });

        squareButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        squareButton.setText("x^2");
        squareButton.setFocusable(false);
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        logTenButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logTenButton.setText("log10");
        logTenButton.setFocusable(false);
        logTenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logTenButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setFocusable(false);

        standardRadioButton.setText("Standard");
        standardRadioButton.setFocusable(false);

        baseNRadioButton.setText("Base N");
        baseNRadioButton.setFocusable(false);
        baseNRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                baseNRadioButtonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(standardRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(baseNRadioButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardRadioButton)
                    .addComponent(baseNRadioButton))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        factButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        factButton.setText("fact");
        factButton.setFocusable(false);
        factButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back Space");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(decimalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button2)
                                        .addGap(18, 18, 18)
                                        .addComponent(button3)
                                        .addGap(18, 18, 18)
                                        .addComponent(leftParButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button5)
                                        .addGap(18, 18, 18)
                                        .addComponent(button6)
                                        .addGap(18, 18, 18)
                                        .addComponent(divisonButton)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiplyButton)
                                    .addComponent(rightParButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(button9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zeroButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtractButton)
                                    .addComponent(powerButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equalButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7)
                        .addGap(18, 18, 18)
                        .addComponent(button8)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backButton)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(squareRootButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sinButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cubeRootButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(logTenButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cosButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(modButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(factButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(squareButton)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inverseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(degree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radian)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inverseButton)
                    .addComponent(degree)
                    .addComponent(radian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(button2)
                    .addComponent(button3)
                    .addComponent(sinButton)
                    .addComponent(leftParButton)
                    .addComponent(rightParButton)
                    .addComponent(cosButton)
                    .addComponent(modButton)
                    .addComponent(factButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4)
                    .addComponent(button5)
                    .addComponent(button6)
                    .addComponent(multiplyButton)
                    .addComponent(divisonButton)
                    .addComponent(tanButton)
                    .addComponent(lnButton)
                    .addComponent(squareButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button7)
                            .addComponent(button8)
                            .addComponent(button9)
                            .addComponent(subtractButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(powerButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zeroButton)
                                .addComponent(decimalButton))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareRootButton)
                                .addComponent(logTenButton)
                                .addComponent(cubeRootButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(clearAllButton)
                                .addComponent(backButton)))
                        .addComponent(equalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
            jTextField2.setText(jTextField2.getText() + "+");   //add Button Clicked ; append + in Texbox2
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());             //add operand to the queue
            jTextField1.setText(null);
            String a;
            while(true && !s.isEmpty())         //Checking Precedence
            {
                a=(String)s.peek();
                if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/") || a.equals("^"))
                {
                    opq.add((String)s.pop());
                }
                else
                    break;
            }
            s.push("+");                //add '+' to stack
    }//GEN-LAST:event_addButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
            if(equalpressed)                //if equal button is pressed then clear all and reset equalpressed flag
                clearAllButtonActionPerformed(null);
            jTextField1.setText(jTextField1.getText() + "1");   //Button1 clicked
            jTextField2.setText(jTextField2.getText() + "1");   //append 1 in both textboxes
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
            if(equalpressed)
                clearAllButtonActionPerformed(null);
            jTextField1.setText(jTextField1.getText() + "2");   //Button2 Clicked
            jTextField2.setText(jTextField2.getText() + "2");   //append 2 in both textboxes
    }//GEN-LAST:event_button2ActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
            while(leftpar-->0)                  //Adjust Right Parenthesis
            {
                rightParButtonActionPerformed(null);        //call rightParButton Action to add the parenthesis 
                leftpar++;
            }
            jTextField2.setText(jTextField2.getText() + "=");   //Append '=' in Textbox2
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());             //Add operand to the Queue
            String op = new String();
            while(!s.isEmpty())                 //Pop the stack
            {                                   
                op=(String)s.pop();
                opq.add(op);                    //Add operators to the queue
            }
            
            String operation, operand1, operand2;
            Double d=0.0;
            try
            {
                while(!opq.isEmpty())               //while the queue is not empty
                {
                    operation=(String)opq.remove();     //remove an element from the queue
                    
                    if(isNumeric(operation))            //if element is Numeric
                    {
                        ns.push(operation);             //push it to the calculation stack
                    }
                    else if(isAlpha(operation))         //if element is alphabetical like sin, cos, sqrt
                    {
                        operand1=(String)ns.pop();      //pop one eement from the calculation stack
                        if(operation.equals("sin"))                                 //for sin
                            d=Math.sin(Double.parseDouble(operand1)*multiplier);
                        else if(operation.equals("invsin"))                         // for sin inverse
                            d=Math.asin(Double.parseDouble(operand1))/multiplier;
                        else if(operation.equals("cos"))                            // for cos
                            d=Math.cos(Double.parseDouble(operand1)*multiplier);
                        else if(operation.equals("invcos"))                         //for cos inverse
                            d=Math.acos(Double.parseDouble(operand1))/multiplier;
                        else if(operation.equals("tan"))                            //for tan
                            d=Math.tan(Double.parseDouble(operand1)*multiplier);
                        else if(operation.equals("invtan"))                         //for tan inverse
                            d=Math.atan(Double.parseDouble(operand1))/multiplier;
                        else if(operation.equals("ln"))                             //for ln
                            d=Math.log(Double.parseDouble(operand1));
                        else if(operation.equals("logten"))                         //for log to the base 10
                            d=Math.log10(Double.parseDouble(operand1));
                        else if(operation.equals("exp"))                            //exponetial
                            d=Math.exp(Double.parseDouble(operand1));
                        else if(operation.equals("sqrt"))                           //square root
                            d=Math.sqrt(Double.parseDouble(operand1));
                        else if(operation.equals("cbrt"))                           //cube root
                            d=Math.cbrt(Double.parseDouble(operand1));
                        else if(operation.equals("square"))                         //square
                            d=Math.pow(Double.parseDouble(operand1),2);
                        else if(operation.equals("fact"))                           //factorial
                        {
                                d=fact(Integer.parseInt(operand1));                 //else calculate the factorial
                        }
                        ns.push(Double.toString(d));                     //push the calculated value on the caluclation stack
                    }
                    else                //for element like '+', '-', '*', '/', '%', '^'
                    {
                        if(!ns.isEmpty()) 
                            operand1=(String)ns.pop();      //pop first element from the calculation stack 
                        else
                            operand1="";
                        if(!ns.isEmpty()) 
                            operand2=(String)ns.pop();      //pop second element from the calculation stack
                        else
                            operand2="";
                       
                        if(!isNumeric(operand1) || !isNumeric(operand2) || operand1.equals("") || operand2.equals(""))
                        {                       //if any operand is not numeric or equals to null
                            jTextField1.setText("Syntax Error");        //generate sysntax error
                            err=true;                                   //set error flag
                            break;                                      //break out from the loop
                        }
                        if(operation.equals("+"))
                            d=Double.parseDouble(operand1)+Double.parseDouble(operand2);
                        else if(operation.equals("-"))
                            d=Double.parseDouble(operand2)-Double.parseDouble(operand1);
                        else if(operation.equals("*"))
                            d=Double.parseDouble(operand1)*Double.parseDouble(operand2);
                        else if(operation.equals("/"))
                            d=Double.parseDouble(operand2)/Double.parseDouble(operand1);
                        else if(operation.equals("^"))
                            d=Math.pow(Double.parseDouble(operand2), Double.parseDouble(operand1));
                        else if(operation.equals("%"))
                            d=Double.parseDouble(operand2)%Double.parseDouble(operand1);
                        ns.push(Double.toString(d));
                    }
                
                }
            }
            catch(NoSuchElementException e)
            {}
            catch(EmptyStackException e)
            {}
            if(!err)
            {
                if(d.toString().contains("E"))      //if answer has E in it
                {
                    jTextField1.setText(Double.toString(d));
                }
                else
                {
                    if(d%1==0)          //if Double==Floor(double)
                    {
                        jTextField1.setText(Integer.toString((int) Math.floor(d)));
                    }
                    else
                        jTextField1.setText(Double.toString(d));
                }
            }
            equalpressed=true;
            s.clear();                      //clear stack
            opq.clear();                    //clear queue
            ns.clear();                     //clear calculation stack
    }//GEN-LAST:event_equalButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
            jTextField2.setText(jTextField2.getText() + "-");  //add minus sign to the TextField2
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());             //add operand to the queue
            else
                opq.add("0");
            jTextField1.setText(null);                      //after that set bottom textfield to null
            String a;
            while(true && !s.isEmpty())                 //adjusting the precedence
            {
                a=(String)s.peek();
                if(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/") || a.equals("^"))
                {
                    opq.add((String)s.pop());
                }
                else
                    break;
            }
            s.push("-");                                //push minus sign on the stack
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
            jTextField2.setText(jTextField2.getText() + "*"); //add minus sign to the TextField2
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());             //add operand to the queue
            jTextField1.setText(null);                      //after that set bottom textfield to null
            String a;
            while(true && !s.isEmpty())                 ////adjusting the precedence
            {
                a=(String)s.peek();
                if(a.equals("*") || a.equals("/") || a.equals("^"))
                {
                    opq.add((String)s.pop());
                }
                else
                    break;
            }
            s.push("*");                //push multiply sign on the stack
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
            jTextField1.setText(null);
            jTextField2.setText(null);
            s.clear();                      //clear stack
            opq.clear();                    //clear queue
            ns.clear();                     //clear calculation stack
            err=false;                      //reset error flag
            leftpar=0;
            function=0;
            equalpressed=false;
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "3");       //button 3 clicked
        jTextField2.setText(jTextField2.getText() + "3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "4");       //button 4 clicked
        jTextField2.setText(jTextField2.getText() + "4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "5");       //button 5 clicked
        jTextField2.setText(jTextField2.getText() + "5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "6");       //button 6 clicked
        jTextField2.setText(jTextField2.getText() + "6");
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "7");       //button 7 clicked
        jTextField2.setText(jTextField2.getText() + "7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "8");       //button 8 clicked
        jTextField2.setText(jTextField2.getText() + "8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "9");       //button 9 clicked
        jTextField2.setText(jTextField2.getText() + "9");
    }//GEN-LAST:event_button9ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();             //key press event    get keycode and storeit in 'key'
        switch(key) {
            case KeyEvent.VK_NUMPAD1: ;         //numpad1
            case KeyEvent.VK_1:                 //keypad1
                button1ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD2: ;
            case KeyEvent.VK_2:
                button2ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD3: ;
            case KeyEvent.VK_3:
                button3ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD4: ;
            case KeyEvent.VK_4:
                button4ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD5: ;
            case KeyEvent.VK_5:
                button5ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD6: ;
            case KeyEvent.VK_6:
                button6ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD7: ;
            case KeyEvent.VK_7:
                button7ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD8: ;
            case KeyEvent.VK_8:
                button8ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD9: ;
            case KeyEvent.VK_9:
                button9ActionPerformed(null);
                break;
                
            case KeyEvent.VK_NUMPAD0: ;
            case KeyEvent.VK_0:
                zeroButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_ADD:
                addButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_SUBTRACT:
                subtractButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_MULTIPLY:
                multiplyButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_DIVIDE:
                divisonButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_DECIMAL:
                decimalButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_C:
                clearAllButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_EQUALS: ;
            case KeyEvent.VK_ENTER:
                equalButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_LEFT_PARENTHESIS:
                leftParButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_RIGHT_PARENTHESIS:
                rightParButtonActionPerformed(null);
                break;
                
            case KeyEvent.VK_BACK_SPACE:
                backButtonActionPerformed(null);
                break;
                
        }
    }//GEN-LAST:event_formKeyPressed

    private void decimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalButtonActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + ".");       //decimal button clicked
        jTextField2.setText(jTextField2.getText() + ".");
    }//GEN-LAST:event_decimalButtonActionPerformed

    private void divisonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisonButtonActionPerformed
            jTextField2.setText(jTextField2.getText() + "/");       //append '/' to textbox
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());             //add operand to queue
            jTextField1.setText(null);
            String a;
            while(true && !s.isEmpty())             //checking precedence
            {
                a=(String)s.peek();
                if(a.equals("*") || a.equals("/") || a.equals("^"))
                {
                    opq.add((String)s.pop());
                }
                else
                    break;
            }
            s.push("/");            //push '/' on the stack
    }//GEN-LAST:event_divisonButtonActionPerformed

    private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinButtonActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        if(sinButton.getText().equals("sin"))       //if button text is sin
        {
            jTextField2.setText(jTextField2.getText() + "sin(");
            s.push("(");            //push ( into stack
            s.push("sin");          //push sin into stack
        }
        else                                        //if button text is invsin
        {
            jTextField2.setText(jTextField2.getText() + "invsin(");
            s.push("(");
            s.push("invsin");
        }
        s.push("(");        
        function++;         //increment function variable
        leftpar=leftpar+1;      //increment leftpar variable
    }//GEN-LAST:event_sinButtonActionPerformed

    private void leftParButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftParButtonActionPerformed
        jTextField2.setText(jTextField2.getText() + "(");       // left parenthesis button clicked
        s.push("(");                                            //push '(' on stack   increment leftpar variable
        leftpar++;
    }//GEN-LAST:event_leftParButtonActionPerformed

    private void rightParButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightParButtonActionPerformed
        jTextField2.setText(jTextField2.getText() + ")");       //append ')' in the textbox
        if(!jTextField1.getText().equals(""))
            opq.add(jTextField1.getText());         //add operand to the queue
        jTextField1.setText(null);
        String op = new String();
        while(true)
        {
            op=(String)s.pop();         //pop stack while '(' is encountered and add the queue
            if(op.equals("("))
                break;
            else
            {
                opq.add(op);
            }
        }
        leftpar--;                  //decrement leftpar variable
        if(function!=0)             //for function
        {
            while(true)
            {
                op=(String)s.pop();         //same as above
                if(op.equals("("))
                    break;
                else
                {
                    opq.add(op);
                }
            }
            function--;
        }
    }//GEN-LAST:event_rightParButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        jTextField1.setText(jTextField1.getText() + "0");           //zero button clicked
        jTextField2.setText(jTextField2.getText() + "0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosButtonActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        if(cosButton.getText().equals("cos"))       //if button text is cos
        {
            jTextField2.setText(jTextField2.getText() + "cos(");
            s.push("(");                    //push ( into stack
            s.push("cos");                  //push cos into stack
        }
        else                                //if button text is cos
        {
            jTextField2.setText(jTextField2.getText() + "invcos(");
            s.push("(");
            s.push("invcos");
        }
        s.push("(");
        function++;
        leftpar++;
    }//GEN-LAST:event_cosButtonActionPerformed

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanButtonActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        if(tanButton.getText().equals("tan"))
        {
            jTextField2.setText(jTextField2.getText() + "tan(");
            s.push("(");
            s.push("tan");
        }
        else
        {
            jTextField2.setText(jTextField2.getText() + "invtan(");
            s.push("(");
            s.push("invtan");
        }
        s.push("(");
        leftpar++;
        function++;
    }//GEN-LAST:event_tanButtonActionPerformed

    private void lnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnButtonActionPerformed
        if(equalpressed)
                clearAllButtonActionPerformed(null);
        if(lnButton.getText().equals("ln"))
        {
            jTextField2.setText(jTextField2.getText() + "ln(");
            s.push("(");
            s.push("ln");
        }
        else
        {
            jTextField2.setText(jTextField2.getText() + "e^(");
            s.push("(");
            s.push("exp");
        }
        s.push("(");
        leftpar++;
        function++;
    }//GEN-LAST:event_lnButtonActionPerformed

    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseButtonActionPerformed
        if(inverseButton.isSelected())
        {
            sinButton.setText("InvSin");        //if button selected convert to invsin
            cosButton.setText("InvCos");        //similarly for others
            tanButton.setText("InvTan");
            lnButton.setText("e^");
        }
        else
        {
            sinButton.setText("sin");       //if button is deselected convert to sin
            cosButton.setText("cos");       //similarly for others
            tanButton.setText("tan");
            lnButton.setText("ln");
        }
    }//GEN-LAST:event_inverseButtonActionPerformed

    private void squareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootButtonActionPerformed
            if(equalpressed)
                clearAllButtonActionPerformed(null);
            jTextField2.setText(jTextField2.getText() + "(√");      //append (√ in textbox
            s.push("(");                        //push '(' into stack
            s.push("sqrt");                     //push sqrt into stack
            s.push("(");
            leftpar++;                          //increment leftpar variable
            function++;
    }//GEN-LAST:event_squareRootButtonActionPerformed

    private void degreeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_degreeItemStateChanged
        if(degree.isSelected())         //if degree is selected
            multiplier=Math.PI/180;
        else
            multiplier=1;
    }//GEN-LAST:event_degreeItemStateChanged

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
            jTextField2.setText(jTextField2.getText() + "^");
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());
            jTextField1.setText(null);
            s.push("^");
    }//GEN-LAST:event_powerButtonActionPerformed

    private void cubeRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeRootButtonActionPerformed
            if(equalpressed)
                clearAllButtonActionPerformed(null);
            jTextField2.setText(jTextField2.getText() + "(∛");
            s.push("(");
            s.push("cbrt");
            s.push("(");
            leftpar++;
            function++;
    }//GEN-LAST:event_cubeRootButtonActionPerformed

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modButtonActionPerformed
            jTextField2.setText(jTextField2.getText() + "%");
            if(!jTextField1.getText().equals(""))
                opq.add(jTextField1.getText());
            jTextField1.setText(null);
            s.push("%");
    }//GEN-LAST:event_modButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
            if(equalpressed)
                clearAllButtonActionPerformed(null);
            jTextField2.setText(jTextField2.getText() + "square(");
            s.push("(");
            s.push("square");
            s.push("(");
            leftpar++;
            function++;
    }//GEN-LAST:event_squareButtonActionPerformed

    private void logTenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logTenButtonActionPerformed
            if(equalpressed)
                clearAllButtonActionPerformed(null);
            jTextField2.setText(jTextField2.getText() + "log10(");
            s.push("(");
            s.push("logten");
            s.push("(");
            leftpar++;
            function++;
    }//GEN-LAST:event_logTenButtonActionPerformed

    private void baseNRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_baseNRadioButtonItemStateChanged
            this.setVisible(false);             //if baseN radio Button clicked set visibility of this window to false
            FrameBaseN f = new FrameBaseN();        //open FrameBaseN
            f.setVisible(true);
            f.setLocation(400, 200); 
            this.dispose();                     //close this window
    }//GEN-LAST:event_baseNRadioButtonItemStateChanged

    private void factButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factButtonActionPerformed
            if(equalpressed)
                clearAllButtonActionPerformed(null);
            jTextField2.setText(jTextField2.getText() + "fact(");       //fact button clicked
            s.push("(");                    //push '(' onto stack
            s.push("fact");                 //push fact onto stack
            s.push("(");
            leftpar++;
            function++;
    }//GEN-LAST:event_factButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));      //backspace button clicked
            jTextField2.setText(jTextField2.getText().substring(0, jTextField2.getText().length()-1));
    }//GEN-LAST:event_backButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton baseNRadioButton;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton cubeRootButton;
    private javax.swing.JButton decimalButton;
    private javax.swing.JRadioButton degree;
    private javax.swing.JButton divisonButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton factButton;
    private javax.swing.JToggleButton inverseButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton leftParButton;
    private javax.swing.JButton lnButton;
    private javax.swing.JButton logTenButton;
    private javax.swing.JButton modButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton powerButton;
    private javax.swing.JRadioButton radian;
    private javax.swing.JButton rightParButton;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton squareButton;
    private javax.swing.JButton squareRootButton;
    private javax.swing.JRadioButton standardRadioButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}


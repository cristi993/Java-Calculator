
import java.rmi.*;
import java.rmi.registry.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RMIClientGUI extends javax.swing.JFrame {

    public RMIClientGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memoryClear = new javax.swing.JButton();
        memoryRead = new javax.swing.JButton();
        memoryPlus = new javax.swing.JButton();
        memoryMinus = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        point = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        inverse = new javax.swing.JButton();
        xpowy = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        squareRoot = new javax.swing.JButton();
        onoff = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        resultField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pocket Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        memoryClear.setBackground(java.awt.Color.lightGray);
        memoryClear.setForeground(new java.awt.Color(254, 254, 254));
        memoryClear.setText("MC");
        memoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryClearActionPerformed(evt);
            }
        });

        memoryRead.setBackground(java.awt.Color.lightGray);
        memoryRead.setForeground(new java.awt.Color(254, 254, 254));
        memoryRead.setText("MR");
        memoryRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryReadActionPerformed(evt);
            }
        });

        memoryPlus.setBackground(java.awt.Color.lightGray);
        memoryPlus.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        memoryPlus.setForeground(new java.awt.Color(254, 254, 254));
        memoryPlus.setText("M+");
        memoryPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryPlusActionPerformed(evt);
            }
        });

        memoryMinus.setBackground(java.awt.Color.lightGray);
        memoryMinus.setForeground(new java.awt.Color(254, 254, 254));
        memoryMinus.setText("M-");
        memoryMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryMinusActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(1, 1, 1));
        seven.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(254, 254, 254));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(1, 1, 1));
        eight.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(254, 254, 254));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(1, 1, 1));
        nine.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(254, 254, 254));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(1, 1, 1));
        four.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        four.setForeground(new java.awt.Color(254, 254, 254));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(1, 1, 1));
        five.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        five.setForeground(new java.awt.Color(254, 254, 254));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(1, 1, 1));
        six.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        six.setForeground(new java.awt.Color(254, 254, 254));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(1, 1, 1));
        one.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        one.setForeground(new java.awt.Color(254, 254, 254));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(1, 1, 1));
        two.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        two.setForeground(new java.awt.Color(254, 254, 254));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(1, 1, 1));
        three.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        three.setForeground(new java.awt.Color(254, 254, 254));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(1, 1, 1));
        zero.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        zero.setForeground(new java.awt.Color(254, 254, 254));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        point.setBackground(new java.awt.Color(1, 1, 1));
        point.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        point.setForeground(new java.awt.Color(254, 254, 254));
        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(1, 1, 1));
        equals.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        equals.setForeground(new java.awt.Color(254, 254, 254));
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        plus.setBackground(java.awt.Color.lightGray);
        plus.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        plus.setForeground(new java.awt.Color(254, 254, 254));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setBackground(java.awt.Color.lightGray);
        minus.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        minus.setForeground(new java.awt.Color(254, 254, 254));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setBackground(java.awt.Color.lightGray);
        multiply.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        multiply.setForeground(new java.awt.Color(254, 254, 254));
        multiply.setText("x");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setBackground(java.awt.Color.lightGray);
        divide.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        divide.setForeground(new java.awt.Color(254, 254, 254));
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        inverse.setBackground(java.awt.Color.lightGray);
        inverse.setForeground(new java.awt.Color(254, 254, 254));
        inverse.setText("1/x");
        inverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseActionPerformed(evt);
            }
        });

        xpowy.setBackground(java.awt.Color.lightGray);
        xpowy.setForeground(new java.awt.Color(254, 254, 254));
        xpowy.setText("x^y");
        xpowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xpowyActionPerformed(evt);
            }
        });

        factorial.setBackground(java.awt.Color.lightGray);
        factorial.setForeground(new java.awt.Color(254, 254, 254));
        factorial.setText("x!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        squareRoot.setBackground(java.awt.Color.lightGray);
        squareRoot.setForeground(new java.awt.Color(254, 254, 254));
        squareRoot.setText("√");
        squareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootActionPerformed(evt);
            }
        });

        onoff.setBackground(new java.awt.Color(240, 116, 127));
        onoff.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        onoff.setText("ON/OFF");
        onoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoffActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(119, 209, 255));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        clearAll.setBackground(new java.awt.Color(119, 209, 255));
        clearAll.setText("CA");
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        resultField.setEditable(false);
        resultField.setBackground(new java.awt.Color(207, 207, 207));
        resultField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("-/+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(onoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(zero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(one, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(four, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memoryRead, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inverse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(point, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memoryClear, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(xpowy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(squareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(six, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(three, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(memoryPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(memoryMinus, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                        .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearAll)
                    .addComponent(clear)
                    .addComponent(onoff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inverse)
                    .addComponent(xpowy)
                    .addComponent(factorial)
                    .addComponent(squareRoot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryRead)
                    .addComponent(memoryClear)
                    .addComponent(memoryPlus)
                    .addComponent(memoryMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nine)
                        .addGap(6, 6, 6)
                        .addComponent(six)
                        .addGap(6, 6, 6)
                        .addComponent(three)
                        .addGap(6, 6, 6)
                        .addComponent(equals))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(seven)
                            .addGap(6, 6, 6)
                            .addComponent(four)
                            .addGap(6, 6, 6)
                            .addComponent(one)
                            .addGap(6, 6, 6)
                            .addComponent(zero))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(eight)
                            .addGap(6, 6, 6)
                            .addComponent(five)
                            .addGap(6, 6, 6)
                            .addComponent(two)
                            .addGap(6, 6, 6)
                            .addComponent(point)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isOn = false, secondOp = false, setNew, invalid;
    private String operation = null;
    private ICalculator ca;
    private IGenerator gen;


    private void onoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoffActionPerformed

        if (isOn == false) {

            try {
                Registry r = LocateRegistry.getRegistry("127.0.0.1", 1099);
                gen = (IGenerator) r.lookup("Calculator");
            } catch (RemoteException | NotBoundException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                return;
            }

            try {
                ca = gen.ownServer();
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                return;
            }

            onoff.setBackground(new Color(239, 34, 52));
            resultField.setText("0");
            resultField.setBackground(Color.white);
            isOn = true;
            setNew = true;
        } else {

            resultField.setText(null);
            resultField.setBackground(Color.lightGray);
            onoff.setBackground(new Color(240, 116, 127));
            isOn = false;
        }
    }//GEN-LAST:event_onoffActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed

        operation = "+";

        if (isOn && (invalid == false)) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;
            invalid = true;

            if (secondOp == false) {
                try {
                    ca.setVal(sc.nextDouble());
                    secondOp = true;
                    return;
                } catch (RemoteException e) {

                    JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                    return;
                }
            }

            try {
                double x;
                resultField.setText("" + (x = ca.ad(sc.nextDouble())));
                ca.setVal(x);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed

        operation = "-";

        if (isOn && (invalid == false)) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;
            invalid = true;

            if (secondOp == false) {
                try {
                    ca.setVal(sc.nextDouble());
                    secondOp = true;
                    return;
                } catch (RemoteException e) {

                    JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                    return;
                }
            }

            try {
                double x;
                resultField.setText("" + (x = ca.sc(sc.nextDouble())));
                ca.setVal(x);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed

        operation = "*";

        if (isOn && (invalid == false)) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;
            invalid = true;

            if (secondOp == false) {
                try {
                    ca.setVal(sc.nextDouble());
                    secondOp = true;
                    return;
                } catch (RemoteException e) {

                    JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                    return;
                }
            }

            try {
                double x;
                resultField.setText("" + (x = ca.in(sc.nextDouble())));
                ca.setVal(x);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed

        operation = "/";

        if (isOn && (invalid == false)) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;
            invalid = true;

            if (secondOp == false) {
                try {
                    ca.setVal(sc.nextDouble());
                    secondOp = true;
                    return;
                } catch (RemoteException e) {

                    JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                    return;
                }
            }

            try {
                double x;
                resultField.setText("" + (x = ca.im(sc.nextDouble())));
                ca.setVal(x);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_divideActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed

        if (isOn) {

            Scanner sc = new Scanner(resultField.getText());

            try {
                setNew = true;

                if (invalid == true) {

                    return;
                }
                
                if(operation == null)
                    return;

                switch (operation) {

                    case "+":
                        resultField.setText("" + ca.ad(sc.nextDouble()));
                        break;
                    case "-":
                        resultField.setText("" + ca.sc(sc.nextDouble()));
                        break;
                    case "*":
                        resultField.setText("" + ca.in(sc.nextDouble()));
                        break;
                    case "/":
                        double x = sc.nextDouble();
                        if (x == 0) {
                            JOptionPane.showMessageDialog(null, "Eroare: Impartire la zero.");
                            ca.setVal(0);
                            secondOp = false;
                            return;
                        }
                        resultField.setText("" + ca.im(x));
                        break;
                    case "^":
                        resultField.setText("" + ca.pow(sc.nextDouble()));
                        break;
                    default:
                        return;
                }
                operation = "";
                secondOp = false;
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_equalsActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("0");
                setNew = false;
            } else if (!resultField.getText().isEmpty() && !resultField.getText().equals("0")) {
                resultField.setText(resultField.getText() + "0");
            }
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("1");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "1");
            }
        }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("2");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "2");
            }
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("3");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "3");
            }
        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("4");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "4");
            }
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("5");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "5");
            }
        }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("6");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "6");
            }
        }
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("7");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "7");
            }
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("8");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "8");
            }
        }
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("9");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + "9");
            }
        }
    }//GEN-LAST:event_nineActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed

        if (isOn) {

            if (resultField.getText().contains(".")) {
                return;
            }

            invalid = false;

            if (setNew == true) {

                resultField.setText("0.");
                setNew = false;
            } else {
                resultField.setText(resultField.getText() + ".");
            }
        }
    }//GEN-LAST:event_pointActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        if (isOn) {

            invalid = false;

            if (setNew == true) {

                resultField.setText("0");
            } else {

                if (resultField.getText().length() == 1) {

                    resultField.setText("0");
                    setNew = true;
                    return;
                }

                StringBuilder s = new StringBuilder(resultField.getText());
                s.deleteCharAt(s.length() - 1);
                resultField.setText(s.toString());
            }
        }
    }//GEN-LAST:event_clearActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed

        if (isOn) {

            try {
                ca.setVal(0);
                resultField.setText("0");
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }

        }
    }//GEN-LAST:event_clearAllActionPerformed

    private void squareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootActionPerformed

        if (isOn) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;

            try {
                double x = sc.nextDouble();

                if (x < 0) {

                    JOptionPane.showMessageDialog(null, "Eroare: Radical dintr-un numar negativ");
                    return;
                }

                resultField.setText("" + ca.sqrt(x));
                ca.setVal(0);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_squareRootActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed

        if (isOn) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;

            try {
                double x = sc.nextDouble();

                if ((x != Math.floor(x))) {

                    JOptionPane.showMessageDialog(null, "Eroare: Factorial dintr-un numar real.");
                    return;
                }

                if (x < 0) {

                    JOptionPane.showMessageDialog(null, "Eroare: Factorial dintr-un numar negativ.");
                    return;
                }

                resultField.setText("" + ca.fact(x));
                ca.setVal(0);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_factorialActionPerformed

    private void inverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseActionPerformed

        if (isOn) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;

            try {
                double x = sc.nextDouble();

                if (x == 0) {

                    JOptionPane.showMessageDialog(null, "Eroare: Impartire la zero.");
                    return;
                }

                resultField.setText("" + ca.rev(x));
                ca.setVal(0);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_inverseActionPerformed

    private void xpowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xpowyActionPerformed

        operation = "^";

        if (isOn && (invalid == false)) {

            Scanner sc = new Scanner(resultField.getText());
            setNew = true;
            invalid = true;

            if (secondOp == false) {
                try {
                    ca.setVal(sc.nextDouble());
                    secondOp = true;
                    return;
                } catch (RemoteException e) {

                    JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
                    return;
                }
            }

            try {
                double x;
                resultField.setText("" + (x = ca.pow(sc.nextDouble())));
                ca.setVal(x);
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_xpowyActionPerformed

    private void memoryReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryReadActionPerformed

        if (isOn) {

            setNew = true;

            try {
                ca.setVal(new Scanner(resultField.getText()).nextDouble());
                resultField.setText("" + ca.rdm());
                invalid = false;
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_memoryReadActionPerformed

    private void memoryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryClearActionPerformed

        if (isOn) {

            try {
                ca.clm();
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_memoryClearActionPerformed

    private void memoryPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryPlusActionPerformed

        if (isOn) {

            setNew = true;

            try {
                Scanner sc = new Scanner(resultField.getText());
                ca.adm(sc.nextDouble());
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_memoryPlusActionPerformed

    private void memoryMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryMinusActionPerformed

        if (isOn) {

            setNew = true;

            try {
                Scanner sc = new Scanner(resultField.getText());
                ca.scm(sc.nextDouble());
            } catch (RemoteException e) {

                JOptionPane.showMessageDialog(null, "Eroare: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_memoryMinusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (isOn) {

            if(resultField.getText().isEmpty())
                resultField.setText("-");
            
            if (resultField.getText().charAt(0) != '-') {

                resultField.setText("-" + resultField.getText());
            } else {

                StringBuilder str = new StringBuilder(resultField.getText());
                str.deleteCharAt(0);
                resultField.setText(str.toString());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton factorial;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton inverse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton memoryClear;
    private javax.swing.JButton memoryMinus;
    private javax.swing.JButton memoryPlus;
    private javax.swing.JButton memoryRead;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onoff;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton squareRoot;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton xpowy;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

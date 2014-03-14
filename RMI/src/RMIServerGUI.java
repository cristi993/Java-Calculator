
import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class RMIServerGUI extends javax.swing.JFrame {

    Generator gen = null;

    public RMIServerGUI() {
        initComponents();
    }

    public class Generator extends UnicastRemoteObject implements IGenerator {

        Generator() throws RemoteException {
        }

        public ICalculator ownServer() throws RemoteException {
            return new Calculator();
        }

    }

    public class Calculator extends UnicastRemoteObject implements ICalculator {

        double currentVal = 0, memmory = 0;

        public Calculator() throws RemoteException {

            textArea.append("Se deschide serverul\n");
        }

        public void setVal(double x) throws RemoteException {

            textArea.append("SetVal: " + x + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            currentVal = x;
        }

        public double ad(double x) throws RemoteException {

            textArea.append("Output:" + currentVal + " + " + x + " = " + (currentVal + x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return currentVal + x;
        }

        public double sc(double x) throws RemoteException {

            textArea.append("Output:" + currentVal + " - " + x + " = " + (currentVal - x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return currentVal - x;
        }

        public double in(double x) throws RemoteException {

            textArea.append("Output:" + currentVal + " * " + x + " = " + (currentVal * x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return currentVal * x;
        }

        public double im(double x) throws RemoteException {

            textArea.append("Output:" + currentVal + " / " + x + " = " + (currentVal / x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return currentVal / x;
        }

        public double pow(double x) throws RemoteException {

            if (currentVal == 0 && x == 0) {
                return 0;
            }
            textArea.append("Output:" + currentVal + "^" + x + " = " + Math.pow(currentVal, x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return Math.pow(currentVal, x);
        }

        public double sqrt(double x) throws RemoteException {

            textArea.append("Output: sqrt(" + x + ") = " + Math.sqrt(x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return Math.sqrt(x);
        }

        public double fact(double x) throws RemoteException {

            double result = 1;

            for (int i = 1; i <= x; i++) {

                result = result * i;
            }

            textArea.append("Output: " + x + "! = " + result + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return result;
        }

        public double rev(double x) throws RemoteException {
            
            textArea.append("Output: 1/" + x + " = " + (1 / x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return (1 / x);
        }

        public void adm(double x) throws RemoteException {
            
            textArea.append("Memmory = " + memmory + "+" + x + " = " + (memmory + x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            memmory += x;
        }

        public void scm(double x) throws RemoteException {

            textArea.append("Memmory = " + memmory + "-" + x + " = " + (memmory - x) + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            memmory -= x;
        }

        public void clm() throws RemoteException {

            textArea.append("MemmoryClear: 0\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            memmory = 0;
        }

        public double rdm() throws RemoteException {

            textArea.append("MemmoryRead: " + memmory + "\n");
            textArea.setCaretPosition(textArea.getDocument().getLength());
            return memmory;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Calculator");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        try {
            gen = new Generator();

            Registry r = LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", gen);

            textArea.append("Server online\n");

        } catch (RemoteException e) {

            JOptionPane.showMessageDialog(null, "RMIServer error: " + e.getMessage());
        }
    }//GEN-LAST:event_startButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}

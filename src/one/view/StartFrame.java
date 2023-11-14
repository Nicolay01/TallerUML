/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package one.view;

import com.formdev.flatlaf.FlatLightLaf;
import one.model.FieldInstance;
import one.model.GestorPersonas;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author decar
 */
public class StartFrame extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    public StartFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelGestorPersonas = new javax.swing.JLabel();
        labelCantidadPersonas = new javax.swing.JLabel();
        textFieldCantidadPersona = new javax.swing.JTextField();
        buttonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FirstFrame");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelGestorPersonas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelGestorPersonas.setText("Gestor de Personas");

        labelCantidadPersonas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantidadPersonas.setText("Cantidad de personal");

        textFieldCantidadPersona.setText("0");

        buttonAceptar.setText("Listo");
        buttonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGestorPersonas)
                    .addComponent(labelCantidadPersonas)
                    .addComponent(textFieldCantidadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAceptar))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelGestorPersonas)
                .addGap(29, 29, 29)
                .addComponent(labelCantidadPersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCantidadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAceptar)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAceptarActionPerformed
        if (textFieldCantidadPersona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Por favor ingrese un numero.");
        } else {
            String control = textFieldCantidadPersona
                    .getText()
                    .replaceAll("[^0-9]", "");

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Texto anterior: " + textFieldCantidadPersona.getText()
                    + "\nTexto ahora: " + control
                    + "\nSi usted no esta de acuerdo con este numero eliga <1> si lo esta entonces <0>"));

            if (opcion == 1) {
                int indexCant = Integer.parseInt(control);
                FieldInstance.GESTOR[0] = new GestorPersonas(indexCant);
//                this.setVisible(false);
                SecondFrame frame = new SecondFrame();
                frame.setVisible(true);
            }
        }

    }//GEN-LAST:event_buttonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StartFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCantidadPersonas;
    private javax.swing.JLabel labelGestorPersonas;
    private javax.swing.JTextField textFieldCantidadPersona;
    // End of variables declaration//GEN-END:variables
}

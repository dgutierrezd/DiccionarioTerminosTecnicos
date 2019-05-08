/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ELementos.Glosario;
import com.sun.awt.AWTUtilities;
import java.awt.Frame;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Vista para agregar términos y guardarlos.
 * @author Daniel Gutiérrez Duque
 * @author Sebastian Cordero Ramírez
 * @since 1.0
 */
public class Agregar extends javax.swing.JDialog {
    private Glosario glosario;
    private int estado;
    /**
     * Creates new form Ver
     */
    public Agregar(PrincipalView vistaPrincipal, boolean modal) {
        super(vistaPrincipal, true);
        this.glosario = vistaPrincipal.getGlosario();
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 90,90);
        AWTUtilities.setWindowShape(this, forma);        
        setLocationRelativeTo(null);
        setVisible(modal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtExpresion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Diccionario Técnico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, 60));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 330, -1));

        btnVer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVer.setText("Agregar");
        btnVer.setContentAreaFilled(false);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Categoria:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        txtExpresion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtExpresion.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(txtExpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Expresión:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 210));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Descripción:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una categoria...", "Sistemas Distribuidos", "Sistemas Embebidos", "Bases de Datos", "Redes", "Programación Orientada a Objetos", "Programación Móvil", "Programación Web" }));
        txtCategoria.setToolTipText("");
        txtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 300, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 40, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaIphone (1).png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * botón para volver al menú principal.
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Botón para agregar el término indicado.
     * @param evt 
     */
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        estado = 1;
        try{
            if(!(txtExpresion.getText().equals("") || txtDescripcion.getText().equals("") || txtCategoria.getSelectedIndex() == 0)){
                glosario.determinarOpcionesAgregar(this, estado, txtExpresion.getText(), txtDescripcion.getText(), (String) txtCategoria.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Se ha agregado con éxito.");
                limpiarTxt();
            }else{
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnVerActionPerformed

    /**
     * Limpiar los campos de texto, luego de agregar el término.
     */
    public void limpiarTxt(){
        txtExpresion.setText("");
        txtDescripcion.setText("");
        txtCategoria.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables
}

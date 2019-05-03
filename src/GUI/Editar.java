/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ELementos.Glosario;
import ELementos.Termino;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dgutierrezd
 */
public class Editar extends javax.swing.JDialog {
    private Glosario glosario;
    private Termino termino;
    private Agregar agregar;
    private Ver ver;
    private int estado;
    /**
     * Creates new form Editar
     */
    public Editar(PrincipalView vistaPrincipal, boolean modal,Termino termino) {
        super(vistaPrincipal, true);
        initComponents();
        this.termino = termino;
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 90,90);
//        AWTUtilities.setWindowShape(this, forma);        
        setLocationRelativeTo(null);
        obtenerTermino();
        setVisible(modal);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtExpresion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 330, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 40, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Expresión:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Descripción:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDescripcion.setDisabledTextColor(new java.awt.Color(60, 60, 60));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 300, 210));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Categoria:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Diccionario Técnico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, 60));
        getContentPane().add(txtExpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, -1));

        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una categoria...", "Sistemas Distribuidos", "Sistemas Embebidos", "Bases de Datos", "Redes", "Programación Orientada a Objetos", "Programación Móvil", "Programación Web" }));
        txtCategoria.setToolTipText("");
        txtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 300, -1));

        btnEditar.setText("Editar y Guardar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaIphone (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        termino.ponExpresion(txtExpresion.getText());
        termino.ponSignificado(txtDescripcion.getText());
        JOptionPane.showMessageDialog(null, "Se ha editado y guardado con éxito.");
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public void obtenerTermino(){
        txtExpresion.setText(termino.obtExpresion());
        txtDescripcion.setText(termino.obtSignificado());
        switch(termino.getCategorias().get(0).getClass().getSimpleName().toString()){
            case "BasesDeDatos":
                txtCategoria.setSelectedIndex(4);
            break;
            case "ProgramacionMovil":
                txtCategoria.setSelectedIndex(6);
            break;
            case "ProgramacionOrientadaAObjetos":
                txtCategoria.setSelectedIndex(5);
            break;
            case "ProgramacionWeb":
                txtCategoria.setSelectedIndex(7);
            break;
            case "Redes":
                txtCategoria.setSelectedIndex(3);
            break;
            case "SistemasDistribuidos":
                txtCategoria.setSelectedIndex(1);
            break;
            case "SistemasEmbeidos":
                txtCategoria.setSelectedIndex(2);
            break;
            default:
                System.out.println(termino.getCategorias().get(0).getClass().getSimpleName());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables
}

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
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class Ver extends javax.swing.JDialog {
    private Glosario glosario;
    private PrincipalView vistaPrincipal;
    private int estado;
    private int indexRemove;
    private int fila;
    /**
     * Creates new form Ver
     */
    public Ver(PrincipalView vistaPrincipal, boolean modal) {
        super(vistaPrincipal, true);
        this.vistaPrincipal = vistaPrincipal;
        glosario = vistaPrincipal.getGlosario();
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 90,90);
        AWTUtilities.setWindowShape(this, forma);        
        setLocationRelativeTo(null);        
        try {
            glosario.determinarOpcionesVer(this, 0, tablaDatos,0);
        } catch (IOException ex) {
            Logger.getLogger(Ver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ver.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Diccionario Técnico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 40, 50));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 330, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img_416864 (1).png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 60, 70));

        jScrollPane2.setFocusable(false);
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tablaDatos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tablaDatos.setForeground(new java.awt.Color(102, 102, 102));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre termino:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setToolTipText("");
        tablaDatos.setRowHeight(30);
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaDatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, 290));

        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plantillaIphone (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        estado = 1;
        try {
            glosario.determinarOpcionesVer(this, estado, tablaDatos,indexRemove);            
        } catch (IOException ex) {
            Logger.getLogger(Ver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ver.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IndexOutOfBoundsException iobe) {
            JOptionPane.showMessageDialog(null, "No hay ningún término para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        indexRemove = tablaDatos.rowAtPoint(evt.getPoint());
        
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       estado = 2;
        try { 
            Termino termino = glosario.determinarOpcionesVer(this,estado,tablaDatos,indexRemove);
            Editar dialogoEditar = new Editar(vistaPrincipal, true, termino);
        } catch (IOException ex) {
            Logger.getLogger(Ver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public JTable getTablaDatos() {
        return tablaDatos;
    }

    public void setTablaDatos(JTable tablaDatos) {
        this.tablaDatos = tablaDatos;
    }

    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}

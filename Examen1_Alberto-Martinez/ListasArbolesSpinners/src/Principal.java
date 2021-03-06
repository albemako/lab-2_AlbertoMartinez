
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        menu_popup = new javax.swing.JPopupMenu();
        opcion_edad = new javax.swing.JMenuItem();
        opcion_eliminar = new javax.swing.JMenuItem();
        opcion_modificar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sp_edad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        cb_nacionalidades = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_personas = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_personas = new javax.swing.JTree();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        opcion_edad.setText("Ver la edad");
        opcion_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_edadActionPerformed(evt);
            }
        });
        menu_popup.add(opcion_edad);

        opcion_eliminar.setText("Eliminar una persona");
        opcion_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_eliminarActionPerformed(evt);
            }
        });
        menu_popup.add(opcion_eliminar);

        opcion_modificar.setText("Modificar Nombre");
        opcion_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_modificarActionPerformed(evt);
            }
        });
        menu_popup.add(opcion_modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Nacionalidad");

        cb_nacionalidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hondureño", "Gringo", "Mexiwey" }));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar al arbol");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_personas.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_personas);

        jButton3.setText("------>");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personas");
        jt_personas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_personasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_personas);

        jLabel4.setText("Personas");

        jLabel5.setText("Personas Clasificadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton3)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_nacionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_nacionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTreeModel m=(DefaultTreeModel)jt_personas.getModel();
        DefaultMutableTreeNode raiz=(DefaultMutableTreeNode)m.getRoot();
        DefaultMutableTreeNode nodo_persona;
        nodo_persona=new DefaultMutableTreeNode(new personas(tf_nombre.getText(),(Integer)sp_edad.getValue(),(String)cb_nacionalidades.getSelectedItem()));
        
        DefaultMutableTreeNode anio;
        DefaultMutableTreeNode mes;
        DefaultMutableTreeNode dia;
        anio=new DefaultMutableTreeNode(new SimpleDateFormat("YYYY").format(new Date()));
        mes=new DefaultMutableTreeNode(new SimpleDateFormat("MM").format(new Date()));
        dia=new DefaultMutableTreeNode(new SimpleDateFormat("d").format(new Date()));
        
        mes.add(dia);
        anio.add(mes);
        nodo_persona.add(anio);
        raiz.add(nodo_persona);
        m.reload();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jt_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_personasMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row=jt_personas.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_personas.setSelectionRow(row);
            Object v1=jt_personas.getSelectionPath().getLastPathComponent();
            nodo_seleccionado=(DefaultMutableTreeNode)v1;
            if(nodo_seleccionado.getUserObject() instanceof personas){
                persona_seleccionada=(personas)nodo_seleccionado.getUserObject();
                menu_popup.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_personasMouseClicked

    private void opcion_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_edadActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, "Tiene una edad de "+persona_seleccionada.getEdad()+" años.");
    }//GEN-LAST:event_opcion_edadActionPerformed

    private void opcion_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_eliminarActionPerformed
        // TODO add your handling code here:
        int response=JOptionPane.showConfirmDialog(this, "Seguro de eliminar?","Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.OK_OPTION){
            DefaultTreeModel m=(DefaultTreeModel)jt_personas.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
    }//GEN-LAST:event_opcion_eliminarActionPerformed

    private void opcion_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_modificarActionPerformed
        String name=JOptionPane.showInputDialog("Ingrese el nuevo nombre");
        persona_seleccionada.setNombre(name);
        
            DefaultTreeModel m=(DefaultTreeModel)jt_personas.getModel();
            m.reload();
    }//GEN-LAST:event_opcion_modificarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        DefaultListModel modelo=(DefaultListModel)jl_personas.getModel();
        modelo.addElement(new personas(tf_nombre.getText(),(Integer)sp_edad.getValue(),(String)cb_nacionalidades.getSelectedItem()));
        
        jl_personas.setModel(modelo);
        tf_nombre.setText("");
        sp_edad.setValue(20);
        cb_nacionalidades.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // verificar si tiene una persona seleccionada
        if (jl_personas.getSelectedIndex()>=0) {
            DefaultTreeModel modeloARBOL=(DefaultTreeModel)jt_personas.getModel();
            DefaultMutableTreeNode raiz=(DefaultMutableTreeNode)modeloARBOL.getRoot();
            //obtener la persona a guardar
            DefaultListModel modeloLISTA=(DefaultListModel)jl_personas.getModel();
            String nacionalidad, nombre;
            int edad;
            
            nacionalidad=((personas)modeloLISTA.get(jl_personas.getSelectedIndex())).getNacionalidad();
            
            edad=((personas)modeloLISTA.get(jl_personas.getSelectedIndex())).getEdad();
            
            nombre=((personas)modeloLISTA.get(jl_personas.getSelectedIndex())).getNombre();
            
            //ver si tiene nacionalidad
            int centinela=-1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(nacionalidad)) {
                    //si ya existe le agrega la persona
                    DefaultMutableTreeNode p=new DefaultMutableTreeNode(new personas(nombre, edad, nacionalidad));
                    ((DefaultMutableTreeNode)raiz.getChildAt(i)).add(p);
                    centinela=1;
                }  
            }
            if(centinela==-1){
                    DefaultMutableTreeNode n=new DefaultMutableTreeNode(nacionalidad);
                    DefaultMutableTreeNode p=new DefaultMutableTreeNode(new personas(nombre, edad, nacionalidad));
                    n.add(p);
                    raiz.add(n);
                    
                }
            modeloARBOL.reload();
            
            
        }else{
            JOptionPane.showMessageDialog(this, "No hay persona seleccionada!");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_nacionalidades;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jl_personas;
    private javax.swing.JTree jt_personas;
    private javax.swing.JPopupMenu menu_popup;
    private javax.swing.JMenuItem opcion_edad;
    private javax.swing.JMenuItem opcion_eliminar;
    private javax.swing.JMenuItem opcion_modificar;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode nodo_seleccionado;
    personas persona_seleccionada;
}

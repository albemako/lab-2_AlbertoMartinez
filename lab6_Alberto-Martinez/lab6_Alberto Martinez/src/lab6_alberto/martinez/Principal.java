/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_alberto.martinez;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

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

        JD_plataforma = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_contactos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_mensaje = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_correos = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        JD_enviar = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        tf_para = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_escribe = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        pf_contra = new javax.swing.JPasswordField();
        pf_nuevacontra = new javax.swing.JPasswordField();
        pf_confirmcontra = new javax.swing.JPasswordField();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nuevocorreo = new javax.swing.JTextField();
        tf_tel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cb_pais = new javax.swing.JComboBox<>();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();

        JD_plataforma.setMinimumSize(new java.awt.Dimension(800, 800));

        jl_contactos.setBorder(javax.swing.BorderFactory.createTitledBorder("CONTACTOS"));
        jl_contactos.setModel(new DefaultListModel());
        jl_contactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_contactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_contactos);

        ta_mensaje.setColumns(20);
        ta_mensaje.setRows(5);
        jScrollPane2.setViewportView(ta_mensaje);

        jl_correos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CORREOS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jl_correos);

        jButton5.setText("actualizar lista");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(38, 38, 38))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("No leidos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Leidos", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Importantes", jPanel4);

        jMenu1.setText("Enviar Mensaje");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu1KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guardar un Borrador");
        jMenuBar1.add(jMenu2);

        JD_plataforma.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout JD_plataformaLayout = new javax.swing.GroupLayout(JD_plataforma.getContentPane());
        JD_plataforma.getContentPane().setLayout(JD_plataformaLayout);
        JD_plataformaLayout.setHorizontalGroup(
            JD_plataformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_plataformaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        JD_plataformaLayout.setVerticalGroup(
            JD_plataformaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_plataformaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jLabel13.setText("Enviar mensaje");

        tf_para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_paraActionPerformed(evt);
            }
        });

        jLabel14.setText("para (Correo): ");

        ta_escribe.setColumns(20);
        ta_escribe.setRows(5);
        jScrollPane4.setViewportView(ta_escribe);

        jLabel15.setText("Escriba el mensaje");

        jButton4.setText("Enviar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_enviarLayout = new javax.swing.GroupLayout(JD_enviar.getContentPane());
        JD_enviar.getContentPane().setLayout(JD_enviarLayout);
        JD_enviarLayout.setHorizontalGroup(
            JD_enviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_enviarLayout.createSequentialGroup()
                .addGroup(JD_enviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_enviarLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel13))
                    .addGroup(JD_enviarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(JD_enviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JD_enviarLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addGroup(JD_enviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_para, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JD_enviarLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel15)))))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_enviarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(153, 153, 153))
        );
        JD_enviarLayout.setVerticalGroup(
            JD_enviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_enviarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addGap(40, 40, 40)
                .addGroup(JD_enviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_para, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 102));
        setForeground(new java.awt.Color(0, 204, 51));
        setMinimumSize(new java.awt.Dimension(650, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel3.setText("Correo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel4.setText("Fecha de nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setText("pais");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel6.setText("Numero de telefono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel8.setText("Confirmar Contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel9.setText("Creacion de cuenta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel10.setText("Correo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel11.setText("Contraseña");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        tf_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_correoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, -1));
        getContentPane().add(pf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 130, -1));
        getContentPane().add(pf_nuevacontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, -1));
        getContentPane().add(pf_confirmcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 130, -1));

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));
        getContentPane().add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 128, -1));
        getContentPane().add(tf_nuevocorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, -1));

        tf_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telActionPerformed(evt);
            }
        });
        getContentPane().add(tf_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 130, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 145, 91));

        jButton2.setText("ENTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 57));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel12.setText("MessageBook");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 90));

        cb_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República de Macedonia", "República del Congo", "República Democrática del Congo", "República Dominicana", "República Sudafricana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        cb_pais.setSelectedItem("Honduras");
        getContentPane().add(cb_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 130, -1));
        getContentPane().add(dc_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setText("ENVIAR MENSAJE");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 300, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_correoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre, apellido, correo,fecha, contra, confirm,  pais;
        int tel;
        int resp=0;
        
        try {
            nombre = tf_nombre.getText();
            apellido=tf_apellido.getText();
            correo=tf_nuevocorreo.getText();
            fecha=dc_fecha.getDate().toString();
            contra=pf_nuevacontra.getText();
            confirm=pf_confirmcontra.getText();
            pais=cb_pais.getSelectedItem().toString();
            tel=Integer.parseInt(tf_tel.getText());
            
            
            if (nombre.equals("")) {
                resp=1;
                
            }
            if (apellido.equals("")) {
                resp=1;
                
            }
            if (correo.equals("")) {
                resp=1;
                
             }
            
            if (dc_fecha.getDate().equals("")) {
                resp=1;
            }
            if (contra.equals("")) {
                resp=1;
            }
            if (confirm.equals("")) {
                resp=1;
            }
            if (pais.equals("")) {
                resp=1;
                
            }
            if (tf_tel.getText().equals("")) {
                resp=1;
            }
            if(!confirm.equals(contra)){
                resp=2;
            }
            
            for (int i = 0; i < ap.listaPersonas.size(); i++) {
                if(correo.equals(ap.getListaPersonas().get(i).getCorreo())){
                    resp=3;
                }
            }
            //guardar
            if (resp==0) {
                
            
            ap.cargarArchivo();
            ap.getListaPersonas().add(new Usuario(nombre, apellido, correo, fecha, pais, tel, contra));
            ap.escribirArchivo();
            
            JOptionPane.showMessageDialog(null, "Cuenta Creada Exitosamente");
                
            //resetear controles
            tf_nombre.setText("");
            tf_apellido.setText("");
            tf_nuevocorreo.setText("");
            dc_fecha.setDate(new Date());
            pf_nuevacontra.setText("");
            pf_confirmcontra.setText("");
            cb_pais.setSelectedItem("Hondruas");
            tf_tel.setText("");
        
            }if(resp==1){
                JOptionPane.showMessageDialog(this, "Olvido llenar algun campo!");
            }if(resp==2){
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden!");
            }
            if(resp==3){
                JOptionPane.showMessageDialog(this, "Usuario con este correo ya fue creado!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se creo una cuenta");
            
        }
        ap.cargarArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Scanner sc=null;
        if (tf_correo.getText()==null||tf_correo.getText().equals("")){
                tf_correo.setText("  ");
        }
        if (pf_contra.getText()==null||pf_contra.getText().equals("")){
                pf_contra.setText("  ");
        }
        ap.cargarArchivo();
        int resp=3;
        for (int i = 0; i < ap.listaPersonas.size(); i++) {
            int control=0;
            String temp="";
            for (int j = 0; j < ap.listaPersonas.get(i).getCorreo().length(); j++) {
                char a=ap.listaPersonas.get(i).getCorreo().charAt(j);
                if (a=='@'){
                    control=1;
                }
                if(control==1){
                    temp=temp+a;
                }
            }
            if (temp.equals("@unitec.com")) {
                if(ap.listaPersonas.get(i).getCorreo().contains(tf_correo.getText()) && ap.listaPersonas.get(i).getContra().contains(pf_contra.getText())){

                    JD_plataforma.setVisible(true);
                    resp=1;
                }else{
                    if(resp!=1){
                        resp=3;
                    }
                }

            }
        }
        if(pf_contra.getText().equals("  ")){
            pf_contra.setText("");
        }
        if(tf_correo.getText().equals("  ")){
            tf_correo.setText("");
            }
        if(resp==3){
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telActionPerformed

    private void tf_paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_paraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_paraActionPerformed

    private void jMenu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu1KeyPressed
        
    }//GEN-LAST:event_jMenu1KeyPressed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        JD_enviar.pack();
        JD_enviar.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String correo, mensaje;
        correo=tf_para.getText();
        mensaje=ta_escribe.getText();
        
        administrarMensajes am=new administrarMensajes("./"+correo+".txt");
            for (int i = 0; i < ap.getListaPersonas().size(); i++) {
                if(ap.getListaPersonas().get(i).getCorreo().equals(correo)){
                    am.cargarArchivo();
                    am.getListaMensaje().add(new Mensaje(tf_correo.getText(), mensaje, "noLeido"));
                    try {
                        am.escribirArchivo();
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
        }
            tf_para.setText("");
            ta_escribe.setText("");
            am.cargarArchivo();

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jl_contactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_contactosMouseClicked
        String correo;
        correo=tf_correo.getText();
        administrarMensajes am=new administrarMensajes("./"+correo+".txt"); 
        
        DefaultListModel modelo=(DefaultListModel)jl_correos.getModel();
        
        
                for (int i = 0; i < am.listaMensajes.size(); i++) {
                    if (ap.listaPersonas.get(i).getCorreo().equals(tf_correo.getText())) {
                        modelo.addElement(am.listaMensajes.get(i));
        
                        jl_correos.setModel(modelo);

                    }
                    
                    
        }
    }//GEN-LAST:event_jl_contactosMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                DefaultListModel modelo=(DefaultListModel)jl_contactos.getModel();
                for (int i = 0; i < ap.listaPersonas.size(); i++) {
                    if (!ap.listaPersonas.get(i).getCorreo().equals(tf_correo.getText())) {
                        modelo.addElement(ap.listaPersonas.get(i));
        
                        jl_contactos.setModel(modelo);

                    }
                    
                    
        }

    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JDialog JD_enviar;
    private javax.swing.JDialog JD_plataforma;
    private javax.swing.JComboBox<String> cb_pais;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jl_contactos;
    private javax.swing.JList<String> jl_correos;
    private javax.swing.JPasswordField pf_confirmcontra;
    private javax.swing.JPasswordField pf_contra;
    private javax.swing.JPasswordField pf_nuevacontra;
    private javax.swing.JTextArea ta_escribe;
    private javax.swing.JTextArea ta_mensaje;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nuevocorreo;
    private javax.swing.JTextField tf_para;
    private javax.swing.JTextField tf_tel;
    // End of variables declaration//GEN-END:variables
administrarPersonas ap=new administrarPersonas("./salida.txt");

}

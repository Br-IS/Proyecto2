/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import ConexionBDD.ConexionBD;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author velez
 */
public class Vista_Persona extends javax.swing.JPanel {
/*
    String base = "jdbc:postgresql://localhost:5432/buffet";
    String usuario1 = "postgres";
    String contra1 = "kirito_7771";

   
    ConexionBD connect = new ConexionBD();
    //creamos el objetto para conectarnos a la bdd
    
    Connection con = connect.getConnection();//metodo propio para establecer coneccion
    //invocar al metodo con de la clase conexion
    
    PreparedStatement ps;   // prepara sentencia sql
    ResultSet rs;//retonra el objeto a la base de datos
    Statement sentencia = null; //Statement cualquir texto que la bdd reconoce como comamndo valido */
    
    
    
    

    private String genero;

    public Vista_Persona() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFechaNac_Cli = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCedulaCli = new javax.swing.JTextField();
        txtNombreCli1 = new javax.swing.JTextField();
        txtApellidoCli1 = new javax.swing.JTextField();
        txtDireccionCli = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCorreoCli = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        cbSexo = new javax.swing.JComboBox<>();
        fechas = new com.toedter.calendar.JDateChooser();
        panelMostrarDatos = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(28, 56, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(28, 56, 71));
        jLabel11.setText("Registrar Persona");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Cedula:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Apellido:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Teléfono:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Direccion:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Sexo:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Correo:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Fecha de Nacimiento");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Edad");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "FEMENINO", "MASCULINO" }));

        fechas.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(156, 156, 156))
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtNombreCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel18))
                    .addComponent(jLabel14)
                    .addComponent(txtApellidoCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelRegistroLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelRegistroLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(txtApellidoCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(6, 6, 6)
                                .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(6, 6, 6)
                                .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelMostrarDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelMostrarDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(28, 56, 71));
        jLabel20.setText("Datos del Persona");

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCliente);

        jButton3.setText("Cargar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarDatosLayout = new javax.swing.GroupLayout(panelMostrarDatos);
        panelMostrarDatos.setLayout(panelMostrarDatosLayout);
        panelMostrarDatosLayout.setHorizontalGroup(
            panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(171, 171, 171))
                    .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        panelMostrarDatosLayout.setVerticalGroup(
            panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                .addGroup(panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Registro de Presona");

        pnlBotones.setBackground(new java.awt.Color(28, 56, 71));
        pnlBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addGap(63, 63, 63)
                .addComponent(btnModificar)
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ico_Buscar.png"))); // NOI18N

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sql = "INSERT INTO persona(cedula, nombre, apellido, telefono, direccion, genero, correo, fecha_nac, edad)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
//usamos la sentencia para ejecutar datos 
       /* try {
            if (!txtCedulaCli.getText().isEmpty()) {
                System.out.println("ENTRO");
                System.out.println("Cedula " + txtCedulaCli.getText());
                ps = con.prepareStatement(sql);
                ps.setString(1, txtCedulaCli.getText());
                ps.setString(2, txtNombreCli1.getText());
                ps.setString(3, txtApellidoCli1.getText());
                ps.setString(4, txtTelefonoCli.getText());
                ps.setString(5, txtDireccionCli.getText());
                ps.setString(6, cbSexo.getSelectedItem().toString());
                ps.setString(7, txtCorreoCli.getText());
                
                ps.setString(8, ((JTextField) fechas.getDateEditor().getUiComponent()).getText());//ayuda a parsear la fecha 
                
                
                ps.setString(9, txtEdad.getText());

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Guardado");
                    CrearDatosCliente();
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar Cliente");
                    //limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Uno o varios campos esta vacio");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
        }*/

    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        // TODO add your handling code here:

        int seleccionar = TablaCliente.rowAtPoint(evt.getPoint());

        txtCedulaCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 0)));
        txtNombreCli1.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 1)));
        txtApellidoCli1.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 2)));
        txtTelefonoCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 3)));
        txtDireccionCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 4)));
        cbSexo.setSelectedItem(String.valueOf(TablaCliente.getValueAt(seleccionar, 5)));
        txtCorreoCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 6)));
        fechas.setDateFormatString(String.valueOf(TablaCliente.getValueAt(seleccionar, 7)));
        txtEdad.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 8)));
        //.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_TablaClienteMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CrearDatosCliente();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String Update = "UPDATE persona SET cedula=?, nombre=?, apellido=?, telefono=?, direccion=?, genero=?, correo=?, fecha_nac=?, edad=? WHERE cedula='" + txtCedulaCli.getText() + "'";

     /*   try {

            ps = con.prepareStatement(Update);
            ps.setString(1, txtCedulaCli.getText());
            ps.setString(2, txtNombreCli1.getText());
            ps.setString(3, txtApellidoCli1.getText());
            ps.setString(4, txtTelefonoCli.getText());
            ps.setString(5, txtDireccionCli.getText());
            ps.setString(6, cbSexo.getSelectedItem().toString());
            ps.setString(7, txtCorreoCli.getText());
            ps.setString(8, ((JTextField) fechas.getDateEditor().getUiComponent()).getText());
            ps.setString(9, txtEdad.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "CLiente Modificado");
                CrearDatosCliente();
                //limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar cliente");
                //limpiar();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en BD " + e);
        }*/

        /*UPDATE persona SET cedula=?, nombre=?, apellido=?, telefono=?, direccion=?, genero=?, correo=?, fecha_nac=?, edad=? WHERE <condition>;*/
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DefaultTableModel tablaCliente = new DefaultTableModel();
        tablaCliente.addColumn("Cedula");
        tablaCliente.addColumn("NOmbre");
        tablaCliente.addColumn("Apellido");
        tablaCliente.addColumn("Telefono");
        tablaCliente.addColumn("Direccion");
        tablaCliente.addColumn("Genero");
        tablaCliente.addColumn("Correo");
        tablaCliente.addColumn("F. Nan");
        tablaCliente.addColumn("Edad");

        TablaCliente.setModel(tablaCliente);
        String[] llenar = new String[9];
        String sql = "SELECT * FROM persona WHERE cedula='" + txtBuscar.getText() + "' OR nombre LIKE '%" + txtBuscar.getText() + "%'";
       /* try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                llenar[0] = rs.getString(1);
                llenar[1] = rs.getString(2);
                llenar[2] = rs.getString(3);
                llenar[3] = rs.getString(4);
                llenar[4] = rs.getString(5);
                llenar[5] = rs.getString(6);
                llenar[6] = rs.getString(7);
                llenar[7] = rs.getString(8);
                llenar[8] = rs.getString(9);

                tablaCliente.addRow(llenar);
            }
            TablaCliente.setModel(tablaCliente);
        } catch (SQLException e) {

        }*/

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String sql = "DELETE FROM persona WHERE cedula='" + txtCedulaCli.getText() + "'";
        /*try {
            ps = con.prepareStatement(sql);
            if (!txtCedulaCli.getText().isEmpty()) {
                ps = con.prepareStatement(sql);
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                    CrearDatosCliente();
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar Cliente");
                    //limpiar();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser fechas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrarDatos;
    private javax.swing.JPanel panelRegistro;
    public static javax.swing.JPanel pnlBotones;
    private javax.swing.JTextField txtApellidoCli1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedulaCli;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtDireccionCli;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaNac_Cli;
    private javax.swing.JTextField txtNombreCli1;
    private javax.swing.JTextField txtTelefonoCli;
    // End of variables declaration//GEN-END:variables

    public void CrearDatosCliente() {
        DefaultTableModel tablaCliente = new DefaultTableModel();
        tablaCliente.addColumn("Cedula");
        tablaCliente.addColumn("Nombre");
        tablaCliente.addColumn("Apellido");
        tablaCliente.addColumn("Telefono");
        tablaCliente.addColumn("Direccion");
        tablaCliente.addColumn("Genero");
        tablaCliente.addColumn("Correo");
        tablaCliente.addColumn("F. Nan");
        tablaCliente.addColumn("Edad");

        TablaCliente.setModel(tablaCliente);
        String[] llenar = new String[9];
        String sql = "SELECT * FROM persona";
        /*try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                llenar[0] = rs.getString(1);
                llenar[1] = rs.getString(2);
                llenar[2] = rs.getString(3);
                llenar[3] = rs.getString(4);
                llenar[4] = rs.getString(5);
                llenar[5] = rs.getString(6);
                llenar[6] = rs.getString(7);
                llenar[7] = rs.getString(8);
                llenar[8] = rs.getString(9);

                tablaCliente.addRow(llenar);
            }
            TablaCliente.setModel(tablaCliente);
        } catch (SQLException e) {

        }*/

    }

}

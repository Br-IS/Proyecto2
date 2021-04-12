/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import ConexionBDD.ConexionBD;
import static Vista.Vista_Cliente.pnlBotones;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author velez
 */
public class Vista_Empleado extends javax.swing.JPanel /*implements ActionListener*/ {
/*
    ConexionBD connect = new ConexionBD();
    Connection con = connect.getConnection();
    PreparedStatement ps;   // prepara sentencia sql
    ResultSet rs;
    Statement sentencia = null;

    JButton registar, eliminar, modificar, cancelar;

    public Vista_Empleado() {
        initComponents();
        botones();
    }

    public void limpiar() {
        txtCedulaCli.setText(null);
        txtNombreCli1.setText(null);
        txtApellidoCli1.setText(null);
        txtCorreoCli.setText(null);
        txtDireccionCli.setText(null);
        txtTelefonoCli.setText(null);
        Dates.setDate(null);
        txtSuelo.setText(null);
        cbSexo.setSelectedIndex(0);
        cbRol.setSelectedIndex(0);
    }

    public void botones() {

        //BTN REGISTRAR
        registar = new EfectoHover();
        registar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_checked_user_male_80px.png")));
        registar.setText("Registrar");
        //registar.setFont(ThoRIGHT_ALIGNMENT);
        registar.setAlignmentX(0.0f);
        registar.setAlignmentY(0.5f);
        registar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registar.setBackground(new Color(97, 200, 97));
        registar.setForeground(Color.WHITE);
        registar.setBounds(36, 25, 165, 92);
        registar.setContentAreaFilled(false);
        registar.setFocusPainted(false);
        registar.setToolTipText("Registar Cliente");
        registar.addActionListener(this);
        pnlBotones.add(registar);

        //BTN MODIFICAR
        modificar = new EfectoHover();
        modificar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        modificar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_registration_80px.png")));
        modificar.setBackground(new Color(97, 167, 97));
        modificar.setText("Editar");
        modificar.setForeground(Color.WHITE);
        modificar.setBounds(36, 156, 161, 92);
        modificar.setContentAreaFilled(false);
        modificar.setFocusPainted(false);
        modificar.setToolTipText("Editar Cliente");
        modificar.addActionListener(this);
        pnlBotones.add(modificar);

        //BTN ELIMINAR
        eliminar = new EfectoHover();
        eliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eliminar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_denied_80px.png")));
        eliminar.setBackground(new Color(97, 167, 97));
        eliminar.setText("Delte");
        eliminar.setForeground(Color.WHITE);
        eliminar.setBounds(36, 300, 161, 92);
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.setToolTipText("Eliminar Cliente");
        eliminar.addActionListener(this);
        pnlBotones.add(eliminar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registar) {
            String sql = "INSERT INTO empleado(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac,sueldo, sexo, rol)VALUES (?, ?, ?, ?, ?, ?, ?,?, ?, ?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, txtCedulaCli.getText());
                ps.setString(2, txtNombreCli1.getText());
                ps.setString(3, txtApellidoCli1.getText());
                ps.setString(4, txtCorreoCli.getText());
                ps.setString(5, txtDireccionCli.getText());
                ps.setString(6, txtTelefonoCli.getText());
                ps.setString(7, ((JTextField) Dates.getDateEditor().getUiComponent()).getText());
                ps.setString(8, txtSuelo.getText());
                ps.setString(9, cbSexo.getSelectedItem().toString());
                ps.setString(10, cbRol.getSelectedItem().toString());

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Guardado");
                    CrearDatosCliente();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar Cliente");
                    limpiar();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
            }
        }
        if (e.getSource() == modificar) {
            String sql = " UPDATE clientes SET cedula=?, nombre=?, apellido=?, correo=?, direccion=?, telefono=?, fecha_nac=?, genero=?WHERE cedula='" + txtCedulaCli.getText() + "'";

            try {

                ps = con.prepareStatement(sql);
                ps.setString(1, txtCedulaCli.getText());
                ps.setString(2, txtNombreCli1.getText());
                ps.setString(3, txtApellidoCli1.getText());
                ps.setString(4, txtCorreoCli.getText());
                ps.setString(5, txtDireccionCli.getText());
                ps.setString(6, txtTelefonoCli.getText());
                ps.setString(7, ((JTextField) Dates.getDateEditor().getUiComponent()).getText());
                ps.setString(8, txtSuelo.getText());
                ps.setString(9, cbSexo.getSelectedItem().toString());
                ps.setString(10, cbRol.getSelectedItem().toString());
                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "CLiente Modificado");
                    CrearDatosCliente();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar cliente");
                    limpiar();
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al escribir en BD " + ex);
            }
        }
        if (e.getSource() == eliminar) {
            String sql = "DELETE FROM empleado WHERE cedula='" + txtCedulaCli.getText() + "'";
            try {
                ps = con.prepareStatement(sql);
                if (!txtCedulaCli.getText().isEmpty()) {
                    ps = con.prepareStatement(sql);
                    int res = ps.executeUpdate();
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                        CrearDatosCliente();
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar Cliente");
                        limpiar();
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        txtFechaNac_Cli = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCedulaCli = new javax.swing.JTextField();
        txtNombreCli1 = new javax.swing.JTextField();
        txtApellidoCli1 = new javax.swing.JTextField();
        txtDireccionCli = new javax.swing.JTextField();
        txtCorreoCli = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtSuelo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        Dates = new com.toedter.calendar.JDateChooser();
        panelMostrarDatos = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("F");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("M");

        jPanel3.setBackground(new java.awt.Color(28, 56, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(28, 56, 71));
        jLabel11.setText("Registrar Empleado");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Cedula:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Apellido:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Teléfono:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Correo:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Direccion:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Sexo:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Fecha de Nacimiento");

        txtCedulaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCliActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Sueldo");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Rol");

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Abogado", "Secretaria", "Otros" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "MASCULINO", "FEMENINO" }));

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtNombreCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel14)
                        .addComponent(txtApellidoCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(98, 98, 98)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dates, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(156, 156, 156))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(txtApellidoCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRegistroLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRegistroLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel23))
                                .addGap(6, 6, 6)
                                .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(6, 6, 6)
                                .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelMostrarDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelMostrarDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(28, 56, 71));
        jLabel20.setText("Datos del Empleado");

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
        TablaCliente.setRowHeight(20);
        jScrollPane1.setViewportView(TablaCliente);

        jButton2.setText("cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarDatosLayout = new javax.swing.GroupLayout(panelMostrarDatos);
        panelMostrarDatos.setLayout(panelMostrarDatosLayout);
        panelMostrarDatosLayout.setHorizontalGroup(
            panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                .addGroup(panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel20)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        panelMostrarDatosLayout.setVerticalGroup(
            panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                .addGroup(panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Registro de Empleado");

        pnlBotones.setBackground(new java.awt.Color(28, 56, 71));
        pnlBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ico_Buscar.png"))); // NOI18N

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolActionPerformed

    private void txtCedulaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCliActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM clientes WHERE cedula='" + txtCedulaCli.getText() + "'";

       /* try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {

                txtCedulaCli.setText(rs.getString(1));
                txtNombreCli1.setText(rs.getString(2));
                txtApellidoCli1.setText(rs.getString(3));
                txtCorreoCli.setText(rs.getString(4));
                txtDireccionCli.setText(rs.getString(5));
                txtTelefonoCli.setText(rs.getString(6));
                Dates.setDateFormatString(rs.getString(7));
                cbSexo.setSelectedItem(rs.getString(8));

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa persona");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al escribir en BD " + e);
        }*/


    }//GEN-LAST:event_txtCedulaCliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tablaCliente = new DefaultTableModel();
        tablaCliente.addColumn("Cedula");
        tablaCliente.addColumn("Nombre");
        tablaCliente.addColumn("Apellido");
        tablaCliente.addColumn("Correo");
        tablaCliente.addColumn("Direccion");
        tablaCliente.addColumn("Telefono");
        tablaCliente.addColumn("F. Nan");
        tablaCliente.addColumn("Suelo");
        tablaCliente.addColumn("Sexo");
        tablaCliente.addColumn("Rol");
        TablaCliente.setModel(tablaCliente);
        String[] llenar = new String[10];
        String sql = "SELECT * FROM clientes WHERE cedula='" + txtBuscador.getText() + "' OR nombre='" + txtBuscador.getText() + "'";

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
                llenar[9] = rs.getString(10);

                tablaCliente.addRow(llenar);
            }
            TablaCliente.setModel(tablaCliente);
        } catch (SQLException e) {

        }*/


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CrearDatosCliente();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Dates;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrarDatos;
    private javax.swing.JPanel panelRegistro;
    public static javax.swing.JPanel pnlBotones;
    private javax.swing.JTextField txtApellidoCli1;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtCedulaCli;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtDireccionCli;
    private javax.swing.JTextField txtFechaNac_Cli;
    private javax.swing.JTextField txtNombreCli1;
    private javax.swing.JTextField txtSuelo;
    private javax.swing.JTextField txtTelefonoCli;
    // End of variables declaration//GEN-END:variables

    public void CrearDatosCliente() {
        DefaultTableModel tablaCliente = new DefaultTableModel();
        tablaCliente.addColumn("Cedula");
        tablaCliente.addColumn("Nombre");
        tablaCliente.addColumn("Apellido");
        tablaCliente.addColumn("Correo");
        tablaCliente.addColumn("Direccion");
        tablaCliente.addColumn("Telefono");
        tablaCliente.addColumn("F. Nan");
        tablaCliente.addColumn("Suelo");
        tablaCliente.addColumn("Sexo");
        tablaCliente.addColumn("Rol");

        TablaCliente.setModel(tablaCliente);
        String[] llenar = new String[10];
        String sql = "SELECT * FROM empleado";
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
                llenar[9] = rs.getString(10);

                tablaCliente.addRow(llenar);
            }
            TablaCliente.setModel(tablaCliente);
        } catch (SQLException e) {

        }*/

    }

}

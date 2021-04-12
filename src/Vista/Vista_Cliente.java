/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import ConexionBDD.ConexionBD;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author velez
 */
public class Vista_Cliente extends javax.swing.JPanel implements ActionListener {

    /*ConexionBD connect = new ConexionBD();
    Connection con = connect.getConnection();
    PreparedStatement ps;   // prepara sentencia sql
    ResultSet rs;
    Statement sentencia = null;*/

    JButton registar, eliminar, modificar, cancelar;

    public Vista_Cliente() {
        System.out.println("A");
        initComponents();
        System.out.println("B");
        //System.out.println("1: "+pnlBotones.getComponent(1).getBounds());
        botones();

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

    public void limpiar() {
        txtCedulaCli.setText(null);
        txtNombreCli.setText(null);
        txtApellidoCli.setText(null);
        txtCorreoCli.setText(null);
        txtDireccionCli.setText(null);
        txtTelefonoCli.setText(null);
        //Dates.setDate(null);
        genero1.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if (e.getSource() == eliminar) {
            int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea cancelar esta operacion", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                    new Object[]{"Si", "No"}, null);
            if (confirmar == 0) {
                txtCedulaCli.setText("");
                txtNombreCli.setText("");
                txtApellidoCli.setText("");
                txtCorreoCli.setText("");
                txtDireccionCli.setText("");
                txtTelefonoCli.setText("");
            } else {

            }
        }
        if (e.getSource() == registar) {
            String sql = "INSERT INTO clientes(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac, genero)VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, txtCedulaCli.getText());
                ps.setString(2, txtNombreCli.getText());
                ps.setString(3, txtApellidoCli.getText());
                ps.setString(4, txtCorreoCli.getText());
                ps.setString(5, txtDireccionCli.getText());
                ps.setString(6, txtTelefonoCli.getText());
                ps.setString(7, ((JTextField) Dates.getDateEditor().getUiComponent()).getText());
                ps.setString(8, genero1.getSelectedItem().toString());
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
        if (e.getSource() == eliminar) {
            String sql = "DELETE FROM clientes WHERE cedula='" + txtCedulaCli.getText() + "'";
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
        if (e.getSource() == modificar) {

            String sql = " UPDATE clientes SET cedula=?, nombre=?, apellido=?, correo=?, direccion=?, telefono=?, fecha_nac=?, genero=?WHERE cedula='" + txtCedulaCli.getText() + "'";

            try {

                ps = con.prepareStatement(sql);
                ps.setString(1, txtCedulaCli.getText());
                ps.setString(2, txtNombreCli.getText());
                ps.setString(3, txtApellidoCli.getText());
                ps.setString(4, txtCorreoCli.getText());
                ps.setString(5, txtDireccionCli.getText());
                ps.setString(6, txtTelefonoCli.getText());
                ps.setString(7, ((JTextField) Dates.getDateEditor().getUiComponent()).getText());
                ps.setString(8, genero1.getSelectedItem().toString());

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "CLiente Modificado");
                    CrearDatosCliente();
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar cliente");
                    //limpiar();
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al escribir en BD " + ex);
            }
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnGuardar = new javax.swing.JButton();
        txtFechaNac_Cli = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCedulaCli = new javax.swing.JTextField();
        txtNombreCli = new javax.swing.JTextField();
        txtApellidoCli = new javax.swing.JTextField();
        txtDireccionCli = new javax.swing.JTextField();
        txtCorreoCli = new javax.swing.JTextField();
        txtTelefonoCli = new javax.swing.JTextField();
        genero1 = new javax.swing.JComboBox<>();
        panelMostrarDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("M");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("F");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(28, 56, 71));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(28, 56, 71));
        jLabel1.setText("Registrar Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Sexo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento");

        txtCedulaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCliActionPerformed(evt);
            }
        });

        genero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "MASCULINO", "FEMENINO" }));

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRegistroLayout.createSequentialGroup()
                            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(122, 122, 122)))
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtApellidoCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(txtNombreCli, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(txtCedulaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(42, 42, 42)))
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistroLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelRegistroLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(6, 6, 6)
                            .addComponent(txtCorreoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addGap(6, 6, 6)
                            .addComponent(txtDireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel5)
                            .addGap(6, 6, 6)
                            .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRegistroLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6)
                            .addComponent(txtApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelMostrarDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelMostrarDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Direccion", "Telefono", "F nan", "Genero"
            }
        ));
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCliente);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(28, 56, 71));
        jLabel11.setText("Datos del Cliente");

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarDatosLayout = new javax.swing.GroupLayout(panelMostrarDatos);
        panelMostrarDatos.setLayout(panelMostrarDatosLayout);
        panelMostrarDatosLayout.setHorizontalGroup(
            panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarDatosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(159, 159, 159))
        );
        panelMostrarDatosLayout.setVerticalGroup(
            panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarDatosLayout.createSequentialGroup()
                .addGroup(panelMostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Registro de Clientes");

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ico_Buscar.png"))); // NOI18N

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(27, 27, 27)
                        .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed
    private String genero;
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        genero = "MASCULINO";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        genero = "FEMENINO";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        // TODO add your handling code here:
        int seleccionar = TablaCliente.rowAtPoint(evt.getPoint());
        txtCedulaCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 0)));
        txtNombreCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 1)));
        txtApellidoCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 2)));

        txtTelefonoCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 5)));

        txtDireccionCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 4)));
        genero1.setSelectedItem(String.valueOf(TablaCliente.getValueAt(seleccionar, 7)));

//        Dates.setDateFormatString(String.valueOf(TablaCliente.getValueAt(seleccionar, 6)));

        txtCorreoCli.setText(String.valueOf(TablaCliente.getValueAt(seleccionar, 3)));


    }//GEN-LAST:event_TablaClienteMouseClicked

    private void txtCedulaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCliActionPerformed
            // TODO add your handling code here:
        /*String sql = "SELECT * FROM persona WHERE cedula='" + txtCedulaCli.getText() + "'";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {//el metodo next se ua para moverse a la sigueinte fila
                txtCedulaCli.setText(rs.getString(1));
                txtNombreCli.setText(rs.getString(2));
                txtApellidoCli.setText(rs.getString(3));
                txtTelefonoCli.setText(rs.getString(4));
                txtDireccionCli.setText(rs.getString(5));
                genero1.setSelectedItem(rs.getString(6));
                txtCorreoCli.setText(rs.getString(7));
                Dates.setDateFormatString(rs.getString(8));
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa persona");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en BD " + e);
        }*/


    }//GEN-LAST:event_txtCedulaCliActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tablaCliente = new DefaultTableModel();
        tablaCliente.addColumn("Cedula");
        tablaCliente.addColumn("Nombre");
        tablaCliente.addColumn("Apellido");
        tablaCliente.addColumn("Correo");
        tablaCliente.addColumn("Direccion");
        tablaCliente.addColumn("Telefono");
        tablaCliente.addColumn("F. Nan");
        tablaCliente.addColumn("Genero");

        TablaCliente.setModel(tablaCliente);
        String[] llenar = new String[8];
        /*String sql = "SELECT * FROM persona WHERE cedula='" + txtBuscador.getText() + "' OR nombre='" + txtBuscador.getText() + "'";
        try {
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

                tablaCliente.addRow(llenar);
            }
            TablaCliente.setModel(tablaCliente);
        } catch (SQLException e) {

        }*/


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CrearDatosCliente();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> genero1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrarDatos;
    private javax.swing.JPanel panelRegistro;
    public static javax.swing.JPanel pnlBotones;
    private javax.swing.JTextField txtApellidoCli;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtCedulaCli;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtDireccionCli;
    private javax.swing.JTextField txtFechaNac_Cli;
    private javax.swing.JTextField txtNombreCli;
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
        tablaCliente.addColumn("Genero");

        TablaCliente.setModel(tablaCliente);
        String[] llenar = new String[8];
        String sql = "SELECT * FROM clientes";
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

                tablaCliente.addRow(llenar);
            }
            TablaCliente.setModel(tablaCliente);
        } catch (SQLException e) {

        }*/

    }

}
/*
ps.setDate(7, (java.sql.Date) Date.getDateEditor());
ps.setString(7, Date.getDate());
 */

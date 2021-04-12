/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import ConexionBDD.ConexionBD;
import java.awt.Color;
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

/**
 *
 * @author velez
 */
public class Vista_Cita extends javax.swing.JPanel implements ActionListener {
/*
    ConexionBD connect = new ConexionBD();
    Connection con = connect.getConnection();
    PreparedStatement ps;   // prepara sentencia sql
    ResultSet rs;
    Statement sentencia = null;
    */
    
    JButton btnGuardar, cancelar;
    public Vista_Cita() {
        initComponents();
        botones();
    }
    public void botones(){
        //BTN REGISTRAR JUICIO
        btnGuardar= new EfectoHover();
        btnGuardar.setText("Agendar");
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_schedule_40px.png")));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setBounds(262, 439, 120, 52);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setToolTipText("Agendar");
        jPanel3.add(btnGuardar);
        
        //BTN CANCELAR
        cancelar= new EfectoHover();   
        cancelar.setText("Cancelar");
        cancelar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_esc_60px.png")));
        cancelar.setBackground(new Color(97,167,97));
        cancelar.setForeground(Color.WHITE);
        cancelar.setBounds(472, 435, 143, 60);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setToolTipText("Cancelar Operacion");
        //cancelar.addActionListener(this);
        jPanel3.add(cancelar);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLfechacita = new javax.swing.JLabel();
        jLnombrecita = new javax.swing.JLabel();
        jLcedulacliente = new javax.swing.JLabel();
        txtCodigocita = new javax.swing.JTextField();
        txtcedulacita = new javax.swing.JTextField();
        jLhoracita = new javax.swing.JLabel();
        txtnumerocita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLnombrecita1 = new javax.swing.JLabel();
        txtapellidocliente = new javax.swing.JTextField();
        jLfechacita1 = new javax.swing.JLabel();
        txthoracita1 = new javax.swing.JTextField();
        jLnombrecita2 = new javax.swing.JLabel();
        txtnombrecita1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jPanel3.setBackground(new java.awt.Color(28, 56, 71));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLfechacita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLfechacita.setText("numero cita");
        jPanel1.add(jLfechacita);
        jLfechacita.setBounds(390, 140, 80, 15);

        jLnombrecita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLnombrecita.setText("Codigo cita");
        jPanel1.add(jLnombrecita);
        jLnombrecita.setBounds(390, 110, 84, 15);

        jLcedulacliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLcedulacliente.setText("Cedula Cliente");
        jPanel1.add(jLcedulacliente);
        jLcedulacliente.setBounds(80, 40, 77, 15);
        jPanel1.add(txtCodigocita);
        txtCodigocita.setBounds(460, 100, 130, 30);

        txtcedulacita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulacitaActionPerformed(evt);
            }
        });
        jPanel1.add(txtcedulacita);
        txtcedulacita.setBounds(170, 30, 130, 30);

        jLhoracita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLhoracita.setText("Hora Cita");
        jPanel1.add(jLhoracita);
        jLhoracita.setBounds(390, 40, 49, 15);
        jPanel1.add(txtnumerocita);
        txtnumerocita.setBounds(470, 140, 100, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 170, 380, 83);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Asunto");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 210, 44, 15);

        jLnombrecita1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLnombrecita1.setText("apellido clliente");
        jPanel1.add(jLnombrecita1);
        jLnombrecita1.setBounds(70, 130, 82, 15);

        txtapellidocliente.setEditable(false);
        jPanel1.add(txtapellidocliente);
        txtapellidocliente.setBounds(160, 130, 130, 30);

        jLfechacita1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLfechacita1.setText("Fecha Cita");
        jPanel1.add(jLfechacita1);
        jLfechacita1.setBounds(390, 70, 56, 15);
        jPanel1.add(txthoracita1);
        txthoracita1.setBounds(460, 30, 100, 30);

        jLnombrecita2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLnombrecita2.setText("Nombre Cliente");
        jPanel1.add(jLnombrecita2);
        jLnombrecita2.setBounds(70, 90, 84, 15);

        txtnombrecita1.setEditable(false);
        jPanel1.add(txtnombrecita1);
        txtnombrecita1.setBounds(160, 80, 130, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ventana de Agendamiento");

        titulo.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Agendar Cita");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulacitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulacitaActionPerformed
        // TODO add your handling code here:
        /*String sql ="SELECT * FROM clientes WHERE cedula='" + txtcedulacita.getText() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {//el metodo next se ua para moverse a la sigueinte fila
                txtcedulacita.setText(rs.getString(1));
                txtnombrecita1.setText(rs.getString(2));
                txtapellidocliente.setText(rs.getString(3));
                
                /*txt.setText(rs.getString(2));
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
    }//GEN-LAST:event_txtcedulacitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLcedulacliente;
    private javax.swing.JLabel jLfechacita;
    private javax.swing.JLabel jLfechacita1;
    private javax.swing.JLabel jLhoracita;
    private javax.swing.JLabel jLnombrecita;
    private javax.swing.JLabel jLnombrecita1;
    private javax.swing.JLabel jLnombrecita2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCodigocita;
    private javax.swing.JTextField txtapellidocliente;
    private javax.swing.JTextField txtcedulacita;
    private javax.swing.JTextField txthoracita1;
    private javax.swing.JTextField txtnombrecita1;
    private javax.swing.JTextField txtnumerocita;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btnGuardar) {
            String sql = "INSERT INTO citas(codcita, cedula, nombre, apellido, fechacita, numcita) VALUES (?, ?, ?, ?, ?, ?)";
            /*try {
                ps= con.prepareStatement(sql);
                ps.setString(PROPERTIES, sql);
                
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "ERROR " + ex.getMessage());
            }
            
            /*
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
            */
            
        }
        if (e.getSource() == cancelar) {
            
        }
    }


}

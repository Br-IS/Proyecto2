/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author velez
 */
public class Vista_Juicio extends javax.swing.JPanel implements ActionListener {
    
    JButton registrarJui, cancelar;
    public Vista_Juicio() {
        initComponents();
        botones();
    }
    public void botones(){
        //BTN REGISTRAR JUICIO
        registrarJui= new EfectoHover();   
        registrarJui.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/registrar Juicio.png")));
        registrarJui.setBackground(new Color(97,167,97));
        registrarJui.setForeground(Color.WHITE);
        registrarJui.setBounds(225, 449, 174, 68);
        registrarJui.setContentAreaFilled(false);
        registrarJui.setFocusPainted(false);
        registrarJui.setToolTipText("Registar Juicio");
        //registrarJui.addActionListener(this);
        PenelEx.add(registrarJui);
        
        //BTN CANCELAR
        cancelar= new EfectoHover();   
        cancelar.setText("Registar");
        cancelar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_esc_60px.png")));
        cancelar.setBackground(new Color(97,167,97));
        cancelar.setForeground(Color.WHITE);
        cancelar.setBounds(469, 449, 142, 72);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setToolTipText("Cancelar Operacion");
        //cancelar.addActionListener(this);
        PenelEx.add(cancelar);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == cancelar) {
            int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea cancelar esta operacion", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                    new Object[]{"Si", "No"}, null);
            if (confirmar == 0) {
                txtCedula.setText("");
                txtAbogado.setText("");
                txtApellidoCli.setText("");
                txtNombreCli.setText("");
            } else {

            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PenelEx = new javax.swing.JPanel();
        panelJuicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCli = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoCli = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboTipojuicio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboEstadojuicio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAbogado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        PenelEx.setBackground(new java.awt.Color(28, 56, 71));

        panelJuicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cedula Cliente:");

        txtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre Cliente:");

        txtNombreCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Apellido Cliente:");

        txtApellidoCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Juicio:");

        comboTipojuicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", " " }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Estado Juicio:");

        comboEstadojuicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "ACTIVO", "PASIVO", " " }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Codigo Juicio:");

        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nombre Abogado:");

        txtAbogado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registar Juicio");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancelar");

        javax.swing.GroupLayout panelJuicioLayout = new javax.swing.GroupLayout(panelJuicio);
        panelJuicio.setLayout(panelJuicioLayout);
        panelJuicioLayout.setHorizontalGroup(
            panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuicioLayout.createSequentialGroup()
                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuicioLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelJuicioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuicioLayout.createSequentialGroup()
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelJuicioLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelJuicioLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelJuicioLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuicioLayout.createSequentialGroup()
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelJuicioLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(79, 79, 79))
                                    .addGroup(panelJuicioLayout.createSequentialGroup()
                                        .addComponent(txtAbogado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)))
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboTipojuicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(97, 97, 97)
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboEstadojuicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuicioLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelJuicioLayout.setVerticalGroup(
            panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuicioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuicioLayout.createSequentialGroup()
                        .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelJuicioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelJuicioLayout.createSequentialGroup()
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuicioLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panelJuicioLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(2, 2, 2)))
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                    .addComponent(txtNombreCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelJuicioLayout.createSequentialGroup()
                                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipojuicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelJuicioLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEstadojuicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelJuicioLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtAbogado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(panelJuicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ventana de Registro de Juicios");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE JUICIOS");

        javax.swing.GroupLayout PenelExLayout = new javax.swing.GroupLayout(PenelEx);
        PenelEx.setLayout(PenelExLayout);
        PenelExLayout.setHorizontalGroup(
            PenelExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PenelExLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(PenelExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenelExLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(361, 361, 361))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenelExLayout.createSequentialGroup()
                        .addGroup(PenelExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PenelExLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2)
                                .addGap(80, 80, 80)))
                        .addGap(147, 147, 147))))
        );
        PenelExLayout.setVerticalGroup(
            PenelExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PenelExLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelJuicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PenelEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PenelEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PenelEx;
    private javax.swing.JComboBox<String> comboEstadojuicio;
    private javax.swing.JComboBox<String> comboTipojuicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelJuicio;
    private javax.swing.JLabel txtAbogado;
    private javax.swing.JLabel txtApellidoCli;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JLabel txtNombreCli;
    private javax.swing.JLabel txtcodigo;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author velez
 */
public class Vista_Audiencia extends javax.swing.JPanel {
    
    JButton btnRegistrarAud, cancelar;
    public Vista_Audiencia() {
        initComponents();
        botones();
    }
    public void botones(){
        //BTN REGISTRAR AUDIENCIA
        btnRegistrarAud= new EfectoHover();
        btnRegistrarAud.setText("Registrar Audiencia");
        btnRegistrarAud.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_law_40px.png")));
        btnRegistrarAud.setBackground(new Color(97,167,97));
        btnRegistrarAud.setForeground(Color.WHITE);
        btnRegistrarAud.setBounds(211, 500, 169, 52);
        btnRegistrarAud.setContentAreaFilled(false);
        btnRegistrarAud.setFocusPainted(false);
        btnRegistrarAud.setToolTipText("Registar Audiencia");
        //btnRegistrarAud.addActionListener(this);
        jPanel2.add(btnRegistrarAud);
        
        //BTN CANCELAR
        cancelar= new EfectoHover();   
        cancelar.setText("Cancelar");
        cancelar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_esc_60px.png")));
        cancelar.setBackground(new Color(97,167,97));
        cancelar.setForeground(Color.WHITE);
        cancelar.setBounds(480, 502, 142, 49);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setToolTipText("Cancelar Operacion");
        //cancelar.addActionListener(this);
        jPanel2.add(cancelar);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelAudiencia = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 56, 71));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ventana de Registro de Audiencias");

        panelAudiencia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("CODIGO DE JUICIO:");

        jLabel4.setText("NUMERO DE AUDIENCIA:");

        jLabel3.setText("FECHA DE AUDIENCIA:");

        javax.swing.GroupLayout panelAudienciaLayout = new javax.swing.GroupLayout(panelAudiencia);
        panelAudiencia.setLayout(panelAudienciaLayout);
        panelAudienciaLayout.setHorizontalGroup(
            panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAudienciaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelAudienciaLayout.setVerticalGroup(
            panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAudienciaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAudienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE AUDIENCIAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(346, 346, 346))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(panelAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(panelAudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -5, 850, 620));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelAudiencia;
    // End of variables declaration//GEN-END:variables
}

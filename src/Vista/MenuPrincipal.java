/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Login;
import java.awt.Color;
import java.awt.Component;
//import AppPackage.AnimationClass;
import Modelo.*;
import javax.swing.JButton;
import Vista.EfectoHover.EventLabel;
import static Vista.Vista_Cliente.*;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author velez
 */
public class MenuPrincipal extends javax.swing.JFrame implements ActionListener {

    private int ancho, alto;

    JToggleButton addCustomer, addCitas, addAudiencias, addJuicios;
    JLabel NewUser;
    CardLayout vista;

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Nivel_Acceso();
        botones();
        vista = (CardLayout) pnl_vistaP.getLayout();
        /*System.out.println(A.getBounds());
        System.out.println(B.getBounds());
        System.out.println(C.getBounds());
        System.out.println(D.getBounds());*/

    }

    /*public void negarAcceso(){
        for(Component botones: jpPrueba.getComponents()){
            botones.setEnabled(false);
        }
    }*/
    public void Nivel_Acceso() {
        
        
        
        System.out.println("ES: " + Login.tip);
        if (Login.tip.equals("Estandar") == true) {
            System.out.println("A");
            btnAddTraba.setVisible(false);
            btnAddUser.setVisible(false);
            btn_addperson.setVisible(false);
        }
        if (Login.tip.equals("Administrador") == true) {
            System.out.println("B");
            btnAddTraba.setVisible(true);
            btnAddUser.setVisible(true);
        }
    }

    public void botones() {

        //BTN ADD CUSTOMER
        addCustomer = new EfectoBottonDoble();
        addCustomer.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/add customer.png")));
        addCustomer.setContentAreaFilled(false);
        addCustomer.setBounds(75, 73, 96, 70);
        addCustomer.setFocusPainted(false);
        addCustomer.setToolTipText("Añadir Cliente");
        addCustomer.addActionListener(this);
        addCustomer.setEnabled(true);
        
        Panel_BTN.add(addCustomer);

        //ADD JUICIOS
        addJuicios = new EfectoBottonDoble();
        addJuicios.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/add juicios .png")));
        addJuicios.setContentAreaFilled(false);
        addJuicios.setBounds(75, 201, 96, 78);
        addJuicios.setFocusPainted(false);
        addJuicios.setToolTipText("Añadir Juicio");
        addJuicios.addActionListener(this);
        Panel_BTN.add(addJuicios);

        //ADD AUDIENCIAS
        addAudiencias = new EfectoBottonDoble();
        addAudiencias.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/add audiencias.png")));
        addAudiencias.setContentAreaFilled(false);
        addAudiencias.setBounds(71, 339, 96, 96);
        addAudiencias.setFocusPainted(false);
        addAudiencias.setToolTipText("Añadir Audiencia");
        addAudiencias.addActionListener(this);
        Panel_BTN.add(addAudiencias);

        //ADD CITAS
        addCitas = new EfectoBottonDoble();
        addCitas.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/icons8_calendar_96px.png")));
        addCitas.setContentAreaFilled(false);
        addCitas.setBounds(81, 493, 96, 96);
        addCitas.setFocusPainted(false);
        addCitas.setToolTipText("Agendar Cita");
        addCitas.addActionListener(this);
        Panel_BTN.add(addCitas);

        //EFECTO LABEL 
        NewUser = new EfectoLabel();
        NewUser.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagen/Nuevo Usuario.png")));
        NewUser.setBounds(-60, 50, 100, 40);
        NewUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        NewUser.setBorder(null);
        Panel_BTN.add(NewUser);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addCustomer) {
            /*this.setVisible(false);*/
            if (addCustomer.isSelected()) {
                Vista_Cliente prue = new Vista_Cliente();
                pnl_vistaP.add(prue, "nuevo cliente");
                vista.show(pnl_vistaP, "nuevo cliente");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            } else {
                pnl_vistaP.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }

        if (e.getSource() == addCitas) {
            if (addCitas.isSelected()) {
                Vista_Cita nuevaCita = new Vista_Cita();
                pnl_vistaP.add(nuevaCita, "nueva cita");
                vista.show(pnl_vistaP, "nueva cita");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            } else {
                pnl_vistaP.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }

        if (e.getSource() == addJuicios) {
            if (addJuicios.isSelected()) {
                Vista_Juicio jui = new Vista_Juicio();
                pnl_vistaP.add(jui, "nuevo juicio");
                vista.show(pnl_vistaP, "nuevo juicio");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            } else {
                pnl_vistaP.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }

        if (e.getSource() == addAudiencias) {
            if (addAudiencias.isSelected()) {
                Vista_Audiencia audiencia = new Vista_Audiencia();
                pnl_vistaP.add(audiencia, "nueva audiencia");
                vista.show(pnl_vistaP, "nueva audiencia");
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            } else {
                pnl_vistaP.removeAll();
                SwingUtilities.updateComponentTreeUI(this);
                this.repaint();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        titulo_ventana = new javax.swing.JLabel();
        pnl_vistaP = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnAddUser = new javax.swing.JToggleButton();
        btn_addperson = new javax.swing.JToggleButton();
        btnAddTraba = new javax.swing.JToggleButton();
        Panel_BTN = new javax.swing.JPanel();
        jL_addCliente = new javax.swing.JLabel();
        jL_addJuicios = new javax.swing.JLabel();
        jL_addAuduencias = new javax.swing.JLabel();
        jL_addCitas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(28, 56, 71));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        btn_cerrar.setBackground(new java.awt.Color(28, 56, 71));
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_delete_24px.png"))); // NOI18N
        btn_cerrar.setToolTipText("closed");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.setOpaque(true);
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseExited(evt);
            }
        });
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cerrar);
        btn_cerrar.setBounds(1120, 0, 30, 29);

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/LOGO.png"))); // NOI18N
        Icono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconoMouseClicked(evt);
            }
        });
        jPanel2.add(Icono);
        Icono.setBounds(0, 0, 30, 26);

        titulo_ventana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titulo_ventana.setForeground(new java.awt.Color(255, 255, 255));
        titulo_ventana.setText("Aplicacion para Proyecto Final");
        jPanel2.add(titulo_ventana);
        titulo_ventana.setBounds(470, 0, 160, 15);

        pnl_vistaP.setBackground(new java.awt.Color(255, 255, 255));
        pnl_vistaP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_vistaP.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(28, 56, 71));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(28, 56, 71));
        jPanel4.setLayout(null);

        btnMenu.setBackground(new java.awt.Color(28, 56, 71));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_menu_24px.png"))); // NOI18N
        btnMenu.setToolTipText("Menu");
        btnMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.setOpaque(true);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuMouseExited(evt);
            }
        });
        jPanel4.add(btnMenu);
        btnMenu.setBounds(0, 0, 43, 40);

        btnAddUser.setBackground(new java.awt.Color(28, 56, 71));
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_businessman_26px.png"))); // NOI18N
        btnAddUser.setText("Añadir Usuario ");
        btnAddUser.setBorder(null);
        btnAddUser.setBorderPainted(false);
        btnAddUser.setContentAreaFilled(false);
        btnAddUser.setFocusPainted(false);
        btnAddUser.setOpaque(true);
        jPanel4.add(btnAddUser);
        btnAddUser.setBounds(330, 0, 130, 40);

        btn_addperson.setBackground(new java.awt.Color(28, 56, 71));
        btn_addperson.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_addperson.setForeground(new java.awt.Color(255, 255, 255));
        btn_addperson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_reception_24px.png"))); // NOI18N
        btn_addperson.setText("Añadir Persona");
        btn_addperson.setBorder(null);
        btn_addperson.setBorderPainted(false);
        btn_addperson.setContentAreaFilled(false);
        btn_addperson.setFocusPainted(false);
        btn_addperson.setOpaque(true);
        btn_addperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addpersonActionPerformed(evt);
            }
        });
        jPanel4.add(btn_addperson);
        btn_addperson.setBounds(60, 0, 120, 40);

        btnAddTraba.setBackground(new java.awt.Color(28, 56, 71));
        btnAddTraba.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddTraba.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTraba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/add tra.png"))); // NOI18N
        btnAddTraba.setText("Añadir Empleado");
        btnAddTraba.setBorder(null);
        btnAddTraba.setBorderPainted(false);
        btnAddTraba.setContentAreaFilled(false);
        btnAddTraba.setFocusCycleRoot(true);
        btnAddTraba.setFocusPainted(false);
        btnAddTraba.setOpaque(true);
        btnAddTraba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTrabaMouseClicked(evt);
            }
        });
        btnAddTraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTrabaActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddTraba);
        btnAddTraba.setBounds(180, 0, 150, 40);

        Panel_BTN.setBackground(new java.awt.Color(255, 255, 255));
        Panel_BTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jL_addCliente.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jL_addCliente.setForeground(new java.awt.Color(28, 56, 71));
        jL_addCliente.setText("Agregar Clientes");

        jL_addJuicios.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jL_addJuicios.setForeground(new java.awt.Color(28, 56, 71));
        jL_addJuicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_addJuicios.setText("Agregar Juicios");

        jL_addAuduencias.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jL_addAuduencias.setForeground(new java.awt.Color(28, 56, 71));
        jL_addAuduencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_addAuduencias.setText("Agregar Audiencias");

        jL_addCitas.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jL_addCitas.setForeground(new java.awt.Color(28, 56, 71));
        jL_addCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_addCitas.setText("Agregar Citas");

        javax.swing.GroupLayout Panel_BTNLayout = new javax.swing.GroupLayout(Panel_BTN);
        Panel_BTN.setLayout(Panel_BTNLayout);
        Panel_BTNLayout.setHorizontalGroup(
            Panel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BTNLayout.createSequentialGroup()
                .addGroup(Panel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_BTNLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jL_addCitas))
                    .addGroup(Panel_BTNLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(Panel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_addJuicios, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_addCliente)))
                    .addGroup(Panel_BTNLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jL_addAuduencias, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Panel_BTNLayout.setVerticalGroup(
            Panel_BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BTNLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jL_addCliente)
                .addGap(97, 97, 97)
                .addComponent(jL_addJuicios)
                .addGap(116, 116, 116)
                .addComponent(jL_addAuduencias)
                .addGap(144, 144, 144)
                .addComponent(jL_addCitas)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_vistaP, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_vistaP, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_vistaP.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        // TODO add your handling code here:
        btn_cerrar.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_cerrarMouseEntered

    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        // TODO add your handling code here:
        btn_cerrar.setBackground(new Color(28, 56, 71));
    }//GEN-LAST:event_btn_cerrarMouseExited

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
        int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea cancelar esta operacion", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                new Object[]{"Si", "No"}, null);
        if (confirmar == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        // TODO add your handling code here:
        btnMenu.setBackground(new Color(65, 65, 65));
    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseExited
        // TODO add your handling code here:
        btnMenu.setBackground(new Color(28, 56, 71));
    }//GEN-LAST:event_btnMenuMouseExited

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
       /* AnimationClass animar = new AnimationClass();
        animar.jLabelXRight(-60, 10, 10, 5, NewUser);
        animar.jLabelXLeft(10, -60, 10, 5, NewUser);

        /*animar.jLabelXRight(-60, 10, 10, 5, NuevoUsuario);
        animar.jLabelXLeft(10, -60, 10, 5, NuevoUsuario);*/
    }//GEN-LAST:event_btnMenuMouseClicked

    private void IconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "GENESIS PEÑA\nBORIS QUIZHPE\nDANNY TENEMEA\nMARLON VELEZ");
    }//GEN-LAST:event_IconoMouseClicked

    private void btn_addpersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addpersonActionPerformed
        System.out.println("Hola");
        if (btn_addperson.isSelected()) {
            Vista_Persona nuevaPersona = new Vista_Persona();
            pnl_vistaP.add(nuevaPersona, "nueva persona");
            vista.show(pnl_vistaP, "nueva persona");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        } else {
            pnl_vistaP.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        }
    }//GEN-LAST:event_btn_addpersonActionPerformed

    private void btnAddTrabaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTrabaMouseClicked
        // TODO add your handling code here:
        System.out.println("Hola1");
        if (btnAddTraba.isSelected()) {
            Vista_Empleado nuevoEmpleado = new Vista_Empleado();
            pnl_vistaP.add(nuevoEmpleado, "nueva empleado");
            vista.show(pnl_vistaP, "nueva empleado");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        } else {
            pnl_vistaP.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
        }

    }//GEN-LAST:event_btnAddTrabaMouseClicked

    private void btnAddTrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTrabaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTrabaActionPerformed

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
                if (/*"Nimbus"*/"Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JPanel Panel_BTN;
    private javax.swing.JToggleButton btnAddTraba;
    private javax.swing.JToggleButton btnAddUser;
    private javax.swing.JButton btnMenu;
    private javax.swing.JToggleButton btn_addperson;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel jL_addAuduencias;
    private javax.swing.JLabel jL_addCitas;
    private javax.swing.JLabel jL_addCliente;
    private javax.swing.JLabel jL_addJuicios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnl_vistaP;
    private javax.swing.JLabel titulo_ventana;
    // End of variables declaration//GEN-END:variables

}

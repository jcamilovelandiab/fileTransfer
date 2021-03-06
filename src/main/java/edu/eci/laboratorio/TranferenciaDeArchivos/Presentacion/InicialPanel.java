/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.laboratorio.TranferenciaDeArchivos.Presentacion;

import edu.eci.laboratorio.TranferenciaDeArchivos.entites.TransferenciaDeArhivosException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rescate
 */
public class InicialPanel extends javax.swing.JPanel {

    private TranferenciaDeArchivosGUI frame;

    public InicialPanel(TranferenciaDeArchivosGUI aThis) {
        
        this.frame = aThis;
        
        initComponents();
        prepareAcciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        recibir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 401));
        setMinimumSize(new java.awt.Dimension(950, 401));

        enviar.setBackground(new java.awt.Color(255, 255, 255));
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/envio.jpg"))); // NOI18N
        enviar.setBorderPainted(false);
        enviar.setMaximumSize(new java.awt.Dimension(301, 288));
        enviar.setMinimumSize(new java.awt.Dimension(301, 288));
        enviar.setPreferredSize(new java.awt.Dimension(301, 288));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel1.setText("Envio de los archivos");

        recibir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibir.jpg"))); // NOI18N
        recibir.setBorderPainted(false);

        jLabel2.setFont(new java.awt.Font("Century", 0, 36)); // NOI18N
        jLabel2.setText("Recibir Archivos");

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Administrador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoEci.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(recibir, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(recibir, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton recibir;
    // End of variables declaration//GEN-END:variables

    private void prepareAcciones() {
        ActionListener recibirAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    recibir();
                } catch (TransferenciaDeArhivosException ex) {
                    Logger.getLogger(InicialPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        recibir.addActionListener(recibirAccion);

        ActionListener enviarAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    enviar();
                } catch (TransferenciaDeArhivosException ex) {
                    Logger.getLogger(InicialPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        enviar.addActionListener(enviarAccion);
    }

    private void enviar() throws TransferenciaDeArhivosException {
        try {
            frame.irPanel("Enviar");
        } catch (TransferenciaDeArhivosException ex) {
            throw new TransferenciaDeArhivosException(TransferenciaDeArhivosException.ERROR);
        }
    }

    private void recibir() throws TransferenciaDeArhivosException {
        try {
            frame.irPanel("Recibir");
        } catch (TransferenciaDeArhivosException ex) {
            throw new TransferenciaDeArhivosException(TransferenciaDeArhivosException.ERROR);
        }
    }

}

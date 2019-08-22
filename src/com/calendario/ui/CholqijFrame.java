package com.calendario.ui;

import com.cholqij.ManejadorDeCalendarioCholqij;
import com.elementoCalendarioCholqij.KinCholqij;

/**
 *
 * @author jesfrin
 */
public class CholqijFrame extends javax.swing.JFrame {

    private ManejadorDeCalendarioCholqij manejador;

    public CholqijFrame() {
        initComponents();
        this.manejador = new ManejadorDeCalendarioCholqij();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        energiaLabel = new javax.swing.JLabel();
        anteriorButton = new javax.swing.JButton();
        siguienteButton = new javax.swing.JButton();
        nahualLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        energiaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenesNumerosMayas/numero1.jpg"))); // NOI18N

        anteriorButton.setBackground(new java.awt.Color(204, 204, 204));
        anteriorButton.setFont(new java.awt.Font("Liberation Mono", 2, 18)); // NOI18N
        anteriorButton.setForeground(new java.awt.Color(255, 51, 0));
        anteriorButton.setText("Anterior");
        anteriorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anteriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorButtonActionPerformed(evt);
            }
        });

        siguienteButton.setBackground(new java.awt.Color(204, 204, 204));
        siguienteButton.setFont(new java.awt.Font("Liberation Mono", 2, 18)); // NOI18N
        siguienteButton.setForeground(new java.awt.Color(255, 51, 0));
        siguienteButton.setText("Siguiente");
        siguienteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });

        nahualLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenesNahualesMayas/Nahual1.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 2, 18)); // NOI18N
        jLabel1.setText("Energia");

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 2, 18)); // NOI18N
        jLabel2.setText("Nahual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anteriorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(siguienteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nahualLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(energiaLabel))))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nahualLabel)
                    .addComponent(energiaLabel))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anteriorButton)
                    .addComponent(siguienteButton))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        KinCholqij dia = this.manejador.verDiaSiguiente();
        cambioDeDia(dia);
    }//GEN-LAST:event_siguienteButtonActionPerformed

    private void anteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorButtonActionPerformed
        KinCholqij dia = this.manejador.verDiaAnterior();
        cambioDeDia(dia);
    }//GEN-LAST:event_anteriorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorButton;
    private javax.swing.JLabel energiaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nahualLabel;
    private javax.swing.JButton siguienteButton;
    // End of variables declaration//GEN-END:variables

    private void cambioDeDia(KinCholqij dia) {
        energiaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(dia.getEnergia().getDireccionDeImagen()))); // NOI18N
        nahualLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(dia.getNahual().getDireccionDeImagen()))); // NOI18N
    }

}

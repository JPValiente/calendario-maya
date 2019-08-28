package com.calendario.ui;

import com.faselunar.ControladorFaseLunar;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author bryan
 */
public class InfoFaseLunar extends javax.swing.JDialog {
    private int fase;
    private ControladorFaseLunar controladorF;
    private LocalDate fechaActual;
    private LocalDate nuevaFecha;
    /**
     * Creates new form Info
     * @param parent
     */
    public InfoFaseLunar(MainFrame parent, int fase) {
        super(parent, true);
        initComponents();
        this.fase = fase;
        this.fechaActual = LocalDate.now();
        this.txtFechaActual.setText(""+fechaActual.getDayOfMonth()+" del "+fechaActual.getMonthValue()+" de "+fechaActual.getYear());
        this.nuevaFecha = null;
        this.controladorF = new ControladorFaseLunar(this, fase, fechaActual);
        this.controladorF.mostrarInformacion();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFechaActual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaDeFase = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNuevaFecha = new javax.swing.JTextField();
        txtFaseLu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbNahual = new javax.swing.JLabel();
        lbEnergia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbMes = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCuentaLarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacion de Fase Lunar");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Fase Lunar:");

        jLabel2.setText("Fecha Actual:");

        txtFechaActual.setEditable(false);
        txtFechaActual.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFechaActual.setForeground(new java.awt.Color(0, 0, 255));

        jLabel3.setText("Fecha mas Proxima a esta Fase Lunar:");

        txtFechaDeFase.setEditable(false);
        txtFechaDeFase.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFechaDeFase.setForeground(new java.awt.Color(0, 0, 255));

        jLabel4.setText("Nueva Fecha:");

        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtNuevaFecha.setEditable(false);
        txtNuevaFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNuevaFecha.setForeground(new java.awt.Color(0, 0, 255));

        txtFaseLu.setEditable(false);
        txtFaseLu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFaseLu.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setText("Cholqi'j");

        jLabel6.setText("Nahual");

        jLabel7.setText("Energia");

        jLabel8.setText("Haab");

        jLabel9.setText("Mes");

        jLabel10.setText("Dia");

        jLabel11.setText("Cuenta Larga (b, k, t, w, k)");

        txtCuentaLarga.setEditable(false);
        txtCuentaLarga.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtCuentaLarga.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFaseLu))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFechaDeFase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(txtCuentaLarga, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNahual, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(lbEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel10)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addGap(0, 88, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(160, 160, 160))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(251, 251, 251))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(txtNuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFechaDeFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCuentaLarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(lbMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNahual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFaseLu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controladorF.establecerFechaAnterior(nuevaFecha);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controladorF.establecerFechaSiguiente(nuevaFecha);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void establecerInfo(String rutaImagen,String info){
        ImageIcon icon = new ImageIcon(rutaImagen);
        //System.out.println("///llego aqui");
        lbImagen.setIcon(icon);
        
        lbImagen.setIconTextGap(1);
        lbImagen.setText("Fase_"+fase);
        lbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagen.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbImagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtFaseLu.setText(info);
        
    }
    
    public void establecerFechaProximaFase(LocalDate fecha){
        txtFechaDeFase.setText(""+fecha.getDayOfMonth()+" del "+fecha.getMonthValue()+" de "+fecha.getYear());
    }
   
    public void establecerNuevaFechaFase(LocalDate fecha, String rutaNahual, String rutaEnergia, String rutaMes, String rutadia, String cuentaLarga, String descHab){
        this.nuevaFecha = fecha;
        txtNuevaFecha.setText(""+fecha.getDayOfMonth()+" del "+fecha.getMonthValue()+" de "+fecha.getYear());
        
        lbNahual.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaNahual)));
        lbEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaEnergia)));
        
        lbMes.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutaMes)));
        lbMes.setIconTextGap(1);
        lbMes.setText(descHab);
        lbMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMes.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        lbMes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbMes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        
        lbDia.setIcon(new javax.swing.ImageIcon(getClass().getResource(rutadia)));
        
        txtCuentaLarga.setText(cuentaLarga);
        
    }
    
    public void establecerAtributosImagen(JLabel labelImagen){
        labelImagen.setIconTextGap(1);
        labelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelImagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbEnergia;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNahual;
    private javax.swing.JTextField txtCuentaLarga;
    private javax.swing.JTextField txtFaseLu;
    private javax.swing.JTextField txtFechaActual;
    private javax.swing.JTextField txtFechaDeFase;
    private javax.swing.JTextField txtNuevaFecha;
    // End of variables declaration//GEN-END:variables
}

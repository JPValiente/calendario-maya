package com.calendario.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 *
 * @author bryan
 */
public class FrameMatrizLunar extends javax.swing.JDialog {
    
    private MainFrame frame;
    private PanelMatrizLunar tab;
    /**
     * Creates new form Calendario
     */
    public FrameMatrizLunar(MainFrame frame) {
        this.frame = frame;
        this.tab = new PanelMatrizLunar(frame);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(800, 600));
        this.setTitle("Fase Lunar");
        this.add(tab,BorderLayout.CENTER);
        this.tab.inicializar();
        this.tab.setSize(200,200);
        this.tab.ordenar();
        //initComponents();
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calendario Lunar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

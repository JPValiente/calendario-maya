/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Haab;

import com.ElementosCalendarioHaab.FechaHaab;
import com.calendario.ui.MatrizHaabFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabricio
 */
public class ManejadorMatrizHaab {

    private CalendarioHaab calendarioHaab;
    private ManejadorCalendarioHaab manejadorCalendario;
    private MatrizHaabFrame matrizFrame;

    public ManejadorMatrizHaab(MatrizHaabFrame matrizFrame) {
        this.matrizFrame = matrizFrame;
        this.calendarioHaab = new CalendarioHaab(false);
        this.manejadorCalendario = new ManejadorCalendarioHaab();
    }

    public String[][] getNumsHaab(int option) {
        String[][] numsHaab1 = new String[CalendarioHaab.NUM_MONTHS][CalendarioHaab.NUM_DAYS];
        String[][] numsHaab2 = new String[CalendarioHaab.NUM_DAYS][CalendarioHaab.NUM_MONTHS];
        if (option == 1) {
            for (int i = 0; i < CalendarioHaab.NUM_MONTHS - 1; i++) {
                for (int j = 0; j < CalendarioHaab.NUM_DAYS; j++) {
                    numsHaab1[i][j] = Integer.toString(j);
                }
            }
            for (int i = 0; i < CalendarioHaab.NUM_DAYS; i++) {
                if (i < 5) {
                    numsHaab1[18][i] = Integer.toString(i);
                } else {
                    numsHaab1[18][i] = " ";
                }
            }
            return numsHaab1;
        } else {
            for (int i = 0; i < CalendarioHaab.NUM_DAYS; i++) {
                for (int j = 0; j < CalendarioHaab.NUM_MONTHS; j++) {
                    if (j == CalendarioHaab.NUM_MONTHS - 1) {
                        if (i < CalendarioHaab.NUM_LAST_DAYS) {
                            numsHaab2[i][j] = Integer.toString(i);
                        } else {
                            numsHaab2[i][j] = " ";
                        }
                    } else {
                        numsHaab2[i][j] = Integer.toString(i);
                    }
                }
            }
            return numsHaab2;
        }
    }

    public String[] columnsName() {
        return calendarioHaab.monthsName();
    }

    public FechaHaab getFecha(int mes, int dia) throws Exception{
        return manejadorCalendario.getFechaEspecifica(mes, dia);
    }

    public void procesarMatriz() {
        this.matrizFrame.setVisiblePanel(true);
        int fila = matrizFrame.getTableHaab().getSelectedRow();
        int columna = matrizFrame.getTableHaab().getSelectedColumn();
        try {
            FechaHaab fecha = getFecha(columna, fila);
            setDateIcons(fecha);
        } catch (Exception e) {
        }
    }
    
    public void setDateIcons(FechaHaab fecha){
        matrizFrame.getPanelDia().setIcon(new javax.swing.ImageIcon(getClass().getResource(fecha.getDia().getDireccionDeImagen())));
        matrizFrame.getPanelMes().setIcon(new javax.swing.ImageIcon(getClass().getResource(fecha.getMes().getDireccionDeImagen())));
        matrizFrame.getInfoArea().setText(fecha.getMes().getDescripcion()+"\n"+ fecha.getDia().getDescripcion());
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) matrizFrame.getTableHaab().getModel();
        String[][] fechas = getNumsHaab(2);
        for (int i = 0; i < MatrizHaabFrame.NUM_DAYS; i++) {
            model.addRow(fechas[i]);
        }
    }
    
}

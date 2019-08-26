/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Haab;

import com.ElementosCalendarioHaab.FechaHaab;
import javax.swing.JOptionPane;

/**
 *
 * @author jpmazate
 */
public class ManejadorCalendarioHaab {

    private CalendarioHaab calendarioHaab;
    private Integer dia;
    private Integer mes;

    public ManejadorCalendarioHaab() {
        this.calendarioHaab = new CalendarioHaab(false);
        dia = 0;
        mes = 0;
    }
    
    public FechaHaab getDiaCero(){
        return calendarioHaab.getFechaExacta()[dia][mes];
    }

    public FechaHaab getDiaSiguiente() {

        if (mes != 18) {
            if (dia+1 > 19) {
                dia = 0;
                mes++;
            } else {
                dia++;
            }
        }else{
            if(dia+1>4){
                dia=0;
                mes=0;
            }else{
                dia++;
            }
        }

        return calendarioHaab.getFechaExacta()[dia][mes];

    }
    
    
    public FechaHaab getFechaEspecifica(int mes, int dia){
        if(mes < 0 || mes > 18){
            JOptionPane.showMessageDialog(null,"MES INCORRECTO");
            return null;
        }else {
            if(mes == 18){
                if(dia < 0 || dia>4){
                    JOptionPane.showMessageDialog(null,"DIA INCORRECTO, EL ULTIMO MES SOLO TIENE 5 DIAS");
                    return null;
                }
            }else{
                if(dia<0 || dia>19){
                    JOptionPane.showMessageDialog(null,"DIA INCORRECTO, SOLO TIENEN 20 DIAS");
                    return null;
                }
            }
        }
        
        
        this.mes = mes;
        this.dia = dia;
        return calendarioHaab.getFechaExacta()[dia][mes];
    }

    public FechaHaab getDiaAnterior() {
        if(mes>0){
            if(dia==0){
                dia = 19;
                mes--;
            }else{
                dia--;
            }
        }else{
            if(dia==0){
                mes = 18;
                dia = 4;
            }else{
                dia--;
            }
        }

        return calendarioHaab.getFechaExacta()[dia][mes];
    }

}

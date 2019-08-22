/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Haab;

import com.ElementosCalendarioHaab.ElementoCalendarioHaab;
import com.ElementosCalendarioHaab.ElementoDia;
import com.ElementosCalendarioHaab.ElementoMes;
import com.ElementosCalendarioHaab.FechaHaab;
import com.elementoCalendarioCholqij.EnergiaCholqij;
import com.elementoCalendarioCholqij.KinCholqij;
import com.elementoCalendarioCholqij.NahualCholqij;

/**
 *
 * @author jpmazate
 */
public class CalendarioHaab {

    //COnstantes de url
    private final String INCIO_URL_DE_NUMERO = "/com/imagenesNumerosMayas/numero";
    private final String INCIO_URL_DE_MES = "/com/imagenesMesesHaab/Mes";
    //Elementos de calendario
    private final FechaHaab[][] fechasHaab = new FechaHaab[20][19];
    private final ElementoDia dia[];
    private final ElementoMes mes[];
    private String informacionDeDia[];

    public CalendarioHaab(boolean esParaCuadricula) {
        dia = new ElementoDia[20];
        mes = new ElementoMes[19];
        //llenar info de cada dia
        if (!esParaCuadricula) {
            crearDias();
            crearMeses();
        } else {

        }
        crearCalendario();
    }

    private void crearDias() {//Se crean 20 dias
        int numeroDeImagen;
        String[] dias = dayNumber();
        for (int i = 0; i < this.dia.length; i++) {
            numeroDeImagen = i;
            this.dia[i] = new ElementoDia(i + 1, INCIO_URL_DE_NUMERO + numeroDeImagen + ".jpg", dias[i]);
        }
    }

    private void crearMeses() {//Se crean 18 meses Mas el mes extra
        String[] meses = monthName();
        int numeroDeImagen;
        int i;
        int mesExtra;
        for (i = 0; i < this.mes.length - 1; i++) {
            numeroDeImagen = i + 1;
            this.mes[i] = new ElementoMes(i, INCIO_URL_DE_MES + +numeroDeImagen + ".png", meses[i], false);
        }
        mesExtra=i+1;
        this.mes[i] = new ElementoMes(i, INCIO_URL_DE_MES + mesExtra + ".png", meses[i], true);
    }

    private void crearCalendario() {
        FechaHaab fecha;
        
        for (int i = 0; i < mes.length ; i++) {
            if (mes[i].isEsUltimoMes()) {
                for (int k = 0; k < 5; k++) {
                    fecha = new FechaHaab(dia[k], mes[i]);
                    this.fechasHaab[k][i]= fecha;   
                }
            } else {
                for (int j = 0; j < dia.length; j++) {
                    fecha = new FechaHaab(dia[j], mes[i]);
                    this.fechasHaab[j][i] = fecha;
                }
            }
        }
    }
    
    

    public FechaHaab[][] getFechaExacta() {
        return fechasHaab;
    }
    
    
    public String[] dayNumber(){
        String[] numbers = new String[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = "Dia: "+i;
        }
        return numbers;
    }
    
    public String[] monthName(){
        String[] months = new String[19];
        
        months[0] = "Mes: Pop";
        months[1] = "Mes: Wo'";
        months[2] = "Mes: Sip";
        months[3] = "Mes: Sotz'";
        months[4] = "Mes: Sek";
        months[5] = "Mes: Xul";
        months[6] = "Mes: Yaxk'in";
        months[7] = "Mes: Mol";
        months[8] = "Mes: Ch'en";
        months[9] = "Mes: Yax";
        months[10] = "Mes: Sak'";
        months[11] = "Mes: Keh";
        months[12] = "Mes: Mak";
        months[13] = "Mes: K'ank'in";
        months[14] = "Mes: Muwan";
        months[15] = "Mes: Pax";
        months[16] = "Mes: Kayab";
        months[17] = "Mes: Kumk'u";
        months[18] = "Mes: Wayeb";
        return months;
        
    }
    

}

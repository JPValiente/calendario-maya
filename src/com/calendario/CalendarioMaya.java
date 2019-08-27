package com.calendario;

import com.ElementosCalendarioHaab.FechaHaab;
import com.SumadorFechas.Fecha;
import com.apiFecha.ApiFecha;
import com.calendario.ui.*;
import com.elementoCalendarioCholqij.KinCholqij;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalendarioMaya {

    public static void main(String[] args) {
        try {
            Fecha fecha = new Fecha("13,0,7,11,0");
            LocalDate fecha1=ApiFecha.convertirFechaDeCuentaLargaAGregoriana(fecha);
            System.out.println(fecha1);
            
            Fecha fecha2=ApiFecha.convertirFechaGregorianaACuentaLarga(fecha1);
            System.out.println(fecha2.getBaktun()+"."+fecha2.getKatun()+"."+fecha2.getTun()+"."+fecha2.getWuinal()+"."+fecha2.getKin());
       
            KinCholqij k=ApiFecha.convertirGregorianoAKinCHolqij(fecha1);
            System.out.println(k.getNahual().getDescripcion()+" \nEnergia:"+k.getEnergia().getNumero());

            FechaHaab h=ApiFecha.convertirGregorianoAHaab(fecha1);
            System.out.println(h.getMes().getDescripcion()+"\nDia:"+h.getDia().getNumero());
            
        } catch (Exception ex) {
            Logger.getLogger(CalendarioMaya.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

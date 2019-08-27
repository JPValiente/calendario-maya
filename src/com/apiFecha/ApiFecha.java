/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiFecha;

import com.ElementosCalendarioHaab.FechaHaab;
import com.Haab.ManejadorCalendarioHaab;
import com.SumadorFechas.Fecha;
import com.cholqij.ManejadorDeCalendarioCholqij;
import com.elementoCalendarioCholqij.KinCholqij;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jesfrin
 */
public class ApiFecha {

    public static final int DIAS_EN_UN_BAKTUN = 144000;
    public static final int DIAS_EN_UN_KATUN = 7200;
    public static final int DIAS_EN_UN_TUN = 360;
    public static final int DIAS_EN_UN_UINAL = 20;
    public static final int DIAS_EN_UN_KIN = 1;

    public static final int DIAS_PIVOTE_CUENTA_LARGA = 13 * DIAS_EN_UN_BAKTUN;
    public static final LocalDate FECHA_PIVOTE_GREGORIANO = LocalDate.of(2012, 12, 21);
    
    //public static final KinCholqij DIA_CHOLQIJ = new KinCholqij(new NahualCholqij(20,"",""),new EnergiaCholqij(4, "", ""));
    public static  ManejadorDeCalendarioCholqij manCholqij = new ManejadorDeCalendarioCholqij();
    public static  ManejadorCalendarioHaab manHab = new ManejadorCalendarioHaab();
    
    public static KinCholqij convertirGregorianoAKinCHolqij(LocalDate fecha)throws Exception{
        Fecha fechaCuentaLarga=convertirFechaGregorianaACuentaLarga(fecha);
        int dias = fechaCuentaLarga.getDiasExactos();
        dias -= DIAS_PIVOTE_CUENTA_LARGA;
        manCholqij.setNumeroDeEnergia(8);
        manCholqij.setNumeroDeNahual(20);
        //Los dias seran los que se avanze o retroceda en la matris
        KinCholqij dia=null;
        if(dias>0){
            for (int i = 0; i < dias; i++) {
                dia=manCholqij.verDiaSiguiente();
            }
        }else if(dias<0){
            dias*=-1;
            for (int i = 0; i < dias; i++) {
                dia=manCholqij.verDiaAnterior();
            }
        }else{
           return  manCholqij.getCalendario().getDiasDeCalendarioCholtij()[20-1][8-1];
        }
        return dia;
    }
    
    public static FechaHaab convertirGregorianoAHaab(LocalDate fecha)throws Exception{
        Fecha fechaCuentaLarga=convertirFechaGregorianaACuentaLarga(fecha);
        int dias = fechaCuentaLarga.getDiasExactos();
        dias -= DIAS_PIVOTE_CUENTA_LARGA;
        manHab.setDia(2);
        manHab.setMes(13);
        FechaHaab dia=null;
         if(dias>0){
            for (int i = 0; i < dias; i++) {
               dia= manHab.getDiaSiguiente();
            }
        }else if(dias<0){
            dias*=-1;
            for (int i = 0; i < dias; i++) {
                dia=manHab.getDiaAnterior();
            }
        }else{
           return  manHab.getCalendarioHaab().getFechasHaab()[3-1][13];
        }
        return dia;
    }
    
    
    
    public static LocalDate convertirFechaDeCuentaLargaAGregoriana(Fecha fechaCuentaLarga) {
        int dias = fechaCuentaLarga.getDiasExactos();
        dias -= DIAS_PIVOTE_CUENTA_LARGA;
        return FECHA_PIVOTE_GREGORIANO.plusDays(dias);
    }

    public static Fecha convertirFechaGregorianaACuentaLarga(LocalDate fecha) throws Exception {
        String fechaNueva = "";
        int diasEntreFechas = (int) ChronoUnit.DAYS.between(FECHA_PIVOTE_GREGORIANO, fecha);
        diasEntreFechas += DIAS_PIVOTE_CUENTA_LARGA;

        int baktun = (int) diasEntreFechas / DIAS_EN_UN_BAKTUN;
        fechaNueva += String.valueOf(baktun);
        diasEntreFechas = (diasEntreFechas % DIAS_EN_UN_BAKTUN);

        int katun = (int) diasEntreFechas / DIAS_EN_UN_KATUN;
        fechaNueva += "," + String.valueOf(katun);
        diasEntreFechas = (diasEntreFechas % DIAS_EN_UN_KATUN);

        int tun = (int) diasEntreFechas / DIAS_EN_UN_TUN;
        fechaNueva += String.valueOf("," + tun);
        diasEntreFechas = (diasEntreFechas % DIAS_EN_UN_TUN);

        int uinal = (int) diasEntreFechas / DIAS_EN_UN_UINAL;
        fechaNueva += "," + String.valueOf(uinal);
        diasEntreFechas = (diasEntreFechas % DIAS_EN_UN_UINAL);

        int kin = (int) diasEntreFechas;
        fechaNueva += "," + String.valueOf(kin);
        return new Fecha(fechaNueva);
    }

    public static int verTotalDeDiasEntreFechas(Fecha fecha1, Fecha fecha2) {
        LocalDate nuevaF1 = convertirFechaDeCuentaLargaAGregoriana(fecha1);
        LocalDate nuevaF2 = convertirFechaDeCuentaLargaAGregoriana(fecha2);
        int diasEntreFechas = (int) ChronoUnit.DAYS.between(nuevaF2, nuevaF1);//Fecha menor,Fecha mayor
        return diasEntreFechas;
    }
}

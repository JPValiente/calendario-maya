package com.faselunar;

import com.apiFecha.ApiFecha;
import com.apiFecha.ElementosCalendarioHaab.ElementoDia;
import com.apiFecha.ElementosCalendarioHaab.ElementoMes;
import com.apiFecha.ElementosCalendarioHaab.FechaHaab;
import com.apiFecha.SumadorFechas.Fecha;
import com.apiFecha.elementoCalendarioCholqij.EnergiaCholqij;
import com.apiFecha.elementoCalendarioCholqij.KinCholqij;
import com.apiFecha.elementoCalendarioCholqij.NahualCholqij;
import com.calendario.ui.InfoFaseLunar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class ControladorFaseLunar {
    private InfoFaseLunar info;
    private int fase;
    private CalculadorFaseLunar calc;
    private LocalDate fechaPivote;
    private ConstanteFaseLunar constFase;

    public ControladorFaseLunar(InfoFaseLunar info, int fase, LocalDate fechaPivote) {
        this.info = info;
        this.fase = fase;
        this.fechaPivote = fechaPivote;
        this.constFase = new ConstanteFaseLunar(fase);
        // Date date1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.calc = new CalculadorFaseLunar(Date.from(fechaPivote.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }
    
    public void mostrarInformacion(){
        int faseActual = calc.calcularFaseLunar();
        
        //fecha proxima de la fase seleccionada
        System.out.println("** La fecha sera: "+devolverFechaProxima(faseActual,fase, fechaPivote).toString());
        LocalDate fechaProximaFase = devolverFechaProxima(faseActual,fase, fechaPivote);
        try {
            KinCholqij chol = ApiFecha.convertirGregorianoAKinCHolqij(fechaProximaFase);
            EnergiaCholqij energia = chol.getEnergia();
            NahualCholqij nahual = chol.getNahual();
            
            FechaHaab haab = ApiFecha.convertirGregorianoAHaab(fechaProximaFase);
            ElementoMes mes = haab.getMes();
            ElementoDia dia = haab.getDia();
            
            Fecha larga = ApiFecha.convertirFechaGregorianaACuentaLarga(fechaProximaFase);
            
            info.establecerInfo(constFase.obtenerRutaImagen(), constFase.obtenerConstante());
            info.establecerFechaProximaFase(fechaProximaFase);
            info.establecerNuevaFechaFase(fechaProximaFase,nahual.getDireccionDeImagen(),energia.getDireccionDeImagen(),mes.getDireccionDeImagen(),dia.getDireccionDeImagen(),larga.getFecha(), mes.getDescripcion());
            
            
        } catch (Exception ex) {
            Logger.getLogger(ControladorFaseLunar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
    
    public LocalDate devolverFechaProxima(int faseActual,int fase, LocalDate fechaPivote){
        LocalDate fechaProximaFase = fechaPivote;
        long nDias = 0;
        if (fase>=faseActual) {
            nDias= fase-faseActual;
            fechaProximaFase = fechaProximaFase.plusDays(nDias);
            
        } else {
            nDias = (30-faseActual)+fase;
            fechaProximaFase = fechaProximaFase.plusDays(nDias);
        }
        return fechaProximaFase;
    
    }
    
    
    public void establecerFechaAnterior(LocalDate nuevaFecha){
        LocalDate fechaAnterior = nuevaFecha;
        fechaAnterior = fechaAnterior.minusDays(30);
        try {
            KinCholqij chol = ApiFecha.convertirGregorianoAKinCHolqij(fechaAnterior);
            EnergiaCholqij energia = chol.getEnergia();
            NahualCholqij nahual = chol.getNahual();
            
            FechaHaab haab = ApiFecha.convertirGregorianoAHaab(fechaAnterior);
            ElementoMes mes = haab.getMes();
            ElementoDia dia = haab.getDia();
            
            Fecha larga = ApiFecha.convertirFechaGregorianaACuentaLarga(fechaAnterior);
            
            info.establecerNuevaFechaFase(fechaAnterior,nahual.getDireccionDeImagen(),energia.getDireccionDeImagen(),mes.getDireccionDeImagen(),dia.getDireccionDeImagen(),larga.getFecha(), mes.getDescripcion());
            
            
        } catch (Exception ex) {
            Logger.getLogger(ControladorFaseLunar.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return fechaAnterior;
        
    }
    
    public void establecerFechaSiguiente(LocalDate nuevaFecha){
        LocalDate fechaSiguiente = nuevaFecha;
        fechaSiguiente = fechaSiguiente.plusDays(30);
        try {
            KinCholqij chol = ApiFecha.convertirGregorianoAKinCHolqij(fechaSiguiente);
            EnergiaCholqij energia = chol.getEnergia();
            NahualCholqij nahual = chol.getNahual();
            
            FechaHaab haab = ApiFecha.convertirGregorianoAHaab(fechaSiguiente);
            ElementoMes mes = haab.getMes();
            ElementoDia dia = haab.getDia();
            
            Fecha larga = ApiFecha.convertirFechaGregorianaACuentaLarga(fechaSiguiente);
            
            info.establecerNuevaFechaFase(fechaSiguiente,nahual.getDireccionDeImagen(),energia.getDireccionDeImagen(),mes.getDireccionDeImagen(),dia.getDireccionDeImagen(),larga.getFecha(), mes.getDescripcion());
            
            
        } catch (Exception ex) {
            Logger.getLogger(ControladorFaseLunar.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return fechaSiguiente;
               
    }
    
    
}


package com.faselunar;
import com.calendario.ui.Calendario2019;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author bryan
 */
public class ControladorCalendarioG {
    //private Info dialogInfo;
    private Calendario2019 dialogInfo;
    private Date date;
    private CalculadorFaseLunar calc;
    private ConstanteFaseLunar constLunar;
    
    public ControladorCalendarioG(Calendario2019 dialogInfo, Date date) {
        this.dialogInfo = dialogInfo;
        this.date = date;
        this.calc= new CalculadorFaseLunar(date);
    }
    
    public void ejecutar(){
        int edad = calc.calcularFaseLunar();
        constLunar = new ConstanteFaseLunar(edad);
        
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String info = "La Fase Lunar para la Fecha \n"
                      + localDate.getDayOfMonth() + " del "+localDate.getMonthValue()+" del año "+localDate.getYear()+" es: \n"
                      + constLunar.obtenerConstante();
                       
        dialogInfo.establecerInfo(constLunar.obtenerRutaImagen(), info);
        
        
    }   
    
}

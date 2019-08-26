    package com.faselunar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author bryan
 */
public class CalculadorFaseLunar {
    private int[] epacta = {24,5,16,28,9,20,1,12,22,3,15,25,7,18,0,11,22,2,14};
    private int[] correccionMensual = {0,1,0,1,2,3,4,5,6,7,8,9};
    private Date date;

    public CalculadorFaseLunar(Date date) {
        this.date = date;
        
    }
    
    public int calcularFaseLunar(){
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        while(!(year>=2000 && year <=2018)){
            if (year<2000) {
                year +=19;
            } else {
                year -=19;
            }
        }
        int edadLuna = devolverEpacta(year)+devolverCorreccionMensual(localDate.getMonthValue())+localDate.getDayOfMonth();
    
        while(edadLuna>=30){
            edadLuna-=30;
        }
        
        return edadLuna;
        
    }
    
    public int devolverEpacta(int var){
        int devol = 0;
        switch (var) {
            case 2000:
                devol = epacta[0];
                break;
            case 2001:
                devol = epacta[1];
                break;
            case 2002:
                devol = epacta[2];
                break;
            case 2003:
                devol = epacta[3];
                break;
            case 2004:
                devol = epacta[4];
                break;
            case 2005:
                devol = epacta[5];
                break;
            case 2006:
                devol = epacta[6];
                break;
            case 2007:
                devol = epacta[7];
                break;
            case 2008:
                devol = epacta[8];
                break;
            case 2009:
                devol = epacta[9];
                break;
            case 2010:
                devol = epacta[10];
                break;
            case 2011:
                devol = epacta[11];
                break;
            case 2012:
                devol = epacta[12];
                break;
            case 2013:
                devol = epacta[13];
                break;
            case 2014:
                devol = epacta[14];
                break;
            case 2015:
                devol = epacta[15];
                break;
            case 2016:
                devol = epacta[16];
                break;
            case 2017:
                devol = epacta[17];
                break;
            case 2018:
                devol = epacta[18];
                break;
            default:
                throw new AssertionError();
        }
        return devol;
    
    }
    
    public int devolverCorreccionMensual(int var){
        int devol = 0;
        switch (var) {
            case 1:
                devol = correccionMensual[0];
                break;
            case 2:
                devol = correccionMensual[1];
                break;
            case 3:
                devol = correccionMensual[2];
                break;
            case 4:
                devol = correccionMensual[3];
                break;
            case 5:
                devol = correccionMensual[4];
                break;
            case 6:
                devol = correccionMensual[5];
                break;
            case 7:
                devol = correccionMensual[6];
                break;
            case 8:
                devol = correccionMensual[7];
                break;
            case 9:
                devol = correccionMensual[8];
                break;
            case 10:
                devol = correccionMensual[9];
                break;
            case 11:
                devol = correccionMensual[10];
                break;
            case 12:
                devol = correccionMensual[11];
                break;
            default:
                throw new AssertionError();
        }
        return devol;
    }

}

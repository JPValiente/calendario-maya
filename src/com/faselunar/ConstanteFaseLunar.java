package com.faselunar;

/**
 *
 * @author bryan
 */
public class ConstanteFaseLunar {
    
    public static final String FASE_NUEVA = "LUNA NUEVA";
    public static final String FASE_CRECIENTE_CONCAVA = "LUNA CRECIENTE CONCAVA";
    public static final String FASE_CUARTO_CRECIENTE = "LUNA CUARTO CRECIENTE";
    public static final String FASE_CRECIENTE_GIBOSA = "LUNA CRECIENTE GIBOSA";
    public static final String FASE_LLENA = "LUNA LLENA";
    public static final String FASE_MENGUANTE_GIBOSA = "LUNA MENGUANTE GIBOSA";
    public static final String FASE_CUARTO_MENGUANTE = "LUNA CUARTO MENGUANTE";
    public static final String FASE_MENGUANTE_CONCAVA = "LUNA MENGUANTE CONCAVA";
    
    private int var;

    public ConstanteFaseLunar(int var) {
        this.var = var;
    }
    
    public String obtenerConstante(){
        if (var==0 ||var ==29) {
            return FASE_NUEVA;
        } else if (var>=1 && var <=6){
            return FASE_CRECIENTE_CONCAVA;
        } else if (var == 7){
            return FASE_CUARTO_CRECIENTE;
        } else if (var<=12 && var>=8){
            return FASE_CRECIENTE_GIBOSA;
        } else if (var >=13 && var <=15){
            return FASE_LLENA;
        } else if (var >=16 && var <=20){
            return FASE_MENGUANTE_GIBOSA;
        } else if (var ==21){
            return FASE_CUARTO_MENGUANTE;
        } else if (var >=22 && var <=28){
            return FASE_MENGUANTE_CONCAVA;
        } else {
            return "";    
        }      
        
    }
    
    public String obtenerRutaImagen(){
        return "src/com/img/Luna"+var+".png";
    }

}

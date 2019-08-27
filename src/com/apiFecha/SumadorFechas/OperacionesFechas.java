package com.SumadorFechas;

import javax.swing.JOptionPane;

/**
 *
 * @author jpmazate
 */
public class OperacionesFechas {

    private Fecha fecha1;
    private Fecha fecha2;
    private Fecha resultado;

    public OperacionesFechas(Fecha fecha1, Fecha fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }

    public Fecha sumarFechas() throws Exception {
        Integer kin = 0, wuinal = 0, tun = 0, katun = 0, baktun = 0;
        Integer diasTotales;
        boolean diasPositivos=true;
        diasTotales = fecha1.getDiasExactos() + fecha2.getDiasExactos();
        if(diasTotales<=0){
            diasPositivos=false;
        }
        kin=0;
        for (int i = 0; i < diasTotales; i++) {
            kin++;
            if(kin>19){
                kin=0;
                wuinal++;
                if(wuinal>17){
                    wuinal=0;
                    tun++;
                    if(tun>19){
                        tun=0;
                        katun++;
                        if(katun>19){
                            katun=0;
                            baktun++;
                            if(baktun>19){
                                baktun =0;
                                throw new Exception("SE PASO DEL 20 BAKTUN. NO SE PUEDE AVANZAR MAS");
                            }
                        }
                    }
                }
            }
            
        }
        return new Fecha(diasTotales, kin, wuinal, tun, katun, baktun, convertirFechaString(kin, wuinal, tun, katun, baktun), diasPositivos);

    }

    public Fecha restarFechas() throws Exception {
        Integer kin = 0, wuinal = 0, tun = 0, katun = 0, baktun = 0;
        Integer diasTotales;
        boolean diasPositivos;
        diasTotales = fecha1.getDiasExactos() - fecha2.getDiasExactos();
        if (diasTotales < 0) {
            diasPositivos = false;
        } else {
            diasPositivos = true;
        }
        
        kin=0;
        for (int i = 0; i < diasTotales; i++) {
            kin++;
            if(kin>19){
                kin=0;
                wuinal++;
                if(wuinal>17){
                    wuinal=0;
                    tun++;
                    if(tun>19){
                        tun=0;
                        katun++;
                        if(katun>19){
                            katun=0;
                            baktun++;
                            if(baktun>19){
                                baktun =0;
                                throw new Exception("SE PASO DEL 20 BAKTUN. NO SE PUEDE AVANZAR MAS");
                            }
                        }
                    }
                }
            }
            
        }
        return new Fecha(diasTotales, kin, wuinal, tun, katun, baktun, convertirFechaString(kin, wuinal, tun, katun, baktun), diasPositivos);
    }
    
    public String convertirFechaString(int kin, int wuinal, int tun, int katun, int baktun){
        String fecha,skin,swuinal,stun,skatun,sbaktun;
        if (baktun < 9){
            sbaktun = "0"+baktun;
        }else {
            sbaktun = baktun+"";
        }
        if(katun< 9){
            skatun = "0"+katun;
        }
        else {
            skatun = katun+"";
        }
        if(tun <9){
            stun = "0"+tun;
            
        }else {
            stun = tun+"";
        }
        if(wuinal <9){
            swuinal = "0"+wuinal;
        }else {
            swuinal = wuinal+"";
        }
        if(kin<9){
            skin = "0"+kin;
        }else {
            skin = kin+"";
        }
        
        fecha = sbaktun+"."+skatun+"."+stun+"."+swuinal+"."+skin;
        return fecha;
        
    }

}

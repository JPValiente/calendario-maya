
package com.ElementosCalendarioHaab;



/**
 *
 * @author jpmazate
 */
public class FechaHaab {
    
    private ElementoDia dia;
    private ElementoMes mes;

    public FechaHaab(ElementoDia dia, ElementoMes mes) {
        this.dia = dia;
        this.mes = mes;
    }
    
    

    public ElementoDia getDia() {
        return dia;
    }

    public void setDia(ElementoDia dia) {
        this.dia = dia;
    }

    public ElementoMes getMes() {
        return mes;
    }

    public void setMes(ElementoMes mes) {
        this.mes = mes;
    }
    
    
    
}


package com.apiFecha.ElementosCalendarioHaab;

/**
 *
 * @author jpmazate
 */
public class ElementoMes extends ElementoCalendarioHaab {
    private boolean esUltimoMes;
    
    public ElementoMes(int numero, String direccionDeImagen, String descripcion,boolean esUltimoMes) {
        super(numero, direccionDeImagen, descripcion);
        this.esUltimoMes = esUltimoMes;
    }

    public boolean isEsUltimoMes() {
        return esUltimoMes;
    }

    public void setEsUltimoMes(boolean esUltimoMes) {
        this.esUltimoMes = esUltimoMes;
    }
    
    
}

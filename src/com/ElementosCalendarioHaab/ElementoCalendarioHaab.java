
package com.ElementosCalendarioHaab;

/**
 *
 * @author jpmazate
 */
public class ElementoCalendarioHaab {
    
    private int numero;
    private String direccionDeImagen;
    private String descripcion;

    public ElementoCalendarioHaab(int numero, String direccionDeImagen, String descripcion) {
        this.numero = numero;
        this.direccionDeImagen = direccionDeImagen;
        this.descripcion = descripcion;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccionDeImagen() {
        return direccionDeImagen;
    }

    public void setDireccionDeImagen(String direccionDeImagen) {
        this.direccionDeImagen = direccionDeImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
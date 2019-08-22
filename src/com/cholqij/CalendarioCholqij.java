package com.cholqij;

import com.elementoCalendarioCholqij.EnergiaCholqij;
import com.elementoCalendarioCholqij.NahualCholqij;
import com.elementoCalendarioCholqij.KinCholqij;

/**
 *
 * @author jesfrin
 */
public class CalendarioCholqij {

    //COnstantes de url
    private final String INCIO_URL_DE_NUMERO = "/com/imagenesNumerosMayas/numero";
    private final String INCIO_URL_DE_NAHUAL = "/com/imagenesNahualesMayas/Nahual";
    //Elementos de calendario
    private final KinCholqij[][] diasDeCalendarioCholtij = new KinCholqij[20][13];
    private final EnergiaCholqij energias[];
    private final NahualCholqij nahuales[];

    public CalendarioCholqij(boolean esParaCuadricula) {
        energias = new EnergiaCholqij[13];
        nahuales = new NahualCholqij[20];
        if (!esParaCuadricula) {
            crearEnergias();
            crearNahuales();
        } else {

        }
        crearCalendario();
    }

    /**
     * Las energias van intercaladas y van dependiendo de la fila asi:
     * Fila 1-> (1) (1+7) (8-6) (2+7)...si la suma sobrepasara 13 entonces se restara 6, asi en cada fila
     * se puede comenzar sumando o restando,basado en la condicion anterior
     * Si la fila sobrepasara los 13 se regresara a 1
     */
    private void crearCalendario() {//El metodo se basa en el avance de filas
        int numeroDeFila = 1;
        for (int i = 0; i < nahuales.length; i++) {
            if (numeroDeFila == 14) {
                numeroDeFila = 1;
            }
            int valorDeEnergiaEnColumna = numeroDeFila;//El numero de fila es la base para saber la energia
            for (int j = 0; j < energias.length; j++) {
                KinCholqij dia = new KinCholqij(nahuales[i]);
                if (j == 0) {
                } else if (valorDeEnergiaEnColumna + 7 >= 14) {
                    valorDeEnergiaEnColumna -= 6;
                } else {
                    valorDeEnergiaEnColumna += 7;
                }
                dia.setEnergia(energias[valorDeEnergiaEnColumna - 1]);
                diasDeCalendarioCholtij[i][j] = dia;
            }
            numeroDeFila++;
        }
    }

    private void crearEnergias() {//Se crean 13 energias
        int numeroDeImagen;
        for (int i = 0; i < energias.length; i++) {
            numeroDeImagen = i + 1;
            this.energias[i] = new EnergiaCholqij(i + 1, INCIO_URL_DE_NUMERO + numeroDeImagen + ".jpg", "");
        }
    }

    private void crearNahuales() {//Se crean 20 nahuales
        int numeroDeImagen;
        for (int i = 0; i < nahuales.length; i++) {
            numeroDeImagen = i + 1;
            this.nahuales[i] = new NahualCholqij(i + 1, INCIO_URL_DE_NAHUAL + numeroDeImagen + ".jpg", "");
        }
    }

    public KinCholqij[][] getDiasDeCalendarioCholtij() {
        return diasDeCalendarioCholtij;
    }

}

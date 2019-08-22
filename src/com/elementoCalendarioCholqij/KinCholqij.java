package com.elementoCalendarioCholqij;

/**
 *
 * @author jesfrin
 */
public class KinCholqij {

    private NahualCholqij nahual;
    private EnergiaCholqij energia;
    
    public KinCholqij(NahualCholqij nahual){
        this.nahual = nahual;
    }

    public NahualCholqij getNahual() {
        return nahual;
    }

    public void setNahual(NahualCholqij nahual) {
        this.nahual = nahual;
    }

    public EnergiaCholqij getEnergia() {
        return energia;
    }

    public void setEnergia(EnergiaCholqij energia) {
        this.energia = energia;
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiFecha.SumadorFechas;

/**
 *
 * @author jpmazate
 */
public class Fecha {

    private Integer diasExactos;
    private Integer kin;
    private Integer wuinal;
    private Integer tun;
    private Integer katun;
    private Integer baktun;
    private String fecha;
    private boolean positivo;

    public Fecha(String fecha) throws Exception {
        this.fecha = fecha;
        dateConverter();
        convertirDiasExactos();
    }

    public Fecha(Integer diasExactos, Integer kin, Integer wuinal, Integer tun, Integer katun, Integer baktun, String fecha, boolean positivo) {
        this.diasExactos = diasExactos;
        this.kin = kin;
        this.wuinal = wuinal;
        this.tun = tun;
        this.katun = katun;
        this.baktun = baktun;
        this.fecha = fecha;
        this.positivo = positivo;
    }

    public void dateConverter() throws Exception {
        String fechas[];
        fechas = this.fecha.split(",");
        int wuinal, kin, tun, katun, baktun;
        switch (fechas.length) {
            case 1:
                kin = Integer.parseInt(fechas[0]);
                if (kin <= 19) {
                    this.kin = kin;
                } else {
                    throw new Exception("KINS MAYORES A 19");
                }
                break;
            case 2:
                wuinal = Integer.parseInt(fechas[0]);
                kin = Integer.parseInt(fechas[1]);
                if (kin <= 19) {
                    if (wuinal <= 17) {
                        this.kin = kin;
                        this.wuinal = wuinal;
                    } else {
                        throw new Exception("WUINALES MAYORES A 17");
                    }
                } else {
                    throw new Exception("KINS MAYORES A 19");
                }
                break;
            case 3:
                tun = Integer.parseInt(fechas[0]);
                wuinal = Integer.parseInt(fechas[1]);
                kin = Integer.parseInt(fechas[2]);

                if (kin <= 19) {
                    if (wuinal <= 17) {
                        if (tun <= 19) {
                            this.kin = kin;
                            this.wuinal = wuinal;
                            this.tun = tun;
                        } else {
                            throw new Exception("TUNS MAYORES A 19");
                        }
                    } else {
                        throw new Exception("WUINALES MAYORES A 17");
                    }
                } else {
                    throw new Exception("KINS MAYORES A 19");
                }
                break;
            case 4:
                katun = Integer.parseInt(fechas[0]);
                tun = Integer.parseInt(fechas[1]);
                wuinal = Integer.parseInt(fechas[2]);
                kin = Integer.parseInt(fechas[3]);
                if (kin <= 19) {
                    if (wuinal <= 17) {
                        if (tun <= 19) {
                            if (katun <= 19) {
                                this.kin = kin;
                                this.wuinal = wuinal;
                                this.tun = tun;
                                this.katun = katun;
                            } else {
                                throw new Exception("KATUNS MAYORES A 19");
                            }
                        } else {
                            throw new Exception("TUNS MAYORES A 19");
                        }
                    } else {
                        throw new Exception("WUINALES MAYORES A 17");
                    }
                } else {
                    throw new Exception("KINS MAYORES A 19");
                }
                break;

            case 5:
                baktun = Integer.parseInt(fechas[0]);
                katun = Integer.parseInt(fechas[1]);
                tun = Integer.parseInt(fechas[2]);
                wuinal = Integer.parseInt(fechas[3]);
                kin = Integer.parseInt(fechas[4]);
                if (kin <= 19) {
                    if (wuinal <= 17) {
                        if (tun <= 19) {
                            if (katun <= 19) {
                                if (baktun <= 19) {
                                    this.kin = kin;
                                    this.wuinal = wuinal;
                                    this.tun = tun;
                                    this.katun = katun;
                                    this.baktun = baktun;
                                } else {
                                    throw new Exception("BAKTUNS MAYORES A 19");
                                }
                            } else {
                                throw new Exception("KATUNS MAYORES A 19");
                            }
                        } else {
                            throw new Exception("TUNS MAYORES A 19");
                        }
                    } else {
                        throw new Exception("WUINALES MAYORES A 17");
                    }
                } else {
                    throw new Exception("KINS MAYORES A 19");
                }
                break;
            default:

                throw new Exception("ENTRADA MAYOR A 5 NUMEROS");

        }
    }

    public void convertirDiasExactos() {
        int dias = 0;
        if (baktun != null) {
            dias += baktun * 20 * 20 * 20 * 18;
        }
        if (katun != null) {
            dias += katun * 20 * 20 * 18;
        }
        if (tun != null) {
            dias += tun * 20 * 18;
        }
        if (wuinal != null) {
            dias += wuinal * 20;
        }
        if (kin != null) {
            dias += kin * 1;
        }

        this.diasExactos = dias;
    }

    public Integer getDiasExactos() {
        return diasExactos;
    }

    public void setDiasExactos(Integer diasExactos) {
        this.diasExactos = diasExactos;
    }

    public Integer getKin() {
        return kin;
    }

    public void setKin(Integer kin) {
        this.kin = kin;
    }

    public Integer getWuinal() {
        return wuinal;
    }

    public void setWuinal(Integer wuinal) {
        this.wuinal = wuinal;
    }

    public Integer getTun() {
        return tun;
    }

    public void setTun(Integer tun) {
        this.tun = tun;
    }

    public Integer getKatun() {
        return katun;
    }

    public void setKatun(Integer katun) {
        this.katun = katun;
    }

    public Integer getBaktun() {
        return baktun;
    }

    public void setBaktun(Integer baktun) {
        this.baktun = baktun;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

}

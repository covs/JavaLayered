package com.example.model;

public class PagoHipoteca {
    private String id;
    private String cuenta;
    private double monto;

    public PagoHipoteca(String id, String cuenta, double monto) {
        this.id = id;
        this.cuenta = cuenta;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
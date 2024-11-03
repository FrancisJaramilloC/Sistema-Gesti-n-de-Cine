package com.example.models;

import java.util.Date;

public class Boleto {
    private boolean estadoBoleto;
    private Date fechaDeCompra;

    public Boleto() {}

    public boolean isEstadoBoleto() {
        return estadoBoleto;
    }

    public void setEstadoBoleto(boolean estadoBoleto) {
        this.estadoBoleto = estadoBoleto;
    }

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
}

package models;

import java.util.Date;

public class Boleto {
    private int idBoleto;
    private Boolean estadoBoleto;
    private Date fechaCompra;
    
    // Getters and Setters
    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Boolean getEstadoBoleto() {
        return estadoBoleto;
    }

    public void setEstadoBoleto(Boolean estadoBoleto) {
        this.estadoBoleto = estadoBoleto;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}

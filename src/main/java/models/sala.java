package models;

public class sala {
    private int idSala;
    private int numeroSala;
    private int capacidad;
    private String tipo;

    public sala(){
        
    }

    public sala(int idSala, int numeroSala, int capacidad, String tipo) {
        this.idSala = idSala;
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

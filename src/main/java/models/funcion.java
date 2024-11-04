package models;

import java.sql.Date;

public class Funcion {
    private Date horaFuncion;
    private Date fecha;
    private Sala sala;
    private Pelicula pelicula;

    public Funcion(){
        
    }

    public Funcion(Date horaFuncion, Date fecha, Sala sala, Pelicula pelicula) {
        this.horaFuncion = horaFuncion;
        this.fecha = fecha;
        this.sala = sala;
        this.pelicula = pelicula;
    }

    public Date getHoraFuncion() {
        return horaFuncion;
    }

    public void setHoraFuncion(Date horaFuncion) {
        this.horaFuncion = horaFuncion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

}

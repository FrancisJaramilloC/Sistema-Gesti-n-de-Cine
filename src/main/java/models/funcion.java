package models;

import java.sql.Date;

public class funcion {
    private Date horaFuncion;
    private Date fecha;
    private sala sala;
    private pelicula pelicula;

    public funcion(){
        
    }

    public funcion(Date horaFuncion, Date fecha, sala sala, pelicula pelicula) {
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

    public sala getSala() {
        return sala;
    }

    public void setSala(sala sala) {
        this.sala = sala;
    }

    public pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(pelicula pelicula) {
        this.pelicula = pelicula;
    }

}

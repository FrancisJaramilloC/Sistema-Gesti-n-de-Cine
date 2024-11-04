package models;
import java.util.Date;

public class Empleado extends Persona {
    private int idEmpleado;
    private Double salario;
    private Date horarioTrabajo;

    // Getters and Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(Date horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
}

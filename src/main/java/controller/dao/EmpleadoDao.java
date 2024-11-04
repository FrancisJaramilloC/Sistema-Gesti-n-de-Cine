package controller.dao;

import models.Empleado;
import controller.tda.list.LinkedList;
import controller.dao.implement.AdapterDao;


public class EmpleadoDao extends AdapterDao<Empleado> {
    private Empleado empleado = new Empleado();
    private LinkedList listAll;
    public EmpleadoDao(){
        super(Empleado.class);
    }
    public Empleado getEmpleado(){
        if (empleado == null) {
            empleado = new Empleado();
        }
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado){
        this.empleado = empleado;
    }

    public LinkedList getlistAll(){
        if (listAll == null) {
            this.listAll = listAll();
        }
        return listAll;
    }
    public Boolean save() throws Exception{
        Integer id = getlistAll().getSize()+1;
        empleado.setIdEmpleado(id);
        this.persist(this.empleado);
        this.listAll = listAll();
        return true;
    }
    
}

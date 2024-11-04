package controller.dao.services;

import controller.tda.list.LinkedList;
import models.Empleado;
import controller.dao.EmpleadoDao;

public class EmpleadoServices extends EmpleadoDao {
    private EmpleadoDao obj;
    public EmpleadoServices(){
        obj = new EmpleadoDao();
    }
    public Boolean save() throws Exception{
        return obj.save();
    }

    public LinkedList listAll(){
        return obj.getlistAll();

    }

    public Empleado getEmpleado(){
        return obj.getEmpleado();
    }

    public void setEmpleado( Empleado empleado){
        obj.setEmpleado(empleado);
    }
    
}

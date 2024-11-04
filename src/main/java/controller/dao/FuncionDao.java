package controller.dao;

import controller.dao.implement.AdapterDao;
import controller.tda.list.LinkedList;
import models.Funcion;

public class FuncionDao extends AdapterDao<Funcion> {
    private Funcion funcion;
    private LinkedList<Funcion> listAll;

    public FuncionDao(){
        super(Funcion.class);
    }

    public Funcion getFuncion(){
        if(funcion == null) {
            funcion = new Funcion();
        }
        return this.funcion;
    }
    
    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public LinkedList<Funcion> getListAll(){
        if (this.listAll == null) {
            this.listAll = listAll();
        }
        return this.listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize() + 1;
        // Assuming Funcion has an ID setter similar to Inversionista
        getFuncion().setIdFuncion(id);  // Add setIdFuncion in Funcion model if not present
        persist(getFuncion());
        return true;
    }
}

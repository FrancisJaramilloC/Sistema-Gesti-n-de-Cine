package controller.dao.services;

import controller.dao.FuncionDao;
import controller.tda.list.LinkedList;
import models.Funcion;

public class FuncionServices {
    private FuncionDao obj;

    public FuncionServices(){
        obj = new FuncionDao();
    }

    public Boolean save() throws Exception {
        return obj.save();
    }
    
    public LinkedList<Funcion> listAll(){
        return obj.getListAll();
    }

    public Funcion getFuncion(){
        return obj.getFuncion();
    }

    public void setFuncion(Funcion funcion) {
        obj.setFuncion(funcion);
    }
}

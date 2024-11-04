package controller.dao.services;

import controller.tda.list.LinkedList;
import models.Cuenta;
import controller.dao.CuentaDao;

public class CuentaServices extends CuentaDao {
    private CuentaDao obj;
    public CuentaServices(){
        obj = new CuentaDao();
    }
    public Boolean save() throws Exception{
        return obj.save();
    }

    public LinkedList listAll(){
        return obj.getlistAll();

    }

    public Cuenta getCuenta(){
        return obj.getCuenta();
    }

    public void setCuenta( Cuenta cuenta){
        obj.setCuenta(cuenta);
    }
    
}

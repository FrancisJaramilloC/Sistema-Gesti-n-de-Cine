package controller.dao;

import models.Cuenta;
import controller.tda.list.LinkedList;
import controller.dao.implement.AdapterDao;

public class CuentaDao extends AdapterDao<Cuenta> {
    private Cuenta cuenta = new Cuenta();
    private LinkedList listAll;
    public CuentaDao(){
        super(Cuenta.class);
    }
    public Cuenta getCuenta(){
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return this.cuenta;
    }

    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }

    public LinkedList getlistAll(){
        if (listAll == null) {
            this.listAll = listAll();
        }
        return listAll;
    }
    public Boolean save() throws Exception{
        Integer id = getlistAll().getSize()+1;
        cuenta.setIdCuenta(id);
        this.persist(this.cuenta);
        this.listAll = listAll();
        return true;
    }
    
}

package controller.dao.services;

import controller.tda.list.LinkedList;
import models.Rol;
import controller.dao.RolDao;

public class RolServices extends RolDao {
    private RolDao obj;
    public RolServices(){
        obj = new RolDao();
    }
    public Boolean save() throws Exception{
        return obj.save();
    }

    public LinkedList listAll(){
        return obj.getlistAll();

    }

    public Rol getRol(){
        return obj.getRol();
    }

    public void setRol( Rol rol){
        obj.setRol(rol);
    }
    
}

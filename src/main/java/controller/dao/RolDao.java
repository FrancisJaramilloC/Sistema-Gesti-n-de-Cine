package controller.dao;

import models.Rol;
import controller.tda.list.LinkedList;
import controller.dao.implement.AdapterDao;

public class RolDao extends AdapterDao<Rol> {
    private Rol rol = new Rol();
    private LinkedList listAll;
    public RolDao(){
        super(Rol.class);
    }
    public Rol getRol(){
        if (rol == null) {
            rol = new Rol();
        }
        return this.rol;
    }

    public void setRol(Rol rol){
        this.rol = rol;
    }

    public LinkedList getlistAll(){
        if (listAll == null) {
            this.listAll = listAll();
        }
        return listAll;
    }
    public Boolean save() throws Exception{
        Integer id = getlistAll().getSize()+1;
        rol.setIdRol(id);
        this.persist(this.rol);
        this.listAll = listAll();
        return true;
    }
    
}

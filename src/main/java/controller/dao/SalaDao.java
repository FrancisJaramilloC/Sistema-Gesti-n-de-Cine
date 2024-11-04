package controller.dao;

import controller.dao.implement.AdapterDao;
import controller.tda.list.LinkedList;
import models.Sala;

public class SalaDao extends AdapterDao<Sala> {
    private Sala sala;
    private LinkedList<Sala> listAll;

    public SalaDao(){
        super(Sala.class);
    }

    public Sala getSala(){
        if (sala == null) {
            sala = new Sala();
        }
        return this.sala;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LinkedList<Sala> getListAll(){
        if (this.listAll == null) {
            this.listAll = listAll();
        }
        return this.listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize() + 1;
        getSala().setIdSala(id);
        persist(getSala());
        return true;
    }
}

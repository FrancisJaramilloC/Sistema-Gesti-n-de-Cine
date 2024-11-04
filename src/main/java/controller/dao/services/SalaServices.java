package controller.dao.services;

import controller.dao.SalaDao;
import controller.tda.list.LinkedList;
import models.Sala;

public class SalaServices {
    private SalaDao obj;

    public SalaServices(){
        obj = new SalaDao();
    }

    public Boolean save() throws Exception {
        return obj.save();
    }
    
    public LinkedList<Sala> listAll(){
        return obj.getListAll();
    }

    public Sala getSala(){
        return obj.getSala();
    }

    public void setSala(Sala sala) {
        obj.setSala(sala);
    }
}

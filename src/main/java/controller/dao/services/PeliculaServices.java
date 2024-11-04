package controller.dao.services;

import controller.dao.PeliculaDao;
import controller.tda.list.LinkedList;
import models.Pelicula;

public class PeliculaServices {
    private PeliculaDao obj;

    public PeliculaServices(){
        obj = new PeliculaDao();
    }

    public Boolean save() throws Exception {
        return obj.save();
    }
    
    public LinkedList<Pelicula> listAll(){
        return obj.getListAll();
    }

    public Pelicula getPelicula(){
        return obj.getPelicula();
    }

    public void setPelicula(Pelicula pelicula) {
        obj.setPelicula(pelicula);
    }
}

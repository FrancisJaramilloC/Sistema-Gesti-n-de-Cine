package controller.dao;

import controller.dao.implement.AdapterDao;
import controller.tda.list.LinkedList;
import models.Pelicula;

public class PeliculaDao extends AdapterDao<Pelicula> {
    private Pelicula pelicula;
    private LinkedList<Pelicula> listAll;

    public PeliculaDao(){
        super(Pelicula.class);
    }

    public Pelicula getPelicula(){
        if (pelicula == null) {
            pelicula = new Pelicula();
        }
        return this.pelicula;
    }
    
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LinkedList<Pelicula> getListAll(){
        if (this.listAll == null) {
            this.listAll = listAll();
        }
        return this.listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize() + 1;
        getPelicula().setIdPelicula(id);
        persist(getPelicula());
        return true;
    }
}

package controller.dao;

import models.Boleto;
import controller.dao.implement.AdapterDao;
import controller.tda.list.LinkedList;


public class BoletoDao extends AdapterDao<Boleto> {
    private Boleto boleto = new Boleto();
    private LinkedList listAll;
    public BoletoDao(){
        super(Boleto.class);
    }
    public Boleto getBoleto(){
        if (boleto == null) {
            boleto = new Boleto();
        }
        return this.boleto;
    }

    public void setBoleto(Boleto boleto){
        this.boleto = boleto;
    }

    public LinkedList getlistAll(){
        if (listAll == null) {
            this.listAll = listAll();
        }
        return listAll;
    }
    public Boolean save() throws Exception{
        Integer id = getlistAll().getSize()+1;
        boleto.setIdBoleto(id);
        this.persist(this.boleto);
        this.listAll = listAll();
        return true;
    }
    

}

package controller.dao.services;

import controller.tda.list.LinkedList;
import models.Boleto;
import controller.dao.BoletoDao;


public class BoletoServices extends BoletoDao {
    private BoletoDao obj;
    public BoletoServices(){
        obj = new BoletoDao();
    }
    public Boolean save() throws Exception{
        return obj.save();
    }

    public LinkedList listAll(){
        return obj.getlistAll();

    }

    public Boleto getBoleto(){
        return obj.getBoleto();
    }

    public void setBoleto( Boleto boleto){
        obj.setBoleto(boleto);
    }
    
}

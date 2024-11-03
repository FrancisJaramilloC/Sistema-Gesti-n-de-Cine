package com.example.dao;


public class BoletoServices {
    private BoletoDao boletoDao;

    public BoletoServices() {
        boletoDao = new BoletoDao();
    }

    public Boolean saveBoleto() throws Exception {
        return boletoDao.save();
    }

    public LinkedList<Boleto> listAllBoletos() {
        return boletoDao.listAll();
    }

    public Boleto getBoleto(int id) throws Exception {
        return boletoDao.get(id);
    }

    public void setBoleto(Boleto boleto) {
        boletoDao.setBoleto(boleto);
    }
}

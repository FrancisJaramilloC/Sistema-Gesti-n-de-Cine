package com.example.dao;

import com.mvn01.controler.dao.implement.AdapterDao;
import com.mvn01.controler.tda.models.Boleto;

public class BoletoDao extends AdapterDao<Boleto> {
    public BoletoDao() {
        super(Boleto.class);
    }
}

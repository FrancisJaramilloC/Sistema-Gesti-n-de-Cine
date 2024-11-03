package com.example.dao;

import com.mvn01.controler.dao.implement.AdapterDao;
import com.mvn01.controler.tda.models.Cuenta;

public class CuentaDao extends AdapterDao<Cuenta> {
    public CuentaDao() {
        super(Cuenta.class);
    }
}

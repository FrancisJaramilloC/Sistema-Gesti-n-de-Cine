package com.example.dao;


public class CuentaServices {
    private CuentaDao cuentaDao;

    public CuentaServices() {
        cuentaDao = new CuentaDao();
    }

    public Boolean saveCuenta() throws Exception {
        return cuentaDao.save();
    }

    public LinkedList<Cuenta> listAllCuentas() {
        return cuentaDao.listAll();
    }

    public Cuenta getCuenta(int id) throws Exception {
        return cuentaDao.get(id);
    }

    public void setCuenta(Cuenta cuenta) {
        cuentaDao.setCuenta(cuenta);
    }
}

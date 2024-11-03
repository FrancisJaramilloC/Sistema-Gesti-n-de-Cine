package com.example.dao;

public class RolServices {
    private RolDao rolDao;

    public RolServices() {
        rolDao = new RolDao();
    }

    public Boolean saveRol() throws Exception {
        return rolDao.save();
    }

    public LinkedList<Rol> listAllRoles() {
        return rolDao.listAll();
    }

    public Rol getRol(int id) throws Exception {
        return rolDao.get(id);
    }

    public void setRol(Rol rol) {
        rolDao.setRol(rol);
    }
}

package controller.dao;

import models.Persona;
import controller.dao.implement.AdapterDao;
import controller.tda.list.LinkedList;

public class PersonaDao extends AdapterDao<Persona> {
    private Persona persona = new Persona();
    private LinkedList listAll;
    public PersonaDao(){
        super(Persona.class);
    }
    public Persona getPersona(){
        if (persona == null) {
            persona = new Persona();
        }
        return this.persona;
    }

    public void setPersona(Persona persona){
        this.persona = persona;
    }

    public LinkedList getlistAll(){
        if (listAll == null) {
            this.listAll = listAll();
        }
        return listAll;
    }
    public Boolean save() throws Exception{
        Integer id = getlistAll().getSize()+1;
        persona.setIdPersona(id);
        this.persist(this.persona);
        this.listAll = listAll();
        return true;
    }
    
}
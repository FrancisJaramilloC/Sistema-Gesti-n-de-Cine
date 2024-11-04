package controller.dao.services;
import controller.tda.list.LinkedList;
import models.Persona;
import controller.dao.PersonaDao;

public class PersonaServices {
    private PersonaDao obj;
    public PersonaServices(){
        obj = new PersonaDao();
    }
    public Boolean save() throws Exception{
        return obj.save();
    }

    public LinkedList listAll(){
        return obj.getlistAll();

    }

    public Persona getPersona(){
        return obj.getPersona();
    }

    public void setPersona( Persona persona){
        obj.setPersona(persona);
    }
    
}

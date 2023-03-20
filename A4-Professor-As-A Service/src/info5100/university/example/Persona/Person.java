/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    String personId;
    String name;
    
    public Person(){
        
    }
    
    public Person(String id, String name){
        this.personId = id;
        this.name = name;

    }

    public String getPersonid() {
        return personId;
    }

    public void setPersonid(String personid) {
        this.personId = personid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.personId;
    }
    
}

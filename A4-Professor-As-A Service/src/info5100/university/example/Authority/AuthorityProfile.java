/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Authority;

import info5100.university.example.Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class AuthorityProfile {

    String name;

    public AuthorityProfile(String n) {  //could be company instead of just a name as a string
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

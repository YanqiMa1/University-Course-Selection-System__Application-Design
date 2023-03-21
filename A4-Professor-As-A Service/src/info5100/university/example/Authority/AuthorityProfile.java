/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Authority;

import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class AuthorityProfile {

    Person person;
    ArrayList<StudentProfile> studentrequest;

    public AuthorityProfile(Person p) {  //could be company instead of just a name as a string
        person = p;
        this.studentrequest=new  ArrayList<StudentProfile>();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<StudentProfile> getStudentrequest() {
        return studentrequest;
    }

    public void setStudentrequest(ArrayList<StudentProfile> studentrequest) {
        this.studentrequest = studentrequest;
    }
    
    
    
    
    
    

    
    
}

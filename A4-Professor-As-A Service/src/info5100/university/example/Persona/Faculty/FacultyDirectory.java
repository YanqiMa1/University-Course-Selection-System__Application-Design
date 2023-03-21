/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.Platform.Platform;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {
     Platform department;
     ArrayList<FacultyProfile> professors;

    public FacultyDirectory(Platform d) {

        department = d;
        professors = new ArrayList();

    }
    public ArrayList<FacultyProfile> getProfessors() {
        return professors;
    }

    public void addToProfessors(FacultyProfile professor) {
        this.professors.add(professor);
    }
    
    public FacultyProfile findProfessorById(String id){
        for (FacultyProfile p: this.professors){
            if (p.getPerson().getPersonId().equals(id)){
                return p;
            }
        }
        
        return null;
    }
    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile sp = new FacultyProfile(p);
        professors.add(sp);
        return sp;
    }

    public FacultyProfile findProfessorByName(String profname) {
        for (FacultyProfile p: this.professors){
            if (p.getPerson().getNameOfPerson().equals(profname)){
                return p;
            }
        }
        
        return null;
    }
}

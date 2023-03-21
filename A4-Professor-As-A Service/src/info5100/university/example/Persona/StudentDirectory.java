/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.Platform.Platform;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    Platform department;
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory(Platform d) {

        department = d;
        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

    public Platform getDepartment() {
        return department;
    }

    public void setDepartment(Platform department) {
        this.department = department;
    }

    public ArrayList<StudentProfile> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<StudentProfile> studentlist) {
        this.studentlist = studentlist;
    }

}

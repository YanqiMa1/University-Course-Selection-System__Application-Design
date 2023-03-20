/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {
    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addToStudents(Student student) {
        this.students.add(student);
    }
}

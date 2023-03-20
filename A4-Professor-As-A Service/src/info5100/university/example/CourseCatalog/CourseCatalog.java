/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;
import info5100.university.example.Professsor.Professor;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    ArrayList<Course> courses;
    private Professor professor;
    
    public CourseCatalog(Professor p){
        this.courses = new ArrayList<Course>();
        this.professor = p;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course createCourse(String name,String topic, String region, String language, int price){
        Course c = new Course(name,topic,region,language,price);
        this.courses.add(c);
        return c;
    }
    
    public Course getCourseById(String id){
        for (Course c : courses) {
            if (c.getCourseId().equals(id))
                return c;
        }
        return null;
    }
    
    
    
}
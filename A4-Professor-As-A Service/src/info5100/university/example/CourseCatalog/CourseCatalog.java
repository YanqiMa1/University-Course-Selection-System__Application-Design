/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;
import info5100.university.example.Platform.Platform;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    ArrayList<Course> courses;
    private FacultyProfile facultyProfile;
    
    public CourseCatalog(FacultyProfile fp){
        this.courses = new ArrayList<Course>();
        this.facultyProfile = fp;
    }
      public CourseCatalog(){
        this.courses = new ArrayList<Course>();
      
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course createCourse(String name,String topic, String region, String language, int price,String profN){
        Course c = new Course(name,topic,region,language,price,profN);
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

    public boolean isCourseAlreadyExist(String name) {
        for(Course c : this.courses){
            if(c.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    
}
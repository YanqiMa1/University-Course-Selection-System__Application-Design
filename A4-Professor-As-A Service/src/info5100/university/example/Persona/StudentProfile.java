/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;


import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.CourseCatalog.SeatAssignment;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    CourseLoad courseLoads;


    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript(this);
        courseLoads = new CourseLoad();
     
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public CourseLoad getCourseLoads() {
        return courseLoads;
    }

    public void setCourseLoads(CourseLoad courseLoads) {
        this.courseLoads = courseLoads;
    }
    
     public CourseLoad getCourseLoadByTerm(String term) {

        return this.getTranscript().getCourseLoadBySemester(term);

    }
    
    

//    public ArrayList<SeatAssignment> getCourseList() {
//        ArrayList<SeatAssignment> temp = new ArrayList<SeatAssignment>();
//        for(CourseLoad cl : this.courseLoads.values()){
//            temp.addAll(cl.getSeatassignments());
//        }
//        return temp;
//
//    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public String toString() {
        return this.person.getNameOfPerson();
    }
}

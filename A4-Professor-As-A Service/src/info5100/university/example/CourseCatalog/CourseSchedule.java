/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author Ma2017
 */
public class CourseSchedule {

    private String term;
    private CourseCatalog courseCatalog;
    private ArrayList<CourseOffer> schedule;
    private ArrayList<StudentProfile> enrolledListForTerm;

    public CourseSchedule(String t, CourseCatalog cc) {
        this.term = t;
        this.courseCatalog = cc;
        schedule = new ArrayList<CourseOffer>();
        enrolledListForTerm = new ArrayList<StudentProfile>();
    }

    public CourseOffer newCourseOffer(String courseId, FacultyProfile prof) {
        Course c = courseCatalog.getCourseById(courseId);
        if (c == null) {
            return null;
        } else {
            CourseOffer co = new CourseOffer(c, prof);
            schedule.add(co);
            return co;
        }

    }
    public ArrayList<CourseOffer> getCourseOfferListByCourseId(String id) {
        ArrayList<CourseOffer> aimedOffer = new ArrayList<CourseOffer>();
        for (CourseOffer co : schedule) {

            if (co.getCourse().getCourseId().equals(id)) {
                aimedOffer.add(co);
            }
        }
        return aimedOffer;
    }
    

    public CourseOffer getCourseOfferByCourseId(String id) {

        for (CourseOffer co : schedule) {

            if (co.getCourse().getCourseId().equals(id)) {
                return co;
            }
        }
        return null;
    }

    public ArrayList<StudentProfile> getEnrolledListForTerm() {
        for (CourseOffer co : schedule) {
            for (StudentProfile s : co.getEnrolledStudentList()) {
                this.enrolledListForTerm.add(s);
            }
        }
        return this.enrolledListForTerm;
    }
    
     public ArrayList<StudentProfile> getEnrolledListForTermOnly() {
     return this.enrolledListForTerm;
     }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public ArrayList<CourseOffer> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<CourseOffer> schedule) {
        this.schedule = schedule;
    }

    public boolean isThisCourseOfferExist(String courseId) {
        for(CourseOffer co : this.schedule){
            if(co.getCourse().getCourseId().equals(courseId)){
                return true;
            }
        }
        return false;
    }

}

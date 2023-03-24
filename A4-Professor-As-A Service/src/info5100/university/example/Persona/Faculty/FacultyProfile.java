/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseCatalog.CourseOffer;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.Persona.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class FacultyProfile {

    private Person person;
    private CourseCatalog courseCatalog;
    private HashMap<String, CourseSchedule> allSchedules;
    private double reputation = 0; //default
    private double tuitionCollected;
//    private Boolean accountStatus; //only professor role has this attribute
    private ArrayList<StudentProfile> enrolledListForAllTerm;
    private ArrayList<StudentProfile> enrolledList;

    public FacultyProfile(Person p) {
        person = p;
        this.courseCatalog = new CourseCatalog(this);
        this.allSchedules = new HashMap<String, CourseSchedule>();
        this.enrolledListForAllTerm = new ArrayList<StudentProfile>();
    }

    public Course createCourse(String name, String topic, String region, String language, int price, String pfoN) {
        Course c = this.courseCatalog.createCourse(name, topic, region, language, price, pfoN);
        return c;
    }

    public CourseSchedule newCourseSchedule(String term) {

        CourseSchedule cs = new CourseSchedule(term, this.courseCatalog);
        this.allSchedules.put(term, cs);
        return cs;
    }

    //create schedule before create offer
    public CourseOffer createCourseOffer(String term, String courseId) {
        CourseSchedule cs = this.getCourseScheduleByTerm(term);
        CourseOffer co = cs.newCourseOffer(courseId, this);

        return co;
    }

    public CourseSchedule getCourseScheduleByTerm(String term) {

        return allSchedules.get(term);

    }

    public ArrayList<StudentProfile> getEnrolledListForAllTerm() {

        for (Map.Entry<String, CourseSchedule> termSchedule : this.allSchedules.entrySet()) {
            CourseSchedule cs = termSchedule.getValue();

            for (StudentProfile s : cs.getEnrolledListForTerm()) {
                this.enrolledListForAllTerm.add(s);
            }
        }
        return this.enrolledListForAllTerm;
    }
    
    public ArrayList<StudentProfile> getEnrolledListForAllTermOnly() {
        return enrolledListForAllTerm;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public double getReputation() {
        return reputation;
    }

    public void setReputation(double reputation) {
        this.reputation = reputation;
    }

    public double getTuitionCollected() {
        return tuitionCollected;
    }

    public void setTuitionCollected(int tuitionCollected) {
        this.tuitionCollected = tuitionCollected;
    }

    public HashMap<String, CourseSchedule> getAllSchedules() {
        return allSchedules;
    }

    public void setAllSchedules(HashMap<String, CourseSchedule> schedules) {
        this.allSchedules = schedules;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<StudentProfile> getEnrolledList() {
        return enrolledList;
    }

    public void setEnrolledList(ArrayList<StudentProfile> enrolledList) {
        this.enrolledList = enrolledList;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.CourseOffer;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.CourseCatalog.Seat;
import info5100.university.example.CourseCatalog.SeatAssignment;
import info5100.university.example.Persona.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
    private double reputation; //default
    private double tuitionCollected;
//    private Boolean accountStatus; //only professor role has this attribute
    private ArrayList<StudentProfile> enrolledListForAllTerm;
    private ArrayList<StudentProfile> enrolledList;
    private ArrayList<Double> ratings;
    private boolean isSubscript;

    public FacultyProfile(Person p) {
        person = p;
        this.courseCatalog = new CourseCatalog(this);
        this.allSchedules = new HashMap<String, CourseSchedule>();
        this.enrolledListForAllTerm = new ArrayList<StudentProfile>();
        this.reputation = 0.0;
        tuitionCollected = 0.0;
        this.ratings = new ArrayList<Double>();
        isSubscript = false;
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

    public void deleteCourseOffer(String term, String courseId) {
        CourseSchedule cs = this.getCourseScheduleByTerm(term);
        for (CourseOffer co : cs.getSchedule()) {
            if (co.getCourse().getCourseId().equals(courseId)) {
                cs.getSchedule().remove(co);
            }
            break;
        }
    }

    public CourseSchedule getCourseScheduleByTerm(String term) {

        return allSchedules.get(term);

    }

//    public ArrayList<StudentProfile> getEnrolledListForAllTerm() {
//
//        for (Map.Entry<String, CourseSchedule> termSchedule : this.allSchedules.entrySet()) {
//            CourseSchedule cs = termSchedule.getValue();
//
//            for (StudentProfile s : cs.getEnrolledListForTerm()) {
//                this.enrolledListForAllTerm.add(s);
//            }
//        }
//        return this.enrolledListForAllTerm;
//    }
    public ArrayList<StudentProfile> getEnrolledListForAllTerm() {

        ArrayList<StudentProfile> uniqueEnrolledListForAllTerm = new ArrayList<>();

        for (Map.Entry<String, CourseSchedule> termSchedule : this.allSchedules.entrySet()) {
            CourseSchedule cs = termSchedule.getValue();

            for (StudentProfile s : cs.getEnrolledListForTerm()) {
                if (!isStudentInList(s, uniqueEnrolledListForAllTerm)) {
                    uniqueEnrolledListForAllTerm.add(s);
                }
            }
        }
        return uniqueEnrolledListForAllTerm;
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

    public void addRating(double rating) {
        this.ratings.add(rating);
        this.reputation = calculateReputation();
    }

    private double calculateReputation() {
        double sum = 0;
        int count = ratings.size();

        for (double rating : ratings) {
            sum += rating;
        }
        System.out.println(count);
        return count == 0 ? 0 : sum / count;

    }

    public double getReputation() {

        int count = 0;
        for (Map.Entry<String, CourseSchedule> termSchedule : this.allSchedules.entrySet()) {
            CourseSchedule cs = (CourseSchedule) termSchedule.getValue();
            for (CourseOffer co : cs.getSchedule()) {
                for (Seat s : co.getSeatlist()) {
                    if (s.getOccupied() && s.getSeatassignment().getRateOfProf() != 0) {
                        double rating = s.getSeatassignment().getRateOfProf();
                        this.reputation += rating;
                        count++;
                    }
                }
            }
        }

        if (count == 0) {
            return 0;
        } else {
            BigDecimal rep = new BigDecimal(this.reputation / count).setScale(2, RoundingMode.HALF_UP);
            return rep.doubleValue();
        }

    }
    
    public double getReputationOnly(){
        return reputation;
    }

    public void setReputation(double reputation) {
        this.reputation = reputation;
    }

    public void collectTuition(double tuitionAmount) {
        this.tuitionCollected += tuitionAmount;
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

    private boolean isStudentInList(StudentProfile student, ArrayList<StudentProfile> studentList) {
        for (StudentProfile s : studentList) {
            if (s == student) {
                return true;
            }
        }
        return false;
    }

    public boolean isIsSubscript() {
        return isSubscript;
    }

    public void setIsSubscript(boolean isSubscript) {
        this.isSubscript = isSubscript;
    }

    public void updateReputation() {
        double sum = 0;
        int count = 0;

        for (Map.Entry<String, CourseSchedule> termSchedule : this.allSchedules.entrySet()) {
            CourseSchedule cs = termSchedule.getValue();
            for (CourseOffer co : cs.getSchedule()) {
                for (Seat s : co.getSeatlist()) {
                    if (s.getOccupied() && s.getSeatassignment().getRateOfProf() != 0) {
                        double rating = s.getSeatassignment().getRateOfProf();
                        sum += rating;
                        count++;
                    }
                }
            }
        }

        if (count != 0) {
            BigDecimal rep = new BigDecimal(sum / count).setScale(2, RoundingMode.HALF_UP);
            this.reputation = rep.doubleValue();
        } else {
            this.reputation = 0;
        }
    }

}

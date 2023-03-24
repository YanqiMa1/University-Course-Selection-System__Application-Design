/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author Ma2017
 */
public class CourseLoad {

    String term;
    ArrayList<SeatAssignment> seatassignments;
    StudentProfile student;
    ArrayList<Course> registeredCourses;

    public CourseLoad(String t, StudentProfile s) {
        seatassignments = new ArrayList<SeatAssignment>();
        this.term = t;
        this.student = s;
        registeredCourses = new ArrayList<Course>();
    }

    public CourseLoad() {

    }

    public SeatAssignment newSeatAssignment(CourseOffer co) {

        Seat seat = co.getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(this);
        this.registeredCourses.add(co.getCourse());
        seatassignments.add(sa);  //add to students course 
        sa.setCourse(co.getCourse());
        return sa;

    }

    public void registerStudent(SeatAssignment sa) {
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }

    public String getTerm() {
        return term;
    }

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }

    public StudentProfile getStudent() {
        return student;
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(ArrayList<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public float getSemesterScore() { //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa : seatassignments) {
            sum = sum + sa.GetCourseStudentScore();
        }
        return sum;
    }

    public int totalCourseTaken() {
        int sum = 0;
        for (int i = 0; i<sum; i++) {
            sum = sum + registeredCourses.size();
        }
        return sum;
    }

}

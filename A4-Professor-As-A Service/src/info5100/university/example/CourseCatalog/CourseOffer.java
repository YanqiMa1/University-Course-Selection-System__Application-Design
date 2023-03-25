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
public class CourseOffer {

    private Course course;
    private ArrayList<Seat> seatlist;
    private FacultyProfile professor;
    private ArrayList<StudentProfile> enrolledStudentList;
    private String term;

    public CourseOffer(Course c, FacultyProfile prof) {
        course = c;
        seatlist = new ArrayList<Seat>();
        enrolledStudentList = new ArrayList<StudentProfile>();
        professor = prof;
    }

    public void generatSeats(int numOfSeats) {
        for (int i = 0; i < numOfSeats; i++) {
            seatlist.add(new Seat(this));
        }
    }

    public void changeSeatsNumbers(int num) {
        this.seatlist.clear();
        for (int i = 0; i < num; i++) {
            seatlist.add(new Seat(this));
        }
    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }


    public int getEmptySeatCount() {
        int seatCounter = 0;
        for (Seat s : seatlist) {
            if (!s.isOccupied()) {
                seatCounter++;
            }
        }
        return seatCounter;
    }


    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); // link seat to courseload (belongs to a certain student)
        cl.registerStudent(sa); // add the sa to student's course load's ArrayList<SeatAssignment>
        return sa;
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getPrice();
            }

        }
        return sum;
    }

    public ArrayList<StudentProfile> getEnrolledStudentList() {

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                this.enrolledStudentList.add(s.getSeatassignment().getCourseload().getStudent());
            }

        }
        return this.enrolledStudentList;
    }

    public ArrayList<StudentProfile> getEnrolledStudentListOnly() {
        return this.enrolledStudentList;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public FacultyProfile getProfessor() {
        return professor;
    }

    public void setProfessor(FacultyProfile professor) {
        this.professor = professor;
    }

    public int getCreditHours() {
        return course.getCredits();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author Ma2017
 */
public class SeatAssignment {

    Seat seat;
    CourseLoad courseload;
    float grade;
    Course course;
    double rateOfProf;

    public SeatAssignment(CourseLoad cl, Seat s) {
        seat = s;
        courseload = cl;
        grade = 0.0f;
        rateOfProf = 0.0;//1-10
    }

    public void assignSeatToStudent(CourseLoad cl) {
        courseload = cl;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public CourseLoad getCourseload() {
        return courseload;
    }

    public void setCourseload(CourseLoad courseload) {
        this.courseload = courseload;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getCreditHours() {
        return seat.getCourseCredits();

    }

    public float GetCourseStudentScore() {
        return getCreditHours() * grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getRateOfProf() {
        return rateOfProf;
    }

    public void setRateOfProf(double rateOfProf) {
        this.rateOfProf = rateOfProf;
    }

    
}

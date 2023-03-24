/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.SeatAssignment;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    StudentProfile student;
    HashMap<String, CourseLoad> courseloadlist;
    CourseLoad currentcourseload;
    String graduateStatus;

    public Transcript(StudentProfile sp) {
        student = sp;
        courseloadlist = new HashMap();
        graduateStatus = "pending";

    }

    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassigmnets; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }

    public CourseLoad newCourseLoad(String sem) {

        currentcourseload = new CourseLoad(sem, student);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }

    public CourseLoad getCurrentCourseLoad() {

        return currentcourseload;

    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return courseloadlist.get(semester);

    }

    public StudentProfile getStudent() {
        return student;
    }

    public void setStudent(StudentProfile student) {
        this.student = student;
    }

    public HashMap<String, CourseLoad> getCourseloadlist() {
        return courseloadlist;
    }

    public void setCourseloadlist(HashMap<String, CourseLoad> courseloadlist) {
        this.courseloadlist = courseloadlist;
    }

    public CourseLoad getCurrentcourseload() {
        return currentcourseload;
    }

    public void setCurrentcourseload(CourseLoad currentcourseload) {
        this.currentcourseload = currentcourseload;
    }

    public String getGraduateStatus() {
        return graduateStatus;
    }

    public void setGraduateStatus(String graduateStatus) {
        this.graduateStatus = graduateStatus;
    }
    
  

    public int getTotalPassedCourses() {
        int passedCourses = 0;

        for (CourseLoad courseLoad : courseloadlist.values()) {
            for (SeatAssignment seatAssignment : courseLoad.getSeatassignments()) {
                if (seatAssignment.getGrade() >= 3.0) {
                    passedCourses++;
                }
            }
        }
        
        return passedCourses;
    }

//    public float getStudentTotalScore() {
//
//        float sum = 0;
//
//        for (CourseLoad cl : courseloadlist.values()) {
//            sum = sum + cl.getSemesterScore();
//
//        }
//        return sum;
//    }
    //sat index means student rated their courses with likes;
//    public int getStudentSatifactionIndex() {
//        ArrayList<SeatAssignment> courseregistrations = getCourseList();
//        int sum = 0;
//        for (SeatAssignment sa : courseregistrations) {
//
//            if (sa.getLike()) {
//                sum = sum + 1;
//            }
//        }
//        return sum;
//    }
    //generate a list of all courses taken so far (seetassignments) 
    //from multiple semesters (course loads)
    //from seat assignments we will be able to access the course offers
//    public ArrayList<SeatAssignment> getCourseList() {
//        ArrayList temp2;
//        temp2 = new ArrayList();
//
//        for (CourseLoad cl : courseloadlist.values()) { //extract cl list as objects --ignore label
//            temp2.addAll(cl.getSeatAssignments()); //merge one array list to another
//        }
//
//        return temp2;
//
//    }
    public float getStudentTotalScore() {

        float sum = 0;

        for (CourseLoad cl : courseloadlist.values()) {
            sum = sum + cl.getSemesterScore();

        }
        return sum;
    }

}

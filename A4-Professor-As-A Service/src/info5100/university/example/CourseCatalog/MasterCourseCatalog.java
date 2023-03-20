/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.CourseCatalog;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class MasterCourseCatalog {
    ArrayList<Course> courses;

    public ArrayList<Course> getMasterCourses() {
        return courses;
    }

    public void addToMasterCourses(Course course) {
        this.courses.add(course);
    }
}

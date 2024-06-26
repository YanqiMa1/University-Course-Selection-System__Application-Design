/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Platform;

import info5100.university.example.Authority.AuthorityDirectory;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.CourseOffer;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Role.UserAccountDirectory;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Role.AdminRole;
import info5100.university.example.Role.UserAccount;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Platform {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    AuthorityDirectory authoritydirectory;
    Degree degree;
    UserAccountDirectory uad;
    HashMap<String, CourseSchedule> mastercoursecatalog;
    double collectionFee;

    public Platform(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog();
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        facultydirectory = new FacultyDirectory(this);
        persondirectory = new PersonDirectory();
        authoritydirectory = new AuthorityDirectory(this);
        degree = new Degree("MSIS");
        uad = new UserAccountDirectory(this);
        
        
        UserAccount user = this.uad.createUserAccount("admin", "admin", new AdminRole());
    }
    
       public static Platform getInstance() {
        return new Platform("Cloud Service Platform");
    }

    public void addCoreCourse(Course c) {
        degree.addCoreCourse(c);
    }

    public void addElectiveCourse(Course c) {
        degree.addElectiveCourse(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseCatalog getCoursecatalog() {
        return coursecatalog;
    }

    public void setCoursecatalog(CourseCatalog coursecatalog) {
        this.coursecatalog = coursecatalog;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void setFacultydirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }

   
    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }

    public HashMap<String, CourseSchedule> getMastercoursecatalog() {
        return mastercoursecatalog;
    }

    public AuthorityDirectory getAuthoritydirectory() {
        return authoritydirectory;
    }

    public void setAuthoritydirectory(AuthorityDirectory authoritydirectory) {
        this.authoritydirectory = authoritydirectory;
    }
    

    public void setMastercoursecatalog(HashMap<String, CourseSchedule> mastercoursecatalog) {
        this.mastercoursecatalog = mastercoursecatalog;
    }

    public CourseSchedule newCourseSchedule(String semester) {
        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {
        return mastercoursecatalog.get(semester);
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

//    public Course newCourse(String n, String nm, int cr) {
//        Course c = coursecatalog.newCourse(n, nm, cr);
//        return c;
//    }

    public int calculateRevenuesBySemester(String semester) {
        CourseSchedule css = mastercoursecatalog.get(semester);
        return css.calculateTotalRevenues();
    }

    public void RegisterForAClass(String studentid, String cn, String semester) {
        StudentProfile sp = studentdirectory.findStudent(studentid);
        CourseLoad cl = sp.getCurrentCourseLoad();
        CourseSchedule cs = mastercoursecatalog.get(semester);
//        CourseOffer co = cs.getCourseOfferByNumber(cn);
//        co.assignEmptySeat(cl);
    }
    
    public double getCollectionFee(){
        return collectionFee;
    }
    
   public void addCollectionFee(double tuitionfee){
       collectionFee += tuitionfee;
   }
}

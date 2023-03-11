/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Role;

import info5100.university.example.Role.UserAccount;
import info5100.university.example.Persona.*;
import info5100.university.example.Department.Department;
import info5100.university.example.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {

    Department department;
    ArrayList<UserAccount> studentlist;
    ArrayList<UserAccount> facultylist;

    public UserAccountDirectory(Department d) {

        department = d;
        studentlist = new ArrayList<>();
        facultylist = new ArrayList<>();

    }

    public UserAccount newStudentAccount(Person p) {

        UserAccount sp = new UserAccount(p);
        studentlist.add(sp);
        return sp;
    }

    public UserAccount newFacultyAccount(Person p) {

        UserAccount fp = new UserAccount(p);
        facultylist.add(fp);
        return fp;
    }

    public UserAccount findStudent(String id) {

        for (UserAccount sp : studentlist) {

//            if (sp.isMatch(id)) {
//                return sp;
//            }
        }
        return null; //not found after going through the whole list
    }

    public UserAccount findStudentById(String id) {
        for (UserAccount u : this.studentlist) {
            if (u.getAccountId().equals(id)) {
                return u;
            }
        }

        return null;
    }

    public UserAccount findFacultyById(String id) {
        for (UserAccount u : this.facultylist) {
            if (u.getAccountId().equals(id)) {
                return u;
            }
        }

        return null;
    }

    public UserAccount getStudentAccount(String username, String password, Role role) {
        for (UserAccount u : this.studentlist) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }

        return null;
    }
    
    
    public UserAccount getFacultyAccount(String username, String password, Role role) {
        for (UserAccount u : this.facultylist) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }

        return null;
    }

    public Boolean studentAccountExists(String username) {
        for (UserAccount u : this.studentlist) {
            if (u.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }
    
    
    public Boolean facultyAccountExists(String username) {
        for (UserAccount u : this.facultylist) {
            if (u.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }

    public UserAccount authenticateStudentUser(String name, String password) {
        for (UserAccount ua : this.studentlist) {
            if (ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount authenticateFacultyUser(String name, String password) {
        for (UserAccount ua : this.facultylist) {
            if (ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount findStduentByUsername(String username) {
        for (UserAccount ua : this.studentlist) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }

        return null;
    }
    
    
    public UserAccount findFacultyByUsername(String username) {
        for (UserAccount ua : this.facultylist) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }

        return null;
    }
}

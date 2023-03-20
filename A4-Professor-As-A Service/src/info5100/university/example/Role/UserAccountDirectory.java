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

    ArrayList<UserAccount> useraccountlist;
//    ArrayList<UserAccount> facultylist;


    public UserAccountDirectory(Department d) {

        department = d;

       
        

    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;

    }
     
    public UserAccount createUserAccount(String username, String password, Role role) {
        UserAccount user = new UserAccount(username, password, role);
        
        useraccountlist.add(user);
        return user;
    }
    
    public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, Role role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username)) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    
      public UserAccount findByUsername(String username) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(username)) {
                return ua;
            }
        }
        
        return null;
    }
}

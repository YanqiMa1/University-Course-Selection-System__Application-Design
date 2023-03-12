/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Role;

/**
 *
 * @author kal bugrara
 */

import info5100.university.example.Persona.Person;
import info5100.university.example.workareas.Workarea;

/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    Person person;
    Workarea landingworkarea;
    static int count = 0;
    String accountId;
    String username;
    String password;
    Role role;
    
    public UserAccount(String username, String password, Role role){
        this.accountId = "user" + count++;
//        person = p;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Workarea getLandingworkarea() {
        return landingworkarea;
    }

    public void setLandingworkarea(Workarea landingworkarea) {
        this.landingworkarea = landingworkarea;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    
    
}
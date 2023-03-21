/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.College;

import info5100.university.example.Platform.Platform;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    ArrayList<Platform> departments;
    String name;
    
    public College(String name){
        departments = new ArrayList();
        this.name = name;
    }

    public static College getInstance() {
        return new College("College of Engineering");
    }
    
    public ArrayList<Platform> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Platform> departments) {
        this.departments = departments;
    }
    
    
    public Platform newDepartment(String n) {
        Platform d = new Platform(n);
        departments.add(d);
        return d;
    }
    
    public Platform findDepartment(String n){
        for (Platform d: this.departments){
            if (d.getName().equals(n)){
                return d;
            }
        }
        return null;
    }
    
    
    
}

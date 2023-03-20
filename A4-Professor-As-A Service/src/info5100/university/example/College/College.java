/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.College;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    ArrayList<Department> departments;
    String name;
    
    public College(String name){
        departments = new ArrayList();
        this.name = name;
        
    }

    public static College getInstance() {
        return new College("College of Engineering");
    }
    
    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
    
    
    public Department newDepartment(String n) {
        Department d = new Department(n);
        departments.add(d);
        return d;
    }
    
    public Department findDepartment(String n){
        for (Department d: this.departments){
            if (d.getName().equals(n)){
                return d;
            }
        }
        return null;
    }

   
    
    
    
}

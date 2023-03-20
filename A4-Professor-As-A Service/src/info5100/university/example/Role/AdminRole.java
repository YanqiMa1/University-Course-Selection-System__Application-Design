/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Role;

import info5100.university.example.College.College;
import info5100.university.example.UI.AdminWorkArea.AdminJFrame;
import info5100.university.example.UI.FacultyJFrame.FacultyJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Ma2017
 */
public class AdminRole extends Role {

    @Override
    public JFrame createWorkArea(College college, UserAccount useraccount) {
         return new AdminJFrame(college, useraccount);
    }
    
}

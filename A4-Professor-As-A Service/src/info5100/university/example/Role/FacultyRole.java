/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Role;

import info5100.university.example.College.College;
import info5100.university.example.UI.FacultyJFrame.FacultyJFrame;
import javax.swing.JFrame;

/**
 *
 * @author alilovepeach
 */
public class FacultyRole extends Role {
    @Override
    public JFrame createWorkArea(College college, UserAccount userAccount) {
        return new FacultyJFrame(college, userAccount);
    }
}
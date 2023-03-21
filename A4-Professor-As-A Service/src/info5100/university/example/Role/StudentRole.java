/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Role;


import info5100.university.example.Platform.Platform;
import info5100.university.example.UI.StudentWorkArea.StudentJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Ma2017
 */
public class StudentRole extends Role {

    @Override
    public JFrame createWorkArea(Platform pf, UserAccount userAccount) {
        return new StudentJFrame(pf, userAccount);
    }
}

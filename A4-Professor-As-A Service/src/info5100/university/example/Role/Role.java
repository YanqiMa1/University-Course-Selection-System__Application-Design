/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Role;


import info5100.university.example.Platform.Platform;
import javax.swing.JFrame;

/**
 *
 * @author Ma2017
 */
public abstract class Role {

    static String[] roles = {"Student", "Professor", "Authority"};

    public static String[] getRoles() {
        return roles;
    }

    public abstract JFrame createWorkArea(Platform pf, UserAccount useraccount);
}

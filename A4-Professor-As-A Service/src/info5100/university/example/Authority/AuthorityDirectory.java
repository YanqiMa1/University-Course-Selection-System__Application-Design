/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.university.example.Authority;

import info5100.university.example.Persona.Person;
import info5100.university.example.Platform.Platform;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class AuthorityDirectory {
    
    Platform platform;
    ArrayList<AuthorityProfile> authoritylist;

    public AuthorityDirectory(Platform p) {

        platform = p;
        authoritylist = new ArrayList<>();

    }

    public AuthorityProfile newAuthorityProfile(Person p) {

        AuthorityProfile sp = new AuthorityProfile(p);
        authoritylist.add(sp);
        return sp;
    }

    public AuthorityProfile findAuthorityProfile(String n) {

        for (AuthorityProfile ap : authoritylist) {

            if (ap.getPerson().getNameOfPerson().equals(n)) {
                return ap;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
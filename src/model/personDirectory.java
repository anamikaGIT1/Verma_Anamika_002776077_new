/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anamikaverma
 */
public class personDirectory {
    private ArrayList <person> person_directory;
    
 public personDirectory()
 {
    person_directory = new ArrayList<>();
 }

    public ArrayList<person> getperson_directory() {
        return person_directory;
    }

    public void setperson_directory(ArrayList<person> person_directory) {
        this.person_directory = person_directory;
    }
 
    public person createAndAddPerson() {
        person person = new person();
        person_directory.add(person);
        return person;
    }
    
    public void deletePerson(person person) {
        person_directory.remove(person);
    }
    public ArrayList<person> searchPatient(String key)
    {
        ArrayList<person> searchPatientDirectory = new ArrayList();
        for(person person: person_directory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<person> searchPerson(String key)
    {
        ArrayList<person> searchPersonDirectory = new ArrayList();
        for(person person: person_directory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}

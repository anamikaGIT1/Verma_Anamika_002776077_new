/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author npatel
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    public PersonDirectory(){
        this.persons = new ArrayList<>();
    }
    public ArrayList<Person> getPersonDerictory(){
        return persons;
    }  
    public void setPersonDirectory(ArrayList<Person> persons){
        this.persons = persons;
    }
    public Person addNewPerson(){
        Person newPerson = new Person();
        persons.add(newPerson);
        return newPerson;
    }
    public void deletePerson(Person person) {
        persons.remove(person);
    }
    
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: persons)
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
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: persons)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}

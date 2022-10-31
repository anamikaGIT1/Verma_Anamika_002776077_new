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
public class PatientDirectory {
    private ArrayList<Patient> patientHistory;
    private ArrayList<Person> personDirectory;
    
   // private Date lastUpdatedDate;
    
    public PatientDirectory() {
        this.patientHistory = new ArrayList<Patient>();
        this.personDirectory= new ArrayList<Person>();
        //createSampleEmpHistory();
    }

    

    public ArrayList<Patient> getPatientDIrectory() {
        return patientHistory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    


   
 
   
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personDirectory)
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
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }

// public Patient createAndAddPatient() {
//        Patient patient = new Patient();
//        patientHistory.add(patient);
//        return patient;
//    }
    public void AddNewPatient(Patient newPatient){
        //car newCar = new car();    
        patientHistory.add(newPatient);
        //return newCar;

    }
 

}

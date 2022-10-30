/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author anamikaverma
 */
public class patientDirectory {
    public ArrayList <Patient> patient = new ArrayList<>();

	 public void addPatient(Patient p) {
	        this.patient.add(p);
	    }
	 
	 public void addPerson(Patient p) {
		 this.patient.add(p);
	 }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anamikaverma
 */
public class Patient extends person {
    private int availability;
    private String DoctorName;
    
    private encounter encounter;
    
    public Patient() {
        this.encounter = new encounter();
    }
    
    public String getDoctorName() {
        return DoctorName;
    }
    
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public encounter getEncounter() {
        return encounter;
    }
    
    public void setEncounter(encounter encounter) {
        this.encounter = encounter;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.availability);
    }
}

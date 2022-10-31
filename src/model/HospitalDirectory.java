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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;
    
    public HospitalDirectory(){
        this.hospitals = new ArrayList<>();
    }
    public ArrayList<Hospital> getHospitalDirectory(){
        return hospitals;
    }  
    public void setHospitalDirectory(ArrayList<Hospital> hospitals){
        this.hospitals = hospitals;
    }
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        hospitals.add(newHospital);
        return newHospital;
    }
}

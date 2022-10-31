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
public class EncounterHistory {
    private ArrayList<Encounter> encounter;
    
    public EncounterHistory(){
        this.encounter = new ArrayList<>();
    }
    public ArrayList<Encounter> getEncounterHistory(){
        return encounter;
    }  
    public void setEncounterHistory(ArrayList<Encounter> encounter){
        this.encounter = encounter;
    }
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounter.add(newEncounter);
        return newEncounter;
    }
}

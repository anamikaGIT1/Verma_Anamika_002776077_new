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
public class encounter {
    vitalSigns vitals;
   
    public ArrayList<vitalSigns> encounterhistory;

    
    public encounter() {
        
        encounterhistory= new ArrayList<>();
        this.vitals = new vitalSigns();
        
      }

    public ArrayList<vitalSigns> getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(ArrayList<vitalSigns> encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    public vitalSigns createvitals()
    {  
    vitalSigns vital = new vitalSigns();
    encounterhistory.add(vital);
    return vital;
    }

    
    public void deleteVitalSign(vitalSigns vitalSign) {
        encounterhistory.remove(vitalSign);
    }
    
    public vitalSigns getVitalSigns(){
        return this.vitals;
    }
    
    public vitalSigns setVitalSigns(vitalSigns vi){
        return  this.vitals = vi;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author npatel
 */
public class Encounter {
    private float billingInfo;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();    
    private String treatement;
    private int noEncounter;

    public float getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(float billingInfo) {
        this.billingInfo = billingInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNoEncounter() {
        return noEncounter;
    }

    public void setNoEncounter(int noEncounter) {
        this.noEncounter = noEncounter;
    }

        
    public String getTreatementName() {
        return treatement;
    }

    public void setTreatementName(String treatement) {
        this.treatement = treatement;
    } 
    
}

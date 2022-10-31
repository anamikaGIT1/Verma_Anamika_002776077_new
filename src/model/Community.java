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
public class Community {
    private String communityName;
    private int houseNo;
    private ArrayList<House> houses;

    public int getHouse() {
        return houseNo;
    }

    public void setHouse(int houseNo) {
        this.houseNo = houseNo;
    }
    public String getCommunity() {
        return communityName;
    }

    public void setCommunity(String communityName) {
        this.communityName = communityName;
    }
    public Community(){
        this.houses = new ArrayList<>();
    }
    public ArrayList<House> getHistory(){
        return houses;
    }  
    public void setHistory(ArrayList<House> houses){
        this.houses = houses;
    }
    public House addNewHouse(){
        House newHouse = new House();
        houses.add(newHouse);
        return newHouse;
        
    }
    @Override
    public String toString(){
        return communityName;
        
    }
}

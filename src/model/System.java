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
public class System {
    
    private ArrayList<City> city;
    
    public System(){
        this.city = new ArrayList<>();
    }
    public ArrayList<City> getHistory(){
        return city;
    }  
    public void setHistory(ArrayList<City> city){
        this.city = city;
    }
    public City addNewCity(){
        City newCity = new City();
        city.add(newCity);
        return newCity;
    }
}

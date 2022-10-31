/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author npatel
 */
public class House {
    private int houseNo;

    public int getHouse() {
        return houseNo;
    }

    public void setHouse(int houseNo) {
        this.houseNo = houseNo;
    }
    @Override
    public String toString(){
        return String.valueOf(houseNo);
        
    }
}

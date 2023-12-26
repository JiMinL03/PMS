package com.mycompany.pms.GUI.DTO;

public class ClientDTO {

    private String ID;
    private String password;
    private int usingTime;
    private int remainingTime;
    private int chargingTime;
    private int seat;

    
    public ClientDTO(){
        
    }
    public ClientDTO(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public ClientDTO(String ID, String password, int chargingTime, int usingTime, int remainingTime, int seat) {
        this.ID = ID;
        this.password = password;
        this.chargingTime = chargingTime;
        this.remainingTime = remainingTime;
        this.usingTime = usingTime;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return ID +','+ password +','+ chargingTime +','+ usingTime +','+ remainingTime +','+ seat +'\n';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(int usingTime) {
        this.usingTime = usingTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }

    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
}

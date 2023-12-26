package com.mycompany.pms.GUI.DTO;

public class ClientDTO {

    private String ID;
    private String password;
    private String usingTime;
    private String chargingTime;
    private int seat;

    public ClientDTO() {

    }

    public ClientDTO(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public ClientDTO(String ID, String password, String chargingTime, String usingTime, int seat) {
        this.ID = ID;
        this.password = password;
        this.chargingTime = chargingTime;
        this.usingTime = usingTime;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return ID + ',' + password + ',' + chargingTime + ',' + usingTime + ',' + seat;
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

    public String getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(String usingTime) {
        this.usingTime = usingTime;
    }

    public String getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}

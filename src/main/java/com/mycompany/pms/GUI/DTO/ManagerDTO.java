package com.mycompany.pms.GUI.DTO;

public class ManagerDTO {

    private String ID;
    private String password;

    public ManagerDTO(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ManagerDTO{" + "ID=" + ID + ", password=" + password + '}';
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

}

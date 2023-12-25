/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pms.GUI.DAO;

import com.mycompany.pms.GUI.DTO.ClientDTO;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author LG
 */
public class ChargingTimeDAO {

    private String clientFile = "Client.txt";

    public boolean readChargingTime(ClientDTO client, String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(clientFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(","); // txt파일에 저장되어있는 아이디와 비밀번호를 나눠서 저장.
                if (id.equals(userInfo[0])) {
                    if(!"0".equals(userInfo[2])){
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ChargingTimeDAO ERROR");
        }
        return false;
    }
}

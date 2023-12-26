package com.mycompany.pms.GUI.DAO;

import com.mycompany.pms.GUI.DTO.ClientDTO;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ChargingTimeDAO {

    private String clientFile = "Client.txt";

    public boolean readChargingTime(ClientDTO client, String id) { //회원 이용시간이 있는지 확인하는 메서드
        try (BufferedReader reader = new BufferedReader(new FileReader(clientFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(","); // txt파일에 저장되어있는 아이디와 비밀번호를 나눠서 저장.
                if (id.equals(userInfo[0])) {
                    if (!"0".equals(userInfo[2])) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ChargingTimeDAO ERROR");
        }
        return false;
    }

    public boolean inputSelectedTime(String ID, String time) { //이용시간을 변경
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(clientFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (ID.equals(userInfo[0])) {
                    userInfo[2] = time;
                    line = String.join(",", userInfo);// 변경된 배열을 다시 문자열로 조합
                }
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("ChargingTimeDAO ERROR");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(clientFile))) {
            for (String lineToWrite : lines) {
                writer.write(lineToWrite);
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("ChargingTimeDAO ERROR");
        }
        return true;
    }
}

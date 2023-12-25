package com.mycompany.pms.GUI.DAO;

import com.mycompany.pms.GUI.DTO.ClientDTO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MembershipDAO {

    private String clientFile = "Client.txt";

    public boolean checkOverlap(String ID) { //입력하려는 정보의 중복확인
        File file = new File(clientFile);
        if (file.length() == 0) {//텍스트파일이 공백일 때 
            return true;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(clientFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String userInfo[] = line.split(",");

                if (ID.equals(userInfo[0])) { //입력받은 ID와 텍스트파일의 ID와 중복되는게 없는 경우
                    return false;
                }

            }
        } catch (Exception e) {
            System.out.println("MembershipDAO ERROR");
        }
        return true;
    }

    public boolean inputIDandPW(ClientDTO client) { //Client.txt 파일에 아이디, 비번 정보 입력
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(clientFile, true))) {
            writer.write(client.toString());
            writer.newLine();
            return true;
        } catch (Exception e) {
            System.out.println("MembershipDAO ERROR");
        }
        return false;
    }
}

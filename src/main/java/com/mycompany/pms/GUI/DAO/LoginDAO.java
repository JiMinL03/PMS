package com.mycompany.pms.GUI.DAO;

import com.mycompany.pms.GUI.DTO.ClientDTO;
import com.mycompany.pms.GUI.DTO.ManagerDTO;
import java.io.*;

public class LoginDAO {

    private String clientFile = "Client.txt";
    private String managerFile = "Manager.txt";

    //Client.txt파일에서 ID,Password 확인
    public boolean readClienttxt(ClientDTO client) {
        //새 객체를 생성하면 DTO내용이 다 초기화 됨. 따라서 매개변수로 넣어줌
        String cLine;
        try (BufferedReader cReader = new BufferedReader(new FileReader(clientFile))) {
            while ((cLine = cReader.readLine()) != null) {
                String[] userInfo = cLine.split(","); // txt파일에 저장되어있는 아이디와 비밀번호를 나눠서 저장.
                if (userInfo[0].equals(client.getID()) && userInfo[1].equals(client.getPassword())) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("LoginDAO ERROR");
        }
        return false;
    }
    //Manager.txt파일에서 ID, Password 확인
    public boolean readManagertxt(ManagerDTO manager) {
        String mLine;
        try (BufferedReader mReader = new BufferedReader(new FileReader(managerFile))) {
            while ((mLine = mReader.readLine()) != null) {
                String[] userInfo = mLine.split(","); // txt파일에 저장되어있는 아이디와 비밀번호를 나눠서 저장.
                if (userInfo[0].equals(manager.getID()) && userInfo[1].equals(manager.getPassword())) {
                    return true;
                }
            }
        }
        catch(Exception e){
            System.out.println("LoginDAO ERROR");
        }
        return false;
    }
}

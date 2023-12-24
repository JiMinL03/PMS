package com.mycompany.pms.GUI.Login;

import com.mycompany.pms.GUI.DTO.ClientDTO;
import java.io.*;

public class LoginDAO {

    private String fileName = "Client.txt";

    public boolean readLogintxt(ClientDTO client) {//!!!!!!!!!!!!!!!!!!!!!중요함 별 다섯개임 새 객체를 생성하면 다 초기화된다잉
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(","); // txt파일에 저장되어있는 아이디와 비밀번호를 나눠서 저장.
                System.out.printf("%s, %s", client.getID(),client.getPassword());//null,null오류!
                if(userInfo[0].equals(client.getID()) && userInfo[1].equals(client.getPassword())){
                    return true;
                }
                else 
                    return false;
            }
        } catch (Exception e) {
            System.out.println("loginDAO ERROR");
            return false;
        }
        return true;
    }
}

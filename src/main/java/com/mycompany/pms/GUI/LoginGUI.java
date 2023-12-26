package com.mycompany.pms.GUI;

import com.mycompany.pms.GUI.DAO.ChargingTimeDAO;
import com.mycompany.pms.GUI.DTO.ClientDTO;
import com.mycompany.pms.GUI.DTO.ManagerDTO;
import com.mycompany.pms.GUI.DAO.LoginDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class LoginGUI extends javax.swing.JFrame {

    private String id;
    private String pw;
    private String usingTime = "00:00";
    private String chargingTime = "00:00";
    private int seat = 0;

    LoginDAO login = new LoginDAO();
    ChargingTimeDAO charging = new ChargingTimeDAO();

    public LoginGUI() {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        ID = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        membershipButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("한컴 고딕", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("로그인");

        jLabel2.setFont(new java.awt.Font("한컴 고딕", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("비밀번호");

        password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        ID.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N

        startButton.setBackground(new java.awt.Color(52, 100, 174));
        startButton.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("사용시작");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        membershipButton.setBackground(new java.awt.Color(216, 216, 216));
        membershipButton.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        membershipButton.setText("회원가입");
        membershipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("LG Smart UI SemiBold", 1, 18)); // NOI18N
        jLabel3.setText("짐인플레이 회원은 플레이 아이디로 로그인 해주세요.");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(membershipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(membershipButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        id = ID.getText();
        pw = password.getText();

        ClientDTO client = new ClientDTO(id, pw, chargingTime, usingTime, seat);
        ManagerDTO manager = new ManagerDTO(id, pw);

        if (login.readClienttxt(client) && charging.readChargingTime(client, id)) { //회원이고, 이용시간이 0이 아닐 때 메뉴화면 이동
            MainGUI main = new MainGUI(id);
            main.setVisible(true);
            dispose();
        } else if (login.readClienttxt(client) && !charging.readChargingTime(client, id)) { //회원이고, 이용시간이 0일 때 충전화면 이동
            ChargingTimeGUI time = new ChargingTimeGUI(id);
            time.setVisible(true);
            dispose();
        } else if (login.readManagertxt(manager)) {

        } else
            JOptionPane.showMessageDialog(
                    null, "로그인 정보가 틀렸습니다.");
    }//GEN-LAST:event_startButtonActionPerformed

    private void membershipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipButtonActionPerformed
        MembershipGUI member = new MembershipGUI();
        member.setVisible(true);
        dispose();
    }//GEN-LAST:event_membershipButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton membershipButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}

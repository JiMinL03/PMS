package com.mycompany.pms.GUI;

import com.mycompany.pms.GUI.DAO.ChargingTimeDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ChargingTimeGUI extends javax.swing.JFrame {

    private static String time;
    private static String ID;
    private static String seat;
    ChargingTimeDAO chargingtime = new ChargingTimeDAO();

    public ChargingTimeGUI() {
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        choiceTime();
    }

    public ChargingTimeGUI(String seat, String time) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        choiceTime();
        this.seat = seat;
        this.time = time;
        selectedTime.setText(time);
        selectedSeat.setText(seat);
    }

    public ChargingTimeGUI(String ID) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        choiceTime();
        this.ID = ID;
    }

    private void choiceTime() {
        threeHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "03:00";
                selectedTime.setText(time);
            }
        });
        fiveHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "05:00";
                selectedTime.setText(time);
            }
        });
        thirteenHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "13:00";
                selectedTime.setText(time);
            }
        });
        oneHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "01:00";
                selectedTime.setText(time);
            }
        });
        twoHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "02:00";
                selectedTime.setText(time);
            }
        });
        fourHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "04:00";
                selectedTime.setText(time);
            }
        });
        twentyHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "20:00";
                selectedTime.setText(time);
            }
        });
        twentyfiveHourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time = "25:00";
                selectedTime.setText(time);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        twoHourButton = new javax.swing.JButton();
        threeHourButton = new javax.swing.JButton();
        fiveHourButton = new javax.swing.JButton();
        oneHourButton = new javax.swing.JButton();
        thirteenHourButton = new javax.swing.JButton();
        twentyfiveHourButton = new javax.swing.JButton();
        twentyHourButton = new javax.swing.JButton();
        fourHourButton = new javax.swing.JButton();
        cardButton = new javax.swing.JButton();
        cashButton = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedTime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        selectedSeat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(786, 600));

        jLabel3.setFont(new java.awt.Font("LG Smart UI SemiBold", 1, 18)); // NOI18N
        jLabel3.setText("안녕하세요. 사용할 요금제를 선택해주세요.");
        jLabel3.setToolTipText("");

        twoHourButton.setBackground(new java.awt.Color(52, 100, 174));
        twoHourButton.setForeground(new java.awt.Color(255, 255, 255));
        twoHourButton.setText("2,000원 02:00");

        threeHourButton.setBackground(new java.awt.Color(52, 100, 174));
        threeHourButton.setForeground(new java.awt.Color(255, 255, 255));
        threeHourButton.setText("3,000원 03:00");

        fiveHourButton.setBackground(new java.awt.Color(52, 100, 174));
        fiveHourButton.setForeground(new java.awt.Color(255, 255, 255));
        fiveHourButton.setText("5,000원 05:00");

        oneHourButton.setBackground(new java.awt.Color(52, 100, 174));
        oneHourButton.setForeground(new java.awt.Color(255, 255, 255));
        oneHourButton.setText("1,000원 01:00");

        thirteenHourButton.setBackground(new java.awt.Color(52, 100, 174));
        thirteenHourButton.setForeground(new java.awt.Color(255, 255, 255));
        thirteenHourButton.setText("10,000원 13:00");

        twentyfiveHourButton.setBackground(new java.awt.Color(52, 100, 174));
        twentyfiveHourButton.setForeground(new java.awt.Color(255, 255, 255));
        twentyfiveHourButton.setText("20,000원 25:00");

        twentyHourButton.setBackground(new java.awt.Color(52, 100, 174));
        twentyHourButton.setForeground(new java.awt.Color(255, 255, 255));
        twentyHourButton.setText("15,000원 20:00");

        fourHourButton.setBackground(new java.awt.Color(52, 100, 174));
        fourHourButton.setForeground(new java.awt.Color(255, 255, 255));
        fourHourButton.setText("4,000원 04:00");

        cardButton.setBackground(new java.awt.Color(255, 255, 255));
        cardButton.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        cardButton.setForeground(new java.awt.Color(0, 153, 255));
        cardButton.setText("신용카드");
        cardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardButtonActionPerformed(evt);
            }
        });

        cashButton.setBackground(new java.awt.Color(255, 255, 255));
        cashButton.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        cashButton.setForeground(new java.awt.Color(0, 153, 255));
        cashButton.setText("현금");
        cashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashButtonActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 153, 255));
        jButton11.setText("좌석보기");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 153, 255));
        jButton12.setText("잔돈반환");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("선택한 요금제");

        selectedTime.setEditable(false);
        selectedTime.setBackground(new java.awt.Color(255, 255, 255));
        selectedTime.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        selectedTime.setForeground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("선택한 좌석");

        selectedSeat.setEditable(false);
        selectedSeat.setBackground(new java.awt.Color(255, 255, 255));
        selectedSeat.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        selectedSeat.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel3)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(fiveHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(twoHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fourHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thirteenHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(oneHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(twentyHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(twentyfiveHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectedTime)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(threeHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(602, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(fiveHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(selectedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(selectedSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirteenHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twentyHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyfiveHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(threeHourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        JOptionPane.showMessageDialog(
                null, "잔돈이 반환되었습니다.");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardButtonActionPerformed
        if (chargingtime.inputSelectedTime(ID, time, seat) && !selectedTime.getText().isEmpty() && !selectedSeat.getText().isEmpty()) {
            selectedSeat.setText(seat + "");
            JOptionPane.showMessageDialog(
                    null, "시간이 충전되었습니다.");
            MainGUI main = new MainGUI();
            main.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(
                    null, "요금제와 좌석을 선택해주세요.");
        }
    }//GEN-LAST:event_cardButtonActionPerformed

    private void cashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashButtonActionPerformed
        if (chargingtime.inputSelectedTime(ID, time, seat) && !selectedTime.getText().isEmpty() && !selectedSeat.getText().isEmpty()) {
            selectedSeat.setText(seat + "");
            JOptionPane.showMessageDialog(
                    null, "시간이 충전되었습니다.");
            MainGUI main = new MainGUI();
            main.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(
                    null, "요금제와 좌석을 선택해주세요.");
        }
    }//GEN-LAST:event_cashButtonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        seatGUI seat = new seatGUI(time);
        seat.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardButton;
    private javax.swing.JButton cashButton;
    private javax.swing.JButton fiveHourButton;
    private javax.swing.JButton fourHourButton;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton oneHourButton;
    private javax.swing.JTextField selectedSeat;
    private javax.swing.JTextField selectedTime;
    private javax.swing.JButton thirteenHourButton;
    private javax.swing.JButton threeHourButton;
    private javax.swing.JButton twentyHourButton;
    private javax.swing.JButton twentyfiveHourButton;
    private javax.swing.JButton twoHourButton;
    // End of variables declaration//GEN-END:variables
}

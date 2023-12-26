package com.mycompany.pms.GUI;

import java.awt.Color;

public class MainGUI extends javax.swing.JFrame {

    private static String id;

    public MainGUI() {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public MainGUI(String id) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chargingTimeButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chargingTimeButton.setBackground(new java.awt.Color(0, 102, 255));
        chargingTimeButton.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        chargingTimeButton.setForeground(new java.awt.Color(255, 255, 255));
        chargingTimeButton.setText("시간 충전");
        chargingTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargingTimeButtonActionPerformed(evt);
            }
        });

        menuButton.setBackground(new java.awt.Color(0, 102, 255));
        menuButton.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("음식 주문");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("이용 종료");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chargingTimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(chargingTimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chargingTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargingTimeButtonActionPerformed
        ChargingTimeGUI chargingtime = new ChargingTimeGUI(id);
        chargingtime.setVisible(true);
        dispose();
    }//GEN-LAST:event_chargingTimeButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        MenuGUI menu = new MenuGUI();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chargingTimeButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton menuButton;
    // End of variables declaration//GEN-END:variables
}

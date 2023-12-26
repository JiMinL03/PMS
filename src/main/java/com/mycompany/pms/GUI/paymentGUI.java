package com.mycompany.pms.GUI;

import java.awt.Color;

public class paymentGUI extends javax.swing.JFrame {

    public paymentGUI(String time) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        
        selectedTime.setText(time);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        selectedTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("LG Smart UI SemiBold", 1, 18)); // NOI18N
        jLabel3.setText("회원님이 선택하신 요금제");
        jLabel3.setToolTipText("");

        selectedTime.setBackground(new java.awt.Color(255, 255, 255));
        selectedTime.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        selectedTime.setForeground(new java.awt.Color(0, 102, 255));
        selectedTime.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(selectedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField selectedTime;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.pms.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class seatGUI extends javax.swing.JFrame implements ActionListener{
    private static String selectedSeat;
    private static String time;
    public seatGUI(String time) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setResizable(false);
        selectedSeat();
        this.time = time;
    }

    private void selectedSeat() {
        JButton[] seatButtons = {
            butt1, butt2, butt3, butt4, butt5,
            butt6, butt7, butt8, butt9, butt10,
            butt11, butt12, butt13, butt14, butt15,
            butt16, butt17, butt18, butt18, butt20,
            butt21, butt22, butt23, butt24, butt25,
            butt26, butt27, butt28, butt29, butt30,
            butt31, butt32, butt33, butt34, butt35,
            butt36, butt37, butt38, butt39, butt40,
            butt41, butt42, butt43, butt44, butt45,
            butt46, butt47, butt48, butt49, butt50,
            butt51, butt52, butt53, butt54};
        for (JButton seat : seatButtons) {
            seat.addActionListener(this);
        }
        
    }
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        selectedSeat = clickedButton.getText();
        selected.setText(selectedSeat);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butt2 = new javax.swing.JButton();
        butt1 = new javax.swing.JButton();
        butt3 = new javax.swing.JButton();
        butt10 = new javax.swing.JButton();
        butt11 = new javax.swing.JButton();
        butt12 = new javax.swing.JButton();
        butt19 = new javax.swing.JButton();
        butt20 = new javax.swing.JButton();
        butt21 = new javax.swing.JButton();
        butt28 = new javax.swing.JButton();
        butt29 = new javax.swing.JButton();
        butt30 = new javax.swing.JButton();
        butt37 = new javax.swing.JButton();
        butt38 = new javax.swing.JButton();
        butt39 = new javax.swing.JButton();
        butt46 = new javax.swing.JButton();
        butt47 = new javax.swing.JButton();
        butt48 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        butt50 = new javax.swing.JButton();
        butt4 = new javax.swing.JButton();
        butt5 = new javax.swing.JButton();
        butt13 = new javax.swing.JButton();
        butt14 = new javax.swing.JButton();
        butt22 = new javax.swing.JButton();
        butt23 = new javax.swing.JButton();
        butt31 = new javax.swing.JButton();
        butt32 = new javax.swing.JButton();
        butt40 = new javax.swing.JButton();
        butt41 = new javax.swing.JButton();
        butt49 = new javax.swing.JButton();
        butt53 = new javax.swing.JButton();
        butt7 = new javax.swing.JButton();
        butt6 = new javax.swing.JButton();
        butt8 = new javax.swing.JButton();
        butt15 = new javax.swing.JButton();
        butt16 = new javax.swing.JButton();
        butt17 = new javax.swing.JButton();
        butt24 = new javax.swing.JButton();
        butt25 = new javax.swing.JButton();
        butt26 = new javax.swing.JButton();
        butt33 = new javax.swing.JButton();
        butt34 = new javax.swing.JButton();
        butt35 = new javax.swing.JButton();
        butt42 = new javax.swing.JButton();
        butt43 = new javax.swing.JButton();
        butt44 = new javax.swing.JButton();
        butt51 = new javax.swing.JButton();
        butt52 = new javax.swing.JButton();
        butt54 = new javax.swing.JButton();
        butt9 = new javax.swing.JButton();
        butt18 = new javax.swing.JButton();
        butt27 = new javax.swing.JButton();
        butt36 = new javax.swing.JButton();
        butt45 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        selected = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        butt2.setBackground(new java.awt.Color(204, 204, 204));
        butt2.setForeground(new java.awt.Color(102, 102, 102));
        butt2.setText("2");

        butt1.setBackground(new java.awt.Color(204, 204, 204));
        butt1.setForeground(new java.awt.Color(102, 102, 102));
        butt1.setText("1");
        butt1.setToolTipText("");

        butt3.setBackground(new java.awt.Color(204, 204, 204));
        butt3.setForeground(new java.awt.Color(102, 102, 102));
        butt3.setText("3");

        butt10.setBackground(new java.awt.Color(204, 204, 204));
        butt10.setForeground(new java.awt.Color(102, 102, 102));
        butt10.setText("10");

        butt11.setBackground(new java.awt.Color(204, 204, 204));
        butt11.setForeground(new java.awt.Color(102, 102, 102));
        butt11.setText("11");

        butt12.setBackground(new java.awt.Color(204, 204, 204));
        butt12.setForeground(new java.awt.Color(102, 102, 102));
        butt12.setText("12");

        butt19.setBackground(new java.awt.Color(204, 204, 204));
        butt19.setForeground(new java.awt.Color(102, 102, 102));
        butt19.setText("19");

        butt20.setBackground(new java.awt.Color(204, 204, 204));
        butt20.setForeground(new java.awt.Color(102, 102, 102));
        butt20.setText("20");

        butt21.setBackground(new java.awt.Color(204, 204, 204));
        butt21.setForeground(new java.awt.Color(102, 102, 102));
        butt21.setText("21");

        butt28.setBackground(new java.awt.Color(204, 204, 204));
        butt28.setForeground(new java.awt.Color(102, 102, 102));
        butt28.setText("28");

        butt29.setBackground(new java.awt.Color(204, 204, 204));
        butt29.setForeground(new java.awt.Color(102, 102, 102));
        butt29.setText("29");

        butt30.setBackground(new java.awt.Color(204, 204, 204));
        butt30.setForeground(new java.awt.Color(102, 102, 102));
        butt30.setText("30");

        butt37.setBackground(new java.awt.Color(204, 204, 204));
        butt37.setForeground(new java.awt.Color(102, 102, 102));
        butt37.setText("37");
        butt37.setToolTipText("");

        butt38.setBackground(new java.awt.Color(204, 204, 204));
        butt38.setForeground(new java.awt.Color(102, 102, 102));
        butt38.setText("38");

        butt39.setBackground(new java.awt.Color(204, 204, 204));
        butt39.setForeground(new java.awt.Color(102, 102, 102));
        butt39.setText("39");
        butt39.setToolTipText("");

        butt46.setBackground(new java.awt.Color(204, 204, 204));
        butt46.setForeground(new java.awt.Color(102, 102, 102));
        butt46.setText("46");

        butt47.setBackground(new java.awt.Color(204, 204, 204));
        butt47.setForeground(new java.awt.Color(102, 102, 102));
        butt47.setText("47");

        butt48.setBackground(new java.awt.Color(204, 204, 204));
        butt48.setForeground(new java.awt.Color(102, 102, 102));
        butt48.setText("48");

        jLabel3.setFont(new java.awt.Font("LG Smart UI SemiBold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("좌석을 선택해주세요.");
        jLabel3.setToolTipText("");

        butt50.setBackground(new java.awt.Color(204, 204, 204));
        butt50.setForeground(new java.awt.Color(102, 102, 102));
        butt50.setText("50");

        butt4.setBackground(new java.awt.Color(204, 204, 204));
        butt4.setForeground(new java.awt.Color(102, 102, 102));
        butt4.setText("4");

        butt5.setBackground(new java.awt.Color(204, 204, 204));
        butt5.setForeground(new java.awt.Color(102, 102, 102));
        butt5.setText("5");

        butt13.setBackground(new java.awt.Color(204, 204, 204));
        butt13.setForeground(new java.awt.Color(102, 102, 102));
        butt13.setText("13");

        butt14.setBackground(new java.awt.Color(204, 204, 204));
        butt14.setForeground(new java.awt.Color(102, 102, 102));
        butt14.setText("14");

        butt22.setBackground(new java.awt.Color(204, 204, 204));
        butt22.setForeground(new java.awt.Color(102, 102, 102));
        butt22.setText("22");

        butt23.setBackground(new java.awt.Color(204, 204, 204));
        butt23.setForeground(new java.awt.Color(102, 102, 102));
        butt23.setText("23");

        butt31.setBackground(new java.awt.Color(204, 204, 204));
        butt31.setForeground(new java.awt.Color(102, 102, 102));
        butt31.setText("31");

        butt32.setBackground(new java.awt.Color(204, 204, 204));
        butt32.setForeground(new java.awt.Color(102, 102, 102));
        butt32.setText("32");

        butt40.setBackground(new java.awt.Color(204, 204, 204));
        butt40.setForeground(new java.awt.Color(102, 102, 102));
        butt40.setText("40");

        butt41.setBackground(new java.awt.Color(204, 204, 204));
        butt41.setForeground(new java.awt.Color(102, 102, 102));
        butt41.setText("41");

        butt49.setBackground(new java.awt.Color(204, 204, 204));
        butt49.setForeground(new java.awt.Color(102, 102, 102));
        butt49.setText("49");
        butt49.setToolTipText("");

        butt53.setBackground(new java.awt.Color(204, 204, 204));
        butt53.setForeground(new java.awt.Color(102, 102, 102));
        butt53.setText("53");

        butt7.setBackground(new java.awt.Color(204, 204, 204));
        butt7.setForeground(new java.awt.Color(102, 102, 102));
        butt7.setText("7");

        butt6.setBackground(new java.awt.Color(204, 204, 204));
        butt6.setForeground(new java.awt.Color(102, 102, 102));
        butt6.setText("6");
        butt6.setToolTipText("");

        butt8.setBackground(new java.awt.Color(204, 204, 204));
        butt8.setForeground(new java.awt.Color(102, 102, 102));
        butt8.setText("8");

        butt15.setBackground(new java.awt.Color(204, 204, 204));
        butt15.setForeground(new java.awt.Color(102, 102, 102));
        butt15.setText("15");

        butt16.setBackground(new java.awt.Color(204, 204, 204));
        butt16.setForeground(new java.awt.Color(102, 102, 102));
        butt16.setText("16");

        butt17.setBackground(new java.awt.Color(204, 204, 204));
        butt17.setForeground(new java.awt.Color(102, 102, 102));
        butt17.setText("17");

        butt24.setBackground(new java.awt.Color(204, 204, 204));
        butt24.setForeground(new java.awt.Color(102, 102, 102));
        butt24.setText("24");

        butt25.setBackground(new java.awt.Color(204, 204, 204));
        butt25.setForeground(new java.awt.Color(102, 102, 102));
        butt25.setText("25");

        butt26.setBackground(new java.awt.Color(204, 204, 204));
        butt26.setForeground(new java.awt.Color(102, 102, 102));
        butt26.setText("26");

        butt33.setBackground(new java.awt.Color(204, 204, 204));
        butt33.setForeground(new java.awt.Color(102, 102, 102));
        butt33.setText("33");

        butt34.setBackground(new java.awt.Color(204, 204, 204));
        butt34.setForeground(new java.awt.Color(102, 102, 102));
        butt34.setText("34");

        butt35.setBackground(new java.awt.Color(204, 204, 204));
        butt35.setForeground(new java.awt.Color(102, 102, 102));
        butt35.setText("35");

        butt42.setBackground(new java.awt.Color(204, 204, 204));
        butt42.setForeground(new java.awt.Color(102, 102, 102));
        butt42.setText("42");

        butt43.setBackground(new java.awt.Color(204, 204, 204));
        butt43.setForeground(new java.awt.Color(102, 102, 102));
        butt43.setText("43");

        butt44.setBackground(new java.awt.Color(204, 204, 204));
        butt44.setForeground(new java.awt.Color(102, 102, 102));
        butt44.setText("44");

        butt51.setBackground(new java.awt.Color(204, 204, 204));
        butt51.setForeground(new java.awt.Color(102, 102, 102));
        butt51.setText("51");

        butt52.setBackground(new java.awt.Color(204, 204, 204));
        butt52.setForeground(new java.awt.Color(102, 102, 102));
        butt52.setText("52");

        butt54.setBackground(new java.awt.Color(204, 204, 204));
        butt54.setForeground(new java.awt.Color(102, 102, 102));
        butt54.setText("54");

        butt9.setBackground(new java.awt.Color(204, 204, 204));
        butt9.setForeground(new java.awt.Color(102, 102, 102));
        butt9.setText("9");

        butt18.setBackground(new java.awt.Color(204, 204, 204));
        butt18.setForeground(new java.awt.Color(102, 102, 102));
        butt18.setText("18");

        butt27.setBackground(new java.awt.Color(204, 204, 204));
        butt27.setForeground(new java.awt.Color(102, 102, 102));
        butt27.setText("27");

        butt36.setBackground(new java.awt.Color(204, 204, 204));
        butt36.setForeground(new java.awt.Color(102, 102, 102));
        butt36.setText("36");

        butt45.setBackground(new java.awt.Color(204, 204, 204));
        butt45.setForeground(new java.awt.Color(102, 102, 102));
        butt45.setText("45");

        jLabel4.setFont(new java.awt.Font("LG Smart UI SemiBold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("선택된 좌석 ");
        jLabel4.setToolTipText("");

        selected.setEditable(false);
        selected.setBackground(new java.awt.Color(0, 102, 255));
        selected.setFont(new java.awt.Font("한컴 고딕", 0, 18)); // NOI18N
        selected.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("LG Smart UI SemiBold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 255));
        jButton1.setText("눌러주세요.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel3)
                        .addGap(355, 355, 355))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt46, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt47, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt48, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(butt37, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(butt38, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(butt39, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(butt28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(butt29, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(butt30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt49, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt50, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(butt40, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(butt41, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(butt31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(butt32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt25, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt26, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(butt42, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(butt43, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(butt44, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(butt33, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(butt34, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(butt35, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(butt54, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butt27, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butt18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(butt45, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(butt36, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(selected, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butt51, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt52, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(butt53, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt30, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt37, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt38, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt39, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt46, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt47, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt48, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt31, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt32, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt40, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt41, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt49, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt50, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt24, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt25, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt33, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt34, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt35, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt42, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt43, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt44, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt51, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt52, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt53, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(butt18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(butt27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(butt36, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(butt45, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(butt54, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selected, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ChargingTimeGUI chargingtime = new ChargingTimeGUI(selected.getText(), time);
        chargingtime.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt1;
    private javax.swing.JButton butt10;
    private javax.swing.JButton butt11;
    private javax.swing.JButton butt12;
    private javax.swing.JButton butt13;
    private javax.swing.JButton butt14;
    private javax.swing.JButton butt15;
    private javax.swing.JButton butt16;
    private javax.swing.JButton butt17;
    private javax.swing.JButton butt18;
    private javax.swing.JButton butt19;
    private javax.swing.JButton butt2;
    private javax.swing.JButton butt20;
    private javax.swing.JButton butt21;
    private javax.swing.JButton butt22;
    private javax.swing.JButton butt23;
    private javax.swing.JButton butt24;
    private javax.swing.JButton butt25;
    private javax.swing.JButton butt26;
    private javax.swing.JButton butt27;
    private javax.swing.JButton butt28;
    private javax.swing.JButton butt29;
    private javax.swing.JButton butt3;
    private javax.swing.JButton butt30;
    private javax.swing.JButton butt31;
    private javax.swing.JButton butt32;
    private javax.swing.JButton butt33;
    private javax.swing.JButton butt34;
    private javax.swing.JButton butt35;
    private javax.swing.JButton butt36;
    private javax.swing.JButton butt37;
    private javax.swing.JButton butt38;
    private javax.swing.JButton butt39;
    private javax.swing.JButton butt4;
    private javax.swing.JButton butt40;
    private javax.swing.JButton butt41;
    private javax.swing.JButton butt42;
    private javax.swing.JButton butt43;
    private javax.swing.JButton butt44;
    private javax.swing.JButton butt45;
    private javax.swing.JButton butt46;
    private javax.swing.JButton butt47;
    private javax.swing.JButton butt48;
    private javax.swing.JButton butt49;
    private javax.swing.JButton butt5;
    private javax.swing.JButton butt50;
    private javax.swing.JButton butt51;
    private javax.swing.JButton butt52;
    private javax.swing.JButton butt53;
    private javax.swing.JButton butt54;
    private javax.swing.JButton butt6;
    private javax.swing.JButton butt7;
    private javax.swing.JButton butt8;
    private javax.swing.JButton butt9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField selected;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.pms.GUI.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class TimerDAO implements Runnable {

    private int[] time = new int[2];
    private Thread timerThread;
    private String clientFile = "Client.txt";
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private boolean timer = false;
    
    public int timer(String ID) {
        try (BufferedReader reader = new BufferedReader(new FileReader(clientFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (ID.equals(userInfo[0])) {
                    String[] timeComponents = userInfo[2].split(":");
                    time[0] = Integer.parseInt(timeComponents[0]);
                    time[1] = Integer.parseInt(timeComponents[1]);
                    seconds = time[0] * 3600 + time[1] * 60;
                }
            }
        } catch (Exception e) {
            System.out.println("timer error");
        }
        return seconds;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);

                if (timer) {
                    getCurrentTime();
                    System.out.printf("%s", getCurrentTime());
                }
            } catch (InterruptedException e) {
                System.out.println("타이머 스레드 중단됨");
                // InterruptedException이 발생하면 쓰레드 종료
                return;
            } catch (Exception e) {
                System.out.println("타이머 오류");
            }
        }
    }

    public void startTimer() {
        timer = true;
        // 기존 쓰레드가 있다면 중지
        if (timerThread != null && timerThread.isAlive()) {
            timerThread.interrupt();
        }

        // 새로운 쓰레드 시작
        timerThread = new Thread(this);
        timerThread.start();
    }

    public void stopTimer() {
        timer = true;
        // 현재 실행 중인 쓰레드를 중지
        if (timerThread != null && timerThread.isAlive()) {
            timerThread.interrupt();
        }
    }

    public String getCurrentTime() {
        if (hours == 0 && minutes == 0 && seconds == 0) {
            return "00:00";
        }

        seconds--;

        if (seconds < 0) {
            seconds = 59;
            minutes--;

            if (minutes < 0) {
                minutes = 59;
                hours--;

                if (hours < 0) {
                    hours = 0;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("00");
        String time = df.format(hours) + ":" + df.format(minutes) + ":" + df.format(seconds);
        return time;
    }
}

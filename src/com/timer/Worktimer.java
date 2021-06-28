package com.timer;

import javax.swing.*;

public class Worktimer extends Thread{

    private JLabel timerLabel;
    private JButton button;

    public Worktimer(JLabel timerLabel, JButton button){
        this.timerLabel = timerLabel;
        this.button = button;
    }


    public void run(){  //jvm에서 스레드 자동 실행
        int CountTime = 1500;   //25

        int CheckMinutes = 0;     //Minutes
        String StCheckMinutes = "";

        int CheckSeconds = 0;   //Seconds
        String StCheckSeconds = "";

        String filename = "D:\\ForCapStone\\TomatoTimer\\Aram.mp3";    //

        while(CountTime != 0){
            CheckMinutes = CountTime / 60;
            if(CheckMinutes<10){ StCheckMinutes = "0" + CheckMinutes;
            }else{ StCheckMinutes = Integer.toString(CheckMinutes); }

            CheckSeconds = CountTime % 60;
            if(CheckSeconds<10){ StCheckSeconds = "0" + CheckSeconds;
            }else{ StCheckSeconds = Integer.toString(CheckSeconds); }

            timerLabel.setText(StCheckMinutes + ":" + StCheckSeconds);
            CountTime--;
            try{
                Thread.sleep(1000); //1초
            }catch(InterruptedException e){return;}
        }
        timerLabel.setText("00:00");
        PlayAlarm mp3 = new PlayAlarm(filename);
        mp3.play();
        timerLabel.setText("25:00");
        button.setEnabled(true);
    }
}
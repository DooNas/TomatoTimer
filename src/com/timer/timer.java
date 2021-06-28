package com.timer;

import com.alarm.PlayAlarm;

import javax.swing.*;

public class timer extends Thread{

    protected JLabel timerLabel;
    protected JButton button;
    protected String timeline;
    protected int Time;

    public timer(JLabel timerLabel, JButton button, String timeline, int Time){
        this.timerLabel = timerLabel;
        this.button = button;
        this.timeline = timeline;
        this.Time = Time;
    }


    public void run(){  //jvm에서 스레드 자동 실행

        int Minutes = 1;     //Minutes
        String StMinutes = "";
        int Seconds = 0;   //Seconds
        String StSeconds = "";

        //you have to fix your link
        String filename = "D:\\ForCapStone\\check\\main\\src\\com\\alarm\\Aram.mp3";

        while(Time != 0){
            Minutes = Time / 60;
            if(Minutes<10){ StMinutes = "0" + Minutes;
            }else{ StMinutes = Integer.toString(Minutes); }

            Seconds = Time % 60;
            if(Seconds<10){ StSeconds = "0" + Seconds;
            }else{ StSeconds = Integer.toString(Seconds); }

            timerLabel.setText(StMinutes + ":" + StSeconds);

            Time--;
            try{
                Thread.sleep(1000); //1초
            }catch(InterruptedException e){return;}
        }
        timerLabel.setText("00:00");
        PlayAlarm mp3 = new PlayAlarm(filename);
        mp3.play();
        timerLabel.setText(timeline);
        button.setEnabled(true);
    }
}
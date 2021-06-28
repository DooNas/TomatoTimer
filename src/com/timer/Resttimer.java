package com.timer;

import javax.swing.*;
import java.awt.*;

public class Resttimer extends Thread{

    private JLabel timerLabel;
    private JButton button;

    public Resttimer(JLabel timerLabel, JButton button){
        this.timerLabel = timerLabel;
        this.button = button;
    }


    public void run(){  //jvm에서 스레드 자동 실행
        int Time = 300;   //5

        int CheckMinutesRest = 0;     //Minutes
        String StCheckMinutesRest = "";
        int CheckSecondsRest = 0;   //Seconds
        String StCheckSecondsRest = "";

        String filename = "D:\\ForCapStone\\TomatoTimer\\Aram.mp3";

        while(Time != 0){
            CheckMinutesRest = Time / 60;
            if(CheckMinutesRest<10){ StCheckMinutesRest = "0" + CheckMinutesRest;
            }else{ StCheckMinutesRest = Integer.toString(CheckMinutesRest); }

            CheckSecondsRest = Time % 60;
            if(CheckSecondsRest<10){ StCheckSecondsRest = "0" + CheckSecondsRest;
            }else{ StCheckSecondsRest = Integer.toString(CheckSecondsRest); }

            timerLabel.setText(StCheckMinutesRest + ":" + StCheckSecondsRest);

            Time--;
            try{
                Thread.sleep(1000); //1초
            }catch(InterruptedException e){return;}
        }
        timerLabel.setText("00:00");
        PlayAlarm mp3 = new PlayAlarm(filename);
        mp3.play();
        timerLabel.setText("05:00");
        button.setEnabled(true);
    }
}

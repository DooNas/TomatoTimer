package timer;

import java.awt.*;
import javax.swing.*;

public class Worktimer extends Thread{
    private JLabel timerLabel;
    public Worktimer(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }


    public void set(){  //jvm에서 스레드 자동 실행
        int CountTime = 1500;   //25분

        int CheckMinutes = 0;     //시간
        String StCheckMinutes = "";
        int CheckSeconds = 0;   //분
        String StCheckSeconds = "";


        while(CountTime != 0){
            CheckMinutes = CountTime/60;
            if(CheckMinutes<10){ StCheckMinutes = "0" + CheckMinutes;
            }else{ StCheckMinutes = Integer.toString(CheckMinutes); }

            CheckSeconds = CountTime%60;
            if(CheckSeconds<10){ StCheckSeconds = "0" + CheckSeconds;
            }else{ StCheckSeconds = Integer.toString(CheckSeconds); }

            timerLabel.setText(StCheckMinutes + " : " + StCheckSeconds);
            CountTime--;
            try{
                Thread.sleep(1000); //1초
            }catch(InterruptedException e){return;}
        }
    }
}


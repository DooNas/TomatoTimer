package timer;

import javax.swing.*;

public class Resttimer extends Thread{

    private JLabel ResttimerLabel;

    public Resttimer(JLabel ResttimerLabel){
        this.ResttimerLabel = ResttimerLabel;
    }


    public void run(){  //jvm에서 스레드 자동 실행
        int RestCountTime = 300;   //5분

        int CheckMinutesRest = 0;     //Minutes
        String StCheckMinutesRest = "";
        int CheckSecondsRest = 0;   //Seconds
        String StCheckSecondsRest = "";

        String filename = "D:\\ForCapStone\\TomatoTimer\\Aram.mp3";

        while(RestCountTime != 0){
            CheckMinutesRest = RestCountTime / 60;
            if(CheckMinutesRest<10){ StCheckMinutesRest = "0" + CheckMinutesRest;
            }else{ StCheckMinutesRest = Integer.toString(CheckMinutesRest); }

            CheckSecondsRest = RestCountTime % 60;
            if(CheckSecondsRest<10){ StCheckSecondsRest = "0" + CheckSecondsRest;
            }else{ StCheckSecondsRest = Integer.toString(CheckSecondsRest); }

            ResttimerLabel.setText(StCheckMinutesRest + ":" + StCheckSecondsRest);

            RestCountTime--;
            try{
                Thread.sleep(1000); //1초
            }catch(InterruptedException e){return;}
        }
        ResttimerLabel.setText("00:00");
        PlayAlarm mp3 = new PlayAlarm(filename);
        mp3.play();
        ResttimerLabel.setText("05:00");
    }
}

package com.alarm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class PlayAlarm {
    private String fileName;
    private Player player;

    public PlayAlarm(String filename){
        this.fileName = filename;
    }

    public void close(){
        if(player != null)
            player.close();
    }
    public void play(){
        try{
           FileInputStream fis = new FileInputStream(fileName);
           BufferedInputStream bis = new BufferedInputStream(fis);
           player = new Player(bis);
        }catch (Exception e){
            e.printStackTrace();
        }
        new Thread(){
            public void run(){
                try{
                    player.play();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }.start();
    }
}

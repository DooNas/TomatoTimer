package com.success;

import java.io.*;
import java.text.*;
import java.util.*;

public class Counting extends Thread{
    private String filepath = "D:\\ProjectWfilecontroll\\file\\";

    private String Count(String StCount){ //숫자처리
        int Count = Integer.parseInt(StCount);
        String result;

        if(Count < 10){
            result = "0" + Integer.toString(Count);
        }else{
            result = Integer.toString(Count);
        }
        return result;
    }

    private String toDate() { //날짜 설정
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date).toString()+".txt";
    }

    private String yesterDate(){ //날짜 설정
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(Locale.KOREA);
        try {
            Date setDate = dateFormat.parse(toDate());
            cal.setTime(setDate);
            cal.add(Calendar.DATE, -1);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return dateFormat.format(cal.getTime()).toString()+".txt";
    }

    private void makefile(){ //파일 생성
        try{
            OutputStream output = new FileOutputStream(filepath + toDate());
            String Count = "0";
            byte[] by = Count.getBytes();
            output.write(by);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void Checkfile(){ //파일 유무 파악
        try {
            File file = new File(filepath + toDate());
            if(file.exists() == false){ makefile();}    //파일 유무 확인

        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public String PullfileToday(){ //금일 파일 정보 가져오기
        String stCount = "";
        try {
            String file = filepath + toDate();
            FileInputStream fileStream = null;

            fileStream = new FileInputStream(file);

            byte[] readCount = new byte[fileStream.available()];
            while(fileStream.read(readCount) != -1){
                stCount += new String(readCount);
            }
            fileStream.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Count(stCount);
    }
    public String PullfileYesterday(){ //익일 파일 정보 가져오기
        String stCount = "";
        try {
            String file = filepath + yesterDate();
            FileInputStream fileStream = null;

            fileStream = new FileInputStream(file);

            byte[] readCount = new byte[fileStream.available()];
            while(fileStream.read(readCount) != -1){
                stCount += new String(readCount);
            }
            fileStream.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Count(stCount);
    }



    public void Fixfile() {  //파일 정보 갱신
        File file = new File(filepath + toDate());
        int Count = Integer.parseInt(PullfileToday());
        Count++;
        try{
            BufferedWriter WriteCount = new BufferedWriter(new FileWriter(file));
            String stCount = Integer.toString(Count);
            WriteCount.write(stCount,0,stCount.length());

            WriteCount.flush();
            WriteCount.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.counts;

import java.io.*;
import java.text.*;
import java.util.*;

public class Makefile {
    protected String filepath = "D:\\ForCapStone\\check\\main\\Checkfile\\";

    protected String Count(String StCount) { //Counts Numbering
        int Count = Integer.parseInt(StCount);
        String result;

        if (Count < 10) {
            result = "0" + Integer.toString(Count);
        } else {
            result = Integer.toString(Count);
        }
        return result;
    }

    protected String toDate() { //Today
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date).toString();
    }

    protected String lastDate() { //Yesterday
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = new GregorianCalendar(Locale.KOREA);
        try {
            Date setDate = dateFormat.parse(toDate());
            cal.setTime(setDate);
            cal.add(Calendar.DATE, -1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateFormat.format(cal.getTime()).toString();
    }

    protected void makefile() { //Make today_file
        try {
            OutputStream output = new FileOutputStream(filepath + toDate() + ".txt");
            String Count = "0";
            byte[] by = Count.getBytes();
            output.write(by);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    protected void Checkfile() { //파일 유무 파악
        try {
            File file = new File(filepath + toDate() + ".txt");
            if (!file.exists()) {
                makefile();
            }    //파일 유무 확인

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

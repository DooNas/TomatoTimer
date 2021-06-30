package com.counts;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CountLastday extends Makefile{

    public String CheckCounts() { //bring file's Counts
        String stCount = "00";
        try {
            String file = filepath + lastDate() + ".txt";
            File Checkfile = new File(filepath + lastDate() + ".txt");

            if (Checkfile.exists()) {
                stCount = ""; //reset
                FileInputStream fileStream = null;

                fileStream = new FileInputStream(file);

                byte[] readCount = new byte[fileStream.available()];
                while (fileStream.read(readCount) != -1) {
                    stCount += new String(readCount);
                }
                fileStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Count(stCount);
    }
}

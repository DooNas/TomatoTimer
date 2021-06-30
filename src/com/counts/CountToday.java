package com.counts;

import java.io.*;

public class CountToday extends Makefile{
    public String CheckCounts() { //bring file's Counts OR Make New file(Today)
        String stCount = "00";
        try {
            String file = filepath + toDate() + ".txt";
            File Checkfile = new File(filepath + toDate() + ".txt");
            if(Checkfile.exists()) {
                stCount = "";
                FileInputStream fileStream = null;

                fileStream = new FileInputStream(file);
                byte[] readCount = new byte[fileStream.available()];

                while (fileStream.read(readCount) != -1) {
                    stCount += new String(readCount);
                }
                fileStream.close();
            }else{
                makefile();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Count(stCount);
    }

    public void AddCounts() {  //파일 정보 갱신
        File file = new File(filepath + toDate() + ".txt");
        int Count = Integer.parseInt(CheckCounts());
        Count++;
        try {
            BufferedWriter WriteCount = new BufferedWriter(new FileWriter(file));
            String stCount = Integer.toString(Count);
            WriteCount.write(stCount, 0, stCount.length());

            WriteCount.flush();
            WriteCount.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

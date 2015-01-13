package com.levelup.homework;

import java.io.*;

public class BuffReader {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (new FileInputStream("/home/alexis/IdeaProjects/untitled1/src/com/levelup/homework/read")));

        DataOutputStream dataOutputStream = new DataOutputStream(System.out);

        int chars;
        while ((chars = bufferedReader.read()) != -1) {
            dataOutputStream.write((char) chars);
        }
        bufferedReader.close();
        dataOutputStream.close();
    }

}
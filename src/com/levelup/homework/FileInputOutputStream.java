package com.levelup.homework;

import java.io.*;

public class FileInputOutputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/alexis/IdeaProjects/untitled1/src/com/levelup/homework/read");
        int chars;
        while ((chars = fileInputStream.read()) != -1){

            System.out.print((char)chars);
        }

    }

}
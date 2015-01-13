package golovachCourses;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.*;

public class App00 {


    public static void main(String[] args) throws IOException {



        int i = 4;

        float f = (float) (i / 0.5);

        InputStream src = new URL("http://vk.ru").openStream();
        OutputStream dst = new FileOutputStream("/home/alexis/Documents/google.txt");
        copy(src, System.out);



        ArrayList<? extends Number> arrayList = new ArrayList<Integer>();

    }

    static String significantOnes;

    private static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true){

            int data = src.read();

            int counter = 0;
            significantOnes = Integer.toBinaryString(data);

            for(int i = 0, startPoint = 0; i < significantOnes.length(); i++) {
                System.out.println("~~" + significantOnes + "~~");
                if (significantOnes.charAt(i) == '1'){
                    startPoint = i;
                    counter++;
//                    startPoint = i;
//                    System.out.print("1");
//                    System.out.print("#" + significantOnes + "#");

                }
                else if (significantOnes.charAt(i) == '0'){
                    System.out.println("#" +significantOnes.substring(i - counter, i) + "#");
                    counter = 0;
                }
            }
            if(data != -1){
                System.out.print(" - " + significantOnes + " - " + data + " - ");
                dst.write(data);
                System.out.println();

            }
            else {
                return;
            }
        }
    }
}

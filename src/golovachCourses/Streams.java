package golovachCourses;

import java.io.OutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Streams {
    public static byte[] copy(URL inputStream){


        return inputStream.toString().getBytes();
    }

    public static void main(String[] args) throws MalformedURLException {
        System.out.println(copy(new URL("http://vk.com")));
    }
}

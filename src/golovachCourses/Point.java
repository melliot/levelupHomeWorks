package golovachCourses;

public class Point {
    Point(int x, int y) {
        if (x < 0 || x > 15){
            throw new IllegalArgumentException();
        }
        if (y < 0 || y > 15){
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Point point = new Point(13, 24);
//        System.out.println(point);

    }
}

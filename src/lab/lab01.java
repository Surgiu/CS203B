package lab;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class lab01 {
    public static void main(String[] args) {
        draw();
    }

    public static void draw() {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(0, 0);
        StdDraw.point(2,0);
        StdDraw.point(0,2);
        StdDraw.point(-2,2);

    }
}

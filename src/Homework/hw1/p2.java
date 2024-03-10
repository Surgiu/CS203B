package Homework.hw1;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdIn;

public class p2 {
    public static void main(String[] args) {
        String[] lines = StdIn.readAll().split("\\r?\\n");
        int[] z_arrival = convert(lines[0]);
        int[] z_departure = convert(lines[1]);
        int[] l_arrival = convert(lines[2]);
        int[] l_departure = convert(lines[3]);

    }

    public static int[] convert(String input) {
        String[] date = input.split("-");
        int[] res = new int[3];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(date[i]);
        }
        return res;
    }
}

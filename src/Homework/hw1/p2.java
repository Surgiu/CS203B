package Homework.hw1;

import java.util.Date;
import java.time.Duration;
import java.time.Instant;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class p2 {
    public static void main(String[] args) {
        String[] lines = StdIn.readAll().split("\\r?\\n");
        Instant z_arrival = convert(lines[0]);
        Instant z_departure = convert(lines[1]);
        Instant l_arrival = convert(lines[2]);
        Instant l_departure = convert(lines[3]);
        Instant start_time = l_arrival, end_time = l_departure;
        if (z_arrival.isAfter(l_arrival)) start_time = z_arrival;
        if (z_departure.isBefore(l_departure)) end_time = z_departure;
        long days = 0;
        if (start_time.isBefore(end_time)) {
            Duration duration = Duration.between(start_time, end_time);
            days = duration.toDays() + 1;
        }
        StdOut.println(days);
    }

    public static Instant convert(String input) {
        String[] date = input.split("-");
        int[] res = new int[3];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(date[i]);
        }
        Date date_c = new Date(res[0] - 1900, res[1] - 1, res[2]);
        return date_c.toInstant();
    }
}

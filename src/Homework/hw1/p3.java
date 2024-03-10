package Homework.hw1;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.Instant;

import edu.princeton.cs.algs4.StdIn;

public class p3 {
    public static void main(String[] args) {
        String[] lines = StdIn.readAllLines();
        Instant ddl = convert(lines[0]);
        for (int i = 1; i < lines.length; i++) {
            Instant date = convert(lines[i]);
            System.out.println(date.isBefore(ddl));
        }
    }

    public static Instant convert(String string) {
        String[] time0 = string.split("[\\s+:-]");
        int[] time2 = new int[4];
        for (int i = 0; i < time2.length; i++) {
            time2[i] = Integer.parseInt(time0[i]);
        }
        if (time0[4].equals("PM") && time2[2] != 12) time2[2] += 12;
        LocalDateTime localDateTime = LocalDateTime.of(2077, time2[0], time2[1], time2[2], time2[3]);
        if (time0[4].equals("AM") && time2[2] == 12) localDateTime = localDateTime.minusHours(12);
        return localDateTime.toInstant(ZoneOffset.UTC);
    }
}

package draft;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; ++i) {
            try {
                In fin = new In("./resources/data/" + i + "Kints.txt");
                int[] arr = fin.readAllInts();
                fin.close();

                StdOut.printf("Calculating sums in %dKints.txt:", i);
                Stopwatch timer = new Stopwatch();
                int count = count1(arr);

                StdOut.printf(" size of data: %d, result: %d sums, time spent: %f seconds.\n", arr.length, count, timer.elapsedTime());
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    public static int count1(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int count2(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) {
                    count++;
                }
            }
        }
        return count;
    }


}
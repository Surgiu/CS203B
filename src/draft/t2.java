package draft;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class t2 {
    public static void main(String[] args) {
        String s = StdIn.readAll();
        String[] lines = s.split("\\r?\\n");
        System.out.println(Arrays.toString(lines));
    }
}

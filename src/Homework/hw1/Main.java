package Homework.hw1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int N_person = StdIn.readInt();
        UnionFind[] people = new UnionFind[N_person];
        for (int i = 0; i < N_person; i++) {
            people[i] = new UnionFind(i);
        }
        ArrayList<String> lines = new ArrayList<>();
        StdIn.readLine();
        while (StdIn.hasNextLine()) {
            String current = StdIn.readLine();
            if (current.isEmpty()) break;
            lines.add(current);
        }
        for (String s : lines) {
            System.out.println(s);
        }

        for (String line : lines) {
            String[] command = line.split("\\s+");
            int p = Integer.parseInt(command[1]);
            int q = Integer.parseInt(command[2]);
            if (command[0].charAt(0) == 'C') {
                UnionFind.connect(p, q, people);
            } else {
                if (UnionFind.is_connected(people[p], people[q]))
                    StdOut.println("YES");
                else StdOut.println("NO");
            }
        }
    }
}

class UnionFind {
    private int id;

    public UnionFind(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static boolean is_connected(UnionFind u1, UnionFind u2) {
        return u1.id == u2.id;
    }

    public static void connect(int p, int q, UnionFind[] people) {
        for (UnionFind person : people) {
            if (person.getId() == p) person.setId(q);
        }
    }
}

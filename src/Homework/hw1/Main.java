package Homework.hw1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String[] args) {
        String s = StdIn.readAll();
        String[] commands = s.split("\\r?\\n");
        int num = Integer.parseInt(commands[0]);
        UnionFind unionFind = new UnionFind(num);
        for (int i = 1; i < commands.length; i++) {
            String[] info = commands[i].split("\\s+");
            char command = info[0].charAt(0);
            int a = Integer.parseInt(info[1]) - 1, b = Integer.parseInt(info[2]) - 1;
            if (command == 'C') unionFind.connect(a, b);
            else if (command == 'Q') {
                StdOut.println(unionFind.is_connect(a, b) ? "Yes" : "No");
            }
        }
    }
}

class UnionFind {
    private int[] parent;
    private int[] size;//size[i]=distance from the root to the ith element

    public UnionFind(int num) {
        parent = new int[num];
        size = new int[num];
        for (int i = 0; i < num; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public boolean is_connect(int p, int q) {
        return root(p) == root(q);
    }

    public int root(int id) {//return the root
        if (parent[id] != id) {
            parent[id] = root(parent[id]); // path compression
        }
        return parent[id];
    }

    public void connect(int p, int q) {
        int root_p = root(p), root_q = root(q);
        if (root_p == root_q) return;
        if (size[p] < size[q]) {
            parent[root_p] = root_q;
            size[q] += size[p];
        } else {
            parent[root_q] = root_p;
            size[p] += size[q];
        }
    }
}

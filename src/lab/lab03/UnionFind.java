package lab.lab03;

import java.util.ArrayList;

public class UnionFind {
    int[] items;

    public UnionFind(int N) {
        for (int i = 0; i < N; i++) {
            items = new int[N];
            items[i] = i;
        }
    }

    public ArrayList<Integer> find(int p) {
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < this.items.length; i++) {
            if (items[i] == p) target.add(i);
        }
        return target;
    }

    public boolean isConnected(int p, int q) {
        return items[p] == items[q];
    }

    public void union(int p, int q) {
        ArrayList<Integer> list = new ArrayList<>();

    }
}

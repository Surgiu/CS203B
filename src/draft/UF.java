package draft;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    protected int[] id; // access to component id (site indexed)
    protected int count; // number of components

    public UF(int N) { // Initialize component id array.
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return this.count;
    }

    public boolean connected(int p, int q) {
        //this function checks if p and q are in the same component
        return find(p) == find(q);
    }

    public int find(int p) {
        //this function find which component p belongs to
        return 0;
    }

    public void union(int p, int q) {
        //this function connects the two components p and q
    }

    // See page 222 (quick-find),page 224 (quick-union) and page 228 (weighted).
    public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        int N = StdIn.readInt(); // Read number of sites.
        UF uf = new UF(N); // Initialize N components.
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt(); // Read pair to connect.
            if (uf.connected(p, q)) {
                continue; // Ignore if connected.
            }
            uf.union(p, q); // Combine components
            StdOut.println(p + " " + q); // and print connection.
        }
        StdOut.println(uf.count() + " components");
    }
}
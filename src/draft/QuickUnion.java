package draft;

public class QuickUnion extends UF {

    public QuickUnion(int N) {
        super(N);
    }

    @Override
    public int find(int p) {
        //if p is not the root of the tree, set p to its parent
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) {
            return;
        }
        id[i] = j;//change root of p to point to root of q
        count--;
    }
}

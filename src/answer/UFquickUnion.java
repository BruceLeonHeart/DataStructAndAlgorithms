package answer;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFquickUnion {
    private int[] id; // 分量id
    private int count; // 分量数目

    public UFquickUnion(int N) {
        this.count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int m) {
        while(m!=id[m])
            m = id[m];
            return m;
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId)
            return;
        // 用后者节点所在的分量id覆盖之前的
        id[pId] = qId;
        
        count--;

    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UFquickUnion uf = new UFquickUnion(N);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.isConnected(p,q))
                continue;
            uf.union(p,q);
            StdOut.println(p+" "+q);

        }
        StdOut.println(uf.count() + " componenets");
    }

}

package answer;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    private int[] id;  //分量id
    private int count; //分量数目


    public UF(int N) {
        this.count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }
    public boolean isConnected(int p ,int q){
        return find(p) == find(q);
    }

    public int find(int m){
        return id[m];
    }

    public void union(int p,int q){
        int pId = id[p];
        int qId = id[q];
        if (pId==qId)
        return;
        //用后者节点所在的分量id覆盖之前的
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId)
                id[i] = qId;            
        }
        count --;

    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
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

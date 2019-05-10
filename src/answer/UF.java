package answer;

import edu.princeton.cs.algs4.StdIn;

public class UF {
    private int[] id;
    private int count;


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
        return 0;
    }

    public void union(int p,int q){

    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while(!StdIn.isEmpty()){

        }
    }

}

package answer;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;

public class Ans_1_2_2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double [] keys = new double[2*N];
        for (int i = 1; i < 2*N+1 ; i++) {
            keys[i-1] = Double.parseDouble(args[i]);
        }

        Interval1D [] objectarr = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            objectarr[i] = new Interval1D(keys[2*i],keys[2*i+1]);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i ; j++)  {
                if (objectarr[i].intersects(objectarr[j]) )
                {
                    StdOut.println("this:" + objectarr[i] +"that" + objectarr[j]);
                }

            }

        }
    }
}

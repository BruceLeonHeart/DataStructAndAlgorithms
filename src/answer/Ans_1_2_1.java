package answer;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ans_1_2_1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
//        int [] k = new int[3];
//        Integer [] m = new Integer("2")[8];
        Point2D  point2Dset []  = new Point2D[T];
        for (int i = 0; i < T; i++) {
            point2Dset[i] = new Point2D(StdRandom.uniform(),StdRandom.uniform());
            StdOut.print(""+point2Dset[i]+"\n");
        }
        double mindisinit  = point2Dset[1].distanceTo(point2Dset[2]);
        for (int i = 1; i < T; i++) {
            for (int j = 0; j < i ; j++) {
                mindisinit = Math.min(mindisinit,point2Dset[i].distanceTo(point2Dset[j]));
            }
        }
        StdOut.print("min is " +mindisinit);

    }
}

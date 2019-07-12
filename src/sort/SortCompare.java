package sort;
import edu.princeton.cs.algs4.Heap;
import sort.Insertion;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
import sort.Selection;
import sort.Shell;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

class SortComPare{
    public static double time(String alg,Comparable[] a){
        Stopwatch timer = new Stopwatch();
        switch(alg){
            case "Insertion":{
                Insertion.sort(a);
                break;
        }
            case "Selection":{
                Selection.sort(a);
                break;
        }
            case "Shell":{
                Shell.sort(a);
                break;
        }
            case "Merge":{
                Merge.sort(a);
                break;
        }
            case "Quick":{
                Quick.sort(a);
                break;
        }
            case "Heap":{
                Heap.sort(a);
                break;
        }
        }
        return timer.elapsedTime();
    }


    public static double timeRandomInput(String alg,int N,int T){
        double total = 0.0;
        Double [] a = new Double [N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) 
                a[i] = StdRandom.uniform();
            total += time(alg,a);    
        }
        return total;
    }
    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        StdOut.printf("%s  ALGS takes %.1f \n",alg1,t1);
        StdOut.printf("%s  ALGS takes %.1f \n",alg2,t2);
        StdOut.printf("For %d random doubles\n %s is %.1f times faster than %s \n",N,alg1,t2/t1,alg2);
    }
}
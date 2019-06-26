package answer;
import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.Shell;
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
        return T;


    }
}
package sort;

import java.lang.Comparable;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

class Selection extends SortExample {
    

    public static void sort(Comparable[] a) { 
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(less(a[j],a[min]))               
                    min = j;                   
            }
            exch(a,i,min);
        }       
    }
    

    public static void main(String[] args) {
         String[] a = In.readStrings();
        //String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }


}
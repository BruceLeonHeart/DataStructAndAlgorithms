package sort;

import edu.princeton.cs.algs4.In;

class Shell extends SortExample
{
    public static void sort(Comparable []a ) {
        int N = a.length;
        int h =1;
        while(h < N/3)
        h = 3*h +1;
        while(h >= 1)
        {
            for (int i = h; i < N; i++) {
                for(int j =i;j>=h && less(a[j],a[j-h]);j= j-h)
                    exch(a,j,j-h);
                
            }
            h /= 3;
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
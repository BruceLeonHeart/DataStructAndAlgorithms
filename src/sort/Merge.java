package sort;

import edu.princeton.cs.algs4.In;

class Merge extends SortExample
{
    private static Comparable[] aux;

    //自顶向下
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    public static void  sort(Comparable[] a,int lo,int hi)
    {
        if(hi<=lo) return;
        int mid = (hi + lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    //自底向上
    public static void sort1(Comparable a[]) {
        int N = a.length;
        aux = new Comparable[N];
        for(int sz =1;sz<N;sz *=2)
            for(int lo =0;lo<N -sz;lo+=2*sz)
                merge(a,lo,lo+sz-1,Math.min(lo+2*sz-1, N-1));

        
        
    }

    public static void merge(Comparable[]a ,int lo,int mid,int hi) {
        int i = lo,j = mid +1;
        //全部复制到aux中
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];           
        }
        for (int k = lo; k <= hi; k++) {
            if (i>mid) a[k] = aux[j++]; //左半边元素耗尽
            else if (j>hi) a[k] = aux[i++]; //右半边元素耗尽
            else if (less(aux[j],aux[i])) a[k] = aux[j++]; //右边同位置元素小于左边元素时
            else          a[k] = aux[i++];  //左边同位置元素小于右边元素时
        }
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
       //String[] a = StdIn.readAllStrings();
       sort1(a);
       assert isSorted(a);
       show(a);
   }
}
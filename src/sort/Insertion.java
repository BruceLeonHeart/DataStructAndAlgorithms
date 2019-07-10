package sort;

import java.lang.Comparable;

import edu.princeton.cs.algs4.In;
class Insertion extends SortExample{

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
              //内循环这里，如果当前比前一个大，那后续就不用在比较了，因为前面都已经是排好的，应该break出来
            for (int j = i;j>0;j--)
            {
                if(less(a[j], a[j-1]))
                    exch(a,j,j-1);
                else
                break;
            }
            
            
        }
        
    }

    //官方直接将判断写到循环的继续条件下，简短的代码，既能跳出内循环又可以做到想做的事，很赞！
    //这里使用了交换，其实可以将较大的元素向后面移动一个位置，减少访问数组的开销
    public static void sort1(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i;j>0 && less(a[j], a[j-1]) ;j--)
                    exch(a,j,j-1);          
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
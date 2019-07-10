package sort;
import java.lang.Comparable;

public class SortExample
{
    //排序方式
    public static void sort(Comparable[] a) {
        System.out.println("you should not see this in CMD");
    }
    //比较
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;

    }
    //交换
    public static void exch(Comparable[] a,int i,int j) {
         Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    //显示
    public static void show(Comparable [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+ " ");    
        }
        
    }

    //判断是否有序
    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (!less(a[i],a[i+1]))
                return false;
        }
        return true;
    }
 
}


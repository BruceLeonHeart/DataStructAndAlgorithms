package answer;

public class FixedCapacityStackOfStrings {
    private  int N;
    private  String[] a;

    public FixedCapacityStackOfStrings(int n) {
        a = new String[n];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    //注意这里的--N 和 ++N 因为入栈总是加一
    // 最后一次入栈会多加一个1，所以要减掉
    public void push(String s){
        a[N++] = s;
    }
    public String pop(){
        return a[--N];
    }
}

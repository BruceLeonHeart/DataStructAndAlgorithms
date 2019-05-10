package answer;

public class FixedCapacityStack<Item> {
    private  int N;
    private  Item[] a;

    public FixedCapacityStack(int n) {
        a = (Item[]) new Object[n];
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int size(){
        return N;
    }
    //注意这里的--N 和 ++N 因为入栈总是加一
    // 最后一次入栈会多加一个1，所以要减掉
    public void push(Item s){
        if(N == a.length)
            resize(2*a.length);
        a[N++] = s;
    }
    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if (N>0&&N == a.length/4)
            resize(a.length/2);
        return item;
    }
    private void resize(int max){
        Item[] temp  =  (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
}

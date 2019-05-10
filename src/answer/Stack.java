package answer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {
    private Node<T> first;
    private int N;
    private class Node<T>{
        T item;
        Node next;
    }
    public Stack() {
        first = null;
        N = 0;
    }

    public boolean isEmpty(){
        return first==null;
        //OR return N==0;
    }

    public int size(){
        return N;
    }

    public void push(T item){
        Node<T> oldfirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public T pop(){
        if(isEmpty()) throw new NoSuchElementException();
        T item = first.item;
        first = first.next;
        N--;
        return  item;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(first);
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public ListIterator(Node<T> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}

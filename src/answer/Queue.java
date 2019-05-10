package answer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements Iterable<T> {
    private Node<T> first;
    private Node<T> last;
    private int N;
    private class Node<T>{
        T item;
        Node next;
    }
    public Queue(){
        first = null;
        last = null;
        N = 0;
    }

    public boolean isEmpty(){
        return N==0;
        //OR return first == null;
    }

    public int size(){
        return N;
    }
    public void enqueue(T item){
        Node<T> oldlast = last;
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }

    public T dequeue(){
        T item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        N--;
        return item;
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

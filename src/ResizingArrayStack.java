import java.util.Iterator;

/**
 * Created by terda12 on 10/11/2015.
 */
public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] a = (T[]) new Object[1];  // stack items
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        // Move stack to a new array of size max
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(T item) {
        if (N == a.length) {
            resize(2 * a.length);
        }

        a[N++] = item;
    }

    public T pop() {
        T item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }

        return item;
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = N;
        public boolean hasNext() {
            return i > 0;
        }
        public T next() {
            return a[--i];
        }
        public void remove() {

        }
    }
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }
}

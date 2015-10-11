import java.util.Iterator;

/**
 * Created by terda12 on 10/11/2015.
 */
public class LinkedList<Item> implements Iterable<Item> {
    Node<Item> first;
    Node<Item> last = first;
    int N = 0;

    public void pushFront(Item item) {
        Node<Item> newNode = new Node<>(item);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }

        N++;
    }

    public void pushBack(Item item) {
        Node<Item> newNode = new Node<>(item);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        N++;
    }

    public void insertAfterIndex(Item item, int i) {
        if (i > size()) {
            throw new IndexOutOfBoundsException();
        }

        Node<Item> newNode = new Node<>(item);
        if (first == null) {
            first = newNode;
        } else {
            Node<Item> curr = first;
            for (int a = 0; a < i; a++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Item> {
        Node<Item> currNode;

        @Override
        public boolean hasNext() {
            if (currNode == null) {
                return first != null;
            } else {
                return currNode.next != null;
            }
        }

        @Override
        public Item next() {
            if (currNode == null) {
                currNode = first;
            } else {
                currNode = currNode.next;
            }
            return currNode.item;
        }
    }
}

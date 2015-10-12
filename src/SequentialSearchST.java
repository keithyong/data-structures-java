import java.util.Iterator;

/**
 * Created by terda12 on 10/11/2015.
 */
public class SequentialSearchST<Key, Value> implements Iterable<Pair<Key, Value>> {
    private LinkedList<Pair<Key, Value>> ll = new LinkedList<>();

    public void put(Key key, Value val) {
        // Search for the key. Update value if found; grow table if new.
        for (Iterator<Pair<Key, Value>> it = ll.iterator(); it.hasNext(); ) {
            Pair<Key, Value> curr = it.next();
            if (curr.getLeft() == key) {
                curr.setRight(val);
                return;
            }
        }

        // Not found, add a new key value pair to the LinkedList
        ll.pushBack(new Pair<Key, Value>(key, val));
    }

    public Value get(Key key) {
        for (Pair<Key, Value> p : ll) {
            if (p.getLeft() == key) {
                return p.getRight();
            }
        }

        return null;
    }

    @Override
    public Iterator<Pair<Key, Value>> iterator() {
        return ll.iterator();
    }
}

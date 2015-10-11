/**
 * Created by terda12 on 10/11/2015.
 */
public class Node<Item> {
    public Item item;
    public Node<Item> next;

    public Node(Item item) {
        this.item = item;
        this.next = null;
    }
}

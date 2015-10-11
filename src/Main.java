import java.util.Iterator;

/**
 * Created by terda12 on 10/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        ResizingArrayStack<Integer> ra_stack = new ResizingArrayStack<Integer>();
        ra_stack.push(new Integer(2));
        ra_stack.push(new Integer(5));
        ra_stack.push(new Integer(7));
        ra_stack.push(new Integer(3));
        ra_stack.push(new Integer(5));

        ra_stack.pop();
        ra_stack.pop();
        ra_stack.pop();
        ra_stack.pop();

        for (Iterator<Integer> it = ra_stack.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }

    }
}

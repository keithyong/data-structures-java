import java.util.Iterator;

/**
 * Created by terda12 on 10/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        SequentialSearchST<String, String> st = new SequentialSearchST<>();

        st.put("port", "1337");
        System.out.println(st.get("port"));
    }
}

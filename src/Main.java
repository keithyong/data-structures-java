import java.util.Iterator;

/**
 * Created by terda12 on 10/11/2015.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLL = new LinkedList<>();

        myLL.pushBack("name");
        myLL.pushBack("is");
        myLL.pushBack("Keith");
        myLL.pushBack("Yong");
        myLL.pushFront("My");

        for (String s : myLL) {
            System.out.println(s);
        }
    }
}

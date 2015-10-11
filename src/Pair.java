/**
 * Created by terda12 on 10/11/2015.
 */
public class Pair<L, R> {
    private L left;
    private R right;

    public Pair(L l, R r) {
        this.left = l;
        this.right = r;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L l) {
        left = l;
    }

    public void setRight(R r) {
        right = r;
    }
}

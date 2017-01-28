public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /* Return the size of a Link list using no recursion. */
    public int iterativeSize() {
        int size = 1;
        IntList rest = this.rest;
        while (rest != null) {
            size += 1;
            rest = rest.rest;
        }
        return size;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        } else {
            return this.rest.get(i-1);
        }
    }

    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        if (L == null) {
            return L;
        }
        L.first += x;
        dincrList(L.rest, x);
        System.out.println(L.get(0));
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());
        // System.out.println(L.get(0));
        // System.out.println(L.get(1));
        // System.out.println(L.get(2));
        dincrList(L, 100);
    }
}
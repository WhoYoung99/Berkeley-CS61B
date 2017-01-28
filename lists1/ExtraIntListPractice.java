public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        if (L == null) {
            return L;
        }
        IntList incr = new IntList(L.first + x, incrList(L.rest, x));
        return incr;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
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
        IntList L = new IntList(5, null);
        L = new IntList(7, L);
        L = new IntList(9, L);

        // System.out.println(L.size());
        // System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));

        /* For testing incrList */
        IntList in_list = incrList(L, 3);
        System.out.println(in_list.get(0));
        System.out.println(in_list.get(1));
        System.out.println(in_list.get(2));
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));

        /* For testing dincrList */
        // IntList din_list = dincrList(L, 3);
        // System.out.println(din_list.get(0));
        // System.out.println(din_list.get(1));
        // System.out.println(din_list.get(2));
        // System.out.println(L.get(0));
        // System.out.println(L.get(1));
        // System.out.println(L.get(2));
    }
}
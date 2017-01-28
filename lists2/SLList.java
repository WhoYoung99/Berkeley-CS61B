public class SLList {

    private static class IntNode {
        int item;
        IntNode next;

        IntNode(int i, IntNode n) {
            item = i;
            next = n;
    }
}

    public IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(15);
        L.addFirst(20);
        System.out.println(L.getFirst());
    } 
}
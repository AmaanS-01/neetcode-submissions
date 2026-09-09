class MyHashSet {
    private static class Node {
        final int val;
        Node next;
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private static final int CAPACITY = 10007;
    private final Node[] table;

    public MyHashSet() {
        table = new Node[CAPACITY];
    }

    private int hash(int key) {
        return key % CAPACITY;
    }

    public void add(int key) {
        int idx = hash(key);
        Node curr = table[idx];
        
        while (curr != null) {
            if (curr.val == key) return;
            curr = curr.next;
        }
        
        table[idx] = new Node(key, table[idx]);
    }

    public void remove(int key) {
        int idx = hash(key);
        Node curr = table[idx];
        Node prev = null;

        while (curr != null) {
            if (curr.val == key) {
                if (prev == null) {
                    table[idx] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public boolean contains(int key) {
        int idx = hash(key);
        Node curr = table[idx];

        while (curr != null) {
            if (curr.val == key) return true;
            curr = curr.next;
        }
        return false;
    }
}
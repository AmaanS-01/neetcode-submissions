class MyHashMap {
    private static class Node {
        final int key;
        int val;
        Node next;

        Node(int key, int val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    private static final int CAPACITY = 10007;
    private final Node[] table;

    public MyHashMap() {
        table = new Node[CAPACITY];
    }

    private int hash(int key) {
        return key % CAPACITY;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        Node curr = table[idx];
        while (curr != null) {
            if (curr.key == key) {
                curr.val = value;
                return;
            }
            curr = curr.next;
        }

        table[idx] = new Node(key, value, table[idx]);
    }

    public int get(int key) {
        int idx = hash(key);
        Node curr = table[idx];

        while (curr != null) {
            if (curr.key == key) {
                return curr.val;
            }
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        int idx = hash(key);
        Node curr = table[idx];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
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
}
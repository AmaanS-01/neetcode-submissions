class MyCircularQueue {
    private final int[] data;
    private int head;   
    private int size;   
    private final int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        data = new int[k];
        head = 0;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        int tail = (head + size) % capacity;
        data[tail] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : data[head];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return data[(head + size - 1) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
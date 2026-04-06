public class ImplementCircularDeque {

    int[] deque;
    int front;
    int rear;
    int size;
    int capacity;

    // Constructor
    public ImplementCircularDeque(int k) {
        capacity = k;
        deque = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Insert at front
    public boolean insertFront(int value) {
        if (isFull()) return false;

        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        return true;
    }

    // Insert at rear
    public boolean insertLast(int value) {
        if (isFull()) return false;

        deque[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    // Delete front
    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    // Delete rear
    public boolean deleteLast() {
        if (isEmpty()) return false;

        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    // Get front element
    public int getFront() {
        if (isEmpty()) return -1;
        return deque[front];
    }

    // Get rear element
    public int getRear() {
        if (isEmpty()) return -1;
        return deque[(rear - 1 + capacity) % capacity];
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check full
    public boolean isFull() {
        return size == capacity;
    }

    // Main method for testing
    public static void main(String[] args) {
        ImplementCircularDeque dq = new ImplementCircularDeque(3);

        System.out.println(dq.insertLast(1));  // true
        System.out.println(dq.insertLast(2));  // true
        System.out.println(dq.insertFront(3)); // true
        System.out.println(dq.insertFront(4)); // false

        System.out.println(dq.getRear()); // 2
        System.out.println(dq.isFull());  // true

        System.out.println(dq.deleteLast());  // true
        System.out.println(dq.insertFront(4)); // true
        System.out.println(dq.getFront()); // 4
    }
}
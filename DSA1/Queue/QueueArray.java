class QueueArray {
    int size = 5;
    int[] arr = new int[size];
    int front = -1;
    int rear = -1;

    // Enqueue (add element)
    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            rear++;
            arr[rear] = x;
            System.out.println(x + " inserted");
        }
    }

    // Dequeue (remove element)
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front] + " removed");
            front++;
        }
    }

    // Peek (front element)
    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }

    // Display queue
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();   

        q.dequeue();   
        q.peek();      

        q.display();   
    }
}
package queue;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        StackQueue q = new StackQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Dequeued: " + q.dequeue()); 
        q.enqueue(4);
        
        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }
    }
}
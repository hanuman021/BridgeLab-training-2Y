import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    // Constructor
    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Push element onto stack
    public void push(int x) {
        q2.offer(x);

        // move all elements from q1 → q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    // Removes top element
    public int pop() {
        return q1.poll();
    }
    
    // Get top element
    public int top() {
        return q1.peek();
    }
    
    // Check if empty
    public boolean empty() {
        return q1.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();

        stack.push(1);
        stack.push(2);

        System.out.println("Top: " + stack.top());   // 2
        System.out.println("Pop: " + stack.pop());   // 2
        System.out.println("Empty: " + stack.empty()); // false
    }
}
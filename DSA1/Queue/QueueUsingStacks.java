import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    // Enqueue
    public void enqueue(int x) {
        input.push(x);
    }

    // Dequeue
    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        if (output.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return output.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}
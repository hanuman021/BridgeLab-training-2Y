import java.util.*;

class SlidingWindowMax {

    static void printMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove out-of-window elements
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            // Print max for window
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        printMax(arr, k);
    }
}
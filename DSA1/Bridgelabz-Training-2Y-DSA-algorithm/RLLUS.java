import java.util.ArrayDeque;
import java.util.Deque;

public class RLLUS {

    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { this.val = v; }
    }

   
    public static ListNode reverse(ListNode head) {
        if (head == null) return null;

        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode curr = head;

        
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        
        ListNode newHead = stack.pop();
        ListNode tail = newHead;
        tail.next = null; 

        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            tail.next = node;
            tail = node;
            tail.next = null; 
        }

        return newHead;
    }

    
    public static ListNode build(int[] values) {
        ListNode head = null;
        ListNode tail = null;
        for (int v : values) {
            ListNode node = new ListNode(v);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    
    public static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
        ListNode head = build(new int[]{1, 2, 3, 4, 5});
        System.out.print("Original: ");
        print(head);

        ListNode reversed = reverse(head);
        System.out.print("Reversed: ");
        print(reversed);
    }
}
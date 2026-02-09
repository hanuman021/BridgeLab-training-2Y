import java.util.*;
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) nums[index++] = num;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int val = sc.nextInt();

        int k = removeElement(nums, val);
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}

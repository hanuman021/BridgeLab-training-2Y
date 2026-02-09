import java.util.*;
public class RemoveDuplicatesSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) 
            return nums.length;

        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) 
                nums[index++] = nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) 
            nums[i] = sc.nextInt();

        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}

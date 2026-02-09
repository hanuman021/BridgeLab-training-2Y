import java.util.*;

public class LinearBinaryChallenge {

    static int firstMissingPositive(int[] arr) {
        boolean[] visited = new boolean[arr.length + 1];

        for (int num : arr) {
            if (num > 0 && num <= arr.length) {
                visited[num] = true;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!visited[i]) return i;
        }
        return arr.length + 1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("First Missing Positive: " + firstMissingPositive(arr));

        Arrays.sort(arr);
        int target = sc.nextInt();

        System.out.println("Target Index: " + binarySearch(arr, target));
    }
}

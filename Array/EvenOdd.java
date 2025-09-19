import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        // Check if natural number
        if (num <= 0) {
            System.out.println("Error");
            System.exit(0);
        }

        // Create arrays with size num/2 + 1
        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];

        // Initialize indexes
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        // Print even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

import java.util.Scanner;

public class SimpleInterest {
    public static int  simpleInterest(int principal, int rate, int time) {
        int si = (principal * rate * time) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int principal = sc.nextInt();
        System.out.println("Enter rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter time: ");
        int time = sc.nextInt();
        int interest = SimpleInterest.simpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + interest + " for principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}

import java.util.Scanner;
public class MutliplicaionTable69{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num1 = new int[11];
        System.out.println("Enter no for multiplication table:");
        int num =sc.nextInt();
        for (int i = 6; i < 10; i++){
             num1[i]=num*i;
             System.out.println(num + "*" + i + "=" + num1[i]);
        }
    }
}
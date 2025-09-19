import java.util.Scanner;
public class VoteChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Ages of 10 students: ");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++){
            if(num[i]<0){
                System.out.println("Invalid Input!!");
            }
            else if(num[i]>=18){
                System.out.println("The Student with the age " + num[i] + " can vote.");

            }
            else{
                System.out.println("The Student with the age " + num[i] + " cannot vote");
            }
        }
        }
    }

import java.util.Scanner;
public class NumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++){
            if(num[i]>0){
                System.out.println("Its a positive number " + num[i]);
            }
            else if(num[i]==0){
                System.out.println("Its a 0 " + num[i]);
            }
            else if(num[i]<0){
                System.out.println("Its a negative number " + num[i]);
            }
        }
        for (int i = 0; i < 5; i++){
            if(num[i]>0){            
                if(num[i] %2 == 0){
                System.out.println("Its a even number " + num[i]);
            }
            else{
                System.out.println("Its a odd number " + num[i]);
            }}
        }
        if(num[0]>num[4]){
            System.out.println(num[0] + " is greater than " + num[4]);
        }
        else if(num[0]==num[4]){
            System.out.println(num[0] + " = " + num[4]);
        }
        else if(num[0]<num[4]){
            System.out.println(num[0] + "is less than " + num[4]);
        }
    }
    }

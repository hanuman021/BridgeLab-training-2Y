import java.util.Scanner;
public class MeanHeight{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double[] arr=new Double[11];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
            sum+=arr[i];

        }
        int mean=sum/11;
        System.out.println("Mean height: "+ mean);
    }
}
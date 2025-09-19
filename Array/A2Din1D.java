import java.util.Scanner;
public class A2Din1D{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
        int[] arr1= new int[9];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[i]=arr[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println("1D array " + arr1[i]);
        }

    }
}
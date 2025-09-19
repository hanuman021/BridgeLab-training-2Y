import java.util.Scanner;
public class NoOfHandshake{
    public int handShake(int student){
        int handshake=(n*(n-1))/2;
        return handshake;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = NoOfHandshake.handShake(int student);

    }
}
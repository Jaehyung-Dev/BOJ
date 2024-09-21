import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.nextLine();
        String B = sc.nextLine();
        System.out.println(A * (B.charAt(2) - '0')); // A * B의 1의 자리수
        System.out.println(A * (B.charAt(1) - '0')); // A * B의 10의 자리수
        System.out.println(A * (B.charAt(0) - '0')); // A * B의 100의 자리수
        System.out.println(A * Integer.parseInt(B));
    }
}
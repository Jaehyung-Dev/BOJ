import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int res = 2;
        for (int i = 1; i <= N; i++) {
            res = (res-1) + res;
        }
        System.out.println(res*res);
    }
}
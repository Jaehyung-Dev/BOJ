import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        count = N / 4;
        String strcount = "";
        for(int i = 0; i < count; i++) {
            strcount += "long ";
        }
        strcount += "int";
        System.out.println(strcount);
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(M < 45){
            H--;
            M = M + 15;
            if(H < 0) {
                H = H + 24;
            }
        } else {
            M = M - 45;
        }
        System.out.println(H + " " + M);
    }
}
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] intArr = new int[N];
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
            }
        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] < X) {
                System.out.print(intArr[i] + " ");
            }
        }
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int[] intArr = new int[N];
 		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt(); 
		}
		
		Arrays.sort(intArr);

		System.out.println(intArr[N - k]);
 	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] intArr = new int[N];
		int count = 0;
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();	
		}
		int v = sc.nextInt();
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}
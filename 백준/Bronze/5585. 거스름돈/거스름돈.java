import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] coins = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		int change = 1000 - sc.nextInt();
		
		for(int i = 0; i < coins.length; i++) {
			cnt += change / coins[i];
			change %= coins[i];
			if(change == 0) {
				break;
			}
		}
		System.out.println(cnt);
 	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			System.out.println(sum);
			if(!sc.hasNextInt()) {
				break;
			}
		}
		sc.close();
	}
}
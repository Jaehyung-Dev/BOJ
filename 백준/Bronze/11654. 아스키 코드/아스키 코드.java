import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equals("[0-9]")) {
			System.out.println(str.charAt(0));
		} else {
			System.out.println((int)str.charAt(0));
		}
		sc.close();
 	}
}
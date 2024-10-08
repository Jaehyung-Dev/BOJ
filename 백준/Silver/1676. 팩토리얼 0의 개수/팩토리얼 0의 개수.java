import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger fac = BigInteger.ONE;
		
		for(int i = n; i > 1; i--) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		
		String str = fac.toString();
		String[] stArr = new String[str.length()];
		stArr = str.split("");
		int cnt = 0;
		
		for(int i = stArr.length - 1; i >= 0; i--) {
			if(stArr[i].equals("0")) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
 	}
}
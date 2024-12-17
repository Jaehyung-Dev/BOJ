import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length();
		int num = 1;
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != sb.charAt(i)) {
				num = 0;
			}
		}
		System.out.println(num);
		
	}
}
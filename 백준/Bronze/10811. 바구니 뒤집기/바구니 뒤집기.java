import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] Narr = new int[N];
		
		for(int i = 0; i < Narr.length; i++) {
			Narr[i] = i + 1;
		}
		
		for(int a = 0; a < M; a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			while(i < j) {
				int temp = Narr[i];
				Narr[i] = Narr[j];
				Narr[j] = temp;
				i++;
				j--;
			}
		}
		
		for(int i = 0; i < Narr.length; i++) {
			System.out.println(Narr[i]);
		}
	}
}

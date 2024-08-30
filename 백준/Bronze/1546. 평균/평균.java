import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		double max = 0;
		double sum = 0;
		
		max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += (arr[i] / max) * 100;
		}
		System.out.println(sum/N);
		
		sc.close();
 	}
}
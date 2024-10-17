import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] intArr = new int[T];
		
		for(int i = 0; i < T; i++) {
			String line = br.readLine();
			String[] numbers = line.split(" ");
			int sum = 0;
			
			for (String number : numbers) {
				sum += Integer.parseInt(number);
			}
			
			intArr[i] = sum;
		}
		for(int i = 1; i <= T; i++) {
			System.out.println("Case #" + i + ": " + intArr[i - 1]);
		}
	}
}
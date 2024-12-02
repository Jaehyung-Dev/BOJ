import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] A = new int[T];
		int[] B = new int[T];
		
		int[] C = new int[T];
		
		for(int i = 0; i < T; i++) {
			String[] stArr = br.readLine().split(" ");
			
			A[i] = Integer.parseInt(stArr[0]);
			B[i] = Integer.parseInt(stArr[1]);
			C[i] = A[i] + B[i];
		}
		
		for(int i = 1; i <= T; i++) {
			bw.write("Case #" + i + ": " + A[i - 1] + " + " + B[i - 1] + " = " + C[i - 1] + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
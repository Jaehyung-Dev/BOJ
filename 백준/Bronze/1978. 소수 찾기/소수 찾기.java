import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[sc.nextInt()];
        int cnt = 0;
        for(int i = 0; i < intArr.length; i++) {
        	intArr[i] = sc.nextInt();
        	if(intArr[i] != 1) {
        		cnt++;
        	}
        	for(int j = 2; j < intArr[i]; j++) {
        		if(intArr[i] % j == 0) {
        			cnt--;
        			break;
        		}
        	}
        }
        System.out.println(cnt);
    }
}
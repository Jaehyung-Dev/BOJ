import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for(int i = 0; i < nArr.length; i++) {
            nArr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for(int i = 0; i < mArr.length; i++) {
            mArr[i] = sc.nextInt();
        }
        
        Arrays.sort(nArr);

        for(int i = 0; i < mArr.length; i++) {
            int M = mArr[i];
            int start = 0;
            int end = nArr.length - 1;
            int mid;
            
            while(start <= end) { 
                mid = (start + end) / 2; 
                mArr[i] = 0;
                if(M == nArr[mid]) {
                	mArr[i] = 1;
                    break;
                } else if(nArr[mid] < M) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        for(int i : mArr) {
            System.out.println(i);
        }
    }
}
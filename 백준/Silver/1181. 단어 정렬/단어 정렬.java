import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] stArr = new String[num];
		for(int i = 0; i < stArr.length; i++) {
			stArr[i] = sc.nextLine();
		}
		
		Set<String> stSet = new HashSet<String>(Arrays.asList(stArr)); 
		stArr = stSet.toArray(new String[0]);
		
		Arrays.sort(stArr);
		
		Arrays.sort(stArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		for(String str : stArr) {
			System.out.println(str);
		}
 	}
}
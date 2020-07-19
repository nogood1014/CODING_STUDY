package level6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		if (A < 100 && A > 1000 && B < 100 && B > 1000 && C < 100 && C > 1000) {
			return;
		}

		int result = A * B * C;
		String resultS = String.valueOf(result);
		int[] resultArray = new int[resultS.length()];
		for (int i = 0; i < resultS.length(); i++) {
			resultArray[i] = resultS.charAt(i) - '0';// char ->int 형변환 방법!
		}
		int count = 0;
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < resultArray.length; i++) {
				if (resultArray[i] == j)
					count++;
			}
			System.out.println(count);
			count = 0;
		}
	}
}

//[ 더하기 사이클 ]
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int N1 = 0;
		int N2 = 0;
		int sum = 0;
		int count = 0;
		int N3 = N;

		if (N < 0 && N > 100) {
			return;
		}
		while (true) {

			N1 = N % 10;// 6
			N2 = N / 10;// 2
			sum = N1 + N2;// 8
			if (sum >= 10) {
				sum = sum % 10;
			}

			N = N1 * 10 + sum;
	
			count++;
			if (N3 == N) {
				System.out.println(count);
				break;
			}
		}

	}
}

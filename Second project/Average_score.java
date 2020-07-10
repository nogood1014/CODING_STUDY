package level5;

import java.util.Scanner;

public class Average_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int score[] = new int[5]; // 선언과 동시에 배열 크기 할당
		int sum =0;
		int avg =0;
		
		for (int i = 0; i < 5; i++) {
			score[i] = s.nextInt();
			if (score[i] > 100 && score[i] < 0 && !(score[i] % 5 == 0)) {
				return;
			}
		} // 입력해주는 for문

		for (int i = 0; i < 5; i++) {
			if (score[i] < 40) {
				score[i]=40;
			}
			sum = sum+score[i];
		}
		
		avg = sum/5;
		System.out.println(avg);
	}

}

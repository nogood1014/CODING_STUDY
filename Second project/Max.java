package level6;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int num[] = new int[9];

		for (int i = 0; i < 9; i++) {
			num[i] = s.nextInt();
			if (num[i] > 99 && num[i] <= 0) {
				return;
			}
		}

		int Max = 0;
		int index=0;
		for (int i = 0; i < 9; i++) {
			if(Max<num[i]) {
				Max=num[i];
			}
		}
		for (int i = 0; i < 9; i++) {
			if(Max==num[i]) {
				index = i+1;
			}
		}
		
		System.out.println(Max);
		System.out.println(index);
		

	}

}

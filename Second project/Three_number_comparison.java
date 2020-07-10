package level5;

import java.util.Scanner;

public class Three_number_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		
		
		
		if(A<=B&&A>=C || A>=B&&A<=C) {
			System.out.println(A);
		}else if(B>=A&&B<=C||B<=A&&B>=C) {
			System.out.println(B);
		}else if(C>=A&&C<=B||C<=A&&C>=B) {
			System.out.println(C);
		}
		
		
		
	}

}

package level5;

import java.util.Scanner;

public class star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		if(num<1 && num>100) {
			return;
		}
		
		int line = 2*num-1; //5
		
		for(int i=1; i<=line-(num-1); i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=line-num; i++) {
			for(int j=num-1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

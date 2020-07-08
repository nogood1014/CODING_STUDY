// [ 곱셈 ]
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt(); //326
	
		if(A<=99 || A>=10000 || B<=99 || B>=1000) {
			return;
		}
		int B1 = B/100; //3
		int C1 = B%100;//26
		int B2 = C1/10; //2
		int B3 = C1 % 10; //6
	

		
		System.out.println(A*B3);
		System.out.println(A*B2);
		System.out.println(A*B1);
		System.out.println(A*B);
		
		
	}

}

// [ A*B ]
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		if(A<=0 || B>=10) {
			return;
		}
		System.out.println(A*B);

				
		
	}

}

//[ 별 찍기 - 2 ]
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=N; j-1>i; j--) {
				System.out.print(" ");
			}
			
			for(int k =1; k<=i+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		
	}

}

//[ A+B - 7 ]
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		int num1 =0;
		int num2 =0;
		
		for(int i =1; i<=T; i++) {
			 num1 = s.nextInt();
			 num2 = s.nextInt();
			 
			 System.out.print("Case #"+i+": ");
			 System.out.println(num1+num2);
		}
		
		
		
		
	}

}

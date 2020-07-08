// [ 알람 시계 ]
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt();
		int M = s.nextInt();
		
		if(M>=45) {
			M= M-45;
		}else if(M<45&&M>=0) {
			H= H-1;
			M = 60 - (45-M);
			if(H<0) {
				H=23;
			}
		}
		
		
		System.out.println(H+" "+M);
	
		
	}

}

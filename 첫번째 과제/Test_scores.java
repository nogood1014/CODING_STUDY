//[ 시험 성적 ]
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		
		int score = s.nextInt();
	
	
		if((score<=100) && (score>=90)) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score >=60) {
			System.out.println("D");
		}else if(score >=0) {
			System.out.println("F");
		}
		
		
	}

}

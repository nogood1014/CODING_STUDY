package level6;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N =s.nextInt();
		
		double score[] = new double[N];
		double Max = 0;
		for(int i =0; i<N; i++) {
			score[i]=s.nextDouble();
			if(Max<score[i]) {
				Max=score[i];
			}
		}
		double sum =0;
		for(int i =0; i<N; i++) {
			score[i]=score[i]/Max*100;
		sum = sum + score[i];	
		}
		System.out.println(sum/N);
		
		
		
		
	
		
		
	}

}

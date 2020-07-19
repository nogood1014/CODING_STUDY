package level6;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		if(N<1&&N>1000000) {
			return;
		}
		
		int num[] = new int[N];
//		int Max = 0;
//		int Min = 0;
		
		for(int i=0; i<N; i++) {
			num[i]=s.nextInt();
			
		}
		
		Arrays.sort(num);
		System.out.print(num[0] + " " + num[N - 1]);
	}
}
//		for(int i=0; i<N; i++) {
//			if(Max<=num[i]) {
//				Max=num[i];
//			}
//		}
//		Min = num[0];
//		for(int i=0; i<N; i++) {
//			
//			if(Min>=num[i]) {
//				Min=num[i];
//		
//			}
//			
//		}
//		System.out.print(Min +" "+Max);
		
//	}
//
//}

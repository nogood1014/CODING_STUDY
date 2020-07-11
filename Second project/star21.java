package level5;

import java.util.Scanner;

public class star21 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
 
		for(int i = 1; i <= 2*N; i++){
 
			// È¦¼ö Çà
			if(i % 2 == 1){
				for(int j = 1; j <= N; j++){
					// È¦¼ö ¹øÂ°
					if(j % 2 == 1){
						System.out.print("*");
					}
					// Â¦¼ö ¹øÂ°
					else{
						System.out.print(" ");
					}
				}
			}
 
			// Â¦¼ö Çà
			else{
				for(int j = 1; j <= N; j++){
					// È¦¼ö ¹øÂ°
					if(j % 2 == 1){
						System.out.print(" ");
					}
					// Â¦¼ö ¹øÂ°
					else{
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
 
		}
 
 
	}
}

package level5;

import java.util.Scanner;

public class star21 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
 
		for(int i = 1; i <= 2*N; i++){
 
			// Ȧ�� ��
			if(i % 2 == 1){
				for(int j = 1; j <= N; j++){
					// Ȧ�� ��°
					if(j % 2 == 1){
						System.out.print("*");
					}
					// ¦�� ��°
					else{
						System.out.print(" ");
					}
				}
			}
 
			// ¦�� ��
			else{
				for(int j = 1; j <= N; j++){
					// Ȧ�� ��°
					if(j % 2 == 1){
						System.out.print(" ");
					}
					// ¦�� ��°
					else{
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
 
		}
 
 
	}
}

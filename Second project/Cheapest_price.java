package level5;

import java.util.Scanner;

public class Cheapest_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int price[] = new int[5];
		// 0:상덕버거, 1:중덕버거 , 2:하덕버거, 3:콜라 , 4:사이다
		int cheapH = 0; // 가장 싼 햄버거 변수
		int cheapV = 0; // 가장 싼 음료 변수
		for (int i = 0; i < 5; i++) {
			price[i] = s.nextInt();
			if (price[i] < 100 && price[i] > 2000) {
				return;
			}
		}
		if (price[0] < price[1]) {
			cheapH = price[0];
			if (cheapH > price[2]) {
				cheapH = price[2];
			}
		} else {
			cheapH = price[1];
			if (cheapH > price[2]) {
				cheapH = price[2];
			}
		} // cheapH구하기

		if (price[3] < price[4]) {
			cheapV = price[3];
		} else {
			cheapV = price[4];
		} //cheapV구하기
		
		int set = cheapH+cheapV -50;
		System.out.println(set);

	}
}

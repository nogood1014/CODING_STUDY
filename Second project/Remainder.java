package level6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Remainder { //TreeSet 중복제거해줌

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num[]= new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = s.nextInt();
			
		}
		
		int D[] =new int[10];
		for (int i = 0; i < 10; i++) {
			D[i] = num[i]%42;
			
		}
		TreeSet t = new TreeSet();

        for(int i=0; i< D.length; i++)

        {
            t.add(D[i]);
        }
        System.out.println(t.size());
        
		
	}

}

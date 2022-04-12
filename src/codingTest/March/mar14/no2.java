package codingTest.March.mar14;

import java.util.*;

public class no2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		
		int a = in.charAt(0) - 96;
		int n = (int)in.charAt(1) - '0';
		int[][] move = {
				{-2, -1},
				{-2, 1},
				{2, -1},
				{2, 1},
				{-1, -2},
				{-1, 2},
				{1, -2},
				{1, 2}
		};
		
		int res = 0;

		for(int i=0; i<8; i++) {
			int x = a + move[i][0];
			int y = n + move[i][1];
			if(x >= 1 && x <= 8 && y >= 1 && y <= 8) 
				res++;
		}
		System.out.println(res);
	
		
		
	}

}

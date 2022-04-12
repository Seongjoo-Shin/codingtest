package codingTest.March.mar10;

import java.util.*;

public class no2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int N = Integer.parseInt(s.split(" ")[0]);
		int M = Integer.parseInt(s.split(" ")[1]);

		int low = Integer.MIN_VALUE;
		
		for(int a=0; a<N; a++) {
			String s1 = sc.nextLine();
			String[] a1 = s1.split(" ");
			
			int[] ary = new int[M];
			
			for(int i=0; i<M; i++) {
				ary[i] = Integer.parseInt(a1[i]);
			}
			
			Arrays.sort(ary);
			
			int min = ary[0];
			
			if(min > low){
				low = min;
			}
		}
		
		System.out.println(low);
	}
}
/*
3 3
3 1 2
4 1 4
2 2 2

2 4
7 3 1 8
3 3 3 4
*/
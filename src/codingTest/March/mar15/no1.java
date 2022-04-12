package codingTest.March.mar15;

import java.util.*;

public class no1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		int result = 0;
		
		if(N >= 0 && N <= 23) {
			for(int h=0; h<=N; h++) {
				for(int m=0; m<60; m++) {
					for(int s=0; s<60; s++) {
						String h1 = Integer.toString(h);
						String m1 = Integer.toString(m);
						String s1 = Integer.toString(s);
						if(!h1.contains("3") && !m1.contains("3") && !s1.contains("3")) {
							continue;
						} else {
							result++;
						}
					}
				}
			}	
		}
		
		System.out.println(result);
	}

}

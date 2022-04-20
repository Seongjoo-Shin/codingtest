package codingTest.April.apr20;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.nextLine());
		
		int[] result = new int[A];
		
		for(int i=0; i<A; i++) {
			int[] ary = new int[10];
			String[] tmp = sc.nextLine().split(" ");
			for(int j=0; j<tmp.length; j++) {
				ary[j] = Integer.parseInt(tmp[j]);
			}
			
			for(int a=0; a<10; a++) {
				for(int b=0; b<10; b++) {
					if(ary[a] < ary[b]) {
						int n = ary[a];
						ary[a] = ary[b];
						ary[b] = n;
					}	
				}
			}
			
			result[i] = ary[7];
		}
		
		for(int i : result) {
			System.out.println(i);
		}
	}
	
}

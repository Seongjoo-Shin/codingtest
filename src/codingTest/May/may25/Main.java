package codingTest.May.may25;

import java.util.Scanner;

public class Main { // 15654 N과 M (5)

	static int N;
	static int M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		int[] num = new int[N];
		
		String[] ntemp = sc.nextLine().split(" ");
		
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(ntemp[i]);
		}
		
		
	}

}

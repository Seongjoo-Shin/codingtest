package practice;

import java.util.Scanner;

public class backTracking {
	
	static int N, M;
//	static boolean C[];
	static int A[];
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
//		C = new boolean[N+1];
		A = new int[N+1];
		
		go(0);
		System.out.println(sb);
	}
	
	public static void go(int index) {
		if(index == M) {
			for(int i=0; i<M; i++) {
				sb.append(A[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=N; i++) {
//			if(C[i])
//				continue;
//			C[i] = true;
			A[index] = i;
			go(index+1);
//			C[i] = false;
		}
	}

}

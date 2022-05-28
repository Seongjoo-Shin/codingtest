package practice;

import java.util.Scanner;

public class backTracking {
	
//	static int N, M;
//	static boolean C[];
//	static int A[];
	
	public static int[] arr;
	public static boolean[] visit;
	
//	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		String[] temp = sc.nextLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		
//		C = new boolean[N+1];
//		A = new int[N+1];
		
//		go(0);
//		System.out.println(sb);
	}
	
//	public static void go(int index) {
//		if(index == M) {
//			for(int i=0; i<M; i++) {
//				sb.append(A[i]).append(" ");
//			}
//			sb.append("\n");
//			return;
//		}
//		
//		for(int i=1; i<=N; i++) {
//			if(C[i])
//				continue;
//			C[i] = true;
//			A[index] = i;
//			go(index+1);
//			C[i] = false;
//		}
//	}

	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}

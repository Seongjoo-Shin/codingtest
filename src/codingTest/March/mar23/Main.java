package codingTest.March.mar23;

import java.util.Scanner;

public class Main {

	static int N;
	static int M;
	static int[][] ICE;
	
	static int cnt=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		ICE = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String[] tmp = sc.nextLine().split(" ");
			for(int j=0; j<M; j++) {
				ICE[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(dfs(i, j)) {
					cnt++;					
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	static boolean dfs(int r, int c) {
		
		if(r < 0 || c < 0 || r >= N || c >= M)
			return false;
		
		if(ICE[r][c] == 0) {
			ICE[r][c] = 1;
			
			dfs(r-1, c);
			dfs(r+1, c);
			dfs(r, c-1);
			dfs(r, c+1);
			
			return true;
		}
		return false;
	}
}

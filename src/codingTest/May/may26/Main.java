package codingTest.May.may26;

import java.util.Scanner;

public class Main { // 1388 바닥장식
	
	static String[][] map;
	static boolean[][] visited;
	static int result = 0;
	static int N, M;
	static boolean flag;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		map = new String[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String[] t1 = sc.nextLine().split("");
			for(int j=0; j<M; j++) {
				map[i][j] = t1[j];
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(dfs(i, j)) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
	
	static boolean dfs(int r, int c) {
		if(r < 0 || c < 0 || r >= N || c >= M) 
			return false;
		
		if(!visited[r][c]) {
			visited[r][c] = true;
			if(map[r][c].equals("-") && (c == M-1 || map[r][c+1].equals("-"))) {
				dfs(r, c+1); // 오른쪽으로
			}
			else if(map[r][c].equals("|") && (r == N-1 || map[r+1][c].equals("|"))) {
				dfs(r+1, c); // 아래로
			}
			return true;
		}

		return false;
	}
	
}

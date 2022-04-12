package codingTest.March.mar30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static int N, M, K;
	static int[][] map;
	static int cnt = 0;
	static int result = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> resultAry = new ArrayList<>();
		
		String[] set = sc.nextLine().split(" ");
		
		N = Integer.parseInt(set[0]);
		M = Integer.parseInt(set[1]);
		K = Integer.parseInt(set[2]);
		
		map = new int[N][M];
		
		for(int c=0; c<K; c++) {
			String[] pos = sc.nextLine().split(" ");
			int x1 = Integer.parseInt(pos[0]);
			int y1 = Integer.parseInt(pos[1]);
			int x2 = Integer.parseInt(pos[2]);
			int y2 = Integer.parseInt(pos[3]);
			for(int i=y1; i<y2; i++) {
				for(int j=x1; j<x2; j++) {
					map[i][j] = 1;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(map[i][j] + " ");
			}System.out.println();
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(dfs(i, j)) {
					resultAry.add(result);
					result = 0;
					cnt++;
				}
			}
		}
		Collections.sort(resultAry);
		System.out.println(cnt);
		for(int i=0; i < resultAry.size(); i++){
			System.out.print(resultAry.get(i) + " ");
		}
	}
	
	static boolean dfs(int r, int c) {
		
		if(r < 0 || c < 0 || r >= N || c >= M)
			return false;
		
		if(map[r][c] == 0) {
			map[r][c] = 1;
			result++;
			dfs(r-1, c);
			dfs(r+1, c);
			dfs(r, c-1);
			dfs(r, c+1);
			return true;
		}
		return false;
	}
}
/*
5 7 3
0 2 4 4
1 1 2 5
4 0 6 2

*/
package codingTest.March.mar31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static int[][] map;
	static int N;
	static int result = 0;
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> resultAry = new ArrayList<>();
		
		map = new int[N][N];
		
		for(int i=0; i<N; i++) {
			String[] tmp = sc.nextLine().split("");
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(dfs(i,j)) {
					resultAry.add(result);
					result = 0;
					cnt++;
				}
			}
		}
		Collections.sort(resultAry);
		System.out.println(cnt);
		for(int i=0; i < resultAry.size(); i++){
			System.out.println(resultAry.get(i) + " ");
		}
	}
	
	static boolean dfs(int r, int c) {
		
		if(r < 0 || c < 0 || r >= N || c >= N)
			return false;
		
		if(map[r][c] == 1) {
			map[r][c] = 0;
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

package codingTest.April.apr07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static int N, M;
	static int[][] map;
	static int result = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> res = new ArrayList<>();
		
		String[] tmp = sc.nextLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);
		
		map = new int[N+2][M+2];
		
		for(int i=0; i<N+2; i++) {
			for(int j=0; j<M+2; j++) {
				map[i][j] = -1;
			}
		}
		
		
		for(int i=1; i<N+1; i++) {
			String[] tmp2 = sc.nextLine().split(" ");
			for(int j=1; j<M+1; j++) {
				map[i][j] = Integer.parseInt(tmp2[j-1]);
			}
		}
		
		safe(map);
		
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<M+1; j++) {
				if(dfs(i,j)) {
					res.add(result);
					result = 0;
				}
			}
		}
		Collections.sort(res);
		System.out.println(res.get(res.size()-1));
		sc.close();
	}
	
	static void safe(int[][] maps){
		ArrayList<String> ary = new ArrayList<>();
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<M+1; j++) {
				if(maps[i][j] == 1) {
					ary.add(i+","+j);
				}
			}
		}
		for(String s : ary) {
			int x = Integer.parseInt(s.split(",")[0]);
			int y = Integer.parseInt(s.split(",")[1]);
			map[x-1][y] = 1;
			map[x+1][y] = 1;
			map[x][y-1] = 1;
			map[x][y+1] = 1;
			map[x-1][y-1] = 1;
			map[x-1][y+1] = 1;
			map[x+1][y-1] = 1;
			map[x+1][y+1] = 1;
			
		}
	}
	
	static boolean dfs(int r, int c) {
		if(r < 1 || c < 1 || r >= N+1 || c >= M+1)
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

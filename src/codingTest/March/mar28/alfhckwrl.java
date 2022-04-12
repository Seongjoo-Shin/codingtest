package codingTest.March.mar28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class alfhckwrl {
	
	static int N, M;
	static int[][] map;
	static int cnt = 0;
	static int[][] move = {
							{1,0},
							{-1,0},
							{0,-1},
							{0,1}
						  };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		
		map = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String[] tmp = sc.nextLine().split("");
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		bfs(0, 0);
		System.out.println(map[N-1][M-1]);
	}
	
	public static void bfs(int r, int c) {
		
		Queue<String> queue = new LinkedList<>();
		queue.offer(r + "," + c);
		
		while(!queue.isEmpty()) {
			String t = queue.poll();
			int x = Integer.parseInt(t.split(",")[0]);
			int y = Integer.parseInt(t.split(",")[1]); 
			for(int i=0; i<4; i++) {
				int nx = x + move[i][0];
				int ny = y + move[i][1];
				
				if(nx < 0 || ny < 0 || nx >= N || ny >= M) 
					continue;
				if(map[nx][ny] == 0)
					continue;
				
				if(map[nx][ny] == 1) {
					map[nx][ny] = map[x][y] + 1;
					if(nx == N-1 && ny == M-1) {
						break;
					}
					queue.offer(nx + "," + ny);
				}
			}
		}
	}
}
/*
 
5 6  
101010
111111
000001
111111
111111  
  
 */
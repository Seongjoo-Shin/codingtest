package codingTest.April.apr05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int M, N, H;
	static int[][][] map;
	static int day = 0;
	static int[] moveX = {1,-1,0,0,0,0};
	static int[] moveY = {0,0,1,-1,0,0};
	static int[] moveZ = {0,0,0,0,1,-1};
	static ArrayList<String> ary = new ArrayList<>();
	static Queue<String> q = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] tmp = sc.nextLine().split(" ");
		M = Integer.parseInt(tmp[0]);
		N = Integer.parseInt(tmp[1]);
		H = Integer.parseInt(tmp[2]);
		
		map = new int[N+1][M+1][H+1];
		
		for(int h=0; h<H; h++) {
			for(int n=0; n<N; n++) {
				String[] tmp2 = sc.nextLine().split(" ");
				for(int m=0; m<M; m++) {
					map[n][m][h] = Integer.parseInt(tmp2[m]);
					if(map[n][m][h] == 1) {
						q.offer(n+","+m+","+h);
					} 
				}
			}
		}
		
		

		bfs();
		System.out.println(map[N-1][M-1][H-1]);
		
	}	
	
	static void bfs() {
		while(!q.isEmpty()) {
			String temp = q.poll();
			int x1 = Integer.parseInt(temp.split(",")[0]);
			int y1 = Integer.parseInt(temp.split(",")[1]);
			int z1 = Integer.parseInt(temp.split(",")[2]);
			for(int i=0; i<6; i++) {
				int x2 = x1 + moveX[i];
				int y2 = y1 + moveY[i];
				int z2 = z1 + moveZ[i];
				if(x2 < 0 || y2 < 0 || z2 < 0 || x2 >= N || y2 >= M || z2 >= H) {
					continue;
				} 
				
				if(map[x2][y2][z2] == 0) {
					map[x2][y2][z2] = map[x1][y1][z1] + 1;
					q.offer(x2+","+y2+","+z2);
					day++;
				}
				if(map[x2][y2][z2] == 1) {
					continue;
				}	
			}
		}
	}
}

/*
5 3 1
0 -1 0 0 0
-1 -1 0 1 1
0 0 0 1 1
  
  
5 3 2
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0  
 */
 
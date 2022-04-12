package codingTest.April.apr07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	static int N, M;
	static int[][] map;
	static int result = 0;
	static boolean[][] visited;
	static int[][] move = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }, { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] tmp = sc.nextLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);

		map = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String[] tmp2 = sc.nextLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(tmp2[j]);
			}
		}


	}

	static void maps(int r, int c) {
		visited[r][c] = true;
		for (int i = 0; i < 8; i++) {
			int mx = r + move[i][1];
			int my = c + move[i][0];

			if (mx < 0 || my < 0 || mx >= N || my >= M)
				continue;

			if (visited[mx][my] == true)
				continue;

			if (map[mx][my] == 0 && visited[mx][my] == false) {
				map[mx][my] = 1;
				visited[mx][my] = true;
				result++;
			}
		}
	}

}

/*
5 4
0 0 1 0
0 0 0 0
1 0 0 0
0 0 0 0
0 0 0 1 
*/

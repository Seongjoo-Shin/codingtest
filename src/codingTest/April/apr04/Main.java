package codingTest.April.apr04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N, M, result = 0; // 변수 선언
	static int[][] map; // 2차원 배열 선언
	static int[][] move = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } }; // 상, 하, 좌, 우로 이동하는 배열을 초기화 선언


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] tmp = sc.nextLine().split(" ");
		N = Integer.parseInt(tmp[0]);
		M = Integer.parseInt(tmp[1]);

		map = new int[N][M]; // 입력값으로 배열 초기화

		for (int i = 0; i < N; i++) {
			String[] tmp2 = sc.nextLine().split("");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(tmp2[j]);
			}
		}

		bfs(0, 0); // 넓이 우선 탐색
		System.out.println(map[N - 1][M - 1]);

	}

	public static void bfs(int r, int c) { // 넓이 우선 탐색

		Queue<String> queue = new LinkedList<>(); // Queue 선언
		queue.offer(r + "," + c); // 큐에 좌표 값을 ,을 더해 문자열로 추가

		while (!queue.isEmpty()) { // 큐가 비어있지 않을 떄 까지
			String t = queue.poll(); // 처음 넣은 큐를 하나씩 빼서 진행
			int x = Integer.parseInt(t.split(",")[0]);
			int y = Integer.parseInt(t.split(",")[1]);
			for (int i = 0; i < 4; i++) { // 4방향으로 진행하는 반복문 
				int nx = x + move[i][0];
				int ny = y + move[i][1];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M) // 범위를 벗어나는 경우는 제외
					continue;
				if (map[nx][ny] == 0) // 값이 0인 경우도 제외
					continue;

				if (map[nx][ny] == 1) { // 값이 1인 경우에만
					map[nx][ny] = map[x][y] + 1; // 배열의 현재 위치에 1을 더한다
					if (nx == N - 1 && ny == M - 1) { // 맵의 끝에 도착하면 break
						break;
					}
					queue.offer(nx + "," + ny); // 진행한 방향의 값을 다시 큐에 넣는다
				}
			}
		}
	}
}
/*
4 6
101111
101010
101011
111011 
  
  
 */

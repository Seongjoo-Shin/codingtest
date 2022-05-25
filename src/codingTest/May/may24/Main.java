package codingTest.May.may24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[] mx = {0, 1};
	static int[] my = {1, 0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.nextLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String[] temp = sc.nextLine().split(" ");
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
		bfs();
		
	}
	
	public static void bfs() {
		Queue<String> q = new LinkedList<>();
		visited[0][0] = true;
		
		q.offer("0,0");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			int x = Integer.parseInt(s.split(",")[0]);
			int y = Integer.parseInt(s.split(",")[1]);
			int n = map[x][y];
			if(n == -1) {
				System.out.println("HaruHaru");
				return;
			}
			
			for(int i=0; i<2; i++) {
				int nx = x + mx[i] * n;
				int ny = y + my[i] * n;
				if(nx >= 0 && ny >= 0 && nx < N && ny < N && visited[nx][ny] == false) {
					visited[nx][ny] = true;
					q.offer(nx+","+ny);
				}
			}
		}
		System.out.println("Hing");
	}

}

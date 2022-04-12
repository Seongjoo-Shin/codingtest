package codingTest.March.mar29;

import java.util.*;
public class Main {
	
	static int N, M, start, end;
	static int[][] map;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.nextLine());
		M = Integer.parseInt(sc.nextLine());
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			String[] s = sc.nextLine().split(" ");
			start = Integer.parseInt(s[0]);
			end = Integer.parseInt(s[1]);
			map[start][end] = 1;
			map[end][start] = 1;
		}
		
		System.out.println(bfs(1));
	}
	
	public static int bfs(int point) {
		Stack<Integer> result = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		q.offer(point);
		visited[point] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			for(int i=1; i<=N; i++) {
				if(map[x][i] == 1 & visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					result.push(i);
				}
			}
		}
        
        return result.size();
	}
}



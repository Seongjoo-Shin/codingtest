 package codingTest.March.mar28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class qorwns {
	
	static int[][] map1;
	static int[][] map2;
	static int[][] map3;
	static boolean[] visited1;
	static boolean[] visited2;
	static boolean[] visited3;
	static int N, M, start, end, S;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] num = sc.nextLine().split(" ");
		
		N = Integer.parseInt(num[0]);
		M = Integer.parseInt(num[1]);
		S = Integer.parseInt(num[2]);
		
		map1 = new int[N+1][N+1];
		map2 = new int[N+1][N+1];
		map3 = new int[N+1][N+1];
		visited1 = new boolean[N+1];
		visited2 = new boolean[N+1];
		visited3 = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			String[] s = sc.nextLine().split(" ");
			start = Integer.parseInt(s[0]);
			end = Integer.parseInt(s[1]);
			map1[start][end] = 1;
			map1[end][start] = 1;
			map2[start][end] = 1;
			map2[end][start] = 1;
			map3[start][end] = 1;
			map3[end][start] = 1;
		}
		
		dfs(S);
		System.out.println();
		dfs1(S);
		System.out.println();
		bfs(S);
				
	}
	
	public static void bfs(int point) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(point);
		visited1[point] = true;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			for(int i=1; i<=N; i++) {
				// 가장 최근데 출력한 결과 위치와 연결되어있고 방문하지 않았다면?
				if(map1[x][i] == 1 && visited1[i] == false) { 
					queue.offer(i);
					visited1[i] = true;
				}
			}
			System.out.print(x + " "); // 탐색 완료 위치
		}
	}
	
	public static void dfs(int point) {
		visited2[point] = true;			
		System.out.print(point + " ");
		
		for(int i=1; i<=N; i++) {
			if(map2[point][i] == 1 & visited2[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void dfs1(int point) {
		Stack<Integer> stack = new Stack<>();
		stack.push(point);
		visited3[point] = true;
		
		while(!stack.isEmpty()) {
			int x = stack.pop();
			for(int i=1; i<=N; i++) {
				if(map3[x][i] == 1 & visited3[i] == false) {
					stack.push(i);
					visited3[i] = true;
				}
			}
			System.out.print(x + " ");
		}
	}
}
/*
 
4 5 1
1 2
1 3
1 4
2 4
3 4
  
 */

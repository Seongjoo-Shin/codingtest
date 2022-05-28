package codingTest.May.may27;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int[] arr;
	static int[] d;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp1 = sc.nextLine().split(" ");
		int N = Integer.parseInt(temp1[0]);
		int M = Integer.parseInt(temp1[1]);
		
		arr = new int[N];
		visited = new boolean[N];
		d = new int[M];
		
		String[] temp2 = sc.nextLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(temp2[i]);
		}
		
		Arrays.sort(arr);
		
		dfs(arr, M, 0);
	}
	
	public static void dfs(int[] ary, int M, int depth) {
		if(depth == M) {
			for( int val : d) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<ary.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				d[depth] = ary[i];
				dfs(ary, M, depth+1);
				visited[i] = false;
			}
		}
	}
}

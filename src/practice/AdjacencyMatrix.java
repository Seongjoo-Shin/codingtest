package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 인접 행렬 : 2차원 배열로 그래피의 연결로 표현하는 방식
public class AdjacencyMatrix {
	
	public static int INF = Integer.MAX_VALUE;
	
	public static List<List<Integer>> graph  = new ArrayList<>();
	
	public static void input() {
		// INF는 이동이 불가능한 경우를 뜻함
		graph.add(Arrays.asList(0, 7, 5));
		graph.add(Arrays.asList(7, 0, INF));
		graph.add(Arrays.asList(5, INF, 0));
	}
	
	public static void print() {
		input();
		System.out.println(graph);
	}
	
	public static void main(String[] args) {
		print();
	}

}

package codingTest.April.apr01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static int T, M, N, K; // 변수선언
	static int[][][] map; // 3차원 배열로 배열을 입력받음
	static int result = 0; // 결과를 출력할 변수 
	static int cnt = 0; // 카운트할 변수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너
		ArrayList<Integer> res = new ArrayList<>(); // 중간 결과를 저장할 ArrayList
		T = Integer.parseInt(sc.nextLine()); 
		
		map = new int[T][][]; // 3차원 배열의 반복 횟수로 사용할 T로 초기화
		
		for(int i=0; i<T; i++) { // T 만큼 반복
			String[] tmp1 = sc.nextLine().split(" ");
			M = Integer.parseInt(tmp1[0]);
			N = Integer.parseInt(tmp1[1]);
			K = Integer.parseInt(tmp1[2]);
			map[i] = new int[M][N];
			for(int a=0; a<K; a++) {
				String[] tmp2 = sc.nextLine().split(" ");
				int x = Integer.parseInt(tmp2[0]);
				int y = Integer.parseInt(tmp2[1]);
				map[i][x][y] = 1; // 1로 초기화
			}
			for(int j=0; j<M; j++) {
				for(int k=0; k<N; k++) {
					if(dfs(i,j,k)) { // 깊이 우선 탐색 사용
						cnt++; // dfs함수가 true인 경우에만 값을 1증가
					}
				}
			}
			res.add(cnt); // ArrayList에 cnt를 추가한후
			cnt = 0; // cnt를 다시 0으로 초기화
		}
		
		for(int i : res) {
			System.out.println(i);
		}
		
	}
	
	static boolean dfs(int i, int r, int c) {
		
		if(r < 0 || c < 0 || r >= M || c >= N) { // 배열의 범위에 맞지 않는 경우 false를 리턴
			return false;
		}
		if(map[i][r][c] == 1) { // map에서 1인경우
			map[i][r][c] = 0; // 0으로 바꿔주고 
			result++; // result값을 1증가
			dfs(i, r-1, c); // 맵의 현재위치에서 왼쪽으로
			dfs(i, r+1, c); // 맵의 현재위치에서 오른쪽으로
			dfs(i, r, c-1); // 맵의 현재위치에서 위로
			dfs(i, r, c+1); // 맵의 현재위치에서 아래로
			
			return true; // 재귀호출이 끝나고 true를 리턴
		}
		return false;
	}
	
}
/*
2 테스트 케이스
M  N K    ( M - 배추밭 가로길이, N - 배추밭 세로길이, K - 위치의 개수 )
10 8 17 
0 0
1 0
1 1
4 2
4 3
4 5
2 4
3 4
7 4
8 4
9 4
7 5
8 5
9 5
7 6
8 6
9 6
10 10 1
5 5
*/

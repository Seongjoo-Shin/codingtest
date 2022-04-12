package codingTest.February.feb21;

import java.util.*;

public class test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine()); // N x N 행렬의 N을 입력받음
		
		String[] array = new String[N]; // N x N으로 입력받은 1차원 배열
		int[][] map = new int[N+1][N+1]; // 입력받은 1차원 문자열 배열을 정수형으로 바꿔서 넣어줄 2차원 배열
		int[][] result = new int[N+1][N+1]; // 결과를 저장할 2차원 배열
		
		// 입력받는 부분
		for(int i=0; i<N; i++) {
			array[i] = sc.nextLine();
			String[] tmp = array[i].split(" ");
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		
		
		result[0][0] = 1; // 시작 위치를 방문
		
		for(int i=0; i<N; i++) { // 오른쪽으로 이동
			for(int j=0; j<N; j++) { // 밑으로 이동
				if(i == (N - 1) && j == (N -1)) { // 현재 위치가 오른쪽 끝이라면, 현재위치가 가장 아래라면
					continue; // 넘어간다
				} 
				
				int dist = map[i][j]; // 현재 위치에서 이동가능한 거리
				int down = dist + i; // 아래로 이동하는 경우
				int right = dist + j; //오른쪽으로 이동하는 경우
				
				if(down < N) { // 아래로 이동하는 경우가 게임판의 크기보다 작은경우
					result[down][j] += result[i][j]; // 현재 위치 방문 개수를 저장
//					System.out.println("i,j : " + i + ", " + j + ", result["+down+"]["+j+"] : " + result[down][j] + ",  result["+i+"]["+j+"] : " + result[i][j]);
				}
				
				if(right < N) { // 오른쪽으로 이동하는 경우가 게임판의 크기보다 작은경우
					result[i][right] += result[i][j]; // 현재 위치 방문 개수를 저장
//					System.out.println("i,j : " + i + ", " + j + ", result["+i+"]["+right+"] : " + result[i][right] + ",  result["+i+"]["+j+"] : " + result[i][j]);
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(result[N-1][N-1]); // N x N의 마지막 우측 최하단 값을 출력
		
	}

}

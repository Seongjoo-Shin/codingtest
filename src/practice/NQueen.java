package practice;
// 백트래킹
public class NQueen {
	
	static int N = 8; // N X N 
	static int[][] board = new int[8][8]; 

	public static void main(String[] args) {
		if(put_queen(0) == false) {
			System.out.println("solution dosen't exist");
		}
		else {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	// 재귀와 반복을 통해 문제를 해결하는 메소드 ( 각 컬럼에 대한 체크 )
	static boolean put_queen(int col) {
		
		// N보다 열의 숫자가 높거나 같다면 모든 열에 퀸이 배치된 상태를 의미
		if(col >= N)
			return true;
		
		// 현재 열에서 각 행을 하나씩 체크
		for(int i=0; i<N; i++) {
			// 현재 열의 i번째 행에 퀸을 위치시킬 수 있는지 확인
			if(check(i, col) == true) {
				board[i][col] = 1;
				
				// 위치 시켰다면, 이후 열에 대해서도 연속적으로 가능한지 확인
				if(put_queen(col+1) == true) {
					return true;
				}
				
				// 만약 이후 열에 대해서 true 반환이 안되었다면 다시 0으로 수행
				// 백트래킹을 통해 다음 row로 넘어가서 수행
				board[i][col] = 0;
			}
		}
		
		return false;
	}
	
	static boolean check(int row, int col) {
		int i, j;
		// 현재 행의 모든 열에 퀸이 있는지 테스트
		for(i=0; i<col; i++) {
			if(board[row][i] == 1) {
				return false;
			}
		}
		
		// 현재 위치의 좌상단 대각선으로 퀸이 있는지 테스트
		for(i=row, j=col; i>=0 && j >= 0; i--, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		// 현재 위치의 우하단 대각선으로 퀸이 있는지 테스트
		for(i=row, j=col; i<N && j >= 0; i++, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		// 반복문이 다 실행된 이후 여기로 온다면 퀸이 이동가능한 곳에 다른 퀸이 없는 경우
		return true;
	}

}

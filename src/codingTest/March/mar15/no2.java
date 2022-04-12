package codingTest.March.mar15;

import java.util.*;

public class no2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] size = sc.nextLine().split(" ");
		int N = Integer.parseInt(size[0]);
		int M = Integer.parseInt(size[1]);
		
//		String[] character = sc.nextLine().split(" ");
//		int A = Integer.parseInt(character[0]);
//		int B = Integer.parseInt(character[1]);
//		int d = Integer.parseInt(character[2]);
		
		System.out.println(N + ", " + M);
		
		int[][] map = new int[N][M];
		
		for(int i=0; i<N+1; i++) {
			String[] tmp = sc.nextLine().split(" ");
			for(int j=0; j<M+1; j++) {
				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.println(map[i][j] + " ");
			}
			System.out.println();
		}
//		int result = 1;
//		
//		while(true) {
//
//			if(map[A][B] == 0) {
//				if(d == 0) {
//					B = B - 1;
//					if(map[A][B] != 0) {
//						B = B + 1;
//						d = 3;
//					} else {
//						result++;
//						map[A][B+1] = 1;
//						if(check(A, B, map)) {
//							break;
//						}
//					}
//				} else if(d == 3) {
//					A = A - 1;
//					if(map[A][B] != 0) {
//						A = A + 1;
//						d = 2;
//					} else {
//						result++;
//						map[A+1][B] = 1;
//						if(check(A, B, map)) {
//							break;
//						}
//					}
//				} else if(d == 2) {
//					B = B + 1;
//					if(map[A][B] != 0) {
//						B = B - 1;
//						d = 1;
//					} else {
//						result++;
//						map[A][B-1] = 1;
//						if(check(A, B, map)) {
//							break;
//						}
//					}
//				} else if(d == 1) {
//					A = A + 1;
//					if(map[A][B] != 0) {
//						A = A - 1;
//						d = 0;
//					} else {
//						result++;
//						map[A-1][B] = 1;
//						if(check(A, B, map)) {
//							break;
//						}
//
//					}
//				}
//			}
//		}
//		System.out.println(result);
//	}
//
//	
//	public static boolean check(int n, int m, int[][] a) throws ArrayIndexOutOfBoundsException {
//		if((a[n-1][m] == 1) && a[n+1][m] == 1 && a[n][m-1] == 1 && a[n][m+1] == 1) {
//			return true;
//		}
//		return false;
	}
}

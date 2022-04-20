package codingTest.April.apr14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		int[][] map = new int[3][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map[0][i] = Integer.parseInt(st.nextToken());
			map[1][i] = i;
			map[2][i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[0][i] < map[0][j]) {
					int temp = map[0][i];
					map[0][i] = map[0][j];
					map[0][j] = temp;
					int temp1 = map[1][i];
					map[1][i] = map[1][j];
					map[1][j] = temp1;
				}
				else if(map[0][i] == map[0][j] && map[1][i] > map[1][j]) {
					int temp1 = map[1][i];
					map[1][i] = map[1][j];
					map[1][j] = temp1;
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.print(map[0][i] + " " + map[2][map[1][i]]);
			System.out.println();
		}
	}
}

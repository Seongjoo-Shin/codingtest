package codingTest.May.may21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dp[] = new int[11];
		
		int T = Integer.parseInt(sc.nextLine());
		
		dp[1] = 1; // 1
		dp[2] = 2; // 1+1, 2
		dp[3] = 4; // 1+1+1, 1+2, 2+1, 3
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(sc.nextLine());
			for(int j=4; j<=n; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			System.out.println(dp[n]);
		}
	}

}

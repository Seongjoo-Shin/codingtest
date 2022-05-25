package codingTest.May.may19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String[] temp = sc.nextLine().split(" ");
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(temp[i-1]);
		}
		
		for(int i=1; i<=N; i++) {
			dp[i] = arr[i];
			for(int j=1; j<i; j++) {
				if(dp[i] > dp[i-j] + arr[j]) {
					dp[i] = dp[i-j] + arr[j];
				}
			}
		}
		
		System.out.println(dp[N]);
	}

}

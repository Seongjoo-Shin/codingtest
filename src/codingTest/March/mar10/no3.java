package codingTest.March.mar10;

import java.util.*;

public class no3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int N = Integer.parseInt(s.split(" ")[0]);
		int K = Integer.parseInt(s.split(" ")[1]);
		
		int cnt = 0;
		
		while(true) {
			if(N % K == 0) {
				N /= K;
				cnt++;
			} else if(N == 1) {
				break;
			}
			else {
				N -= 1;
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}

package codingTest.February.feb23;

import java.util.HashMap;
import java.util.Scanner;

public class algorithm1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String[] tmp = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		
		String[] s1 = new String[N];
		String[] s2 = new String[M];
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			map.put(sc.nextLine(), 1);
		}
		
		for(int i=0; i<M; i++) {
			String word = sc.nextLine();
			if(map.get(word) != null) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}

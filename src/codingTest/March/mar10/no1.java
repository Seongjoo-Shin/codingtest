package codingTest.March.mar10;

import java.util.*;

public class no1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String[] a1 = s1.split(" ");
		
		int N = Integer.parseInt(a1[0]);
		int M = Integer.parseInt(a1[1]);
		int K = Integer.parseInt(a1[2]);

		int sum = 0;
		
		String[] a2 = s2.split(" ");
		
		List<Integer> ary = new ArrayList<>();

		for(int i=0; i<N; i++) {
			ary.add(Integer.parseInt(a2[i]));
		}
		
		ary.sort(null);

		for(int i=1; i<M+1; i++) {
			if(i % K != 0) {
				sum += ary.get(ary.size()-1);
				
			} else {
				sum += ary.get(ary.size()-2);
			}
		}
			
		System.out.println(sum);
	}
}

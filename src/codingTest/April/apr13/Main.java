package codingTest.April.apr13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		
		int sum = 0;
		
		String[] strAry1 = sc.nextLine().split(" ");
		String[] strAry2 = sc.nextLine().split(" ");
		int[] ary1 = new int[N];
		int[] ary2 = new int[N];
		
		for(int i=0; i<N; i++) {
			ary1[i] = Integer.parseInt(strAry1[i]);
			ary2[i] = Integer.parseInt(strAry2[i]);
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(ary1[i] < ary1[j]) {
					int n = ary1[i];
					ary1[i] = ary1[j];
					ary1[j] = n;
				}	
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(ary2[i] > ary2[j]) {
					int n = ary2[i];
					ary2[i] = ary2[j];
					ary2[j] = n;
				}	
			}
		}
		
		for(int i=0; i<K; i++) {
			int aa = ary1[i];
			ary1[i] = ary2[i];
			ary2[i] = aa;
		}
		
		for(int i:ary1) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}

package codingTest.April.apr11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		int[] ary = new int[N];
		
		for(int i=0; i<N; i++) {
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i=1; i<N; i++) {
			if(ary[i-1] < ary[i]){
				int temp = ary[i-1];
				ary[i-1] = ary[i];
				ary[i] = temp;
			}
		}
		
		for(int i : ary) {
			System.out.print(i + " ");
		}
	}

}

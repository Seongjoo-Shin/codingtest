package codingTest.March.mar14;

import java.util.*;

public class no1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		String[] move = sc.nextLine().split(" ");
		
		int[] res = {1, 1};
		
		for(int i=0; i<move.length; i++) {
			if(move[i].equals("L")) {
				res[1] = res[1] - 1;
				if(res[1] < 1) {
					res[1] = res[1] + 1;
				}
			} else if(move[i].equals("R")) {
				res[1] = res[1] + 1;
				if(res[1] > N) {
					res[1] = res[1] - 1;
				}
			} else if(move[i].equals("U")) {
				res[0] = res[0] - 1;
				if(res[0] < 1) {
					res[0] = res[0] + 1;
				}
			} else if(move[i].equals("D")) {
				res[0] = res[0] + 1;
				if(res[0] > N) {
					res[0] = res[0] - 1;
				}
			}
		}
		
		System.out.println(res[0] + " " + res[1]);
	}

}

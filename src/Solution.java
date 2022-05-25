import java.util.ArrayList;
import java.util.Scanner;

class Solution {
	static ArrayList<Integer> ary = new ArrayList<>();

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int gongtong = Integer.parseInt(sc.nextLine());

		String[] temp1 = sc.nextLine().split(" ");
		String[] temp2 = sc.nextLine().split(" ");
		String[] temp3 = sc.nextLine().split(" ");

		int[] jorip1 = new int[temp1.length];
		int[] jorip2 = new int[temp2.length];
		int[] bupum = new int[temp3.length];

		for (int i = 0; i < temp1.length; i++) {
			jorip1[i] = Integer.parseInt(temp1[i]);
		}
		for (int i = 0; i < temp2.length; i++) {
			jorip2[i] = Integer.parseInt(temp2[i]);
		}
		for (int i = 0; i < temp3.length; i++) {
			bupum[i] = Integer.parseInt(temp3[i]);
		}

		
		for (int i : bupum) {
			for (int j = 0; j < jorip1.length; j++) {
				if (jorip1[j] == i) {
					jorip1[j] = 0;
					for (int k = 0; k < bupum.length; k++) {
						if (bupum[k] == i) {
							bupum[k] = 0;
							break;
						}
					}
				}
			}
		}
		
		for (int i : bupum) {
			for (int x = 0; x < jorip2.length; x++) {
				if (jorip2[x] == i) {
					jorip2[x] = 0;
					for (int k = 0; k < bupum.length; k++) {
						if (bupum[k] == i) {
							bupum[k] = 0;
							break;
						}
					}
				}
			}
		}
		
		int jtemp1 = 0;
		for (int j1 : jorip1) {
			if (j1 == 0) {
				jtemp1++;
			}

			if (jtemp1 == jorip1.length) {
				ary.add(1);
			}
		}

		int jtemp2 = 0;
		for (int j2 : jorip2) {
			if (j2 == 0) {
				jtemp2++;
			}

			if (jtemp2 == jorip2.length) {
				ary.add(1);
			}
		}
		
		int jtemp3 = 0;
		for (int j3 : bupum) {
			if (j3 == 0) {
				jtemp3++;
			}

			if (jtemp3 == bupum.length) {
				ary.add(0);
			}
		}
		
		for(int i=0; i<ary.size(); i++) {
			System.out.println("#" + (i+1) + " " + ary.get(i));
		}

	}
}

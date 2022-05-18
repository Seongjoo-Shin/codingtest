package codingTest.May.may17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] tmp1 = sc.nextLine().split("");
        String[] tmp2 = sc.nextLine().split("");
        
        String temp = "";
        
        for(int i=0; i<8; i++) {
        	temp += tmp1[i];
        	temp += tmp2[i];
        }
        while(temp.length() > 2) {
			String str = "";
			for(int i=0; i<temp.length()-1; i++) {
				int n = (temp.charAt(i) - '0') + (temp.charAt(i+1) - '0'); 
				str += Integer.toString(n%10);
			}
			temp = str;
		}
		
		System.out.print(temp);
    }
}
/*
74759336
36195974

26

01234567
12345678

02

*/
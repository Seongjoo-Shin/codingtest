package codingTest.February.feb14;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		// 4번
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("[입력]");
		System.out.print("시작수 : ");
		int start = Integer.parseInt(scanner.nextLine());
		
		System.out.print("끝수 : ");
		int end = Integer.parseInt(scanner.nextLine());
		
		System.out.print("배수 : ");
		int x = Integer.parseInt(scanner.nextLine());
		
		for(int i=start; i<=end; i++) {
			if(i % x == 0) {
				sum += i;
			}
		}
		
		System.out.println();
		System.out.println("[출력]");
		System.out.println(sum);
	}

}
/*
 4. 시작수와 끝수를 입력 받고 주어진 배수의 합을 출력
 [입력]
 시작수: 1
 끝수: 15
 배수: 7
 
 [출력]
 21
 */
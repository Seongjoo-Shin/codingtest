package codingTest.February.feb14;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		// 5번
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int sum = 0;
			
			System.out.println("[입력]");
			System.out.print("시작수 : ");
			int start = Integer.parseInt(scanner.nextLine());
			
			System.out.print("끝수 : ");
			int end = Integer.parseInt(scanner.nextLine());

			if(start > end) {
				System.out.println("끝수의 값이 시작수의 값보다 작아 프로그램을 종료합니다.");
				break;
			}
			
			
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
			System.out.println();
		}
	}

}
/*
5. 4번을 무한 반복하는 코드를 작성하시오, 단 끝수가 시작수보다 적을 경우는 프로그램을 종료하시오

*/
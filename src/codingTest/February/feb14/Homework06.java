package codingTest.February.feb14;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("***********************************");
			System.out.println("1.메뉴 | 2.메뉴 | 3.메뉴 | 4.종료");
			System.out.println("***********************************");
			System.out.print("선택 : ");
			int menu = Integer.parseInt(scanner.nextLine());
			
			if(menu == 4) {
				System.exit(0);
			}
			
			System.out.println(menu + "번이 선택되었습니다.");
		}
		
		/*while(true) {
			System.out.println("***********************************");
			System.out.println("1.메뉴 | 2.메뉴 | 3.메뉴 | 4.종료");
			System.out.println("***********************************");
			System.out.print("선택 : ");
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("1번이 선택되었습니다.");
				break;
			case 2:
				System.out.println("2번이 선택되었습니다.");
				break;
			case 3:
				System.out.println("3번이 선택되었습니다.");
				break;
			default:
				System.exit(0);
			}
		}*/
	}

}
/*
6. 다음과 같이 메뉴를 반복해서 제공하고 각 번호를 입력했을 때 "몇번이 선택되었습니다" 를 출력하시오
   4를 입력하면 System.exit(0);을 실행해서 프로그램을 종료하시오. ( while문과 if문 또는 switch문 사용 )

*/
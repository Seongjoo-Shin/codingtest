package codingTest.February.feb18;

import java.util.*;

public class EasyPassword {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너 사용
		
		
		int testCase = Integer.parseInt(scanner.nextLine()); // 입력 데이터 개수를 받는 변수
		
		char tmp; // 복호화한 값을 받을 tmp변수
		
		String[] password = new String[testCase]; // 입력받은 데이터 개수 크기의 문자열 배열 선언
		int[] wordlen = new int[testCase]; // 암호 크기를 받을 int형 배열 선언
		
		for(int i=0; i<testCase; i++) { // 테스트 케이스 개수 만큼 반복
			wordlen[i] = Integer.parseInt(scanner.nextLine()); // 암호 크기를 입력받으면서 int형으로 변환
			password[i] = scanner.nextLine(); // 암호 입력받기
		}
		
		System.out.println(); // 줄바꿈
		
		for(int i=0; i<testCase; i++) { // 테스트 케이스 개수 만큼 반복 
			System.out.println("Case #" + (i+1)); // 출력문 Case #숫자 형태로 출력
			for(int j=0; j<wordlen[i]; j++) { // 입력받은 데이터 크기만큼 반복
				tmp = password[i].charAt(j); // 문자열을 하나씩 꺼내와 tmp에 저장
				if(tmp > 118) { // w, x, y, z인 경우 a, b, c, d로 바꾸기 위해 
					tmp -= 22; // 22만큼 빼준다
				} else { // 나머지의 경우
					tmp += 4; // 4씩 더해준다
				}
				System.out.print(tmp); // 출력
			}
			System.out.println(); // 줄바꿈
		}
	}

}

// w,x,y,z인 경우 넘어가는거 설정해주기
// 119 120 121 122
// a,b,c,d
// 97 98 99 100
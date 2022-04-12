package codingTest.February.feb21;

import java.util.*;

public class test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(temp[0]); // 물이 새는 곳
		int L = Integer.parseInt(temp[1]); // 테이프의 길이
		
		String[] locTemp = sc.nextLine().split(" "); // 물이 새는 곳의 위치를 입력받을 문자열 배열 선언
		int[] loc = new int[N]; // 물이 새는 곳의 개수크기의 정수형 배열 선언
		
		int result = 0; // 테이프 개수를 저장할 변수
		
		for(int i=0; i<N; i++) {
			loc[i] = Integer.parseInt(locTemp[i]); // 문자열 배열 정수형으로 변환
		}
		
		int tmp = 0; // 임시 저장 변수
		
		// 오름차순 정렬을 위한 반복문
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
				if(loc[j] > loc[j+1]) {
					tmp = loc[j];
					loc[j] = loc[j+1];
					loc[j+1] = tmp;
				}				
			}
		}
		
		double tape = loc[0] - 0.5; // 첫번째 위치보다 작은 지점에서의 테이프 시작점
		
		result++; // 시작점을 주었기 때문에 테이프를 붙이고 시작
		
		for(int i=0; i<N; i++) { // 반복문 구멍의 개수만큼
			if(tape + L < loc[i]) { // 테이프 시작점과 테이프의 길이를 합한 값이 구멍의 위치보다 작은경우 
				result++; // 테이프 한개 증가
				tape = loc[i] - 0.5; // 테이프를 다시 붙이는 위치 설정
			}
		}
		
		System.out.println();
		System.out.println(result);
		
		
	}

}

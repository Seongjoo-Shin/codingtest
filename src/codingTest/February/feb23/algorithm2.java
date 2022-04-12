package codingTest.February.feb23;

import java.util.*;

public class algorithm2 {
	
	public static int max = Integer.MIN_VALUE; // max값을 저장하기 위해 int형에서 가장 작은 값을 저장, 메소드에서 사용해야 하기 때문에 전역 변수로 선언
	public static int min = Integer.MAX_VALUE; // min값을 저장하기 위해 int형에서 가장 큰 값을 저장, 메소드에서 사용해야 하기 때문에 전역 변수로 선언
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너 사용
		
		int n = Integer.parseInt(sc.nextLine()); // 피연산자 개수 n에 입력 받기
		
		String[] numStr = sc.nextLine().split(" "); // 피연산자를 입력받는 배열, numStr에 입력받
		String[] operStr = sc.nextLine().split(" "); // 연산자의 개수를 입력받는 배열, operStr 입력
		
		int[] numAry = new int[n]; // int형으로 저장하기 위해 int형 배열 numAry 선언
		int[] operAry = new int[4]; // int형으로 저장히기 위해 int형 배열 operAry 선언
		
		// 문자열으르 int형으로
		for(int i=0; i<numStr.length; i++) {
			numAry[i] = Integer.parseInt(numStr[i]);
		}
		
		// 문자열을 int형으로
		for(int i=0; i<4; i++) {
			operAry[i] = Integer.parseInt(operStr[i]);
		}
		
		int add = operAry[0]; // + 연산 개수
		int sub = operAry[1]; // - 연산 개수
		int mul = operAry[2]; // * 연산 개수
		int div = operAry[3]; // / 연산 개수

		// calc 메소드 호출
		// 1부터 시작하는 이유 : 문제에서 연산자 우선순위와 상관없이 앞에서 부터 차례대로 계산한다고 했기 때문에
		// 첫 result에는 numAry[0]이 들어가기 때문에
		calc(numAry, add, sub, mul, div, 1, numAry[0]); 
		
		System.out.println(max); // max 값 출력
		System.out.println(min); // min 값 출력 
		
	}
	
	// 피연산 배열, 덧셈 개수, 뺄셈 개수, 곱셈 개수, 나눗셈 개수, 인덱스, 결과를 저장할 변수
	public static void calc(int[] numAry, int add, int sub, int mul, int div, int i, int result) {
		if(add == 0 && sub == 0 && mul == 0 && div == 0) { // 모든 연산자의 개수가 0개인 경우, 즉 연산이 끝났을 때
			if( max < result) { // result의 값이 max보다 큰 경우 max값에 result를 넣어준다
				max = result;
			}
			if ( min > result) { // result의 값이 min보다 작은 경우 min값에 result를 넣어준다
				min = result;
			}
		}
		
		// 연산을 수행하는 부분 함수 재귀호출을 통해 값을 계산한다
		// 연산의 순서가 입력받은 순서대로 진행됨
		// 처음 함수가 호출 된 경우 result에는 numAry의 0번째 인덱스 값이 저장되어있다
		if(add != 0) { // 덧셈 연산이 있는 경우
			// calc함수를 재귀호출 하여 덧셈 연산의 개수를 1개 빼주고 result에 result와 numAry[i]의 값을 계산한다
			calc(numAry, add-1, sub, mul, div, i+1, result+numAry[i]);
		}
		if(sub != 0) { // 뺄셈 연산이 있는 경우
			// calc함수를 재귀호출 하여 뺄셈 연산의 개수를 1개 빼주고 result에 result와 numAry[i]의 값을 계산한다
			calc(numAry, add, sub-1, mul, div, i+1, result-numAry[i]);
		}
		if(mul != 0) { // 곱셈 연산이 있는 경우
			// calc함수를 재귀호출 하여 곱셈 연산의 개수를 1개 빼주고 result에 result와 numAry[i]의 값을 계산한다
			calc(numAry, add, sub, mul-1, div, i+1, result*numAry[i]);
		}
		if(div != 0) { // 나눗셈 연산이 있는 경우
			// calc함수를 재귀호출 하여 나눗셈 연산의 개수를 1개 빼주고 result에 result와 numAry[i]의 값을 계산한다
			calc(numAry, add, sub, mul, div-1, i+1, result/numAry[i]);
		}
	}
}

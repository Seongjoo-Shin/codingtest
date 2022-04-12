package codingTest.February.feb15;

import java.util.Scanner;

public class CodingTest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int target = Integer.parseInt(scanner.nextLine()); // 과녁 개수
		int sum = 0; // 총점
		
		String[] inputScores = new String[target]; // 과녁만큼 표적 생성
		
		inputScores = scanner.nextLine().split(" "); // 점수
		String[] trap1 = scanner.nextLine().split(""); // 과녁
		String[] trap2 = scanner.nextLine().split(""); // 과녁
		
		for(int i=0; i<target; i++) {
			// 1번, 2번 과녁이 같고, 과녁이 O
			if(trap1[i].equals(trap2[i]) && trap1[i].equals("O")) {
				sum += Integer.parseInt(inputScores[i]); // sum에 점수를 더한다
			}
		}
		
		// 출력
		System.out.println("총 점수");
		System.out.println(sum);
		
	}

}

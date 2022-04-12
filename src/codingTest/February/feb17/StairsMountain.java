package codingTest.February.feb17;

import java.util.Scanner;

public class StairsMountain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] mountain = scanner.nextLine().split(""); // 입력받은 문자열을 mountain 문자열 배열에 split후 저장
		boolean gs = false; // 급경사
		int kcal = 0; // kcal
		int hei = 0; // 위치
		
		for(int i=0; i<mountain.length; i++) { // mountain의 길이만큼 반복
			if(mountain[i].equals("#")) { // 반복문에서 급경사를 만난 경우
				if(gs) { // 급경사인 상태
					gs = false; // 급경사인 상태에서 만났으므로 false
				}
				else{ // 급경사가 아닌 상태
					gs = true; // 급경사인 상태가 아니므로 true
				}
			}
			else { // 반복문에서 급경사를 만나기 전
				if(gs) { // 급경사 시작
					if(mountain[i].equals("(")) { // 급경사에서 올라가는 경우
						hei++; // 현재 위치를 1증가
						kcal += (hei * 2); // 급경사 이므로 2배후 kcal에 더한 후 저장
					}
					else { // 내려가는 경우
						kcal += (hei * 2); // 현재 위치의 값을 2배한 후 kcal에 더한 후 저장
						hei--; // 계산 후 한칸 내려왔기 때문에 1감소
					}					
				}
				else { // 급경사가 아닌 경우
					if(mountain[i].equals("(")) { // 올라가는 경우
						hei++; // 현재위치를 1증가
						kcal += hei; // kcal에 현재 위치를 더한 후 저장
					}
					else { // 내려가는 경우
						kcal += hei; // kcal에 현재 위치를 더한 후 저장
						hei--; // 계산 후 한칸 내려왔기 때문에 1감소
					}
				}
			}
		}
		System.out.println(kcal); // 출력
	}

}

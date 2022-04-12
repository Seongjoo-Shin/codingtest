package codingTest.April.apr12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String[] tmp = sc.nextLine().split(" ");
			String name = tmp[0];
			int score = Integer.parseInt(tmp[1]);
			map.put(name, score);
		}

		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		for(Map.Entry<String, Integer> entry : entryList){
		    System.out.print(entry.getKey() + " ");
		}
	}
}

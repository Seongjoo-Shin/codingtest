package codingTest.February.feb14;

public class Homework03 {

	public static void main(String[] args) {
		
		// 3번
		for(int i=1; i<10; i++) {
			if(i<=5) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=10-i; j>=1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
/*
3.
	*
	**
	***
	****
	*****
	****
	***
	**
	*

*/
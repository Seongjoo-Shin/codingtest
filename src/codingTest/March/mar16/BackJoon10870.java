package codingTest.March.mar16;

import java.util.*;

public class BackJoon10870 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int n = Integer.parseInt(sc.nextLine());
	     System.out.println(fib(n));
	}
	
    public static int fib(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fib(n-2) + fib(n-1);   
        }
    }
}

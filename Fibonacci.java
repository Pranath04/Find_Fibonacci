package fibinacci;

import java.util.Scanner;

public class Fibonacci{
	public static int fib(int A) {
		if(A==0) {
			return 0;
		}
		if(A==1) {
			return 1;
		}
		return fib(A-1)+fib(A-2);
	}
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		scanner.close();
		System.out.println(fib(A));
	}
}
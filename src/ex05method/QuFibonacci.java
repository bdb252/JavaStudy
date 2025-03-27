package ex05method;

import java.util.Scanner;

public class QuFibonacci {

	static void fibonacciProgression(int n) {
//		if(n < 2)
//			return;
//		int[] fibo = new int[n];
//		fibo[0] = 0;
//		fibo[1] = 1;
//		for(int i = 2; i<n; i++) {
//			fibo[i] = fibo[i-1]+fibo[i-2];
//		}
//		for(int i = 0; i<n; i++) {
//			System.out.print(fibo[i] + " ");
//		}
		
		int f1 = 0, f2 = 1;
		int fib = f1 + f2;
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				System.out.print(f1 + " ");
			}
			else if(i == 1) {
				System.out.print(f2 + " ");
			}
			else {
				System.out.print(fib + " ");
				f1 = f2;
				f2 = fib;
				fib = f1 + f2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		fibonacciProgression(num);
	}

}

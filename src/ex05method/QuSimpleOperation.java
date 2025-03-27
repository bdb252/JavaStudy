package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	static void arithmetic(int a, int b) {

		System.out.println("덧셈결과 -> "+(a+b));
		System.out.println("뺄셈결과 -> "+(a-b));
		System.out.println("곱셈결과 -> "+(a*b));
		System.out.println("나눗셈 몫 -> "+(a/b));
		System.out.println("나눗셈 나머지 -> "+(a%b));
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오");
		System.out.print("첫번째 정수: ");
		int n1 = scanner.nextInt();
		System.out.print("두번째 정수: ");		
		int n2 = scanner.nextInt();
		arithmetic(n1, n2);
	}

}

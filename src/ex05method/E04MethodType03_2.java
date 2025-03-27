package ex05method;

import java.util.Scanner;
/*
퀴즈] 사용자로부터 2개의 숫자를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오. 
	무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메서드명 : inputGugudan(int sNum, int eNum)
 */

public class E04MethodType03_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n1 = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		int n2 = scanner.nextInt();
		inputGugudan(n1, n2);
	}

	static void inputGugudan(int sNum, int eNum) {
		for(int i = sNum; i<=eNum; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%2d*%d=%2d ",i, j, (i*j));
			}
			System.out.println();
		}
	}
}

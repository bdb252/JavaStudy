package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException2 extends Exception{
	public AgeErrorException2() {
		super("나이 입력이 개잘못되었어요");
	}
}
public class Ex06DeveloperDefine2 {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");
		int age = readAge();
		System.out.println("당신의 나이는 "+age+"입니다.");
	}
	
	public static int readAge() {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
//			System.out.println("예외발생");
			e.printStackTrace();
			System.exit(0);
		}
		try {
			if(inputAge < 0) {
				AgeErrorException2 ex = new AgeErrorException2();
				throw ex;
			}			
		}
		catch (AgeErrorException2 e) {
			System.out.println("나이 입력 예외 발생");
			System.exit(0);
		}
		return inputAge;
	}
}

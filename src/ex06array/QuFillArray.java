package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for(int i = 0; i<10; i++) {
			System.out.printf("%d번째 정수를 입력하세요:",i+1);
			arr1[i] = scanner.nextInt();
		}
		
		System.out.println("순서대로 입력된 결과");
		for(int i = 0; i<10; i++) {
			System.out.print(arr1[i] + " ");
		}
		int a = 0;
		int b = arr2.length - 1;
		for(int i = 0; i<10; i++) {
			if(arr1[i] % 2 == 1) {
				arr2[a++] = arr1[i];
			}
			else {
				arr2[b--] = arr1[i];
			}
		}
		System.out.println("\n홀수/짝수 구분 입력 결과");
		for(int i = 0; i<10; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}

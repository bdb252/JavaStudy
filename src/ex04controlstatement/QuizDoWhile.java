package ex04controlstatement;

public class QuizDoWhile {

	public static void main(String[] args) {

		/*
		퀴즈) 다음과 같은 피라미드를 출력하는 프로그램을 
			do~while문으로 작성하시오.
		 *
		 **
		 ***
		 ****
		 *****
		*/
		//1.행을 위한 반복문 생성
		int a = 1;
		int k = 1;
		do {
			//2.열을 위한 반복문 생성
			k = 1;
			do {
				//3.반복문 확인
				System.out.print("*");
				k++;
			//5.행에 해당하는 a의 개수만큼만 *을 출력한다.
			}while(k<=a);
			a++;
			//4.5개 출력 후 줄바꿈 
			System.out.println();
		}while(a<=5);
		
		System.out.println();
		System.out.println("if문으로 구현하기");
		
		int i = 1;
		do {
			int j = 1;
			do {
				//i의 크기만큼 반복해서 *를 출력한다.
				if(i>=j) {
					System.out.print("* ");					
				}
				j++;
			}while(j <= 5);
			System.out.println();
			i++;
		}while(i <= 5);
		/*
		*****
		****
		***
		**
		*
		 */
//		a = 5;
//		do {
//			k = 1;
//			do {
//				System.out.print("*");
//				k++;
//			}while(k<=a);
//			a--;
//			System.out.println();
//		}while(a>=1);
	}

}

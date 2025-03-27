package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
while(false){}
실행x
do{}while(false)
무조건 한 번은 실행

do~while문 : 반드시 한 번은 실행해야 할 경우 사용하는 반복문으로 조건검사 없이 무조건 한 번은 실행된다.
		형식 ] 
			반복을 위한 변수
			do {
				실행문장;
				증감식;
			}while(조건식); <=문장 끝에 세미콜론 들어감.
 */

public class E04DoWhile {

	public static void main(String[] args) throws IOException{

		/*
		시나리오] E03 예제의 1~10까지 더하는 수열 문제를 do~while문으로 변경하여 구현하시오.
		 */
		//누적합과 반복을 위한 변수 선언
		int sum = 0;
		int i = 1;
		//조건 없이 진입해서 실행
		do {
			//증가하는 변수 i를 누적해서 sum에 더함
			sum += i;
			i++;
			//탈출의 조건을 위해 증가시킨 후에 체크한다.
		}while(i <= 10);
		System.out.println("1~10까지의 누적합 : "+sum);
		
		/*
		시나리오] 1부터 1000까지의 정수 중 4의 배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
		간, do~while문을 사용해야 한다.
		 */
		int total = 0;
		int j = 1;
		do {
			//4 혹은 7의 배수인지 확인
			if(j % 4 == 0 || j % 7 == 0) {
				//배수 확인용 출력문장 디버깅용
				System.out.println("j = " +j);
				//증가하는 j를 누적해서 더한다.
				total += j;
			}
			j++;
			//탈출의 조건을 위해 j를 증가시킨 후 확인한다.
		}while(j<=1000);
		System.out.println("1~1000사이 4 또는 7의 배수 합 : "+total);
		
		/*
		시나리오] 국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력하는 프로그램을
		작성하시오. 단, 사용자가 X, x를 입력하면 프로그램이 종료되어야 하며 do~while문으로 구현해야 한다.
		 */
		//사용자 입력을 위한 참조변수 생성
		Scanner scanner = new Scanner(System.in);
		//점수와 탈출문자 입력을 위한 변수 생성
		int kor, eng, math, avg;
		int exitCode;
		do {
			//점수를 정수로 입력받음
			System.out.print("국어점수: ");
			kor = scanner.nextInt();
			System.out.print("영어점수: ");
			eng = scanner.nextInt();
			System.out.print("수학점수: ");
			math = scanner.nextInt();
			
			//평균값 계산(평균점수 구간을 위해 10을 곱해준다)
			avg = (kor + eng + math) / (3 * 10);
			switch(avg) {
			case 10 : case 9 :
				System.out.println("A학점");break;
			case 8 : 
				System.out.println("B학점");break;
			case 7 :
				System.out.println("C학점");break;
			case 6 :
				System.out.println("D학점");break;
			default :
				System.out.println("F학점");
			}
			System.out.println("종료하려면 x(X)키를 입력하시오");
			System.out.println("계속하려면 아무 키나 입력하시오.");
			exitCode = System.in.read();
		}while(!(exitCode=='x' || exitCode == 'X'));
		/*
		x를 입력한 경우
			   !(true || false) => !(true) => false
				따라서 반복문을 탈출한다.
		a를 입력한 경우
			   !(false || false) => !(false) => true
		 		따라서 반복문이 다시 실행된다.
		 */
	}

}

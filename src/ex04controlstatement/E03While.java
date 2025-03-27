package ex04controlstatement;

/*
while문
	: 반복의 횟수가 명확하지 않은 경우에 주로 사용하는 반복문으로
	  반복을 위한 초기값, 조건, 증감식을 따로 작성한다.
	형식] 
		반복을 위한 변수;
		while(반복의 조건){
			반복 실행 문장;
			증감식; <- 반복문 탈출을 위한 조건
		}
	조건이 true일 때 반복하고, 반복문의 처음으로 돌아가면서 조건을 확인한다.
	반복의 조건이 false일 때 탈출한다.
 */
public class E03While {

	public static void main(String[] args) {

		/*
		시나리오] 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오.
		 */
		//작성1
		//반복을 위한 변수 i를 생성한 후 1로 초기화
		int i = 1;
		//반복을 위한 조건 : i가 10이하일 때만 반복
		while(i <= 10) {
			System.out.println("변수 i ="+i);
			//반복문을 탈출하기 위한 증감식
			i++;
		}
		
		//작성2
		//누적합을 계산하기 위한 변수 생성
		int sum = 0;
		//반복을 위한 변수의 초기값은 1로 설정
		int j = 1;
		//반복의 조건
		while(j<=10) {
			//복합대입연산자를 통해 증가하는 j를 sum에 누적해서 합산
			sum += j;
			//sum = sum + j;
			//반복의 증가식
			j++;
		}
		System.out.println("1~10까지의 합 sum = " +sum);
		
		/*
		 시나리오] 1~100 까지의 정수 중 3의 배수이거나 4의 배수인 정수의 합을 구하는 프로그램을 
		 	while문을 이용하여 작성하시오
		 */
		
		int total = 0;
		int k = 1;
		//k가 100이하일 때만 반복하므로 100번 반복실행된다.
		while(k <= 100) {
			//3의 배수이거나 4의 배수이므로 논리 Or을 사용한다.
			if(k % 3 == 0 || k % 4 == 0) {
				//조건에 맞는 k를 누적해서 total에 더함
				total += k;
				System.out.println("k = "+k);
			}
			k++;
		}
		System.out.println("3 또는 4의 배수의 합 : " +total);
		
		/*
		시나리오] 구구단을 출력하는 프로그램을 while문으로 작성하시오.
		 */
		//'단'을 표현한 변수
		int dan = 2;
		//단에 대한 조건(2~9)단까지
		while(dan <= 9) {
			//'수'를 표현한 변수
			int su = 1;
			//수에 대한 조건(단이 고정된 상태에서 1~9까지 증가)
			while(su <= 9) {
				//서식문자를 통해 구구단을 출력
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				System.out.print(" ");
				//수에 대한 증가
				su++;
			}
			//하나의 단을 출력하면 줄바꿈
			System.out.println();
			//단을 1씩 증가시킴
			dan++;
		}
		System.out.println("\n=============================\n");
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
		출력결과
		1 0 0 0
		0 1 0 0
		0 0 1 0
		0 0 0 1
		 */
		/*
		디버깅표
		x | x<=4 | y | y<=4 | x == y | 출력 
		1	 t	   1	t 		t		1
				   2	t		f		1 0
				   3	t		f		1 0 0
				   4	t		f		1 0 0 0
				   5	f				1 0 0 0	(줄바꿈)
		------------------------------------------------
		2	t	   1	t		t		1 0 0 0
			   							0
			   	   2	t		t		1 0 0 0
			   	   						0 1
			   	   			...
			   	   			
		 */
		//행으로 4번 반복하기 위한 변수
		int x = 1;
		while(x <= 4) {
			//행(x)이 고정된 상태에서 열을 4번 반복하기 위한 변수
			int y = 1;
			while(y <= 4) {
				//행과 열의 번호가 동일할 때 1을 출력
				if(x == y) {
					System.out.print("1 ");
				}
				else {
					//나머지는 0을 출력
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}

		System.out.println();
		/*
		퀴즈] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		
		x = 1;
		while(x <= 4) {
			int y = 4;
			while(y >= 1) {
				if(x == y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y--;
			}
			System.out.println();
			x++;
		}
		
	}

}

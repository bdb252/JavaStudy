package quiz; 

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static int cpu = random.nextInt(100)+1;
	static int num = 0;

	public static void reGameQuestion() {
		System.out.println("게임을 다시 시작할까요?\n1.게임재시작, 0:게임종료");
		int reGame = sc.nextInt();
		if(reGame == 1) {
			System.out.println("게임을 재시작합니다.");
			cpu = random.nextInt(100)+1;
			System.out.println("생성된 난수:"+cpu);
			num = 0;
		}
		else {
			System.out.println("감사합니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	public static void main(String[] args) {

		System.out.println("생성된 난수:"+cpu);
		while(num < 7) {
			System.out.print("1~100사이의 정수를 입력하세요:");
			int user = sc.nextInt();
			if(cpu > user) {
				System.out.println("Up 입니다.");
				num++;
			}
			else if(cpu < user){
				System.out.println("Down입니다.");
				num++;
			}
			else {
				System.out.println("정답입니다.\n승리하셨습니다.");
				reGameQuestion();
			}
			if(num == 7) {
				System.out.println("실패하셨습니다.");
				reGameQuestion();				
			}
		}
	}

}

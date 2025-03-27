package quiz;

import java.util.Random;
import java.util.Scanner;

interface Game{
	int SCISSORS = 1, ROCK = 2, PAPER = 3;
}
/*
사용자 - 컴퓨터 => 가위바위보 결과
이기는 경우			지는 경우
사용자 컴퓨터		사용자	컴퓨터
가위1	  보3 =>-2	 1		2  =>-1
바위2	 가위1 =>1	 2		3  =>-1
보3	 바위2 =>1	 3		1  => 2
 */
public class QuRockPaperScissorstmp {

	public static void result(int user, int cpu) {
		String[] RSP = {"가위", "바위", "보"};
		System.out.println("사용자 : "+RSP[user-1]+", 컴퓨터 : "+RSP[cpu-1]);
		
		if(user == cpu) {
			System.out.println("비겼습니다.");
		}
		else if(user == Game.PAPER && cpu == Game.ROCK || user == Game.SCISSORS && cpu == Game.PAPER || 
				user == Game.ROCK && cpu == Game.SCISSORS) {
			System.out.println("이겼습니다.");
		}
		else {
			System.out.println("졌습니다.");
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int num = 0;
//		System.out.println(cpu);
		while(num<5) {
			int cpu = random.nextInt(3)+1;
			System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
			int user = sc.nextInt();
			switch(user) {
			case Game.SCISSORS : case Game.ROCK : case Game.PAPER :
				result(user,cpu);
				num++;
				break;
			default :
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
			}
			if(num == 5) {
				boolean flag = true;
				System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) :");
				while(flag) {
					int choice = sc.nextInt();
					if(choice == 0) {
						System.out.println("게임이 종료되었습니다. 감사합니다.");
						flag = false;
					}
					else if(choice == 1) {
//						System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) :");
						num = 0;
						cpu = random.nextInt(2)+1;
						flag = false;
					}
					else {
						System.out.print("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요:");
					}
				}
			}
			
		}
	}

}

package skillup.project05;

import java.util.Scanner;

public class MyFriendInfoBook {

	public static Scanner scan = new Scanner(System.in);
	public static void menuShow() {
		System.out.println("####### 메뉴를 입력하시오(ver03) #######");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}
	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		//무한루프로 while문 작성. 프로그램을 종료할 때까지 무한히 반복하며 친구의 정보를 입력, 수정, 삭제, 검색한다.
		while(true) {
			//제일먼저 메뉴출력
			menuShow();
			try {
				//메뉴입력
				int choice = scan.nextInt();
				//입력을 위한 버퍼(Buffer) 제거
				scan.nextLine();
				//입력받은 정수에 따라 분기하여 각 기능을 실행한다.
				switch(choice) {
				case 1: case 2:
					//친구의 정보 입력(고딩/대딩)
					handler.addFriend(choice);
					break;
				case 3:
					//정보 전체(4가지) 출력
					handler.showAllData();
					break;
				case 4:
					//정보 간략(2가지) 출력
					handler.showSimpleData();
					break;
				case 5:
					//정보 검색
					handler.searchInfo();
					break;
				case 6:
					//정보 삭제
					handler.deleteInfo();
					break;
				case 7:
					System.out.println("프로그램종료");
					return;
				}//switch 끝
			}
			catch (Exception e) {
				System.out.println("[예외발생]메뉴선택은 숫자만 입력해주세요.");
				/*
				nextInt() 사용 시 문자를 입력하면 즉시 에러가 발생한다.
				이때 입력을 위한 Enter키가 버퍼에 남아 무한루프에 빠지는 경우가 있는데, 이를 제거하기 위해 nextLine()을 한번 호출해야 한다.
				 */
				scan.nextLine();
			}
		}//while 끝
	}//main 끝
}//class 끝

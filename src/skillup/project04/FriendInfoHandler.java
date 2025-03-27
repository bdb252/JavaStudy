package skillup.project04;

//import java.util.Scanner;
/*
	 	 Friend 		showInfo(){}
		^		^
		|		|
 		High	Univ
 @overriding	@overriding
 showInfo(){}	 showInfo(){}

 Friend[]
 0 1 2 3 4 5 ... n
 H U H H U H    ->업캐스팅되어 Friend타입으로 저장되어있음
 오버라이딩되면-> 부모를 타고 자식으로 내려와서 showInfo찾아서 출력가능
 		안되어있으면->형변환으로 찾아서 해야됨.(부모클래스에 showInfo없이 오버라이딩 안되어있을 때)
 */

public class FriendInfoHandler {
	/*
	멤버변수: 상속관계에 있어 최상위 클래스인 Friend로 배열을 생성한다.
		   클래스가 상속관계에 있다면 상위클래스 배열에 하위클래스의 인스턴스를 저장할 수 있다.
	 */
	private Friend[] myFriends;
	//정보 카운트용 변수 생성
	private int numOfFriend;
	
	public FriendInfoHandler(int num) {
		/*
		핸들러 클래스의 인스턴스를 생성할 때 데이터 저장을 위한 Friend 타입의 배열의 인스턴스도 함께 생성한다.
		크기는 num으로 지정한다.
		 */
		myFriends = new Friend[num];
		//카운트용 변수는 0으로 초기화
		numOfFriend = 0;
	}
	//연락처 정보 추가
	public void addFriend(int choice) {
//		System.out.println("## addFriend 호출됨 ##");
//		Scanner scan = new Scanner(System.in);
		//공통정보 3가지를 먼저 입력받는다.
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름:"); iName = MyFriendInfoBook.scan.nextLine();
		System.out.print("전화번호:"); iPhone = MyFriendInfoBook.scan.nextLine();
		System.out.print("주소:"); iAddr = MyFriendInfoBook.scan.nextLine();

		/*
		1,2번을 구분해서 각 인스턴스를 생성 후 저장은 부모타입인 Friend 배열에 저장한다.
		즉 상속을 통해 타입이 다른 자식 인스턴스를 통합적으로 관리할 수 있다.
		 */
		if(choice == 1) {
			System.out.print("별명:"); iNickname = MyFriendInfoBook.scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriend++] = high;
		}
		else if(choice == 2) {
			System.out.print("전공:"); iMajor = MyFriendInfoBook.scan.nextLine();
			myFriends[numOfFriend++]= new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		/*
		 High, Univ 타입의 인스턴스를 Friend 타입의 배열에 추가할 때에는 자동형변환이 일어난다.
		 정수를 실수타입의 변수에 저장할 때 자동형변환이 되는것과 동일한 현상이라 생각하면 된다.
		 즉, High와 Univ 인스턴스는 Friend 타입의 인스턴스로 자동형변환되어 저장된다.
		 */
		System.out.println("##친구정보 입력이 완료되었습니다##");
	}
	
	//전체 정보 출력
	public void showAllData() {
//		System.out.println("## showAllData 호출됨 ##");
		//배열에 저장된 정보의 개수만큼 반복
		for(int i = 0; i<numOfFriend; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("##전체정보가 출력되었습니다##");
	}
	//간략 정보 출력
	public void showSimpleData() {
//		System.out.println("## showAllData 호출됨 ##");		
		for(int i = 0; i<numOfFriend; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("##간략정보가 출력되었습니다##");
	}
	
	//이름으로 정보 검색
	public void searchInfo() {
//		System.out.println("serchInfo 호출됨");
		//검색결과 저장용 변수
		boolean isFind = false;
//		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하시오:");
		String searchName = MyFriendInfoBook.scan.nextLine();
		
		//저장된 정보의 개수만큼 반복
		for(int i = 0; i<numOfFriend; i++) {
			//검색할 이름과 일치하는지 확인
			if(searchName.compareTo(myFriends[i].name)==0) {
				/*
				일치하는 정보를 찾았다면 자식클래스로 형변환 후 메서드를 호출하여 출력한다.
				 */
				myFriends[i].showAllData();
				System.out.println("##귀하가 요청하는 정보를 찾았습니다.##");
				//정보를 찾았다면 true로 변경
				isFind = true;
			}
		}
		
		//만약 검색결과가 없다면 아래와 같이 출력한다.
		if(isFind == false) {
			System.out.println("##찾는 정보가 없습니다.##");
		}
	}
	//연락처정보 삭제
	public void deleteInfo() {
//		System.out.println("## deleteInfo 호출됨##");
//		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = MyFriendInfoBook.scan.nextLine();
		//삭제할 인스턴스의 인덱스 저장용 변수
		int deleteIndex = -1;
		
		//개수만큼 반복
		for(int i = 0; i<numOfFriend; i++) {
			//일치하는 이름 검색
			if(deleteName.equals(myFriends[i].name)) {
				//일치하는 정보가 있다면 null로 변경
				myFriends[i] = null;
				//인덱스 저장
				deleteIndex = i;
				//전체카운트 1감소
				numOfFriend--;
				//반복문 탈출
				break;
			}
		}
		if(deleteIndex==-1) {
			//-1을 유지한다면 삭제된 인스턴스가 없는 것으로 간주
			System.out.println("##삭제된 데이터가 없습니다##");
		}
		else {
			//삭제되었다면 해당 인덱스부터 마지막까지 반복해서..
			for(int i = deleteIndex; i<numOfFriend; i++) {
				//한칸씩 앞으로 인스턴스를 이동시킨다.
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("###데이터("+deleteIndex+"번)가 삭제되었습니다##");
		}
	}
}

package test;

/*
A										C-----------------------
^										|  B------------------	|
|										|  |     A----------  |	|
B										|  |     ㅣ---------ㅣ |	|
^										|	------------------- |
|										 ------------------------
C 
*/
class MyA{
	public void rideMethod() {
		System.out.println("MyA의 rideMethod");
	}
}
class MyB extends MyA{
	@Override
	public void rideMethod() {
		System.out.println("MyB의 rideMethod");
	}
}
class MyC extends MyB{
	@Override
	public void rideMethod() {
		System.out.println("MyC의 rideMethod");
	}
}
public class Testover {

	public static void main(String[] args) {
		/*
		부모 참조변수로 자식 인스턴스를 참조할 수 있다.
		좌측은 부모, 우측은 자식이므로 모두 실행 가능한 문장이다.
		 */
		MyA refNum1 = new MyB();
		MyA refnum2 = new MyC();
		MyB refnum3 = new MyC();
		
		MyA A1 = new MyA();
		MyB B1 = new MyB();
		MyC C1 = new MyC();
		A1.rideMethod();
		B1.rideMethod();
		C1.rideMethod();
		
		//같은 타입이므로 참조가능
		MyC refMyAddrC = new MyC();
		//MyB -> MyC타입을 참조하므로 가능
		MyB refMyAddrB = refMyAddrC;
		//myA -> MyC타입을 참조하므로 가능
		MyA refMyAddrA = refMyAddrC;
		
		refMyAddrC.rideMethod();
		refMyAddrB.rideMethod();
		refMyAddrA.rideMethod();
		
		//MyA -> MyC타입을 참조하므로 가능
		MyA refId1 = new MyC(); //MyA는 MyC를 참조하지만 타입은 A타입임
		//MyB - >MyA를 탐조하므로 불가능(자식은 부모를 참조할 수 없다.)
//		MyB refId2 = refId1;
		//MyC -> MyA를 참조하므로 불가능(자식은 부모를 참조할 수 없다.)
//		MyC refId3 = refId1;
		
		MyB refId2 = (MyB) refId1;
		MyC refId3 = (MyC) refId1;
		
	}

}

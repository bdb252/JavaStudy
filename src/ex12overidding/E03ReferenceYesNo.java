package ex12overidding;

/*

A										C-----------------------
^										|  B------------------	|
|										|  |     A----------  |	|
B										|  |     ㅣ---------ㅣ |	|
^										|	------------------- |
|										 ------------------------
C 

부모는 자식을 참조할 수 있음
자식은 부모를 참조할 수 없음   

A ref1 = new C();  O
A[] arr= new C();  O
 		 new B();  O

void fn(A apr){}
	fn(B타입/ C타입) 가능
	=> 부모타입 만들어놓으면 자식을 사용할 수 있으므로 통합적으로 관리 가능
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
public class E03ReferenceYesNo {

	public static void main(String[] args) {
		/*
		부모 참조변수로 자식 인스턴스를 참조할 수 있다.
		좌측은 부모, 우측은 자식이므로 모두 실행 가능한 문장이다.
		 */
		MyA refNum1 = new MyB();
		MyA refnum2 = new MyC();
		MyB refnum3 = new MyC();
		
		//같은 타입이므로 참조가능
		MyC refMyAddr1 = new MyC();
		//MyB -> MyC타입을 참조하므로 가능
		MyB refMyAddr2 = refMyAddr1;
		//myA -> MyC타입을 참조하므로 가능
		MyA refMyAddr3 = refMyAddr1;
		
		//MyA -> MyC타입을 참조하므로 가능
		MyA refId1 = new MyC(); //MyA는 MyC를 참조하지만 타입은 A타입임
		//MyB - >MyA를 탐조하므로 불가능(자식은 부모를 참조할 수 없다.)
//		MyB refId2 = refId1;
		//MyC -> MyA를 참조하므로 불가능(자식은 부모를 참조할 수 없다.)
//		MyC refId3 = refId1;
		/*
		refId1은 MyC인스턴스를 참조하지만, 원래 MyA타입이므로 MyC타입으로 착각하면 안된다.
		 */
		
		/*
		자식으로 부모인스턴스를 참조하는 것은 기본적으로 불가능하다. 하지만 다운캐스팅(강제형변환)을 하면 참조가 가능하다.
		즉 부모타입을 자식타입으로 변경하는 것이다. 이는 클래스가 상속관계에 있기 때문에 가능하고, 
		방식은 기본자료형과 동일하게 소괄호를 이용하면 된다.
		 */
		MyB refId2 = (MyB) refId1;
		MyC refId3 = (MyC) refId1;
		
	}

}

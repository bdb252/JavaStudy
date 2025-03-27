package test;

class MyFriends extends Object {
	String myName="성유겸";
	@Override
	public String toString() {
		return "이름:"+ myName;
	}
}

public class TesttoString {
	public static void main(String[] args) {
		MyFriends fnd1 = new MyFriends();
		System.out.println(fnd1);
	}
}

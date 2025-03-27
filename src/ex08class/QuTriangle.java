package ex08class;

class Triangle{
	int bottom;
	int height;
	
	public void init(int a, int b) {
		bottom = a;
		height = b;
	}
	public void setBottom(int a) {
		bottom = a;
	}
	public void setHeight(int b) {
		height = b;
	}
	public double getArea() {
		return (height * bottom * 0.5);
	}
}

public class QuTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());

	}

}

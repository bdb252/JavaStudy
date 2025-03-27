package ex05method;

public class QuCircleCalculator {

	static double circleArea(double a) {
		return (3.14 * a * a);
	}
	static double circleRound(double a) {
		return (2 * 3.14 * a);
	}
	public static void main(String[] args) {
		double a = 5.5;
		System.out.printf("원의 둘레(%f) : %f",a, circleRound(a));
		System.out.printf("\n원의 넓이(%f) : %f", a, circleArea(a));
	}

}

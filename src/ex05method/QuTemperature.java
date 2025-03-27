package ex05method;

public class QuTemperature {

	static double celsiusToFahrenheit(double c) {
		return (1.8 * c + 32);
	}
	static double fahrenheitToCelsius(double f) {
		return ((f - 32) / 1.8);
	}
	public static void main(String[] args) {
		double c = 10;
		double f = 30;
		System.out.println("섭씨 -> 화씨 : " + celsiusToFahrenheit(c));
		System.out.println("화씨 -> 섭씨 : " + fahrenheitToCelsius(f));
		
	}
}

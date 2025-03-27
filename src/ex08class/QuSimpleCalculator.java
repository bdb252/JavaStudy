package ex08class;

class CalculatorEx{
	int add_cnt;
	int min_cnt;
	int mul_cnt;
	int div_cnt;
	
	public void init() {
		add_cnt = 0;
		min_cnt = 0;
		mul_cnt = 0;
		div_cnt = 0;
	}
	public double add(double a, double b) {
		add_cnt++;
		return a+b;
	}
	public double min(double a, double b) {
		min_cnt++;
		return a-b;
	}
	public double mul(double a, double b) {
		mul_cnt++;
		return a*b;
	}
	public double div(int a, int b) {
		if(b == 0)
			return 0;
		div_cnt++;
		return a/b;
	}
	public void showOpCount() {
		System.out.printf("덧셈횟수: %d\n뺄셈횟수: %d\n곱셈횟수: %d\n나눗셈횟수: %d\n",add_cnt,min_cnt,mul_cnt,div_cnt);
	}
	
}
public class QuSimpleCalculator {

	public static void main(String[] args) {

		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}

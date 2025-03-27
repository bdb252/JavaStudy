package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		int a = 1;
		int k = 1;
		while(a<=5) {
			k = 1;
			while(k<=a) {
				System.out.print("*");
				k++;
			}
			a++;
			System.out.println();
		}
	}

}

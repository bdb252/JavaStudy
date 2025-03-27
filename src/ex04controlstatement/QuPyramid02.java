package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		int a = 5;
		int k = 1;
		do {
			k = 1;
			do {
				System.out.print("*");
				k++;
			}while(k<=a);
			a--;
			System.out.println();
		}while(a>=1);
	}

}

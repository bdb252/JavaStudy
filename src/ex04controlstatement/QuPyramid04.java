package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
//		final int MAX_NUM = 5;
		for(int a = 1; a<=5; a++) {
			for(int k = 1; k<=a; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = 4; a>=1; a--) {
			//descNum = MAX_NUM - (i - MAX_NUM)
			for(int k = 1; k<=a; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

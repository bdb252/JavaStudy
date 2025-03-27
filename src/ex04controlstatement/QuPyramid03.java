package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		int dan = 9;
		int space = dan / 2;
		int star = dan % 2;
		//피라미드
		
		for(;space >= 0;space--) {
			for(int i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}
	}

}

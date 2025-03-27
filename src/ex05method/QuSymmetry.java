package ex05method;

public class QuSymmetry {

	static void rotationSymmetry() {
		int i = 1;
		while(i <= 4) {
			for(int a = 4; a>0; a--) {
				if(i == a) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");				
				}
			}
			i++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		rotationSymmetry();
	}

}

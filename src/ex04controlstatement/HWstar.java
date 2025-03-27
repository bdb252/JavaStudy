package ex04controlstatement;

public class HWstar {
	public static void main(String[] args) {

		int dan = 11;
		int space = dan / 2;
		int star = dan % 2;
		//피라미드
		
		while(space >= 0) {
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			space--;
			int j = 1;
			while(j <= star) {
				System.out.print("*");
				j++;
			}
			star+=2;
			System.out.println();
		}
//		System.out.println();
		
		//역피라미드
		star = dan;
		space = 0;
		while(star >= 0) {
			int x = 1;
			while(x <= space) {
				System.out.print(" ");
				x++;
			}
			space++;
			int y = 1;
			while(y <= star) {
				System.out.print("*");
				y++;
			}
			star-=2;
			System.out.println();
		}
	}
}
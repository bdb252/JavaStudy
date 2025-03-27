package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <=100) {
			if(i % 3 == 0 || i % 7 == 0) {
				if(!(i % 3 == 0 && i % 7 == 0)) {
					sum +=i;
				}
			}
			i++;
		}
		System.out.println(sum);
		
		i = 1;
		sum = 0;
		do {
			if(i % 3 == 0 || i % 7 == 0) {
				if(!(i % 3 == 0 && i % 7 == 0)) {
					sum +=i;
				}
			}
			i++;
		}while(i <=100);
		System.out.println(sum);
		
		sum = 0;
		for(i = 1; i<=100; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				if(!(i % 3 == 0 && i % 7 == 0)) {
					sum +=i;
				}
			}
		}
		System.out.println(sum);
	}

}

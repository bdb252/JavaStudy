import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nm = scanner.nextLine();

		String[] arr = nm.split(":");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		int min = n;
		if(min > m)
			min = m;
		
		int i = 2;
		while(i < min) {
			if(n % i == 0 && m % i == 0) {
				n/=i;
				m/=i;
			}
			i++;
		}
		System.out.println(n+":"+m);
		scanner.close();
	}
}

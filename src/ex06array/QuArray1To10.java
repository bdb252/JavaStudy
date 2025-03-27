package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("초기화된 배열 요소");
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i]+" ");
		}
		int sum = 0;
		for(int i = 0; i<10; i++) {
			sum += arr[i];
		}
		System.out.println("\n배열전체요소의합:"+sum);
	}

}

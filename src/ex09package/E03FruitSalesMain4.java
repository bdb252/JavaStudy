package ex09package;

import ex09package.study.buyer.FruitBuyer4;
import ex09package.study.seller.FruitSeller4;


public class E03FruitSalesMain4 {

	public static void main(String[] args) {
		/*
		생성자를 사용해서 인스턴스를 생성하면 생성과 동시에 초기화할 수 있으므로 초기화메서드를 사용하는 것보다 편리하게 코드를 작성할 수 있다.
		 */
		//판매자1 : 사과100개, 단가1000원
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		//판매자2 : 사과80개, 단가500원
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);	
		//구매자 : 보유금액10000원
		FruitBuyer4 buyer = new FruitBuyer4(10000,0);
		
		System.out.println("구매 행위가 일어나기 전 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		System.out.println("구매 행위가 일어난 후 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}

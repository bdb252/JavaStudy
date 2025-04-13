package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class UpdateShop extends MyConnection{
	
	public UpdateShop(String user, String pass) {
		super(user, pass);
	}
	String query;
	int result;
	@Override
	public void dbExecute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?, ?, ?, ?, ?)");
			csmt.setString(1, inputValue("수정할 상품의 일련번호:"));
			csmt.setString(2, inputValue("상품명:"));
			csmt.setString(3, inputValue("가격:"));
			csmt.setString(4, inputValue("제품코드:"));
			csmt.registerOutParameter(5, Types.NUMERIC);
			csmt.execute();
			int affected=csmt.getInt(5);
			if(affected == 0) {
				System.out.println("오류 발생: 입력 실패");
			}
			else {
				System.out.println(affected+"상품 수정 성공");
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외발생");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UpdateShop("education", "1234").dbExecute();
	}

}

package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.crud.MyConnection;

public class InsertShop extends MyConnection{

	public InsertShop(String user, String pass) {
		super(user, pass);
	}
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			/*seq_total_idx.nextval사용?*/
			query = "insert into sh_goods values (seq_total_idx.nextval, ?, ?, sysdate, ?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("상품명:"));
			psmt.setString(2, inputValue("상품가격:"));
			psmt.setString(3, inputValue("상품코드:"));
			result = psmt.executeUpdate();
			System.out.println(result+"행 입력됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외 발생");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InsertShop("education", "1234").dbExecute();
	}

}


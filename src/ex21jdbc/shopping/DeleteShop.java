package ex21jdbc.shopping;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class DeleteShop extends MyConnection{
	
	public DeleteShop(String user, String pass) {
		super(user, pass);
	}

	String query;
	int result;
	@Override
	public void dbExecute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?, ?)}");
			csmt.setString(1, inputValue("삭제할 상품의 일련번호:"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
			System.out.println("삭제프로시저 실행결과:"+csmt.getString(2));
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외발생");
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	public static void main(String[] args) {
		new DeleteShop("education", "1234").dbExecute();
	}

}

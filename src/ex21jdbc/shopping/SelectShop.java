package ex21jdbc.shopping;

import java.sql.Date;
import java.sql.SQLException;

import ex21jdbc.crud.MyConnection;

public class SelectShop extends MyConnection{

	public SelectShop(String user, String pass) {
		super(user,pass);
	}
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			query = "select * from sh_goods "
					+ "where goods_name like '%'||?||'%'";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("찾는 상품명:"));
			rs=psmt.executeQuery();
			while(rs.next()) {
				String idx = rs.getString(1);
				String name = rs.getString("goods_name");
				String price = rs.getString("goods_price");
				Date regidate = rs.getDate("regidate");
				String code = rs.getString("p_code");
				
				System.out.printf("%s %s %s %s %s\n",idx, name, price, regidate, code);
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외발생");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SelectShop("education", "1234").dbExecute();
	}

}

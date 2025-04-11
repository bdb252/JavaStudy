package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLdelete extends MyConnection{
	public SQLdelete(String user, String pass) {
		super(user,pass);
	}
	String query; //쿼리문
	int result;	 //쿼리 실행 후 결과 반환
	@Override
	public void dbExecute() {
		try {
			stmt = con.createStatement();
			query = "delete from member where id='test1'";
			result = stmt.executeUpdate(query);
			System.out.println(result+"행 삭제됨");
			
			///////////////////////////////////////////////////////
			query = "delete from member where id=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("삭제할 아이디"));
			System.out.println(psmt.executeUpdate()+"행 삭제됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리실행중 예외발생");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SQLdelete("education", "1234").dbExecute();
	}
}

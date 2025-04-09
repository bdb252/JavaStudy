package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLupdate extends MyConnection{
	public SQLupdate(String user, String pass) {
		super(user,pass);
	}
	String query; //쿼리문
	int result;	 //쿼리 실행 후 결과 반환
	@Override
	public void dbExecute() {
		try {
			//Statement인스턴스 생성(쿼리문과는 별도 생성)
			stmt = con.createStatement();
			query = "update member set "
					+ " pass='0412',"
					+ " name='성유겸',"
					+ " regidate=sysdate"
					+ " where id='test2'";
			result = stmt.executeUpdate(query);
			System.out.println("[stmt]"+result+"행 업데이트됨");
			
			///////////////////////////////////////////////////////
			query = "update member"
					+ " set name=?, pass=? "
					+ " where id=?";
			psmt = con.prepareStatement(query);
			while(true) {
				//입력값을 통해 인파라미터 설정
				psmt.setString(3, inputValue("수정할 아이디"));
				psmt.setString(1, inputValue("이름"));
				psmt.setString(2, inputValue("패스워드"));
				result = psmt.executeUpdate();
				System.out.println("[psmt]"+result+"행 업데이트됨");
			}			
		}
		catch (SQLException e) {
			System.out.println("쿼리실행중 예외발생");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new SQLupdate("education", "1234").dbExecute();
	}
}

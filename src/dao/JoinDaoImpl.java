package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conn.DBConnect;
import model.Member;

public class JoinDaoImpl implements JoinDao {
	private DBConnect db;

	public JoinDaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		//db에 한 줄 추가하는 sql
		String sql = "insert into member values(?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		try {
			//커넥션 객체 획득
			conn = db.getConnection();
			
			//java에서 sql을 실행하는 PreparedStatement객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//sql의 ?파라메터 매칭
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			
			//sql실행
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//자원 반환
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

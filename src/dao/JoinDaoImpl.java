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
		
		//db�� �� �� �߰��ϴ� sql
		String sql = "insert into member values(?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		try {
			//Ŀ�ؼ� ��ü ȹ��
			conn = db.getConnection();
			
			//java���� sql�� �����ϴ� PreparedStatement��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//sql�� ?�Ķ���� ��Ī
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			
			//sql����
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//�ڿ� ��ȯ
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

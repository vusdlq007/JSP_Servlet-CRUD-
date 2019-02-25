package conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@yoonoracle.cisfbqyulfaf.ap-northeast-2.rds.amazonaws.com:1521:ORCL";

	private DBConnect() {
		// TODO Auto-generated constructor stub

	}

	public static DBConnect getInstance() {
		return db;
	}

	public Connection getConnection() {
		
		try {
			Class.forName(jdbc_driver);

			// �����ͺ��̽� ���������� �̿��� Connection �ν��Ͻ� Ȯ��
			conn = DriverManager.getConnection(jdbc_url, "yoon", "rlanrlan1!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}

package FirstDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class firstDB {
	
	private static Connection conn; //DB 연결 
	private static PreparedStatement pstmt; //쿼리문 작성

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprogramming","test","1234");
		pstmt = conn.prepareStatement("insert into 대리점 values(?,?,?,?,?,?)");
		pstmt.setString(1, "테스트");
		pstmt.setString(2, "서울");
		pstmt.setString(3, "201-1111");
		pstmt.setInt(4, 5);
		pstmt.setInt(5, 50000000);
		pstmt.setInt(6, 19801001);
		pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

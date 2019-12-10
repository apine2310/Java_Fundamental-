package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {

	public static void main(String[] args) {
		try {//1.드라이버 연결
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//2.데이터베이스와 연결 시도
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn13",
					"acorn13");
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			//sql.append("UPDATE dept SET dname = ?, loc = ? WHERE deptno = 60");
			
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ?");
			
			//3.SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
			pstmt = con.prepareStatement(sql.toString());
			
			//4.바인딩 변수(?->구체적인 값)를 설정한다.
			pstmt.setString(1, "MINING");
			pstmt.setString(2, "SILCON");
			pstmt.setInt(3, 60);
			
			//5.SQL문을 전송한다.
			int result = pstmt.executeUpdate();
			
			System.out.println("갱신된 행의 수 : " + result);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

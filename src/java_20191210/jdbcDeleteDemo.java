package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDeleteDemo {

	public static void main(String[] args) {
		try {
			//1.드라이버 연결
			Class.forName("org.mariadb.jdbc.Driver");
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
					
			//3.SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM dept ");
			sql.append("WHERE deptno = ?");
			
			
			
			pstmt = con.prepareStatement(sql.toString());
			//4.바인딩 변수를 설정한다.
			pstmt.setInt(1, 60);
			//5.SQL문을 데이터 베이스에 전송한다.
			System.out.println("갱신된 행의 수 : " + pstmt.executeLargeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try{
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}

package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDemo {

	public static void main(String[] args) {
		try {
			//1. 드라이버
			//org.mariadb.jdbc 패키지명임
			//Driver 클래스임      메모리에 할당한다.
			Class.forName("org.mariadb.jdbc.Driver"); //메모리에 로드시켜주는 작업 
			System.out.println("드라이브 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt =null;
		try {
			//2. 데이터베이스와 연결을 시도한다.
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn13", //user
					"acorn13"); //password
			
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(?, ?, ?)");
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
			pstmt = con.prepareStatement(sql.toString());
			//UPDATE dept SET dname = 'MINING', loc = 'SILICON VALLEY' WHERE deptno = 60
			//4. 바인딩 변수(?)를 설정한다.
			pstmt.setInt(1, 60);
			pstmt.setString(2, "ANAYLSIS");
			pstmt.setString(3, "LA");
			
			//5. SQL문을 전송한다.
			int result = pstmt.executeUpdate(); //insert, update, delete (DML)
			
			System.out.println("갱신된 행의 수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

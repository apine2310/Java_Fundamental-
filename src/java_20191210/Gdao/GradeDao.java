package java_20191210.Gdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.Gdto.GradeDto;


public class GradeDao {
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // 메모리에 로드시켜주는 작업
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static GradeDao single;

	private GradeDao() {
	}

	public static GradeDao getInstance() {
		if (single == null) {
			single = new GradeDao();
		}
		return single;
	}

	public boolean insert(GradeDto gto) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnect=true", "acorn13", "acorn13");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO salgrade(grade, losal, hisal) VALUES(?, ?, ?)");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, gto.getGrade());
			pstmt.setInt(++index, gto.getLosal());
			pstmt.setInt(++index, gto.getHisal());

			pstmt.executeUpdate(); // insert, update, delete (DML)

			isSuccess = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return isSuccess;
	}

	public boolean update(GradeDto gto) {
		boolean isSuccess = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnect=true", "acorn13", "acorn13");

			StringBuffer sql = new StringBuffer();

			sql.append("UPDATE salgrade ");
			sql.append("SET losal = ?, hisal = ? ");
			sql.append("WHERE deptno = ?");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, gto.getLosal());
			pstmt.setInt(++index, gto.getHisal());
			pstmt.setInt(++index, gto.getGrade());

			pstmt.executeUpdate();

			isSuccess = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return isSuccess;
	}

	public boolean delete(int grade) {
		boolean isSuccess = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnect=true", "acorn13", "acorn13");

			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM salgrade ");
			sql.append("WHERE grade = ?");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, grade);

			pstmt.executeLargeUpdate();

			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return isSuccess;
	}

	public ArrayList select() {
		ArrayList<GradeDto> list = new ArrayList<GradeDto>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn13", "acorn13");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("ORDER BY grade ASC ");

			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int index = 0;
				int grade = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				list.add(new GradeDto(grade, losal, hisal));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {

			}
		}
		
		return list;
	}

	public GradeDto select(int grade) {
		GradeDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn13", "acorn13");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT grade, losal, hisal ");
			sql.append("FROM salgrade ");
			sql.append("WHERE grade = ? ");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, grade);
			
			rs = pstmt.executeQuery();

			if(rs.next()) {
				index = 0;
				int grade2 = rs.getInt(++index);
				int losal = rs.getInt(++index);
				int hisal = rs.getInt(++index);
				dto = new GradeDto(grade2, losal, hisal);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {

			}
		}
		return dto;
	}
}

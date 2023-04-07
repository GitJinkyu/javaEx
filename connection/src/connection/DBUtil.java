package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/**
	 * DB 커넥션은 생성하여 반환
	 * @return
	 */
	public static Connection getConnection() {
		// 데이터 베이스 접근 시 필요한 정보
		//계정정보,비밀번호,ip,port,sid
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //@IP:포트:SID  
		String id ="orauser";
		String pw = "1234";
		Connection conn=null;
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//드라이버 매니저를 이용해서 커넥션 객체 생성
			conn = DriverManager.getConnection(url,id,pw);
			//롤백하지않고 커넥션이 종료되면 커밋된다.
			//커넥션이 종료될때 자동 커밋됨
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e1) {
		}
		return conn;
	}
	
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
		}
	}
	
	public static void closeConnection(Connection conn,Statement stmt,ResultSet rs) {
			try {
				if(conn != null && !conn.isClosed()) conn.close();
				if(stmt != null && !stmt.isClosed()) stmt.close();
				if(rs != null && !rs.isClosed()) rs.close();
			} catch (SQLException e) {
			}
	}
	
	public static void closeConnection(Connection conn,Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
		} catch (SQLException e) {
		}
	}
	
	
}

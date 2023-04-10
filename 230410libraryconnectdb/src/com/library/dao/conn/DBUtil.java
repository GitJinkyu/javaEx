package com.library.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static void main(String[] args) {
		//작동 확인 테스트
		System.out.println(DBUtil.getConnection());
	}
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
			//DB는 커넥션이 종료될때 자동 커밋됨
			//자동커밋 비활성화
			conn.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			System.out.println("라이브러리를 확인해주세요!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		return conn;
	}
	
	public static void commit(Connection conn) {
		try {
			//만약 conn이 null이 아니고 연결이 된 상태라면
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
		}
	}
	
	public static void closeConnection(Connection conn,Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
		}
	}
	
	public static void closeConnection(Connection conn,Statement stmt,ResultSet rs) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
				if(stmt != null && !stmt.isClosed()) {
					stmt.close();
				}
				if(rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
			}
	}
	
	
	
}

package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB Connection을 생성 하여 반환 한다. 
 * @author user
 *
 */
public class ConnectionUtil {
	
	/**
	 * DB Connection 을 반환한다.
	 * @return Connection
	 */
	public static Connection getConnection() {
		//데이터 베이스 접근 시 필요한 정보
		//접속정보 (IP,PORT,SID,ID,PW)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "LIBRARY";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 생성
			conn = DriverManager.getConnection(url,id,pw);
			//트랜젝션 처리를 위해 자동커밋을 false로 설정
			// -> 커넥션이 종료 되는 시점에 커밋
			conn.setAutoCommit(false);
	
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void Close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("conn.close() 실패!");
			e.printStackTrace();
		}
	}
	
	public static void Close(Connection conn,Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("stmt.close() 실패!");
			e.printStackTrace();
		}
	}
	
	public static void Close(Connection conn,Statement stmt,ResultSet rs) {
		try {
			if(rs 	!= null && !rs.isClosed()) 	rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("rs.close() 실패!");
			e.printStackTrace();
		}
	}
	
	//롤백
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.err.println("rollback 실패!");
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
	}
}

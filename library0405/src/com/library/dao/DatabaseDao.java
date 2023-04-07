package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DatabaseDao implements Dao{

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			//질의결과를 결과집합으로 받아온다.
			ResultSet rs= stmt.executeQuery("select * from book order by no");
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				//Y,N
				String isRentStr =rs.getString("isRent");
				//3항 연산자
				//(조건)? 참일때 반환값 :거짓일때 반환값
				boolean isRent = ("Y".equals(isRentStr))?true:false;
				
				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}
			
			//자원반납
			DBUtil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
		}
		return list;
	}

	
	@Override
	public boolean listToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int delete(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt= conn.createStatement();
			System.out.println("==데이터를 삭제합니다==");
			int res = stmt.executeUpdate("DELETE FROM book WHERE NO ="+no);
			System.out.println(res+"건 삭제되었습니다.");
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
		}
		return 0;
	}


	@Override
	public int update(int no) {
		int res=0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			System.out.println("데이터를 수정합니다");
			res = stmt.executeUpdate(
					"UPDATE BOOK SET ISRENT = 'N', EDITDATE = NULL WHERE NO ="+no);
			
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
		}
		
		return res;
	}


	@Override
	public int insert(Book book) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			System.out.println("==데이터를 추가합니다==");
			
			//sql쿼리문 작성
			String sql ="";
			
			//삽입 수정 삭제
			int res = stmt.executeUpdate(sql);
			System.out.println(res+"건 추가되었습니다.");
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
		}
		return 0;
	}

}

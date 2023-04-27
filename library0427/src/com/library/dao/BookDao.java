package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	
	public List<Book> getList(){
		List list = new ArrayList<Book>();
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK ORDER BY NO");
				while(rs.next()) {
					int no = rs.getInt(1);
					String title  = rs.getString(2);
					String rentYN = rs.getString(3);
					String author = rs.getString(4);
					//책을 생성해서 리스트에 담아주기
					Book book =new Book(no, title, rentYN, author);
					list.add(book);
				}
					
				
		} catch (SQLException e) {
			System.out.println("도서목록 출력 실패!");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertBook(Book book) {
		String sql="INSERT INTO BOOK VALUES(SEQ_BOOK_NO.NEXTVAL,?,'N',?)";
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				
			
				pstmt.setString(1, book.getTitle());
				pstmt.setString(2, book.getAuthor());
				
				int res = pstmt.executeUpdate();
				
				return res;	
				
		} catch (SQLException e) {
			System.out.println("도서 추가 실패!");
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int deleteBook(int no) {
		String sql = "delete from Book where no ="+no;
		try(Connection conn=ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			
				int res = stmt.executeUpdate(sql);
		
				return res;
			
		} catch (SQLException e) {
			System.out.println("도서 삭제 실패!");
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int updateBook(int no,String rentYN) {
		String sql="UPDATE BOOK SET rentYN = ? WHERE no = ?";
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			//?의 순서대로 인덱스 번호 수정
			pstmt.setString(1, rentYN);
			pstmt.setInt(2, no);
			
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			System.out.println("도서 변경 실패!");
			e.printStackTrace();
		}
		
		return 0;
		
	}
	
	
	
}

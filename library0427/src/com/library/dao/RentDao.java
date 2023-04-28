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
import com.library.vo.Member;

public class RentDao {
	
	
	
	public List<Book> getList(){
		List list = new ArrayList<Book>();
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
				ResultSet rs = stmt.executeQuery("SELECT NO,TITLE,NVL(대여여부,'N'),AUTHOR FROM BOOK,대여 WHERE NO=도서번호(+) AND 대여여부(+)='Y' ORDER BY 1");
				while(rs.next()) {
					int no = rs.getInt(1);
					String title  = rs.getString(2);
					String 대여여부 = rs.getString(3);
					String author = rs.getString(4);
					//책을 생성해서 리스트에 담아주기
					Book book =new Book(no, title, 대여여부, author);
					list.add(book);
				}
					
				
		} catch (SQLException e) {
			System.out.println("도서목록 출력 실패!");
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	//대여를 하면 insert로 대여여부 기록
	public int insertRent(String id,int no) {
		String sql="insert into 대여 values (seq_대여.nextval,?,?,'Y',SYSDATE,null,to_date(sysdate)+7,null)";
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				
			
				pstmt.setString(1, id);
				pstmt.setInt(2, no);
				
				int res = pstmt.executeUpdate();
				
				return res;	
				
		} catch (SQLException e) {
			System.out.println("도서 추가 실패!");
			e.printStackTrace();
		}
		return 0;
	}
	
	//반납을 하면 대여여부를 N으로,반납일=sysdate 업데이트
	public int updateRent(int no) {
		String sql="UPDATE 대여 SET 대여여부 = 'N',반납일=SYSDATE WHERE 도서번호 = ?";
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			//?의 순서대로 인덱스 번호 수정
			
			pstmt.setInt(1, no);
			
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			System.out.println("도서 변경 실패!");
			e.printStackTrace();
		}
		
		return 0;
		
	}
	
	public String getRentYN(int no) {
		String rentYN="N";
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
				ResultSet rs = stmt.executeQuery("SELECT 대여여부 FROM 대여 WHERE 대여여부='Y' AND 도서번호="+no);
				if(rs.next()) {
					//DB에서 조회된 값을 변수에 저장
					rentYN = rs.getString(1);
				}
					
		} catch (SQLException e) {
			System.out.println("도서목록 출력 실패!");
			e.printStackTrace();
		}
		
		return rentYN;
	}

	
}

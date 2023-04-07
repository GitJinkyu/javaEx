package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.jdbc.driver.parser.util.Array;

public class BookDao {
	
	public static void main(String[] args) {
		BookDao dao =new BookDao();
//		dao.getList();
		dao.insert(55,"나루토","나루루","Y");
//		dao.delete(55);
//		dao.update(4);
		List<Book> list = dao.getList();
		
		System.out.println("========책 리스트========");
		for(Book book : list) {
			System.out.println(book.toString());
		}
		
	}
	
	
	
	
	//데이터 삽입
	public void insert(int no,String title,String author,String isRent) {
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			System.out.println("==데이터를 추가합니다==");
			//sql쿼리문 작성
			String sql ="insert into book values ("+no+",'"+title+"','"+author+"','"+isRent+"',sysdate,null)";
			
			//삽입 수정 삭제
			int res = stmt.executeUpdate(sql);
			System.out.println(res+"건 추가되었습니다.");
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
		}
		
		
	}
	//데이터 수정
	public void update(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt= conn.createStatement();
			System.out.println("==데이터를 수정합니다==");
			int res = stmt.executeUpdate(
					"UPDATE BOOK SET ISRENT = 'Y', EDITDATE = SYSDATE WHERE NO="+no);
			System.out.println(res+"건 수정되었습니다.");
			
			System.out.println("대기");
			Thread.sleep(5000);
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
			System.out.println("자원 반납 완료");
		} catch (SQLException e) {
		} catch (InterruptedException e) {
		}
		
	}
	//데이터 삭제
	public void delete(int no) {
		
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
	}
	//데이터 조회
	public List<Book> getList () {
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
				String isRent = rs.getString("isRent");
				Date regdate = rs.getDate("regdate");
				Date editdate = rs.getDate("editdate");
				
				Book book = new Book(no, title, author, isRent, regdate, editdate);
				list.add(book);
			}
			
			//자원반납
			DBUtil.closeConnection(conn, stmt, rs);
		} catch (SQLException e) {
		}
		
		return list;
	}
}

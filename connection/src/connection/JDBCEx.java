package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEx {

	
	public static void main(String[] args) {
		JDBCEx ex =new JDBCEx();
		
		ex.getList();
//		ex.insert();
//		ex.delete();
//		ex.update();
	}
	
	public void getList() {
		// 데이터 베이스 접근 시 필요한 정보
		//계정정보,비밀번호,ip,port,sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 	//@IP:포트:SID  
		String id ="orauser";
		String pw = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 성공"+conn);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book order by no");
			List<Book> list = new ArrayList<>();
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
				Book book = new Book(no, title, author, isRent, regdate, editdate);
				list.add(book);
				
			}
			System.out.println(list);
			for(Book book:list) {
				System.out.println(book.toString());
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	
	public void insert() {
		// 데이터 베이스 접근 시 필요한 정보
		//계정정보,비밀번호,ip,port,sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 	//@IP:포트:SID  
		String id ="orauser";
		String pw = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 성공"+conn);
			Statement stmt = conn.createStatement();
			
			//몇건이 처리되었는지 int타입으로 반환해줌
			int res = stmt.executeUpdate("insert into book values (4,'슬램덩크','이노우에다케히코','N',null,null)");
			System.out.println(res+"건 처리되었습니다.");
			
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("오류");
			System.out.println(e.getMessage());
			
		} catch (SQLException e1) {
			System.out.println("오류1");
			System.out.println(e1.getMessage());
		}
	}
	
	
	public void delete() {
		// 데이터 베이스 접근 시 필요한 정보
		//계정정보,비밀번호,ip,port,sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 	//@IP:포트:SID  
		String id ="orauser";
		String pw = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션을 얻어오기 위해 필요한 정보 넣어주기
			Connection conn = DriverManager.getConnection(url,id,pw);
			//오토커밋 비활성화 (커넥션close할때 자동커밋됨)
			conn.setAutoCommit(false);
			
			//쿼리 실행 준비
			Statement stmt = conn.createStatement();
			//몇건이 처리되었는지 반환받음
			int res = stmt.executeUpdate("delete from book");
			System.out.println(res+"건 처리 되었습니다.");
			conn.rollback();
			System.out.println("롤백되었습니다.");
			
		} catch (ClassNotFoundException e) {
		} catch (SQLException e1) {
		}
		
	}
	
	public void update() {
		// 데이터 베이스 접근 시 필요한 정보
		//계정정보,비밀번호,ip,port,sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 	//@IP:포트:SID  
		String id ="orauser";
		String pw = "1234";
		
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DB연결 설정
			Connection conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 성공"+conn);
			//쿼리 실행 객체 생성
			Statement stmt = conn.createStatement();
			//쿼리 실행
			int res = stmt.executeUpdate("UPDATE BOOK SET ISRENT = 'Y', EDITDATE = SYSDATE WHERE NO = 3");
			
			System.out.println(res+"건 처리되었습니다.");
			
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
	
	
	
	
	public void connetion() {
		// 데이터 베이스 접근 시 필요한 정보
		//계정정보,비밀번호,ip,port,sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 	//@IP:포트:SID  
		String id ="orauser";
		String pw = "1234";
		
		try {
			//jdbc 순서
			//1.클래스 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.커넥션 얻어오기
			Connection conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 성공"+conn);
			//쿼리 실행
			Statement stmt = conn.createStatement();
			
			//데이터 조회
			//3.executeQuery(쿼리문장 입력);
			//4.ResultSet:결과 집합 = 쿼리 문장에 대한 결과
			ResultSet rs = stmt.executeQuery("select count(*) from book");
			rs.next();//다음 행으로 이동 (첫줄은 아무것도 값이 없다.)
			System.out.println("조회결과 "+rs.getString("count(*)"));
			
			rs.close();
			stmt.close();
			conn.close();
			
			//데이터 생성,수정,삭제
			//stmt.executeUpdate("");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
}

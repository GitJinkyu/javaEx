package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;







public class SqlEx {

	public static void main(String[] args) {

		System.out.println(Seqbookno());
		
		
	}
	
	public static int Seqbookno(){
		String sql="SELECT book_seq.NEXTVAL FROM book";

		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			 ResultSet rs = pstmt.executeQuery();
			 
			rs.next();
			int rss=rs.getInt(1);
			return rss;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
}
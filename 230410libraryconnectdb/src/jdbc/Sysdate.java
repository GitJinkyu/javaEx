package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

public class Sysdate {

	public static void main(String[] args) {

		Sysdate();
		
		
	}
	
	public static void Sysdate(){
		String sql = "SELECT TO_CHAR(SYSDATE,'YYYY\"년\"-MM\"월\"-DD\"일\" HH\"시\" MI\"분\" SS\"초\"(DAY)') FROM DUAL";
		try(Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

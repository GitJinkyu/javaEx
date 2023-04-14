package javatest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlEx {

	public static void main(String[] args) {

		Sysdate();
		
		
	}
	
	public static void Sysdate(){
	    String sql = "SELECT * FROM (SELECT ROWNUM RN, EMP_COPY.* FROM EMP_COPY)WHERE RN BETWEEN 10 AND 20";
	    try(Connection conn = DBUtil.getConnection();
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);) {
	       
	        while(rs.next()) {
	            String rn = rs.getString(1);
	            String id = rs.getString(2);
	            String name = rs.getString(3);
	            String email = rs.getString(4);
	            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));


	           
	        }
	    } catch (SQLException e) {
	    	System.out.println("오류");
	        e.printStackTrace();
	    }
	}
}
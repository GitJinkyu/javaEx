package javatest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex4 {

	public static void main(String[] args) {

		Sysdate();
		
		
	}
	
	public static void Sysdate(){
	    String sql = "SELECT period,RPAD(region,4), LPAD(TO_CHAR(SUM(loan_jan_amt),'9,999,999'),10) FROM KOR_LOAN_STATUS GROUP BY ROLLUP (period,region) HAVING SUM(loan_jan_amt)>=100000 ORDER BY 1,2";
	    try(Connection conn = DBUtil.getConnection();
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);) {
	        String prevDate = null;
	        while(rs.next()) {
	            String date = rs.getString(1);
	            String region =rs.getString(2);
	            String loan = rs.getString(3);
	            if(region == null ) {
	                region = "총합";
	                if(date == null) {
	                    date = "전년";
	                    System.out.printf("대출기간:%s 지역:%s 대출금합계:%s\n",date,region,loan);
	                } else if(!region.equals(prevDate)){
	                    System.out.printf("대출기간:%s 지역:%s 대출금합계:%s\n",date,region,loan);
	                }
	            } else if(!region.equals(prevDate)){
	                System.out.printf("대출기간:%s 지역:%s 대출금합계:%s\n",date,region,loan);
	            }
	            prevDate = region;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
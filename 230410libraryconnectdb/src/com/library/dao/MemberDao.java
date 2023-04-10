package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

public class MemberDao {
	public MemberVo login(String id,String pw) {
		String sql = "select * from member where id =? and pw = ?";
		System.out.println("id= "+id);
		System.out.println("pw= "+pw);
		try(Connection conn = DBUtil.getConnection();
				//쿼리문에 매개변수 넣을때 쓰는 preapareStatement
				//쿼리문을 conn.prepareStatement 에 넣어야함
				//기존엔 executeQuery에 넣었음
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
				//1번째 ? 에 넣을 값 id
				pstmt.setString(1, id);
				//2번째 ? 에 넣을 값 pw
				pstmt.setString(2, pw);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					String name = rs.getString("name");
					String adminYN = rs.getString("adminYN");
					MemberVo memberVo =  new MemberVo(id, "", name, adminYN);
					
					return memberVo;
				}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// id/pw가 일치하는 사용자를 찾을수 없음
		return null;
		
	}
	/**
	 * 사용자의 정보를 데이터 베이스에 등록한다.
	 * @param memberVo
	 * @return
	 */
	public static int InsertMember(MemberVo memberVo) {
		String sql="insert into member values(?, ?, ?, ?)";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}
	/**
	 * 데이터베이스에 등록된 사용자 정보를 삭제
	 * Statement
	 * 	-쿼리 자체를 String 문자열로 넣어주기 때문에
	 * 		문자가 값으로 들어가는 경우 ''처리를 해줘야 한다.
	 * 
	 * PreapareStatement
	 * 	-Statement보다 기능이 향상된 클래스
	 *  -코드의 안정성과가독성이 높다
	 *  -인자 값으로 전달이 가능
	 *  -매개변수를 ?로 설정 (?에 ''처리를 하지 않는다.)
	 *  	setString(index,값);
	 *  	setInt(index,값);
	 *  
	 * @param id
	 * @return
	 */
	public static int deleteMember(String id) {
//		두가지 방법
//		1.
//		String sql = "delete from member where id ='"+id+"'";
//		try(Connection conn=DBUtil.getConnection();
//				Statement stmt = conn.createStatement();) {
//			int res = stmt.executeUpdate(sql);
//			return res;
//		2.
		String sql="delete from member where id = ?";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, id);
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}

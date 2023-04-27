package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;
import com.library.vo.Member;

public class MemberDao {
	public Member login(String id,String pw) {
		Member member = null;
		String sql=String.format("SELECT id,name,adminyn,status,grade FROM MEMBER WHERE ID='%s' AND PW='%s'", id,pw);
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			//질의결과 결과집합을 member 객채에 담아줌
			if(rs.next()) {
				String name = rs.getString(2);
				String adminyn = rs.getString(3);
				String status = rs.getString(4);
				String grade = rs.getString(5);
				
				member = new Member(id, "", name, adminyn, status, grade);
			}
				
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return member;
	}
	
	//계정추가
//	public int insertMember(Member member) {
//		String sql="INSERT INTO MEMBER (id,pw,name) VALUES(?,?,?)";
//		try(Connection conn = ConnectionUtil.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql);) {
//				
//				pstmt.setString(1, member.getId());
//				pstmt.setString(2, member.getPw());
//				pstmt.setString(3, member.getName());
//				
//				int res = pstmt.executeUpdate();
//				
//				return res;	
//				
//		} catch (SQLException e) {
//			System.out.println("계정 추가 실패!");
//			e.printStackTrace();
//		}
//		return 0;
//		
//	}
	
	
	
	public int deleteMember(String id) {
		String sql = "delete from member where id ='"+id+"'";
		try(Connection conn=ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			
				int res = stmt.executeUpdate(sql);
		
				return res;
			
		} catch (SQLException e) {
			System.out.println("계정 삭제 실패!");
			e.printStackTrace();
		}
		return 0;
		
	}
	/**
	 * 아이디 중복체크
	 * 중복일경우 false 리턴
	 * @param id
	 * @return
	 */
	public boolean idCheck(String id) {
		boolean res=false;
		String sql = "select * from member where id ='"+id+"'";
		try(Connection conn=ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
				
			// 조회 결과 집합이 있으면 rs는 true이기때문에 !를 붙여 false로 반환받기
				return !rs.next();
				
			
		} catch (SQLException e) {
			System.out.println("계정 중복 확인 실패!");
			e.printStackTrace();
		}
		return res;
		
	}
	
	
	public int insertMember(Member member) {
		if (!idCheck(member.getId())) {
	        return 0;
	    }
		
		String sql="INSERT INTO MEMBER (id,pw,name) VALUES(?,?,?)";
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPw());
				pstmt.setString(3, member.getName());
				
				int res = pstmt.executeUpdate();
				
				return res;	
				
		} catch (SQLException e) {
			System.out.println("계정 추가 실패!");
			e.printStackTrace();
		}
		return 0;
		
	}






}

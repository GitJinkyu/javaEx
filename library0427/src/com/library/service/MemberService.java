package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	public Member login(String id,String pw) {
		Member member = null;
		member = dao.login(id, pw);
		if(member != null) {
			System.out.println("로그인 되었습니다.");
			System.out.println(member.getName()+"님 환영합니다!🎉");
			return member;
		}
		else {
			System.out.println("ID/PW가 틀렸습니다.");
		}
		return member;
	}
	
	public boolean idCheck(String id) {
		boolean res=dao.idCheck(id);
		if(!res) {
			System.out.println("입력한 ID가 이미 존재합니다. 다시 입력해주세요.");
			return false; 
		}
		return true;
	}
	
	public int insertMember(String id,String pw, String name, String adminYN) {
		
		int res=dao.insertMember(id,pw,name,adminYN);
		if(res>0) {
			System.out.println("사용자 등록 "+res+"건이 완료되었습니다!👏");
			return 0;
		}
		return 0;
	}
	
	public int deleteMember(String id,String pw) {
		int res = dao.deleteMember(id,pw);
		if(res>0) {
			System.out.println("사용자 "+res+"건 삭제 되었습니다.👏");
			
		}else {
			System.out.println("존재 하지않는 사용자이거나 ID/PW가 틀렸습니다‼");
		}
		
		return 0;
		
	}
}



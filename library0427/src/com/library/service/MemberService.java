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
			return member;
		}
		else {
			System.out.println("ID/PW가 틀렸습니다.");
		}
		return member;
	}
	
	public int insertMember(Member member) {
		
		int res=dao.insertMember(member);
		if(res==0) {
			System.out.println("아이디가 중복되었습니다.\n다른 아이디를 입력해주세요");
			return 0;
		}
		else {
			System.out.println("사용자 등록 "+res+"건이 완료되었습니다!");
		}
		return 1;
	}
}

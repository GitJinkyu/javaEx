package member.service;

public class MemberService {
	
	
	public boolean login(String id,String password) {
		//id에 null이들어올 경우 nullpointException이 발생할 우려가 있다
		//null이 아닌경우 체크로직을 실행하거나 "hong"(문자열).equals를 사용
		if("hong".equals(id) && "12345".equals(password)) {
			return true;
		}
		else{
			return false;	
		}
	}
	public void logout(String id) {
			
		System.out.println("로그아웃되었습니다.");
	}
}

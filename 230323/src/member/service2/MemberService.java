package member.service2;

public class MemberService {
	String id;
	String password;

	//생성자
	public MemberService(String id,String password) {
		this.id=id;
		this.password=password;
	}
	
	
	//로그인
	public boolean login(String id,String password) {
		//id,password 필드에 값과 비교하여 일치하면 true 아니면 false
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	public void logout(String id) {
			
		System.out.println(this.id+"님 로그아웃되었습니다.");
	}
}

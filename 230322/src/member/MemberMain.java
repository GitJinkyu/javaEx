package member;

public class MemberMain {

	public static void main(String[] args) {
		Member mem = new Member();
		System.out.println("멤버 이름: "+mem.name);
		System.out.println("멤버 아이디: "+mem.id);
		System.out.println("멤버 패스워드: "+mem.password);
		System.out.println("멤버 나이: "+mem.age);
		System.out.println("초기화전=============");
		mem.name="김진규";
		mem.id="rlawlsrb";
		mem.password="rlawlsrb";
		mem.age=20;
		System.out.println("멤버 이름: "+mem.name);
		System.out.println("멤버 아이디: "+mem.id);
		System.out.println("멤버 패스워드: "+mem.password);
		System.out.println("멤버 나이: "+mem.age);

	}

}

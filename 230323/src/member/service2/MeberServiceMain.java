package member.service2;

import java.util.Scanner;

public class MeberServiceMain {

	public static void main(String[] args) {
		MemberService memberService= new MemberService("hong","12345");
	
		int i =0;
	while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String id = scan.next();
		System.out.println("비밀번호를 입력해주세요");
		String password = scan.next();
		
		
		boolean resul = memberService.login(id,password);
		if(resul){
			System.out.println("로그인 되었습니다");
			break;
			
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
			i++;
			if(i>=5) {
				System.out.println("시스템을 종료합니다(5회 불일치)");
				System.exit(0);
			}
		}
	}
	memberService.logout("");

	}

}

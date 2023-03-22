package korea.object;

public class KoreanMain {
	public static void main(String[] args) {
		
		Korean Korean = new Korean();
		Korean.name = "길";
		Korean.ssn = "222222-2222222";
		System.out.println("Korean: "+Korean.nation);
		System.out.println("Korean: "+Korean.name);
		System.out.println("Korean: "+Korean.ssn);
		
		//객체 초기화
		Korean Hong =new Korean("홍길동","123456-1234567");
		System.out.println("Hong: "+Hong.nation);
		System.out.println("Hong: "+Hong.name);
		System.out.println("Hong: "+Hong.ssn);
		
		Korean Lee =new Korean("이하늬","111111-2222222");
		System.out.println("Lee: "+Lee.nation);
		System.out.println("Lee: "+Lee.name);
		System.out.println("Lee: "+Lee.ssn);
	
		
	}
	
}

package stringEx;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		//매개값의 문자열을 포함 여부를 확인
		//포함 : 시작인덱스값을 반환
		//불포함 : -1을 반환 
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("야"));
		
		
		System.out.println("==============================================");
		//원하는 문자열 추출
		//시작 인덱스 포함 ,끝 인덱스 미포함
		System.out.println(str.substring(4, 7));
		//시작 인덱스만 넣으면 끝까지 출력
		System.out.println(str.substring(4));
		
		
		System.out.println("==============================================");
		if(str.indexOf("자바")>=0 ) {
			System.out.println("자바 관련 있음");
		}else {
		System.out.println("자바 관련 없음");
		}
		
		System.out.println("==============================================");
		//문자열의 길이를 반환
		//id의 길이는 5자 이상이여야 한다
		String id = "id";
		if(id.length()<5) {
			System.out.println("ID는 5자 이상이여야 합니다.");
		}
		String ssn = "12345612345672";
		if(ssn.length()!=13) {
			System.out.println("주민등록번호가 아닙니다.");
		}
		
		
		System.out.println("==============================================");
		//문자 교체
		str = "자바는 객체지향 언어 입니다 자바를 자바봅시다";
		System.out.println(str);
		String newStr = str.replace("자바", "java");
		System.out.println(newStr);
		
		System.out.println("==============================================");
		//대소문자 교체
		str = "Java Program Language";
		System.out.println(str.toUpperCase()); //대문자로 변경
		System.out.println(str.toLowerCase()); //소문자로 변경
		
		
		System.out.println("==============================================");
		//대소문자를 가리지않고 비교
		str = "q";
		System.out.println(str.equalsIgnoreCase("Q"));		
		System.out.println(str.equalsIgnoreCase("q"));		
		
		System.out.println("==============================================");
		//공백을 제거해주기
		id = "     id";
		System.out.println(id);
		System.out.println(id.trim());	
		
		System.out.println("==============================================");
		//기본 타입을 문자열로 변경
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(4.4));
		System.out.println(String.valueOf(true));
		
		System.out.println("==============================================");
		
		
	}
}

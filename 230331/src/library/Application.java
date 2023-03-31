package library;

public class Application {

	public static void main(String[] args) {
		Library lib =  new Library();
		
		//책 추가
		lib.addBook("책1", "작가1");
		lib.addBook("책2", "작가2");
		lib.addBook("책3", "작가3");
		
		//책 정보 출력
		lib.toString();
		
		System.out.println("삭제할 책 번호를 선택해주세요.");
		int i = 0; //스캐너로 입력 받는 부분
		
		//책 삭제
		lib.removeBook(i);
		
		//책 정보 출력
		lib.toString();
		
		//책 대여:book.isRent 값이 True로 변하는것 
		
		System.out.println("대여할 책 번호를 선택 해주세요.");
		i = 0; //스캐너로 입력 받는 부분
		
		lib.updateBook(i);

		//책 정보 출력
		lib.toString();
		
		//검증 : 책의 목록의 사이즈보다 큰 값이입력되었을때 다시 입력 받을수있도록
		
	}

}

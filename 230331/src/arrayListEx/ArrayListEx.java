package arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		//List는 인터페이스라 직접 생성 불가
		//List의 구현체인 ArrayList를 사용
		List<String>list = new ArrayList<String>();

		//리스트에 저장
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("myBATIS");
		list.add(2,"Database"); //두번째 객체를 뒤로 밀고 두번째 객체로 추가됨
		
		//삭제
		list.remove(1); //1번 객체를 삭제하고 다음 객체들이 한칸씩 앞으로 올라옴
		
		//수정
		list.set(1, "Oracle"); //앞으로 당겨진 1번객체의 "Database"값을 "Oracle"로 변경함
		
		
		//리스트에 저장된 총 갯수
		int size =  list.size();
		System.out.println("총 갯수: "+size);
		
		//리스트에 저장된 객체 읽기
		//인덱스 0부터 시작
		String str = list.get(2);
		System.out.println("2번 인덱스: "+str);
		
		for(int i = 0 ; i<list.size(); i++) {
			str= list.get(i);
			System.out.println(i+" : "+str);
		}
		
		//향상된 for문
		int i = 0;
		for(String s : list) {
			System.out.println(i+" : "+s);
			i++;
		}
		
		
	}
}

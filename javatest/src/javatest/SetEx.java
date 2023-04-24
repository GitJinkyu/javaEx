package javatest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		//컬렉션프레임워크
		//데이터를 효율적으로 관리(추가,삭제,검색,저장)할수있는 자료구조
		//list : 인덱스로 관리
		//set : 중복을 허용하지 않음
		//map : key, value
		Set lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			int i = (int)(Math.random()*6)+1;
			lotto.add(i);
			System.out.println(lotto.toString());
		}
		/*
		 * 컬렉션에서 요소를 제어하는 기능
		 * nex(), previous()를 사용하여 앞뒤로 이동이 가능
		 * hasNext()를 사용하여 다음 요소가 있는지 확인하는 기능
		 */
		Iterator i = lotto.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
			
		}
	}

}

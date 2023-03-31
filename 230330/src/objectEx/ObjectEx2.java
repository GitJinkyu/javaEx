package objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/**
		 * 			타입   타입
		 * HashMab <key,value>
		 * 
		 * 해쉬맵 선언부
		 * HashMap<String, String> hashMap = new HashMap();
		 * 동일한 key값이 저장될 수  없음.
		 * 동일한 key가 있을 경우 덮어씌어짐
		 * 
		 *  1	홍길동
		 *  2	너몰라
		 *  3	나잘난
		 *  
		 */
		HashMap<String, String> hashMap = new HashMap();
		hashMap.put("1", "홍길동"); //데이터를 넣는 메서드
		hashMap.put("2", "너잘난"); //데이터를 넣는 메서드
		hashMap.put("3", "나잘난"); //데이터를 넣는 메서드
		hashMap.put("key", "나잘난"); //데이터를 넣는 메서드
		hashMap.put(new String("key"), "객d체"); //데이터를 넣는 메서드
		
		
		hashMap.get("key"); //데이터를 꺼내오는 메서드, key값을 넣으면 거기에 저장된 value를 가져옴
		System.out.println(hashMap.get("1"));
		System.out.println(hashMap.get("2"));
		System.out.println(hashMap.get("3"));
		System.out.println(hashMap.get("key"));
		System.out.println(hashMap.get(new String("key")));
		
		HashMap<String, String> hashMap1 = new HashMap();
		hashMap1.put("1", "홍길동"); //데이터를 넣는 메서드
		hashMap1.put("2", "너잘난"); //데이터를 넣는 메서드
		hashMap1.put("3", "나잘난"); //데이터를 넣는 메서드
		System.out.println("==========================");
		System.out.println(hashMap1.get("1"));
		System.out.println(hashMap1.get("2"));
		System.out.println(hashMap1.get("3"));
		System.out.println("==========================");
		
		
		
		
	}
}

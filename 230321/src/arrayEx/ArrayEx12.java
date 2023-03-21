package arrayEx;


public class ArrayEx12 {

	
	public static void main(String[] args) {
		String[] oldStrArr = {"java","array","copy"};
		String[] newStrArr = new String[5];
		//원본배열,복사 시작 index, 복사받을 배열, 복사를 시작할 인덱스,복사할 개수
		System.arraycopy(oldStrArr,0, newStrArr, 0, oldStrArr.length);
		
		for(int i = 0; i<newStrArr.length;i++) {
			System.out.println(newStrArr[i]);
		}
		System.out.println("====================");
		
		//향상된 For문
		//(타입 변수명 : 배열의이름)
		//배열의 요소를 모두 순회합니다. 0~끝까지
		
		for(String str : newStrArr) {
			System.out.println(str);
			
		}
		
			
	
	}
}
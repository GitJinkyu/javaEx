package arrayEx;


public class ArrayEx11 {

	
	public static void main(String[] args) {
		//배열의 길이를 변경할 수 없으므로
		//배열이 길이를 늘이거나 줄이기 위해서는
		//새로운 배열을 만들고 기존 배열을 복사한다
		
		
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5];
	
		
		for(int i = 0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		
		for(int i = 0; i<newArr.length; i++) {
			System.out.println("newArr: "+newArr[i]);
			
		}
				
			
	
	}
}
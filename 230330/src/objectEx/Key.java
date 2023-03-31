package objectEx;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//형변환이 가능하면 형변환 한 후 number 값 비교
			Key key = (Key) obj;
			if(key.number == this.number)
			return true;
			
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//객체의 주소값을 숫자로 반환
		//생성된 객체마다 다른 주소 값을 가지고 있다
		
		return number;
	}
	
}

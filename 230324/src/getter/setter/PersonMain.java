package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person("123456","호삼원");
		//상수 필드의 값을 변경할 수 없다
		//person.nation = "한국"; //<-- 상수 값을 바꾸려해서 오류 발생
		person.name = "호사원";
		
		
		System.out.println("파이값: "+person.PI);
		System.out.println("지구반지름: "+person.EARTH_RADIUS+"km");
		
		Calendar cal = Calendar.getInstance();
		
		//현재 일을 출력
		//두개 같은것임
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(5);
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		//시간 구하는법 
		long before = System.currentTimeMillis(); //실행전
		System.out.println(before);
		long after = System.currentTimeMillis();  //실행후
		System.out.println(after);
		
		
	}

}

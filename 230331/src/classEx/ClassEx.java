package classEx;

public class ClassEx {

	public static void main(String[] args) {
//		Class clazz = Car.class;
		
		Class clazz;
		try {
			//해당 경로에 클래스가 존재 할 경우 클래스를 반환
			//없는경우 예외 발생 
			//clazz = Class.forName("classEx.Car1");
			
			//라이브러리가 잘 로드되었는지 확인 할때 사용 
			clazz = Class.forName("classEx.Car");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			//클래스 경로를 활용하여 리소스 절대경로를 얻어오기
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
			
		} catch (ClassNotFoundException e) {
			System.out.println("정보 얻기 실패");
		}
	}

}

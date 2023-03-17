package bmiEx;

public class printfEx {

	public static void main(String[] args) {
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.6;
		int money = 10000000;
		
		System.out.println(money);
		System.out.printf("%,d\n", money);
		
		System.out.printf("이름: " + name + " 나이 : " + age + " 아이디 : " + id);
		// 형식문자열(%s: 문자열, %d: 정수, %f: 실수)
		// 형식문자열에 맞게 변수를 대입할 수 있다.
		System.out.printf("\n이름 : %s \n나이 : %d \n아이디 : %s \n키: %f", name, age, id, height);
		// 혹은 직접 값을 입력할 수도 있다.
		System.out.printf("\n이름 : %s \n나이 : %d \n아이디 : %s \n키: %f", "name", 10, "id", 160.0);

		// 자릿수를 정해줄 때
		// %5d: 왼쪽 빈자리 공백
		// %-5d: 오른쪽 빈자리를 공백
		// %05d: 0으로 빈자리를 채움
		System.out.println("====================================================");
		System.out.printf("이름 : %s 나이 : %d 키: %10.2f \n", "name", age, height);
		System.out.printf("이름 : %5s 나이 : %d 키: %f \n", "name", age, height);
		System.out.printf("이름 : %5s 나이 : %05d 키: %f \n", "name", age, height);
		System.out.println("====================================================");
		System.out.printf("이름 : %5s 나이 : %05d 키: %10.2f \n", "name", age, height);
		System.out.printf("이름 : %5s 나이 : %05d 키: %-10.2f \n", "name", age, height);
		System.out.printf("이름 : %5s 나이 : %05d 키: %010.2f \n", "name", age, height);
		System.out.printf("이름 : %5s 나이 : %05d 키: %f \t", "name", age, height);
		System.out.printf("이름 : %5s 나이 : %05d 키: %f %%", "name", age, height);
	}
}

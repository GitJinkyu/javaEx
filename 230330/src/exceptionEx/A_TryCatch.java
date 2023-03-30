package exceptionEx;

/**
 * try{
 *  //예외가 발생할 수있는 코드들
 * }catch(Exception e){
 *  //try 블록에서예외가 발생시 실행을 멈추고 catch 블록을 실행
 * }finaly{
 *  //생략이 가능하며
 *  //예외가 발생하거나예외가 발생하지 않았을경우 모두실행한다.
 *  //보통 자원을 반납하는 문장이 작성된다
 * }
 * @author user
 *
 */

public class A_TryCatch {
	public static void main(String[] args) throws Exception {
		A_TryCatch trycatch = new A_TryCatch();
		
		trycatch.method1();
		System.out.println("=================");
		trycatch.method3();
		
	}
	public void method3() throws Exception {
		method2();
	}
	
	public void method1() {
		//오류가 발생할소지가 있는 메서드를 try catch문으로 감싸
		//오류처리를 할 수 있다.
		//=======> 프로그램이 강제 종료되지 않고 계속해서 실행될 수 있도록 처리
		//오류를 처리하는 방법 
		//1.메서드를 호출한 곳으로 오류를 떠넘기기
		//2. try catch문으로 처리하기
		try {
			System.out.println("method2 호출 전");
			method2();
			System.out.println("method2 호출 후");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("method2가 호출 도중 오류 발생");
		}finally {
			//필수는 아님 생략가능
			//무조건 실행(오류발생or오류 미발생)하는 구간
			System.out.println();
		}
	}
	
	//메서드를 호출한 곳으로 예외처리를 미룸
	public void method2() throws Exception {
		System.out.println("method2()호출 중에 예상치 못한 예외가 발생했습니다.");
		throw new Exception("강제로 예외를 발생 시켰습니다."); 
	}
}

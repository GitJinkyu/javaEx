package obejectEx;

public class Calculator {
	//접근제어자 반환타입 메서드명(매개변수타입 변수명)
	
	/**
	 * 두개의 정수를 받아서 두수의 합을 반환한다 
	 *        
	 * @return 두수의 합
	 */
	public int add(int num1,int num2){
			
		return num1 + num2;
	
		
	}
	
	
	//빼기
	/**
	 * 두개의 정수를 받아서 두수의 차를 반환한다 
	 *        
	 * @return 두수의 차
	 */
	public int subtarct(int snum1,int snum2){
		
		return snum1 - snum2;
		
		
	}
	
	
	//곱하기
	/**
	 * 두개의 정수를 받아서 두수를 곱한다 
	 *        
	 * @return 두수의 곱
	 */
	public int multiply(int mnum1,int mnum2){
		
		return mnum1 * mnum2;
		
		
	}
	
	
	//나누기
	/**
	 * 두개의 정수를 받아서 두수를 나눈다 
	 *        
	 * @return 두수의 나눈 값
	 */
	public int divide(int dnum1,int dnum2){
		
		return dnum1 / dnum2;
		
		
	}
	
	
	//나머지
	/**
	 * 두개의 정수를 받아서 두수를 나눈 나머지를 반환한다 
	 *        
	 * @return 두수의 나머지
	 */
	public int remainder(int rnum1,int rnum2){
		
		return rnum1 % rnum2;
		
		
	}
	
	
	
	
}

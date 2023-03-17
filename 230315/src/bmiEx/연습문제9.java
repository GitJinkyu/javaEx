package bmiEx;

public class 연습문제9 {
	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)var1 + (int)(var2 + (double)var3) + (int)Double.parseDouble(var4);
		int result2 = (int)var1 + (int)var2 + (int)(var3 + (double)Double.parseDouble(var4));
			
 		
		System.out.println(result);
		System.out.println(result2);
	}
}
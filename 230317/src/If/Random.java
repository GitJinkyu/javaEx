package If;



public class Random {

	public static void main(String[] args) {
		
		
		double num = Math.random();
		
		int numRes = (int)((num * 6)+1);
		
	
		System.out.println("주사위 : " + numRes);
		switch(numRes) {
		case 1:
			System.out.println("1번이 나왔습니다"); break;
		
		case 2:
			System.out.println("2번이 나왔습니다"); break;
		
		case 3:
			System.out.println("3번이 나왔습니다"); break;
		
		case 4:
			System.out.println("4번이 나왔습니다"); break;
	
		case 5:
			System.out.println("5번이 나왔습니다"); break;
		
		case 6:
			System.out.println("6번이 나왔습니다"); break;
		
		default:
			System.out.println("=====종료====="); break;
		}
		
		
		//Math.random()
		//0.0 ~ 1.0 사이의 무작위수를 추출하여  double  타입으로 반환
		//10을 곱했을때 0-9
		//100을 곱했을때 00-99
		int i=0;
		while(true) {
			int rotto =(int) (Math.random()*45+1);
			System.out.println("당신의 로또 번호는"+rotto+"입니다");
			
			i++;
			if(i==5) {
				break;
			}
		}
	
		
	
		
		
		
	}

}

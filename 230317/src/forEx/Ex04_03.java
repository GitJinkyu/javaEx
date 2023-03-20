package forEx;

public class Ex04_03 {

	public static void main(String[] args) {
		//두개의 주사위를 던져서 나온 수
		// 1~ 6 까지 6개의 수가 나올수 있다.
		
		//dice1,2 합이 5이면 출력후 종료
		//아니면 계속 주사위를 굴립니다.
		while(true){
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			System.out.printf("(%d,%d)\n",dice1,dice2);
			
			if(dice1+dice2 == 5) {
				System.out.println("dice1+dice2="+(dice1+dice2));
				break;
				
			}
			
			
	
			
		}

	}

}

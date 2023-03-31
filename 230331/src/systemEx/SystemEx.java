package systemEx;

public class SystemEx {
	public static void main(String[] args) throws InterruptedException {
		long sum=0;
		
		//수행시간 구하기
		//1/1000초를구한다
		Long startTime = System.currentTimeMillis();
		
		for(long i=0; i < 5; i++) {
			sum+=i;
			if(i==4) {
				System.out.println("정상종료");
				//JVM 강제 종료 
				System.exit(0);
			}
			//1초 대기
			Thread.sleep(1000);
		}
		System.out.println("총 합게 : "+sum);
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println((endTime - startTime)/1000+"초 소요 되었습니다."); //1초 단위를 얻기 위해 /1000을 해줌
		
	}
}

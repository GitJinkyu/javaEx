package getter.setter;

import java.io.ObjectInputStream.GetField;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		//private 접근제한자를 이용한 경우
		//필드에 직접 접근할 수 없으므로
		//setter메서드를 잉ㅇ해서 필드의 값을 변경 시켜 줄 수 있다
		car.setSpeed(-50);
		System.out.println("현재속도는: "+car.getSpeed());
		
		car.setSpeed(50);
		System.out.println("현재속도는: "+car.getSpeed());
		
		//멈춤 : true / 생성되었을때 : false
		//멈추지않았을때 멈추게하는 메서드 
		//상태확인
		if(!car.isStop()) {
			car.setStop(true);
		}
		car.setStop(true);
		System.out.println("현재속도는: "+car.getSpeed());
		

	}

}

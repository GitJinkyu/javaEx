package forEx;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		
		boolean run =true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		label:while(run) {
			System.out.println("===========================");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
			System.out.println("===========================");
			System.out.print("선택> ");
			int input = scanner.nextInt();
			
			
			switch (input) {
				case 1:
					System.out.print("예금액> ");
					balance += scanner.nextInt();
					System.out.println();
					break;
					
				case 2:
					System.out.print("출금액> ");
					balance -= scanner.nextInt();
					System.out.println();
					break;
					
				case 3:
					System.out.printf("잔고> %d",balance);
					System.out.println();
					break;
					
				case 4:
					System.out.println("Money: "+balance);
					System.out.println("프로그램 종료");
					System.exit(0);
					
	
				
			}
			
			
		}
		
		
		

	}

}

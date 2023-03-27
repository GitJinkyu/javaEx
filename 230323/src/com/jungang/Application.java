package com.jungang;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		//학생 정보 기록 배열 생성
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student("김진규",31,181,70,4,"컴공");
		studentArr[1] = new Student("유재석",41,172,57,4,"코미디");
		studentArr[2] = new Student("강호동",45,177,81,4,"씨름");
		
		//학생 정보 모두 출력
		for(Student studentList : studentArr) {
			
			System.out.println(studentList.information());
			System.out.println("===============");
		}
		
		
		//사원 정보 기록 배열 생성
		Employee[] employeeArr = new Employee[10];

		int i = 0 ;
		while(i<employeeArr.length) {
			Scanner scan = new Scanner(System.in);
			System.out.println("이름을 입력해주세요");
			String name = scan.next();
			System.out.println("나이를 입력해주세요");
			int age = scan.nextInt();
			System.out.println("키를 입력해주세요");
			double height = scan.nextDouble();
			System.out.println("몸무게를 입력해주세요");
			double weight = scan.nextDouble();
			System.out.println("급여를 입력해주세요");
			int salary = scan.nextInt();
			System.out.println("부서를 입력해주세요");
			String dept = scan.next();
			
			employeeArr[i] = new Employee(name,age,height,weight,salary,dept);
			
			i++;
			//배열 꽉차면 반복문 탈출
			if(i>=3) {
				System.out.println("정보란이 꽉찼습니다. 입력을 중단합니다.");
				break ;
			}
			
			//계속 입력받기
			System.out.println("그만 입력하시려면 'n' 계속 추가하시려면 'y'를 눌러주세요. ");

			//스트링의 비교는 .equals()
			String input = scan.next();
			if("n".equals(input)||"N".equals(input)) {
				//반복문 탈출
				System.out.println("입력이 끝났습니다.");
				break ;
			}else if("Y".equals(input)||"y".equals(input)) {
				continue;
			}else {
				continue;
			}
			
		}//while끝
		
		//사원 정보 모두 출력
		for(Employee employeelist: employeeArr) {
			if(employeelist!=null) {
				System.out.println("============등록된 사원 정보============");
				System.out.println(employeelist.information());
				System.out.println("===================================");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		
	}//메인끝
}//클래스끝

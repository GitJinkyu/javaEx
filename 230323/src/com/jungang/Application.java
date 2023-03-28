package com.jungang;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		//학생 정보 기록 배열 생성
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		studentArr[1] = new Student("김말똥",21,187.3,80.0,2,"경영학");
		studentArr[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		//학생 정보 모두 출력
		for(Student studentList : studentArr) {
			
			System.out.println(studentList.information());
			System.out.println("======================================================");
		}
		
		
		//사원 정보 기록 배열 생성
		Employee[] employeeArr = new Employee[10];
		Scanner scan = new Scanner(System.in);

		int i = 0 ;
		while(i<employeeArr.length) {
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
			if(i>=10) {
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
			//null 체크
			//배열이 초기화될때 null값으로 초기화
			//employeelist. <--주소접근 연산자인 . 을 이용할 경우
			//null은 주소를 가지고 있지 않으므로 오류가 발생
			if(employeelist!=null) {
				System.out.println("===================등록된 사원 정보===================");
				System.out.println(employeelist.information());
				System.out.println("=================================================");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		
	}//메인끝
}//클래스끝

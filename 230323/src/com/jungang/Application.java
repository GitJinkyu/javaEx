package com.jungang;

public class Application {

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student("김진규",31,181,70,4,"컴공");
		studentArr[1] = new Student("유재석",41,172,57,4,"코미디");
		studentArr[2] = new Student("강호동",45,177,81,4,"씨름");
		
		for(Student studentList : studentArr) {
			System.out.println("===============");
			System.out.println(studentList.name);
			System.out.println(studentList.age);
			System.out.println(studentList.height);
			System.out.println(studentList.weight);
			System.out.println(studentList.grade);
			System.out.println(studentList.major);
			System.out.println("===============");
			
		}
	}

}

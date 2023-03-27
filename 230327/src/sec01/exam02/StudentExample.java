package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =  new Student("학생1","123456-1234567",1);
		System.out.println(s.name+s.ssn+s.studentno);
		System.out.println("s.toString-------");
		System.out.println(s.toString());
	}

}

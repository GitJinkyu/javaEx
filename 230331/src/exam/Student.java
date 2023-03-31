package exam;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum=studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}

package co.jdbc.sms.dto;

public class Student {
      
	private int StudentId;
	private String StudentName;
	private int StudentClass;
	private float StudentMarks;
	public Student() {
		super();
		
		
	}
	public Student(int studentId, String studentName, int studentClass, float studnetMarks) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentClass = studentClass;
		StudentMarks = studnetMarks;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(int studentClass) {
		StudentClass = studentClass;
	}
	public float getStudnetMarks() {
		return StudentMarks;
	}
	public void setStudnetMarks(float studnetMarks) {
		StudentMarks = studnetMarks;
	}
	@Override
	public String toString() {
		return String.format("Student %-4d %-8s %-4d %.2f ",StudentId, StudentName, StudentClass, StudentMarks);
	}
	
	
	 

	}



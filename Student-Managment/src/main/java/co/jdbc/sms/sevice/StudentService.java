package co.jdbc.sms.sevice;

import co.jdbc.sms.dto.Student;

public interface StudentService {

	public void saveStudent( Student student) throws Exception;
	
	public void updateStudent (Student student) throws Exception;
	
	public void deleteStudent (Integer StudentID) throws Exception;
	
	public Student getStudentByNo(Integer StudentID) throws Exception;
	
	public void getallStudents() throws Exception;
	
}

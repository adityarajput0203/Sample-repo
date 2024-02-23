package co.jdbc.sms.dao;

import java.util.List;

import co.jdbc.sms.dto.Student;

public interface StudentDao {
	
	public Integer saveStudent(Student student) throws Exception;
	
	public Integer updateStudent(Student student) throws Exception;
	
	public Integer deleteStudentByNo(Integer StudentID) throws Exception;
	
	public Student findStudentByNo(Integer StudentID) throws Exception;

	public List<Student> findAll() throws Exception;
}

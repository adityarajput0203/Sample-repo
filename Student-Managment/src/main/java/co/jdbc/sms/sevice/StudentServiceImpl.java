package co.jdbc.sms.sevice;


import java.util.List;

import co.jdbc.sms.dao.StudentDao;
import co.jdbc.sms.dao.StudentDaoImpl;
import co.jdbc.sms.dto.Student;

public class StudentServiceImpl implements StudentService {
	
	private static StudentDao dao;
	
	public StudentServiceImpl() throws Exception {
		
		dao = new StudentDaoImpl();
		
	}

	public void saveStudent(Student student) throws Exception {
		
		int n = dao.saveStudent(student);
		if (n>0)
			System.out.println("Student Saved!!");
	
	}

	public void updateStudent(Student student) throws Exception {
		
		int n = dao.updateStudent(student);
		if (n>0)
			System.out.println("Student Updated!!");
	}

	public void deleteStudent(Integer StudentID) throws Exception {
		
		int n = dao.deleteStudentByNo(StudentID);
		if (n>0)
			System.out.println("Student deleted!!");
		else
			System.out.println("No matching Student found...");
	}

	public Student getStudentByNo(Integer StudentID) throws Exception {
		return dao.findStudentByNo(StudentID);
	
	}

	public void getallStudents() throws Exception {
		
		List<Student> x = dao.findAll();
		
		for (Student student : x) {
			
			System.out.println(student);
			Thread.sleep(2000);
		}

	}

}

package co.jdbc.sms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.jdbc.sms.configs.ConnectionFactory;
import co.jdbc.sms.dto.Student;

public class StudentDaoImpl implements StudentDao {
	
	private static Statement st = null;
	
	public StudentDaoImpl() throws Exception {
		
		Connection con = ConnectionFactory.getDBConnection();
		st = con.createStatement();
	}

	public Integer saveStudent(Student student) throws Exception {
		String sql = "insert into student values("+student.getStudentId()+",'"+student.getStudentName()+"',"+student.getStudentClass()+" , "+student.getStudnetMarks()+")";
		int rowsInserted = st.executeUpdate(sql);
		return rowsInserted;
	}

	public Integer updateStudent(Student student) throws Exception {
		String sql = "update student set Name='" +student.getStudentName()+"' , Class = " +student.getStudentClass()+", Marks="+student.getStudnetMarks()+" where StudentID ="+student.getStudentId();
	
	int rowsUpdated = st.executeUpdate(sql);
	return rowsUpdated;
		
	}

	public Integer deleteStudentByNo(Integer StudentID) throws Exception {
		
		String sql = "delete from student where StudentId ="+StudentID;
		int rowsDeleted = st.executeUpdate(sql);
		return rowsDeleted;
	}

	public Student findStudentByNo(Integer StudentID) throws Exception {
		
		Student stud = null;
		
		String sql = "select Name,Class,Marks from student where StudentID=" + StudentID;
		
		ResultSet rs = st.executeQuery(sql);
		
		if (rs.next()) {
			
			stud = new Student();
			
			stud.setStudentId(StudentID);
			stud.setStudentName(rs.getString(1));
			stud.setStudentClass(rs.getInt(2));
			stud.setStudnetMarks(rs.getFloat(3));
			
			
		}
		
		return stud;
		
	}

	public List<Student> findAll() throws Exception {
		List<Student> x = new ArrayList<Student>();
        String sql = "select * from student";
        
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()) {
        	
        int id = rs.getInt(1);
        String name = rs.getString(2);
        int cl = rs.getInt(3);
        float mark = rs.getFloat(4); 
		
        Student stu = new Student(id , name, cl, mark);
        x.add(stu);
        }
        
        return x;
	}

	}



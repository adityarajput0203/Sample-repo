package co.jdbc.studms;

import java.util.Scanner;

import co.jdbc.sms.configs.StudentServiceFactory;
import co.jdbc.sms.dto.Student;
import co.jdbc.sms.sevice.StudentService;

public class SMSMain {

	public static void main(String[] args) throws Exception {
        int studentid=0;
		
		Scanner sc = new Scanner(System.in);
		StudentService service = StudentServiceFactory.getStudentService();		

		while(true) {
			System.out.println("1. New Student");
			System.out.println("2. Update Student");
			System.out.println("3. Search Student");
			System.out.println("4. Delete Student");
			System.out.println("5. All Students");
			System.out.println("6. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				System.out.print("enter student ID: ");
				studentid = sc.nextInt();
				sc.nextLine();
				
				System.out.print("enter student name: ");
				String name = sc.nextLine();
				
				System.out.print("enter student class: ");
				int Class = sc.nextInt();
				
				System.out.print("enter student Marks: ");
				float marks = sc.nextFloat();
				
				Student student = new Student(studentid, name, Class, marks);
				service.saveStudent(student);
				break;
				
			 case 2:
				 System.out.print("enter student name: ");
					String name1 = sc.nextLine();
					
				System.out.print("enter student class: ");
					int Class1 = sc.nextInt();
					
				System.out.print("enter student Marks: ");
					float marks1 = sc.nextFloat();
				
				Student student1 = new Student(studentid, name1, Class1, marks1);
				service.saveStudent(student1);
				
				
				break;
				
			 case 3:
				System.out.print("search employee with empno =  ");
				studentid = sc.nextInt();
				student = service.getStudentByNo(studentid);
				if(student != null)
					System.out.println(student);
				else
					System.out.println("###--- No Matching Employee Found!! ---###");
				break;
				
			 case 4:
				System.out.print("enter the employee number to delete: ");
				studentid = sc.nextInt();
				service.deleteStudent(studentid);
				break;
				
			 case 5:
				service.getallStudents(); 
				break;
				
			 case 6:
				sc.close();
				System.exit(0); //to terminate the application
				break;
				
			 default:
				System.out.println("@@@--- INVALID OPTION --- TRY AGAIN ---@@@");				
			}
			System.out.println("--------------------------------------------------------------------------------");
		}		
	}

	

}


package co.jdbc.sms.configs;

import co.jdbc.sms.sevice.StudentService;
import co.jdbc.sms.sevice.StudentServiceImpl;

public class StudentServiceFactory {

	 private static StudentService service;
	 
	 public static StudentService getStudentService() throws Exception{
		
		 if(service == null) {
			 
			 service = new StudentServiceImpl();
		 }
		 return service;
		 
		 
	 }
}

package in.swadhin.spring_jdbc_connection_dem02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.swadhin.resource.jdbc_config;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbc_config.class);
		JdbcTemplate jt = context.getBean(JdbcTemplate.class);
		
//		-------INSER OPERATION--------
		
		int rollno = 105;
		String name = "sourav";
		float mark = 88.6f;
		String values = "insert into student values(?,?,?)";
		int a = jt.update(values, rollno, name, mark);
		if (a > 0) {
			System.out.println("Insert data Successfully.....");
		} else {
			System.out.println("Insertion failed.....");
		}
		
//		---------UPDATE OPERATION-------
		
//		int rollno = 105;
//		float mark = 91.6f;
//		String values = "update student set std_mark=? where std_roll=?";
//		int a = jt.update(values, mark, rollno);
//		if (a > 0) {
//			System.out.println("Update data Successfully.....");
//		} else {
//			System.out.println("Update failed.....");
//		}
		
//		------DELET OPERATION--------
		
//		int rollno = 105;
//		String values = "delete student  where std_roll=?";
//		int a = jt.update(values, rollno);
//		if (a > 0) {
//			System.out.println("Delete data Successfully.....");
//		} else {
//			System.out.println("Delete failed.....");
//		}
	}
}

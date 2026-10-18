package org.jsp.emp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id you want to delete = ");
		Employee e = ses.get(Employee.class, sc.nextInt());
		if(e!=null) {
			ses.delete(e);
			System.out.println("Record Deleted");
		}
		else {
			System.err.println("No Record Found !!!");
		}
		try {}
		finally {
			sc.close();
		}
	}
}

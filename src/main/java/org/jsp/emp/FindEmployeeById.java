package org.jsp.emp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindEmployeeById {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Employee ID = ");
		Employee e = ses.get(Employee.class, sc.nextInt());
		if(e!=null)
		System.out.println(e);
		else
			System.err.println("NO RECORD FOUND !!!");
		
		try {}
		
		finally {
			sc.close();
		}
	}
}
